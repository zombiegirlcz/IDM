package zml;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.external_entry.external_entry.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f323621w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.sso.impl.ui.external_entry.external_entry.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f323621w |= Integer.MIN_VALUE;
        return this.v.S2(this);
    }
}
