package cid;

import a09.r;
import cjl.n;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.feature.entity.provider.api.navigation.LearnMoreBottomSheetDestination;
import com.revolut.feature.passcode_reminder.api.navigation.PasscodeReminderDestination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$PersonalizedOffers$Destination;
import com.revolut.feature.subscriptions.api.block_future_payments.BlockFuturePaymentsFlowDestination;
import com.revolut.feature.workflow.chat.api.navigation.WorkflowChatDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.api.app_consent.RevolutSsoQrConsentDestination;
import com.revolut.sso.api.app_consent.SsoQrConsentInputData;
import efm.d0;
import jf0.c;
import jf0.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import q06.h;
import q06.k;
import rfm.f0;
import s2i.i;
import sri.m;
import ue0.e;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f24445b;

    public a(m navigator, int i) {
        this.f24444a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f24445b = navigator;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f24445b = navigator;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f24445b = navigator;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f24445b = navigator;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f24445b = navigator;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f24445b = navigator;
                break;
            default:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f24445b = navigator;
                break;
        }
    }

    public static FeatureCommand b(c cVar) {
        if (!Intrinsics.f(cVar.e(3), "third-party-targeting")) {
            return null;
        }
        String str = (String) cVar.d.get("utm_source");
        if (str == null) {
            str = "";
        }
        return new FeatureCommand(new KompotOverlayFeatureConfig((ParcelableDestination) new ShopsFeatureConfig$PersonalizedOffers$Destination(str), yhi.b.BOTTOM_DIALOG, (Integer) 2004, 8));
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        switch (this.f24444a) {
            case 0:
                return y.D(cVar, "deeplink", 1, "ads") && Intrinsics.f(cVar.e(2), "consents");
            case 1:
                return y.D(cVar, "deeplink", 1, "legal-entity-learn-more");
            case 2:
                return y.D(cVar, "deeplink", 1, "personal-details");
            case 3:
                return y.D(cVar, "deeplink", 1, "challenges") && Intrinsics.f(cVar.e(2), "qr") && cVar.e(3).length() > 0;
            case 4:
                return y.D(cVar, "deeplink", 1, "block-future-payments") && cVar.e(2).length() > 0;
            case 5:
                return y.D(cVar, "deeplink", 1, "remind-passcode");
            default:
                return y.D(cVar, "deeplink", 1, "workflow-chat");
        }
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        switch (this.f24444a) {
            case 0:
                FeatureCommand featureCommandB = b(cVar);
                if (featureCommandB != null) {
                    return new h(new BridgeDestination(featureCommandB), new q06.b(ibb.c.e, null));
                }
                return null;
            case 1:
                return new h(LearnMoreBottomSheetDestination.f72114a, null);
            case 2:
                return new h(UserDetailsDestination.f26226a, null);
            case 3:
                return new h(new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(new RevolutSsoQrConsentDestination(new SsoQrConsentInputData(n.QrPersonal, cVar.e(3), null)), yhi.b.SOLID, (Integer) null, 12))), new q06.b(ibb.c.f160140a, null));
            case 4:
                return new h(new BlockFuturePaymentsFlowDestination(cVar.e(2), true), null);
            case 5:
                return new h(PasscodeReminderDestination.f78645a, null);
            default:
                return new h(new WorkflowChatDestination(0), null);
        }
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        switch (this.f24444a) {
            case 0:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 4), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                return cVar;
            case 1:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                ufm.c cVar2 = new ufm.c(new r(this, vhi.c.c(LearnMoreBottomSheetDestination.f72114a, yhi.b.POPUP, null, false, 12), 23), 2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                return cVar2;
            case 2:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                f0 f0VarF = new pfm.h(new hc7.a(this, gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) UserDetailsDestination.f26226a, false, (Integer) null, 0, 61)), 10), 2).f(d0.m(Boolean.TRUE));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return e.F(f0VarF, Boolean.FALSE);
            case 3:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                ufm.c cVar3 = new ufm.c(new a6j.b(deeplink, z, this, 11), 2);
                Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
                return cVar3;
            case 4:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                z zVar = new z(new ufm.c(new pu9.a(this, deeplink, 14), 2), 1, new q2j.k(18), null);
                Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
                return zVar;
            case 5:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                ufm.c cVar4 = new ufm.c(new i(this, 3), 2);
                Intrinsics.checkNotNullExpressionValue(cVar4, "fromCallable(...)");
                return cVar4;
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                ufm.c cVar5 = new ufm.c(new i(this, 15), 2);
                Intrinsics.checkNotNullExpressionValue(cVar5, "fromCallable(...)");
                return cVar5;
        }
    }
}
