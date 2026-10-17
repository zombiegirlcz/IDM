package uye;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends gim.c {
    public xi0.b u;
    public io3.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountId f284331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f284332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284333y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, gim.c cVar) {
        super(cVar);
        this.f284333y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284332x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup.flow.i.J2(this.f284333y, null, this);
    }
}
