package ybh;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends gim.c {
    public dj0.d u;
    public DepositInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f312334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b f312335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f312336y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, gim.c cVar) {
        super(cVar);
        this.f312335x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f312334w = obj2;
        this.f312336y |= Integer.MIN_VALUE;
        return com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b.I2(this.f312335x, null, this);
    }
}
