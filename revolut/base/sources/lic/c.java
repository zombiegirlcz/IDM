package lic;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public kic.f u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f195447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f195448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f195449y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f195448x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f195447w = obj2;
        this.f195449y |= Integer.MIN_VALUE;
        return g.Z2(this.f195448x, null, this);
    }
}
