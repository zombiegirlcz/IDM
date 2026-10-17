package yj;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements xj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f314351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.a f314352b;

    public e(long j2, ie.a aVar) {
        this.f314351a = j2;
        this.f314352b = (ah.a) aVar.e;
    }

    @Override // xj.a
    public final Object getValue() {
        return Long.valueOf(this.f314351a);
    }

    @Override // xj.a
    public final byte[] serialize() {
        this.f314352b.getClass();
        return new byte[]{-4, (byte) (r1 >>> 56), (byte) (r1 >>> 48), (byte) (r1 >>> 40), (byte) (r1 >>> 32), (byte) (r1 >>> 24), (byte) (r1 >>> 16), (byte) (r1 >>> 8), (byte) this.f314351a};
    }
}
