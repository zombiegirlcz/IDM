package i9e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlowContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockFuturePaymentsFlowContract$InputData f159681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f159682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f159683c = this;
    public final e4m.e d;

    public i(o oVar, BlockFuturePaymentsFlowContract$InputData blockFuturePaymentsFlowContract$InputData) {
        this.f159682b = oVar;
        this.f159681a = blockFuturePaymentsFlowContract$InputData;
        this.d = e4m.b.b(new hc2.r(oVar, this, 13));
    }

    public final a9e.h b() {
        o oVar = this.f159682b;
        mae.p factory = oVar.f159704c.e();
        vc.s.j(factory);
        f01.c uiKitResources = oVar.d.g();
        t70.b currenciesLocalization = oVar.e.g();
        vc.s.j(currenciesLocalization);
        s9e.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.d(uiKitResources, currenciesLocalization);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
