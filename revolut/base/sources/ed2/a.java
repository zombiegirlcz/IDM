package ed2;

import a08.l;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.retail.main_screen.container.models.action_payload.APMConfirmationPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.HashMap;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import q06.i;
import sri.m;
import wp5.y;
import zc2.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f124911a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f124911a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "open-banking-auth-ideal");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        HashMap map = cVar.d;
        String str = (String) map.get("payloadUri");
        String str2 = (String) map.get("sig");
        if (str == null || str2 == null) {
            return null;
        }
        return new i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("APM_AUTH_CONFIRMATION"), new APMConfirmationPayload.IdealConfirmation(str, str2))));
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        HashMap map = deeplink.d;
        String str = (String) map.get("payloadUri");
        String str2 = (String) map.get("sig");
        if (str != null && str2 != null) {
            return new h(new l(this, new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("APM_AUTH_CONFIRMATION"), new APMConfirmationPayload.IdealConfirmation(str, str2)))), 23), 2).D(Boolean.TRUE);
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
