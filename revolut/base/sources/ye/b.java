package ye;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f312729a;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f312729a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f312729a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f312729a += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
