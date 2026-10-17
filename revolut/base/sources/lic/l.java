package lic;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f195461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f195462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, gim.c cVar) {
        super(cVar);
        this.f195461w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f195462x |= Integer.MIN_VALUE;
        return o.Z2(this.f195461w, this);
    }
}
