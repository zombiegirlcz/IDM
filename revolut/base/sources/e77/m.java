package e77;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.giro.api.GiroToggles$GiroPocketSelector;
import com.revolut.feature.giro.api.R$string;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f123099a;

    public m(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f123099a = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f fVar;
        dj0.d dVar;
        CellDetailsDelegate.Model model;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_creditor, null, null, 14), (Image) null, 0, false, 30);
        FormState formState = domainState.f123092a;
        Biller biller = formState.f74553a;
        LocalDate localDate = formState.d;
        Biller.Details details = biller.k;
        String str = details != null ? details.f61152b : null;
        CellDetailsSwitcherDelegate.Model model2 = null;
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ID_CREDITOR_NAME", t0Var, new TextClause(str == null ? "" : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_creditor_id, null, null, 14), (Image) null, 0, false, 30);
        Biller biller2 = formState.f74553a;
        dj0.d dVar2 = formState.e;
        Biller.Details details2 = biller2.k;
        String str2 = details2 != null ? details2.f61151a : null;
        List listK = v.k(model3, new CellDetailsDelegate.Model("ID_CREDITOR_ID", t0Var2, new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("ID_CONSUMER_ID", new t0((Clause) new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_consumer_id, null, null, 14), (Image) null, 0, false, 30), new TextClause(formState.f74554b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        if (((jte.d) this.f123099a).c(GiroToggles$GiroPocketSelector.f74527c)) {
            fVar = domainState;
            CellDetailsActionDelegate.Model model4 = new CellDetailsActionDelegate.Model("ID_POCKET_SELECTOR_ID", new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_pocket_selection, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_pocket_selection_personal_currency, u.c(new CurrencyClause(fVar.f123093b.f74563b, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model4);
        } else {
            fVar = domainState;
        }
        CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("ID_START_DATE", new t0((Clause) new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_start_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, formState.f74555c, new LocalDateClause$DateFormat.DateMedium(0)), null, null, null, null, 0, null, false, false, null, null, 32760);
        CellDetailsDelegate.Model model6 = localDate == null ? null : new CellDetailsDelegate.Model("ID_END_DATE", new t0((Clause) new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_end_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.a(localDate, new LocalDateClause$DateFormat.DateMedium(0), null), null, null, null, null, 0, null, false, false, null, null, 32760);
        if (dVar2 != null) {
            dVar = dVar2;
            model = new CellDetailsDelegate.Model("ID_SINGLE_TRANSACTION_LIMIT", new t0((Clause) new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_single_transaction_limit, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        } else {
            dVar = dVar2;
            model = null;
        }
        if (dVar != null) {
            model2 = new CellDetailsSwitcherDelegate.Model("ID_NOTIFY_DEBIT_LIMIT", new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_notify_creditor_debit_limit, null, null, 14), fVar.f123094c, true, 0, null, null, null, 4080);
        }
        qv0.i[] elements = {model5, model6, model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        return new i(u.a(eVarB));
    }
}
