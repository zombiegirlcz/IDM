package wyd;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.account.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f301247w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.statements.impl.ui.account.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f301247w |= Integer.MIN_VALUE;
        return com.revolut.feature.statements.impl.ui.account.a.I2(this.v, null, null, this);
    }
}
