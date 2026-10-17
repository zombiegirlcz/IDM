package ekg;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public dkg.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f127156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127157x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f127156w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127157x |= Integer.MIN_VALUE;
        return this.f127156w.g(this);
    }
}
