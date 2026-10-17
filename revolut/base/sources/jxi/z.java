package jxi;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a;
import java.util.concurrent.CopyOnWriteArrayList;
import jsl.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oxi.d;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c f179239b;

    public /* synthetic */ z(com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar, int i) {
        this.f179238a = i;
        this.f179239b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f179238a;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar = this.f179239b;
        switch (i) {
            case 0:
                com.revolut.kompot.common.flow.permissions.a output = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof a.C0596a) {
                    cVar.E.a();
                }
                return Unit.f186387a;
            case 1:
                rxi.a it8 = (rxi.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, rxi.a.f258184a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar.C1(new BridgeDestination(new FeatureCommand(KompotProfileFeatureConfig.Settings.f81342g)));
                return Unit.f186387a;
            default:
                oxi.d output2 = (oxi.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof d.a) {
                    cVar.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.accessing-airport-lounges", 2))));
                } else if (output2 instanceof d.b) {
                    cVar.C2(a.d.f99090a);
                } else {
                    if (!(output2 instanceof d.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = (String) ((r) ((j2) cVar.G.f22677a).getValue()).e.getContent();
                    if (str != null) {
                        cVar.l2(new t0(cVar, str, null, 12), new yi5.b(26));
                    } else {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "AirportLoungesHomeScreenModel", "Can't launch T&C deeplink: no terms url in the screen state", null, h0Var);
                    }
                }
                return Unit.f186387a;
        }
    }
}
