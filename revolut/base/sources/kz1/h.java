package kz1;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import sri.m;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xw1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191051a;

    public h(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f191051a = navigator;
    }

    public static FeatureCommand b(ApmDeeplinkPayload.Apm apm) {
        return new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("APM_DEEPLINK"), new ApmDeeplinkPayload.PaymentArea(apm))));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "apm-payment-area");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        ApmDeeplinkPayload.Apm.Companion companion = ApmDeeplinkPayload.Apm.INSTANCE;
        String strE = cVar.e(2);
        companion.getClass();
        ApmDeeplinkPayload.Apm apmA = ApmDeeplinkPayload.Apm.Companion.a(strE);
        if (apmA != null) {
            return new q06.h(new BridgeDestination(b(apmA)), null);
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown APM type: ", cVar.e(2)));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(2);
        ApmDeeplinkPayload.Apm.INSTANCE.getClass();
        ApmDeeplinkPayload.Apm apmA = ApmDeeplinkPayload.Apm.Companion.a(strE);
        if (apmA != null) {
            z zVarD = new pfm.h(new hc7.a(this, apmA, 26), 2).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unknown APM type: ".concat(strE));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
