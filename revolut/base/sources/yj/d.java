package yj;

/* JADX INFO: loaded from: classes.dex */
public final class d implements xj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f314349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af.f f314350b;

    public d(int i, ie.a aVar) {
        this.f314349a = i;
        this.f314350b = (af.f) aVar.d;
    }

    @Override // xj.a
    public final Object getValue() {
        return Integer.valueOf(this.f314349a);
    }

    @Override // xj.a
    public final byte[] serialize() {
        this.f314350b.getClass();
        int i = this.f314349a;
        return new byte[]{-3, (byte) ((i >>> 24) & 255), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }
}
