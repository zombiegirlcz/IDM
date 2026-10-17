package khb;

import yhm.m;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ fkg.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184084w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fkg.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184084w |= Integer.MIN_VALUE;
        Object objF = this.v.f(this);
        return objF == fim.a.COROUTINE_SUSPENDED ? objF : new m(objF);
    }
}
