package hu1;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import com.revolut.feature.apm.core.api.ApmToggles$BlikP2PRegistrationConfirmation;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BlikCodeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(BlikCodeScreen blikCodeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = blikCodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BlikCodeScreen blikCodeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                blikCodeScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0Var = (e0) blikCodeScreen.T2();
                if (((jte.d) ((ty1.b) e0Var.A).f275454b).c(ApmToggles$BlikP2PRegistrationConfirmation.f61792c)) {
                    lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.blik_register_phone_prompt_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.blik_register_phone_prompt_confirmation_subtitle, null, null, 14), null, null, false, 28);
                    m6 m6Var = n6.Companion;
                    aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.blik_register_phone_prompt_confirmation_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.blik_register_phone_prompt_confirmation_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                    k9 k9Var = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    u block = new u(e0Var, 1);
                    Intrinsics.checkNotNullParameter(block, "block");
                    actionsBottomSheetController.H = block;
                    e0Var.C1(new com.revolut.kompot.common.b(actionsBottomSheetController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
                } else {
                    e0Var.E2(new t(e0Var, 0));
                }
                break;
        }
        return Unit.f186387a;
    }
}
