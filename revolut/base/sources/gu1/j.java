package gu1;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.c {
    public c02.j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f146668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f146669x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, gim.c cVar) {
        super(cVar);
        this.f146668w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f146669x |= Integer.MIN_VALUE;
        return this.f146668w.H(null, this);
    }
}
