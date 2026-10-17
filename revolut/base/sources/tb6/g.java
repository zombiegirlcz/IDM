package tb6;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CharityDetailsScreen f269479w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CharityDetailsScreen charityDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f269479w = charityDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f269479w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f269479w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f269479w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((ba6.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        CharityDetailsScreen charityDetailsScreen = this.f269479w;
        switch (i) {
            case 0:
                com.revolut.core.ui_kit.delegates.t model = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = charityDetailsScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) rVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f54721a, ActionWidgetDelegate.a.d.f51610a)) {
                    j60.a aVar2 = cVar.A;
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.donations_common_action_got_it, null, null, 14);
                    int i2 = R$attr.uikit_dp16;
                    aVar2.x(new rp0.y(zhm.u.c(new LargeActionButtonDelegate.Model("action_button", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, i2, i2, i2, 496)), new rp0.t(new TextLocalisedClause(R$string.donations_details_pending_donations_popup_title, null, null, 14), new TextLocalisedClause(R$string.donations_details_pending_donations_popup_description, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, "BOTTOM_DIALOG_DELEGATES_KEY", null, null, null, 3832));
                }
                break;
            case 1:
                ba6.l charity = (ba6.l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = charityDetailsScreen.d();
                Intrinsics.h(charity);
                com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar2 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) rVarE32;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(charity, "charity");
                cVar2.n2(new sx2.r(cVar2, charity, continuation, 23), new whi.b(6));
                break;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE33 = charityDetailsScreen.d();
                Intrinsics.h(bool);
                com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar3 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) rVarE33;
                cVar3.H2(cVar3.J, new rk.b(bool.booleanValue(), 12));
                break;
        }
        return Unit.f186387a;
    }
}
