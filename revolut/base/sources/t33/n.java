package t33;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_payment_method.api.declaration.CardPaymentMethodFeatureConfig;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import com.revolut.feature.cards_core.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import e93.l0;
import ip0.jh0;
import ip0.lh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f267622b;

    public /* synthetic */ n(w wVar, int i) {
        this.f267621a = i;
        this.f267622b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        int i = this.f267621a;
        w wVar = this.f267622b;
        switch (i) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, wVar.o);
                return Unit.f186387a;
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String name = (String) pair.f186385a;
                l0 virtualCardLabelType = (l0) pair.f186386b;
                l lVar = (l) wVar.f267631j;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
                InputTextDelegate.Model model = new InputTextDelegate.Model("VIRTUAL_CARD_NAME_INPUT_FIELD_ID", new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.card_action_name_your_card_input_title, null, null, 14), null, null, null, null, true, 20, false, true, 0, true, 0, true, false, true, lVar.d, false, false, 0, false, false, null, 855195640, 131071);
                int i2 = R$attr.uikit_dp16;
                yp0.b.l(model, i2, 0, i2, i2, null, false, 50);
                int i3 = k.f267614a[virtualCardLabelType.ordinal()];
                if (i3 == 1) {
                    list = lVar.f267616b;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = lVar.f267617c;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    int iIntValue = ((Number) it9.next()).intValue();
                    String string = lVar.f267615a.getString(iIntValue);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(new SuggestionsBarDelegate.Suggestion(string, new TextLocalisedClause(iIntValue, null, null, 14), null, name.equals(string) ? lh0.ACCENT : lh0.SEMIACCENT, null, false, string, null, 372));
                }
                return zhm.v.k(model, new nh("SUGGESTIONS_BAR_LIST_ID", arrayList, null, jh0.HORIZONTAL_SCROLLER, 0, 0, 0, 0, 0, 32756));
            case 2:
                n93.h result = (n93.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return wVar.f267635p.c0(result.f213561b);
            case 3:
                SelectedPaymentMethodResultContract$SelectedCardBindingStrategy strategy = (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) obj2;
                d dVar = wVar.i;
                Intrinsics.h(strategy);
                m mVar = (m) dVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(strategy, "strategy");
                ((y) mVar.f267618a).A0().set(strategy);
                return Unit.f186387a;
            case 4:
                SelectedPaymentMethodResultContract$SelectedCardBindingStrategy it10 = (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((m) wVar.i).a();
            case 5:
                Boolean shouldBindToPocket = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(shouldBindToPocket, "shouldBindToPocket");
                return shouldBindToPocket.booleanValue() ? ((x) wVar.f267636q).f267638a.a(new FeatureCommand(new CardPaymentMethodFeatureConfig.SelectPaymentMethod(new SelectPaymentMethodInputData(new SelectPaymentMethodInputData.UseCase.OrderNewCard(com.revolut.feature.card_payment_method.api.declaration.a.CRYPTO, true, 1))))) : ((m) wVar.i).a();
            case 6:
                String name2 = (String) obj2;
                d dVar2 = wVar.i;
                Intrinsics.h(name2);
                m mVar2 = (m) dVar2;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(name2, "name");
                y yVar = (y) mVar2.f267618a;
                yVar.f.getValue(yVar, y.f267639l[4]).set(name2);
                return Unit.f186387a;
            case 7:
                SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) obj2;
                Intrinsics.checkNotNullParameter(suggestion, "suggestion");
                pfm.h hVar = new pfm.h(new rzc.b(wVar, suggestion, 15), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 8:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return wVar.Q();
            case 9:
                ((m) wVar.i).d = true;
                return wVar.Q();
            default:
                wVar.f267632l.f(new TextLocalisedClause(((Boolean) obj2).booleanValue() ? R$string.card_label_button_continue : R$string.card_label_button_create_card, null, null, 14));
                return Unit.f186387a;
        }
    }
}
