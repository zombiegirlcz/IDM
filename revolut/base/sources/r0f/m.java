package r0f;

import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.topup.mcy.McyTopUpMethod;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreenContract$InputData;
import ip0.s7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigDecimal f250801c = new BigDecimal(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McyExchangeRateScreenContract$InputData f250802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2k.c f250803b;

    public m(McyExchangeRateScreenContract$InputData inputData, v2k.c taxesItemProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        this.f250802a = inputData;
        this.f250803b = taxesItemProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listL;
        g gVar;
        CellDetailsDelegate.Model model;
        CellDetailsActionDelegate.Model modelE;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        j71.c cVar = (j71.c) domainState.f250787a.getContent();
        j71.c cVar2 = (j71.c) domainState.f250787a.getContent();
        McyExchangeRateScreenContract$InputData mcyExchangeRateScreenContract$InputData = this.f250802a;
        if (cVar2 != null) {
            dj0.d dVar = cVar2.d;
            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("AMOUNT_ADDED_LIST_ID", new TextLocalisedClause(R$string.topup_mcy_exchange_rate_items_amount_title, null, null, 14), new MoneyClause(cVar2.f171832a, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("EXCHANGE_RATE_LIST_ID", new TextLocalisedClause(R$string.topup_mcy_exchange_rate_items_price_title, null, null, 14), new CompositeClause(v.k(new RateClause(f250801c, mcyExchangeRateScreenContract$InputData.f91087b.f115083b, new RateClause.Format.Default(null, true), null), new MoneyClause(mif.a.P(new ej0.b(new BigDecimal(String.valueOf(Math.pow(cVar2.f171834c.f272904a, -1))), mcyExchangeRateScreenContract$InputData.f91086a), 0, 3), new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12)), new TextClause(" =  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("EXCHANGED_LIST_ID", new TextLocalisedClause(R$string.topup_india_exchanged_title, null, null, 14), new MoneyClause(cVar2.f171833b, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_india_free_title, null, null, 14);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("FREE_LIST_ID", textLocalisedClause, Intrinsics.f(bigDecimalValueOf, BigDecimal.ZERO) ? new TextLocalisedClause(R$string.topup_india_review_transfer_no_fee, null, null, 14) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 13), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            z3l.a aVar = cVar2.e;
            if (aVar != null) {
                model = model2;
                modelE = this.f250803b.e(aVar);
            } else {
                model = model2;
                modelE = null;
            }
            Object[] elements = {model, model3, model4, model5, modelE, new CellDetailsDelegate.Model("TOTAL_LIST_ID", new TextLocalisedClause(R$string.topup_mcy_exchange_rate_items_estimated_total_proceeds_title, null, null, 14), new MoneyClause(cVar2.f, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
        } else {
            IntRange intRange = new IntRange(1, 6, 1);
            ArrayList arrayList = new ArrayList(w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList.add(new s7(a0.d.n("LOADING_LIST_ID-", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            listL = arrayList;
        }
        if (cVar == null) {
            gVar = null;
        } else {
            dj0.d dVar2 = cVar.f171833b;
            dj0.d dVar3 = cVar.f171832a;
            gVar = new g(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12), new PairedImage(new CurrencyImage(dVar2.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(dVar3.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null));
        }
        return new j(listL, gVar, new aw0.e(false, new TextLocalisedClause(R$string.topup_mcy_exchange_rate_footer_new, u.c(new TextLocalisedClause(R$string.topup_mcy_exchange_rate_footer_declaration_form, null, new Click(30, (Integer) null, (Object) null, "DECLARATION_FORM", false), 10)), null, 12), null, new n6(mcyExchangeRateScreenContract$InputData.e instanceof McyTopUpMethod.Stored ? new TextLocalisedClause(R$string.topup_title_add_money, null, null, 14) : new TextLocalisedClause(R$string.topup_india_review_transfer_action_make_payment, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53));
    }
}
