package qna;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.main_screen_ui_customization.api.navigation.MainScreenUiCustomizationConfig$TabsOrderDestination;
import com.revolut.feature.profile.impl.ui.profile.screens.app_interface.AppInterfaceScreen;
import com.revolut.feature.tab.accounts.api.navigation.TransactionsCountPreviewDestination;
import com.revolut.feature.tab.crypto.api.navigation.CryptoCurrencyChangerDestination;
import com.revolut.feature.wealth.ui.api.navigation.currencychanger.WealthCurrencyChangerDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import qc0.e1;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AppInterfaceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AppInterfaceScreen appInterfaceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = appInterfaceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVar = (s) this.v.O.getValue();
        String listId = model.f53228a;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        String strE0 = d0.e0(listId, "ID_CUSTOMISABLE_TAB_VISIBILITY_");
        if (Intrinsics.f(strE0, listId)) {
            strE0 = null;
        }
        if (strE0 == null) {
            switch (listId.hashCode()) {
                case -1943967822:
                    if (listId.equals("ID_HIDE_TAB_BAR_LABELS_SWITCHER")) {
                        sVar.l2(new q(1, null, sVar), new yi5.b(26));
                    }
                    break;
                case -1843904664:
                    if (listId.equals("ID_HIDE_BOTTOM_BAR_SWITCHER")) {
                        sVar.l2(new q(2, null, sVar), new yi5.b(26));
                    }
                    break;
                case -1389451016:
                    if (listId.equals("ID_CHANGE_TABS_ORDER")) {
                        sVar.C1(MainScreenUiCustomizationConfig$TabsOrderDestination.f78068a);
                    }
                    break;
                case -1119631628:
                    if (listId.equals("ID_INVEST_DISPLAY_CURRENCY")) {
                        sVar.C1(WealthCurrencyChangerDestination.f95929b);
                    }
                    break;
                case 717301672:
                    if (listId.equals("ID_CRYPTO_DISPLAY_CURRENCY")) {
                        sVar.C1(CryptoCurrencyChangerDestination.f89777b);
                    }
                    break;
                case 769322841:
                    if (listId.equals("TRANSACTION_AMOUNT_ACTION_LIST_ID")) {
                        sVar.C1(TransactionsCountPreviewDestination.f89566b);
                    }
                    break;
            }
        } else {
            sVar.l2(new e1(sVar, strE0, null, 17), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
