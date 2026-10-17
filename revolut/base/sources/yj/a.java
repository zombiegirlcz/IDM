package yj;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements xj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f314342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf.b f314343b;

    public a(boolean z, ie.a aVar) {
        this.f314342a = z;
        this.f314343b = (qf.b) aVar.f160499a;
    }

    @Override // xj.a
    public final Object getValue() {
        return Boolean.valueOf(this.f314342a);
    }

    @Override // xj.a
    public final byte[] serialize() {
        this.f314343b.getClass();
        return new byte[]{-7, this.f314342a ? (byte) 1 : (byte) 0};
    }
}
