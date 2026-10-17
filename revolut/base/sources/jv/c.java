package jv;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends gim.c {
    public xv.l u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f178698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f178699x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, gim.c cVar) {
        super(cVar);
        this.f178698w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f178699x |= Integer.MIN_VALUE;
        return r.b(this.f178698w, null, this);
    }
}
