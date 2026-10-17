package pzc;

import aw0.o9;
import bw0.l;
import bw0.m;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ne0.o;
import ozc.r0;
import ozc.s0;
import ozc.t;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f240942b;

    public /* synthetic */ e(k kVar, int i) {
        this.f240941a = i;
        this.f240942b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f240941a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                b bVar = (b) pair.f186385a;
                xi0.b currency = (xi0.b) pair.f186386b;
                dj0.d moneyAmount = new dj0.d(bVar.f240939a, currency);
                k kVar = this.f240942b;
                ozc.a aVar = kVar.k;
                dj0.d yearlyAmount = dj0.d.c(moneyAmount, bVar.f240940b, null, 2);
                String formattedAmount = kVar.f240951m.e(moneyAmount);
                ((ozc.k) aVar).getClass();
                Intrinsics.checkNotNullParameter(moneyAmount, "moneyAmount");
                Intrinsics.checkNotNullParameter(yearlyAmount, "yearlyAmount");
                Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
                TextClause textClause = new TextClause(currency.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                nx0.e eVar = nx0.e.AMOUNT;
                m mVar = new m(yoj.b.w(yoj.b.w(new MoneyClause(yearlyAmount, new MoneyClause.Format.Editable(), null, null, 12), new TextClause(" /", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextLocalisedClause(R$string.sow_money_input_info_year, null, null, 14)), l.INFO, null, false, null, 28);
                Intrinsics.checkNotNullParameter(currency, "currency");
                AmountEditDelegate.Model model = new AmountEditDelegate.Model("AMOUNT_LIST_ITEM_ID", textClause, new bw0.h(formattedAmount, cp5.d.J(currency), true, null, Boolean.TRUE, false, false, false, false, null, 8148), eVar, null, null, mVar, false, currency, null, 1680);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                return u.c(model);
            case 1:
                List currencies = (List) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                k kVar2 = this.f240942b;
                ozc.f fVar = kVar2.f240950l;
                ozc.k kVar3 = (ozc.k) kVar2.k;
                kVar3.getClass();
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                List<xi0.b> list = currencies;
                ArrayList currencies2 = new ArrayList(w.t(list, 10));
                for (xi0.b bVar2 : list) {
                    String str = bVar2.f306286a;
                    String str2 = bVar2.f306286a;
                    String strA = kVar3.f231288b.a(bVar2);
                    currencies2.add(new ChooserScreenContract$Model(str, strA == null ? str2 : strA, null, null, str2, new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), false, bVar2, 24924));
                }
                r0 r0Var = (r0) fVar;
                r0Var.getClass();
                Intrinsics.checkNotNullParameter(currencies2, "currencies");
                pfm.h hVar = new pfm.h(new o(r0Var, currencies2, 26), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 2:
                List list2 = (List) obj2;
                rri.a aVar2 = (c) this.f240942b.L();
                if (aVar2 != null) {
                    Intrinsics.h(list2);
                    ((BaseLayoutBuilderFragment) aVar2).setItems(list2);
                }
                return Unit.f186387a;
            case 3:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((qri.b) this.f240942b.f240950l).m();
            case 4:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                String str3 = (String) pair2.f186385a;
                xi0.b bVar3 = (xi0.b) pair2.f186386b;
                k kVar4 = this.f240942b;
                return te0.w.z0(((s0) ((t) kVar4.f240949j).f231329b).x0(), Long.valueOf(kVar4.f240951m.b(str3, bVar3.f306286a)));
            case 5:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                k kVar5 = this.f240942b;
                rzc.c cVar = (rzc.c) ((t) kVar5.f240949j).e;
                cVar.getClass();
                ufm.c cVar2 = new ufm.c(new nc0.a(cVar, 29), 2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                return new pfm.a(cVar2, new pz4.a(11, new e(kVar5, 1)), 4);
            default:
                xi0.b currency2 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency2, "currency");
                ozc.d dVar = this.f240942b.f240949j;
                String currencyCode = currency2.f306286a;
                t tVar = (t) dVar;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                return te0.w.A0(((s0) tVar.f231329b).z0(), currencyCode);
        }
    }
}
