package zml;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.external_entry.external_entry.a f323622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f323623x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.sso.impl.ui.external_entry.external_entry.a aVar, gim.c cVar) {
        super(cVar);
        this.f323622w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f323623x |= Integer.MIN_VALUE;
        return this.f323622w.T2(null, this);
    }
}
