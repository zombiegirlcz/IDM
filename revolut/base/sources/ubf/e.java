package ubf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;
import u45.w0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAddOnsFlowContract$InputData f278873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f278874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f278875c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f278876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f278877h;

    public e(d dVar, BaseFlow baseFlow, TradingAddOnsFlowContract$InputData tradingAddOnsFlowContract$InputData) {
        this.f278874b = dVar;
        this.f278873a = tradingAddOnsFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseFlow));
        int i = 12;
        this.e = e4m.b.b(new w0(dVar, this, 2, i));
        this.f = e4m.b.b(new w0(dVar, this, 1, i));
        this.f278876g = e4m.b.b(new w0(dVar, this, 0, i));
        this.f278877h = e4m.b.b(new w0(dVar, this, 3, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f278876g.get());
    }
}
