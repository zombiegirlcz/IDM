package kug;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f189812w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f189812w |= Integer.MIN_VALUE;
        return com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b.I2(this.v, null, null, this);
    }
}
