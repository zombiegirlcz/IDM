package zs4;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public ArrayList u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a f324810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f324811x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f324810w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f324811x |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a.I2(this.f324810w, null, this);
    }
}
