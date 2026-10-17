package hcm;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.h f151250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f151251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151252c;

    public b0(mmm.h hVar, int i) {
        this.f151250a = hVar;
        this.f151251b = i;
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.f151250a.write(bArr, i, i2);
        this.f151251b -= i2;
        this.f151252c += i2;
    }
}
