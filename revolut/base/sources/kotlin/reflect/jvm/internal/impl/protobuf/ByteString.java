package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final ByteString EMPTY = new g(new byte[0]);

    /* JADX INFO: loaded from: classes14.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static ByteString a(Iterator it8, int i) {
        if (i == 1) {
            return (ByteString) it8.next();
        }
        int i2 = i >>> 1;
        return a(it8, i2).concat(a(it8, i - i2));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new g(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new g(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static Output newOutput() {
        return new Output();
    }

    public abstract void b(byte[] bArr, int i, int i2, int i3);

    public abstract int c();

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb6 = new StringBuilder(53);
            sb6.append("ByteString would be too long: ");
            sb6.append(size);
            sb6.append("+");
            sb6.append(size2);
            throw new IllegalArgumentException(sb6.toString());
        }
        int[] iArr = i.f187533g;
        i iVar = this instanceof i ? (i) this : null;
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size3 = byteString.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = byteString.size();
            byte[] bArr = new byte[size4 + size5];
            copyTo(bArr, 0, 0, size4);
            byteString.copyTo(bArr, 0, size4, size5);
            return new g(bArr);
        }
        if (iVar != null) {
            ByteString byteString2 = iVar.f187536c;
            if (byteString.size() + byteString2.size() < 128) {
                int size6 = byteString2.size();
                int size7 = byteString.size();
                byte[] bArr2 = new byte[size6 + size7];
                byteString2.copyTo(bArr2, 0, 0, size6);
                byteString.copyTo(bArr2, 0, size6, size7);
                return new i(iVar.f187535b, new g(bArr2));
            }
        }
        if (iVar != null) {
            ByteString byteString3 = iVar.f187536c;
            ByteString byteString4 = iVar.f187535b;
            if (byteString4.c() > byteString3.c() && iVar.e > byteString.c()) {
                return new i(byteString4, new i(byteString3, byteString));
            }
        }
        if (size3 >= i.f187533g[Math.max(c(), byteString.c()) + 1]) {
            return new i(this, byteString);
        }
        qm.e eVar = new qm.e(10);
        eVar.c(this);
        eVar.c(byteString);
        Stack stack = (Stack) eVar.f247740b;
        ByteString iVar2 = (ByteString) stack.pop();
        while (!stack.isEmpty()) {
            iVar2 = new i((ByteString) stack.pop(), iVar2);
        }
        return iVar2;
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb6 = new StringBuilder(30);
            sb6.append("Source offset < 0: ");
            sb6.append(i);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        if (i2 < 0) {
            StringBuilder sb9 = new StringBuilder(30);
            sb9.append("Target offset < 0: ");
            sb9.append(i2);
            throw new IndexOutOfBoundsException(sb9.toString());
        }
        if (i3 < 0) {
            StringBuilder sb10 = new StringBuilder(23);
            sb10.append("Length < 0: ");
            sb10.append(i3);
            throw new IndexOutOfBoundsException(sb10.toString());
        }
        int i5 = i + i3;
        if (i5 > size()) {
            StringBuilder sb11 = new StringBuilder(34);
            sb11.append("Source end offset < 0: ");
            sb11.append(i5);
            throw new IndexOutOfBoundsException(sb11.toString());
        }
        int i6 = i2 + i3;
        if (i6 <= bArr.length) {
            if (i3 > 0) {
                b(bArr, i, i2, i3);
            }
        } else {
            StringBuilder sb12 = new StringBuilder(34);
            sb12.append("Target end offset < 0: ");
            sb12.append(i6);
            throw new IndexOutOfBoundsException(sb12.toString());
        }
    }

    public abstract boolean d();

    public abstract int e(int i, int i2, int i3);

    public abstract int f(int i, int i2, int i3);

    public abstract int g();

    public abstract void h(OutputStream outputStream, int i, int i2);

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        b(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str) throws UnsupportedEncodingException;

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static final class Output extends OutputStream {
        public static final byte[] f = new byte[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187491c;
        public int e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f187489a = 128;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f187490b = new ArrayList();
        public byte[] d = new byte[128];

        public final void d(int i) {
            this.f187490b.add(new g(this.d));
            int length = this.f187491c + this.d.length;
            this.f187491c = length;
            this.d = new byte[Math.max(this.f187489a, Math.max(i, length >>> 1))];
            this.e = 0;
        }

        public final void f() {
            int i = this.e;
            byte[] bArr = this.d;
            int length = bArr.length;
            ArrayList arrayList = this.f187490b;
            if (i >= length) {
                arrayList.add(new g(this.d));
                this.d = f;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                arrayList.add(new g(bArr2));
            }
            this.f187491c += this.e;
            this.e = 0;
        }

        public synchronized int size() {
            return this.f187491c + this.e;
        }

        public synchronized ByteString toByteString() {
            f();
            return ByteString.copyFrom(this.f187490b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.e == this.d.length) {
                    d(1);
                }
                byte[] bArr = this.d;
                int i2 = this.e;
                this.e = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th10) {
                throw th10;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i3 = this.e;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.e += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i5 = i2 - length2;
                    d(i5);
                    System.arraycopy(bArr, i + length2, this.d, 0, i5);
                    this.e = i5;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        ?? arrayList;
        if (!(iterable instanceof Collection)) {
            arrayList = new ArrayList();
            Iterator<ByteString> it8 = iterable.iterator();
            while (it8.hasNext()) {
                arrayList.add(it8.next());
            }
        } else {
            arrayList = (Collection) iterable;
        }
        if (arrayList.isEmpty()) {
            return EMPTY;
        }
        return a(arrayList.iterator(), arrayList.size());
    }
}
