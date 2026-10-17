package ke;

import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f182943g = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f182944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f182946c;
    public i d;
    public i e;
    public final byte[] f;

    public l(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    q(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th10) {
                randomAccessFile.close();
                throw th10;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f182944a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iJ = j(bArr, 0);
        this.f182945b = iJ;
        if (iJ > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f182945b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f182946c = j(bArr, 4);
        int iJ2 = j(bArr, 8);
        int iJ3 = j(bArr, 12);
        this.d = i(iJ2);
        this.e = i(iJ3);
    }

    public static int j(byte[] bArr, int i) {
        return ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) + ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[i + 3] & UnsignedBytes.MAX_VALUE);
    }

    public static void q(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f182944a.close();
    }

    public final void d(byte[] bArr) {
        int iO;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean zH = h();
                    if (zH) {
                        iO = 16;
                    } else {
                        i iVar = this.e;
                        iO = o(iVar.f182938a + 4 + iVar.f182939b);
                    }
                    i iVar2 = new i(iO, length);
                    q(this.f, 0, length);
                    m(iO, 4, this.f);
                    m(iO + 4, length, bArr);
                    p(this.f182945b, this.f182946c + 1, zH ? iO : this.d.f182938a, iO);
                    this.e = iVar2;
                    this.f182946c++;
                    if (zH) {
                        this.d = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void f(int i) throws IOException {
        int i2 = i + 4;
        int iN = this.f182945b - n();
        if (iN >= i2) {
            return;
        }
        int i3 = this.f182945b;
        do {
            iN += i3;
            i3 <<= 1;
        } while (iN < i2);
        RandomAccessFile randomAccessFile = this.f182944a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        i iVar = this.e;
        int iO = o(iVar.f182938a + 4 + iVar.f182939b);
        if (iO < this.d.f182938a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f182945b);
            long j2 = iO - 4;
            if (channel.transferTo(16L, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.e.f182938a;
        int i6 = this.d.f182938a;
        if (i5 < i6) {
            int i21 = (this.f182945b + i5) - 16;
            p(i3, this.f182946c, i6, i21);
            this.e = new i(i21, this.e.f182939b);
        } else {
            p(i3, this.f182946c, i6, i5);
        }
        this.f182945b = i3;
    }

    public final synchronized void g(k kVar) {
        int iO = this.d.f182938a;
        for (int i = 0; i < this.f182946c; i++) {
            i iVarI = i(iO);
            kVar.a(new j(this, iVarI), iVarI.f182939b);
            iO = o(iVarI.f182938a + 4 + iVarI.f182939b);
        }
    }

    public final synchronized boolean h() {
        return this.f182946c == 0;
    }

    public final i i(int i) throws IOException {
        if (i == 0) {
            return i.f182937c;
        }
        RandomAccessFile randomAccessFile = this.f182944a;
        randomAccessFile.seek(i);
        return new i(i, randomAccessFile.readInt());
    }

    public final synchronized void k() {
        if (h()) {
            throw new NoSuchElementException();
        }
        if (this.f182946c == 1) {
            synchronized (this) {
                p(4096, 0, 0, 0);
                this.f182946c = 0;
                i iVar = i.f182937c;
                this.d = iVar;
                this.e = iVar;
                if (this.f182945b > 4096) {
                    RandomAccessFile randomAccessFile = this.f182944a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f182945b = 4096;
            }
        } else {
            i iVar2 = this.d;
            int iO = o(iVar2.f182938a + 4 + iVar2.f182939b);
            l(iO, 0, 4, this.f);
            int iJ = j(this.f, 0);
            p(this.f182945b, this.f182946c - 1, iO, this.e.f182938a);
            this.f182946c--;
            this.d = new i(iO, iJ);
        }
    }

    public final void l(int i, int i2, int i3, byte[] bArr) throws IOException {
        int iO = o(i);
        int i5 = iO + i3;
        int i6 = this.f182945b;
        RandomAccessFile randomAccessFile = this.f182944a;
        if (i5 <= i6) {
            randomAccessFile.seek(iO);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i21 = i6 - iO;
        randomAccessFile.seek(iO);
        randomAccessFile.readFully(bArr, i2, i21);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i21, i3 - i21);
    }

    public final void m(int i, int i2, byte[] bArr) throws IOException {
        int iO = o(i);
        int i3 = iO + i2;
        int i5 = this.f182945b;
        RandomAccessFile randomAccessFile = this.f182944a;
        if (i3 <= i5) {
            randomAccessFile.seek(iO);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i6 = i5 - iO;
        randomAccessFile.seek(iO);
        randomAccessFile.write(bArr, 0, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i6, i2 - i6);
    }

    public final int n() {
        if (this.f182946c == 0) {
            return 16;
        }
        i iVar = this.e;
        int i = iVar.f182938a;
        int i2 = this.d.f182938a;
        return i >= i2 ? (i - i2) + 4 + iVar.f182939b + 16 : (((i + 4) + iVar.f182939b) + this.f182945b) - i2;
    }

    public final int o(int i) {
        int i2 = this.f182945b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void p(int i, int i2, int i3, int i5) throws IOException {
        int[] iArr = {i, i2, i3, i5};
        int i6 = 0;
        int i21 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i6 >= 4) {
                RandomAccessFile randomAccessFile = this.f182944a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                q(bArr, i21, iArr[i6]);
                i21 += 4;
                i6++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(l.class.getSimpleName());
        sb6.append("[fileLength=");
        sb6.append(this.f182945b);
        sb6.append(", size=");
        sb6.append(this.f182946c);
        sb6.append(", first=");
        sb6.append(this.d);
        sb6.append(", last=");
        sb6.append(this.e);
        sb6.append(", element lengths=[");
        try {
            g(new dki.h(sb6));
        } catch (IOException e) {
            f182943g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb6.append("]]");
        return sb6.toString();
    }
}
