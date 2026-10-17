package q78;

import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public TabAccountsInitialPayload.Action u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f242769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f242770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f242771y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f242771y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f242770x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f242771y.f(null, null, null, false, this);
    }
}
