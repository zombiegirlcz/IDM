package jv;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends gim.c {
    public gv.m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f178709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f178710x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, gim.c cVar) {
        super(cVar);
        this.f178709w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f178710x |= Integer.MIN_VALUE;
        return r.c(this.f178709w, null, null, this);
    }
}
