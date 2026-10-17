package ts6;

import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.c {
    public TabAccountsInitialPayload u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f274007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f274008x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s0 s0Var, gim.c cVar) {
        super(cVar);
        this.f274007w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f274008x |= Integer.MIN_VALUE;
        return this.f274007w.d(null, null, this);
    }
}
