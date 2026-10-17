package l8;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f192737h;

    @Override // l8.n
    public final m a(int i, int i2, int i3, int i5) {
        switch (this.f192737h) {
            case 0:
                return b(i, i2, i3, i5) == 1.0f ? m.QUALITY : n.f192738a.a(i, i2, i3, i5);
            case 1:
                return m.QUALITY;
            case 2:
                return n.f192741g ? m.QUALITY : m.MEMORY;
            default:
                return m.QUALITY;
        }
    }

    @Override // l8.n
    public final float b(int i, int i2, int i3, int i5) {
        switch (this.f192737h) {
            case 0:
                return Math.min(1.0f, n.f192738a.b(i, i2, i3, i5));
            case 1:
                return Math.max(i3 / i, i5 / i2);
            case 2:
                if (n.f192741g) {
                    return Math.min(i3 / i, i5 / i2);
                }
                if (Math.max(i2 / i5, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
