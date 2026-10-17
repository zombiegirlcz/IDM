package tfj;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.impl.ui.flows.checkout.EsimCheckoutFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.checkout.a;
import com.revolut.retail.feature.payment_options.api.PaymentOptionsFeatureConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zgj.s;
import zgj.t;
import zgj.u;
import zgj.v;
import zgj.w;
import zgj.x;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.checkout.c f270325b;

    public /* synthetic */ d(com.revolut.retail.feature.esim.impl.ui.flows.checkout.c cVar, int i) {
        this.f270324a = i;
        this.f270325b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f270324a;
        com.revolut.retail.feature.esim.impl.ui.flows.checkout.c cVar = this.f270325b;
        switch (i) {
            case 0:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                h.u2(cVar, cVar.f100606r, EsimCheckoutFlowContract$Step.Checkout.f100601a, null, 6);
                return Boolean.FALSE;
            default:
                x output = (x) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof u) {
                    cVar.C2(a.b.f100603a);
                } else if (output instanceof s) {
                    cVar.C2(a.C0609a.f100602a);
                } else if (output instanceof v) {
                    cVar.C2(new c(((v) output).f322186a));
                } else if (output instanceof w) {
                    cVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, ((w) output).f322187a, null, null, 30)));
                } else {
                    if (!(output instanceof t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.C1(new BridgeDestination(new FeatureCommand(new PaymentOptionsFeatureConfig.PaymentOptions(((t) output).f322184a))));
                }
                return Unit.f186387a;
        }
    }
}
