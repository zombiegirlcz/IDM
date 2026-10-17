package mh4;

import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.m;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditToRefinanceSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditToRefinanceSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = (y) creditToRefinanceSelectionScreen.R2();
                if (!yVar.I2().d.getLoading()) {
                    mv3.e eVar = yVar.I2().f;
                    if (eVar != null) {
                        j60.a aVar2 = yVar.f205411p;
                        m.b bVar = rp0.m.Companion;
                        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.refinancing_offer_credit_to_selection_fixed_term_bottom_sheet_title, zhm.u.c(new TextClause(eVar.f209117a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.refinancing_offer_credit_to_selection_fixed_term_bottom_sheet_subtitle, zhm.u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, eVar.f209118b)), null, 12), null, 28);
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        int i3 = R$string.refinancing_offer_credit_to_selection_fixed_term_bottom_sheet_action_primary;
                        mv3.d dVar = eVar.f209119c;
                        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_FIXED_TERM_PRIMARY_BUTTON", defaultFilledButton, null, new TextLocalisedClause(i3, zhm.u.c(new TextClause(dVar.f209115a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), false, null, null, dVar.f209116b, null, 744);
                        int i5 = R$attr.uikit_dp16;
                        yp0.b.r(model, i5, 0, i5, i5, 2);
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                        int i6 = R$string.refinancing_offer_credit_to_selection_fixed_term_bottom_sheet_action_secondary;
                        mv3.d dVar2 = eVar.d;
                        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_FIXED_TERM_SECONDARY_BUTTON", defaultFilledButton2, null, new TextLocalisedClause(i6, zhm.u.c(new TextClause(dVar2.f209115a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), false, null, null, dVar2.f209116b, null, 744);
                        int i21 = R$attr.uikit_dp16;
                        yp0.b.p(model2, i21, R$attr.uikit_dp24, i21, i21);
                        LargeActionButtonDelegate.Model[] elements = {model, model2};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        aVar2.x(dy4.b.b(bVar, kotlin.collections.d.L(elements), tVar, null, "REFINANCING_OFFER_DELEGATES_KEY", null, null, 892));
                    } else {
                        mv3.k kVar = yVar.I2().f205395g;
                        if (kVar == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        yVar.C2(new l(kVar, false));
                    }
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar2 = (y) creditToRefinanceSelectionScreen.R2();
                if (!yVar2.I2().d.getLoading()) {
                    yVar2.C2(n.f205400a);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar3 = (y) creditToRefinanceSelectionScreen.R2();
                yVar3.getClass();
                yVar3.n2(new u(yVar3, continuation, i2), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
