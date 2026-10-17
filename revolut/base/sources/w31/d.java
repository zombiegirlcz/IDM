package w31;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f294136w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f294136w |= Integer.MIN_VALUE;
        Object objB = this.v.b(this);
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            return objB;
        }
        String str = (String) objB;
        if (str != null) {
            return new u31.d(str);
        }
        return null;
    }
}
