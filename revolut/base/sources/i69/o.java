package i69;

import android.os.Parcelable;
import aw0.c7;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.masav.api.R$string;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        io3.d dVar = domainState.f158894b;
        xi0.a aVar = xi0.b.Companion;
        String str = dVar.f163147c;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        eVarB.addAll(yp0.b.i(new RowDelegate.Model("LIST_ID_CURRENCY_CHOOSER", new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, new CurrencyClause(bVarA, null, null, 6), new MoneyClause(new dj0.d(dVar.i, bVarA), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, 0, new pf(new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_payment_from_change, null, null, 14), null, null, false, null, null, 510), true, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735532), new ListSubheaderDelegate.Model("LIST_ID_CURRENCY_CHOOSER_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_section_payment_from_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        DirectDebitData directDebitData = domainState.f158893a;
        Biller biller = directDebitData.f78095a;
        eVarB.addAll(yp0.b.g(v.k(new CellDetailsDelegate.Model("LIST_ID_CREDITOR_NAME", new t0((Clause) new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_institution, null, null, 14), (Image) null, 0, false, 30), new TextClause(com.revolut.feature.apm.bills.billers.api.model.a.b(biller), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("LIST_ID_CREDITOR_ID", new t0((Clause) new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_institution_id, null, null, 14), (Image) null, 0, false, 30), new TextClause(com.revolut.feature.apm.bills.billers.api.model.a.a(biller), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("LIST_ID_REFERENCE", new t0((Clause) new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_customer_reference, null, null, 14), (Image) null, 0, false, 30), new TextClause(directDebitData.f78096b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760)), new ListSubheaderDelegate.Model("LIST_ID_CREDITOR_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_section_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LIST_ID_START_DATE", new t0((Clause) new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_start_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, directDebitData.f78097c, new LocalDateClause$DateFormat.DateMedium(0)), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_end_date, null, null, 14), (Image) null, 0, false, 30);
        LocalDate localDate = directDebitData.d;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("LIST_ID_END_DATE", t0Var, localDate == null ? new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_no_end_date, null, null, 14) : com.revolut.core.ui_kit.models.j.a(localDate, new LocalDateClause$DateFormat.DateMedium(0), null), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_single_transaction_limit, null, null, 14), (Image) null, 0, false, 30);
        dj0.d dVar2 = directDebitData.e;
        CellDetailsDelegate.Model[] elements = {model, model2, new CellDetailsDelegate.Model("LIST_ID_SINGLE_TRANSACTION_LIMIT", t0Var2, dVar2 == null ? new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_no_single_transaction_limit, null, null, 14) : new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        return new n(u.a(eVarB));
    }
}
