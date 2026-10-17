package jm6;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.flow.link_external.b f176483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f176484x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar, gim.c cVar) {
        super(cVar);
        this.f176483w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f176484x |= Integer.MIN_VALUE;
        return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.K2(this.f176483w, this);
    }
}
