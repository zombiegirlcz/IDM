package l1i;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import cp5.d;
import g1i.l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1i.m;
import od0.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f191543b;

    public /* synthetic */ a(b bVar, int i) {
        this.f191542a = i;
        this.f191543b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f191542a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((l0) this.f191543b.f191544a).d();
            default:
                m mVar = this.f191543b.f191544a;
                i optionalCurrency = (i) obj2;
                Intrinsics.checkNotNullParameter(optionalCurrency, "optionalCurrency");
                if (!optionalCurrency.d()) {
                    return ((l0) mVar).d();
                }
                boolean zY = d.y((xi0.b) optionalCurrency.c());
                FinishFlowCommand finishFlowCommand = FinishFlowCommand.f98647a;
                if (zY) {
                    xi0.b currency = (xi0.b) optionalCurrency.c();
                    ocj.a destination = ocj.a.TRANSACTIONS;
                    l0 l0Var = (l0) mVar;
                    l0Var.getClass();
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(destination, "destination");
                    return l0Var.d.a(finishFlowCommand);
                }
                xi0.b currency2 = (xi0.b) optionalCurrency.c();
                ocj.a destination2 = ocj.a.TRANSACTIONS;
                l0 l0Var2 = (l0) mVar;
                l0Var2.getClass();
                Intrinsics.checkNotNullParameter(currency2, "currency");
                Intrinsics.checkNotNullParameter(destination2, "destination");
                return l0Var2.d.a(com.revolut.retail.core.navigation.a.c(finishFlowCommand, new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(currency2, destination2, null, null, 48))));
        }
    }
}
