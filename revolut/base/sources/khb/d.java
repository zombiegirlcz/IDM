package khb;

import yhm.m;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public dda.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f184088w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184089x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f184088w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184089x |= Integer.MIN_VALUE;
        Object objC = this.f184088w.c(this);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : new m(objC);
    }
}
