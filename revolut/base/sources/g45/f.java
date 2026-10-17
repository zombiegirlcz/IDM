package g45;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import aw0.u0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsControllerContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountDetailsControllerContract$InputData f140342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ky4.c f140343b;

    public f(AccountDetailsControllerContract$InputData inputData, ky4.c numberFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        this.f140342a = inputData;
        this.f140343b = numberFormatter;
    }

    @Override // cli.n
    public final o c(j jVar) {
        xi0.b bVar;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.credit_loan_sepa_direct_debit_external_account_screen_title;
        x35.b bVar2 = domainState.f140338a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(bVar2.d), null, 12);
        AccountDetailsControllerContract$InputData accountDetailsControllerContract$InputData = this.f140342a;
        dj0.d dVar = accountDetailsControllerContract$InputData.f70290b;
        Integer num = accountDetailsControllerContract$InputData.f70291c;
        CompositeClause compositeClause = (dVar == null || (bVar = dVar.f115083b) == null) ? null : new CompositeClause(v.k(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4), new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_screen_subtitle, null, null, 14)), null, null, null, 14);
        yy0.j jVar2 = new yy0.j(new UrlImage(bVar2.f302650c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902));
        CellDetailsDelegate.Model[] elements = {new CellDetailsDelegate.Model("account_owner_name_id", new t0((Clause) new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_details_name_label, null, null, 14), (Image) null, 0, false, 30), new TextClause(bVar2.f302651g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("iban_id", new t0((Clause) new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_details_iban_label, null, null, 14), (Image) null, 0, false, 30), new TextClause(bVar2.f.b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, u0.LARGE, 0, null, false, false, null, null, 32504), dVar != null ? new CellDetailsDelegate.Model("amount_id", new t0((Clause) new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_details_repayment_amount_label, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, dVar), null, null, null, null, 0, null, false, false, null, null, 32760) : null, num != null ? new CellDetailsDelegate.Model("day_id", new t0((Clause) new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_details_repayment_day_label, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.loan_management_account_repayment_date_detailed, u.c(new TextClause(this.f140343b.a(num), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new d(textLocalisedClause, compositeClause, jVar2, yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("account_details_list_subheader_id", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_details_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
    }
}
