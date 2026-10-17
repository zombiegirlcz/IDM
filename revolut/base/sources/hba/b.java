package hba;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.feature.pix.api.navigation.PixAliasNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixAliasNavigation$InputData;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.portability_details.screens.review.ReviewPortabilityInfoScreen;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.tm0;
import ip0.um0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import rp0.t;
import rp0.y;
import yhm.o;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReviewPortabilityInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ReviewPortabilityInfoScreen reviewPortabilityInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reviewPortabilityInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f52613a;
        int iHashCode = str.hashCode();
        ReviewPortabilityInfoScreen reviewPortabilityInfoScreen = this.v;
        switch (iHashCode) {
            case -1831980691:
                if (str.equals("CANCEL_PORTABILITY_KEY_BUTTON_ID")) {
                    l lVar = (l) reviewPortabilityInfoScreen.d();
                    if (!(lVar.o.f80678b.getF80406b() instanceof PixKeyStatus.UnderPortability.DifferentOwnership)) {
                        lVar.I2(new gwc.h(1, lVar.f150635q, h.class, "providePortabilitySameOwnershipCancelErrorConfig", "providePortabilitySameOwnershipCancelErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 25), new a76.c(0, lVar.f150635q, h.class, "providePortabilitySameOwnershipCancelSuccessConfig", "providePortabilitySameOwnershipCancelSuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 28), new j(lVar, null, 1));
                    } else {
                        lVar.f150635q.getClass();
                        t tVar = new t(new TextLocalisedClause(R$string.pix_cancel_ownership_confirm_title, null, null, 14), new TextLocalisedClause(R$string.pix_cancel_ownership_confirm_description, null, null, 14), null, 28);
                        List listC = u.c(new um0("CONFIRM_CANCELLATION_DIFFERENT_OWNERSHIP_ACTIONS_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.pix_cancel_ownership_confirm_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.pix_cancel_ownership_give_up, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016));
                        yp0.b.q(listC, 0, R$attr.uikit_dp16, 0, 0, 13);
                        lVar.l2(new h54.o(lVar, new y(listC, tVar, null, null, null, null, 1020), null, 15), new yi5.b(26));
                    }
                }
                break;
            case -1323361233:
                if (str.equals("CREATE_RANDOM_KEY_BUTTON_ID")) {
                    l lVar2 = (l) reviewPortabilityInfoScreen.d();
                    knm.b.j(lVar2.l1(), u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new PixAliasNavigation$Destination(new PixAliasNavigation$InputData.Registration(AliasRegistrationType.RandomKey.f80393a, (dj0.d) null, 5)), yhi.b.SOLID, (Integer) null, 12))));
                    lVar2.C2(d.DISMISS);
                }
                break;
            case -48530949:
                if (str.equals("ACCEPT_PORTABILITY_BUTTON_ID")) {
                    l lVar3 = (l) reviewPortabilityInfoScreen.d();
                    Pair pair = lVar3.o.f80678b.getF80406b() instanceof PixKeyStatus.UnderPortability.DifferentOwnership ? new Pair(new gwc.h(1, lVar3.f150635q, h.class, "providePortabilityDifferentOwnershipAcceptErrorConfig", "providePortabilityDifferentOwnershipAcceptErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 23), new a76.c(0, lVar3.f150635q, h.class, "providePortabilityDifferentOwnershipAcceptSuccessConfig", "providePortabilityDifferentOwnershipAcceptSuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 26)) : new Pair(new gwc.h(1, lVar3.f150635q, h.class, "providePortabilitySameOwnershipAcceptErrorConfig", "providePortabilitySameOwnershipAcceptErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 24), new a76.c(0, lVar3.f150635q, h.class, "providePortabilitySameOwnershipAcceptSuccessConfig", "providePortabilitySameOwnershipAcceptSuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 27));
                    lVar3.I2((Function1) ((KFunction) pair.f186385a), (Function0) ((KFunction) pair.f186386b), new j(lVar3, null, 0));
                }
                break;
            case 1419734015:
                if (str.equals("DENY_PORTABILITY_BUTTON_ID")) {
                    l lVar4 = (l) reviewPortabilityInfoScreen.d();
                    lVar4.getClass();
                    lVar4.C2(d.REQUEST_OTP);
                }
                break;
        }
        return Unit.f186387a;
    }
}
