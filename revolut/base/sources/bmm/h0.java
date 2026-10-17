package bmm;

/* JADX INFO: loaded from: classes13.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f16928c;

    public h0(int i) {
        switch (i) {
            case 1:
                this.f16928c = new h0[256];
                this.f16926a = 0;
                this.f16927b = 0;
                break;
            default:
                this.f16928c = new h0[256];
                this.f16926a = 0;
                this.f16927b = 0;
                break;
        }
    }

    public h0(int i, int i2, int i3) {
        switch (i3) {
            case 1:
                this.f16928c = null;
                this.f16926a = i;
                int i5 = i2 & 7;
                this.f16927b = i5 == 0 ? 8 : i5;
                break;
            default:
                this.f16928c = null;
                this.f16926a = i;
                int i6 = i2 & 7;
                this.f16927b = i6 == 0 ? 8 : i6;
                break;
        }
    }
}
