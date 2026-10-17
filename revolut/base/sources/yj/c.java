package yj;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements xj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f314347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf.b f314348b;

    public c(float f, ie.a aVar) {
        this.f314347a = f;
        this.f314348b = (qf.b) aVar.f160501c;
    }

    @Override // xj.a
    public final Object getValue() {
        return Float.valueOf(this.f314347a);
    }

    @Override // xj.a
    public final byte[] serialize() {
        this.f314348b.getClass();
        int iFloatToIntBits = Float.floatToIntBits(this.f314347a);
        return new byte[]{-6, (byte) (iFloatToIntBits >>> 24), (byte) (iFloatToIntBits >>> 16), (byte) (iFloatToIntBits >>> 8), (byte) iFloatToIntBits};
    }
}
