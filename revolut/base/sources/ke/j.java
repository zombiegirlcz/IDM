package ke;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f182940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f182942c;

    public j(l lVar, i iVar) {
        this.f182942c = lVar;
        this.f182940a = lVar.o(iVar.f182938a + 4);
        this.f182941b = iVar.f182939b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f182941b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i5 = this.f182940a;
        l lVar = this.f182942c;
        lVar.l(i5, i, i2, bArr);
        this.f182940a = lVar.o(this.f182940a + i2);
        this.f182941b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f182941b == 0) {
            return -1;
        }
        l lVar = this.f182942c;
        lVar.f182944a.seek(this.f182940a);
        int i = lVar.f182944a.read();
        this.f182940a = lVar.o(this.f182940a + 1);
        this.f182941b--;
        return i;
    }
}
