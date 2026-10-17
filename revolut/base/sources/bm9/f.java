package bm9;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public BigDecimal u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f16775w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c f16776x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16777y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f16776x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f16775w = obj2;
        this.f16777y |= Integer.MIN_VALUE;
        return com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c.I2(this.f16776x, null, false, this);
    }
}
