package oc8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f224112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f224113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f224114y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, gim.c cVar) {
        super(cVar);
        this.f224113x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f224112w = obj2;
        this.f224114y |= Integer.MIN_VALUE;
        return this.f224113x.Z2(null, this);
    }
}
