package cd4;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.m;
import rp0.t;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditLinkedAccountsV2ListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CreditLinkedAccountsV2ListScreen creditLinkedAccountsV2ListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditLinkedAccountsV2ListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f53228a;
        boolean zF = Intrinsics.f(str, "id_linked_account_item_list");
        CreditLinkedAccountsV2ListScreen creditLinkedAccountsV2ListScreen = this.v;
        if (zF) {
            i iVarI3 = creditLinkedAccountsV2ListScreen.T2();
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.core.model.domain.wallet.pocket.Pocket");
            io3.d pocket = (io3.d) obj3;
            k kVar = (k) iVarI3;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            kVar.C1(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(pocket, (AccountId) AccountId.Personal.f51414a, true, true, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, true, 2032)));
        } else if (Intrinsics.f(str, "id_revolut_account_item_list")) {
            k kVar2 = (k) creditLinkedAccountsV2ListScreen.T2();
            j60.a aVar2 = kVar2.f23181p;
            kVar2.f23182q.getClass();
            m.b bVar = rp0.m.Companion;
            t tVar = new t(new TextLocalisedClause(R$string.linked_accounts_v2_hub_revolut_popup_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v2_hub_revolut_popup_description, null, null, 14), null, 28);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_WHY_IN_THE_LIST_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_hub_revolut_popup_button, null, null, 14), false, null, null, null, null, 1000);
            int i = R$attr.uikit_dp24;
            yp0.b.r(model2, i, i, 0, 0, 12);
            aVar2.x(dy4.b.b(bVar, u.c(model2), tVar, rp0.l.WINDOW, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}
