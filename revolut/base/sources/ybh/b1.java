package ybh;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class b1 extends gim.c {
    public DepositInfo u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b f312294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f312295x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, gim.c cVar) {
        super(cVar);
        this.f312294w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f312295x |= Integer.MIN_VALUE;
        return this.f312294w.J2(null, null, this);
    }
}
