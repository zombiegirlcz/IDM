package aem;

/* JADX INFO: loaded from: classes23.dex */
public final class n extends nem.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kem.i f3752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3754c;

    public n(kem.i iVar, Object obj2) {
        this.f3754c = obj2;
        if (iVar == null) {
            kem.i iVar2 = kem.e.f183196a;
            iVar = kem.e.f183197b;
        }
        this.f3752a = iVar;
        this.f3753b = ((byte[]) obj2).length;
    }

    @Override // nem.c
    public final Long a() {
        return Long.valueOf(this.f3753b);
    }

    @Override // nem.c
    public final kem.i b() {
        return this.f3752a;
    }

    @Override // nem.b
    public final byte[] d() {
        return (byte[]) this.f3754c;
    }
}
