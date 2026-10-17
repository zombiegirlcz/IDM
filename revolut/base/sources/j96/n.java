package j96;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.direct_deposit.impl.R$string;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import com.youTransactor.uCube.rpc.Constants;
import ip0.cp0;
import java.util.List;
import jul.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d96.b f172306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f172307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw6.m f172308c;

    public n(d96.b companyNameValidator, o decimalFormat) {
        Intrinsics.checkNotNullParameter(companyNameValidator, "companyNameValidator");
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        this.f172306a = companyNameValidator;
        this.f172307b = decimalFormat;
        this.f172308c = new cw6.m(3);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        InputTextDelegate.Model model;
        String strR;
        kj kjVar;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f172290a;
        DepositAmount amountToDeposit = domainState.f172291b;
        boolean z = this.f172306a.validate(str).f316033b.isEmpty() && amountToDeposit.a();
        String companyName = domainState.f172290a;
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("COMPANY_NAME_INPUT_ID", new TextClause(companyName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.direct_deposit_form_creation_company_name, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i = R$attr.uikit_dp16;
        yp0.b.l(model2, i, 0, i, i, null, false, 50);
        Intrinsics.checkNotNullParameter(amountToDeposit, "amountToDeposit");
        DepositAmount.EntirePaycheck entirePaycheck = DepositAmount.EntirePaycheck.f71945a;
        if (Intrinsics.f(amountToDeposit, entirePaycheck)) {
            textLocalisedClause = new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_full, null, null, 14);
        } else if (amountToDeposit instanceof DepositAmount.FixedAmount) {
            textLocalisedClause = new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_fixed, null, null, 14);
        } else {
            if (!(amountToDeposit instanceof DepositAmount.PercentageOfPaycheck)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_percentage, null, null, 14);
        }
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("AMOUNT_PICKER_INPUT_ID", textLocalisedClause, new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(model3, i2, 0, i2, i2, null, false, 50);
        InputTextDelegate.Model modelA = r.a(model3);
        Intrinsics.checkNotNullParameter(amountToDeposit, "amountToDeposit");
        if (Intrinsics.f(amountToDeposit, entirePaycheck)) {
            model = new InputTextDelegate.Model("ENTIRE_SALARY_FIELD_INPUT_ID", new TextClause("100%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_percentage, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, true, 8194, 0, null, false, false, null, false, u.c(this.f172308c), false, false, false, null, null, 0, -1076101128, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        } else if (amountToDeposit instanceof DepositAmount.PercentageOfPaycheck) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_percentage, null, null, 14);
            double d = ((DepositAmount.PercentageOfPaycheck) amountToDeposit).f71947a;
            if (d == 0.0d) {
                m70.a.c(t0.f186434a);
                strR = "";
            } else {
                strR = a0.d.r(this.f172307b.g(lzl.a.TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING, Double.valueOf(d)), "%");
            }
            model = new InputTextDelegate.Model("PERCENTAGE_AMOUNT_FIELD_INPUT_ID", new TextClause(strR, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause2, null, false, null, null, null, null, null, null, false, null, null, false, true, 8194, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -2359304, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        } else {
            if (!(amountToDeposit instanceof DepositAmount.FixedAmount)) {
                throw new NoWhenBranchMatchedException();
            }
            model = new InputTextDelegate.Model("FIXED_AMOUNT_FIELD_INPUT_ID", new MoneyClause(((DepositAmount.FixedAmount) amountToDeposit).f71946a, new MoneyClause.Format.Editable(), null, null, 12), new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_fixed, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, true, 8194, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -2359304, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        }
        InputTextDelegate.Model model4 = model;
        int i3 = R$attr.uikit_dp16;
        yp0.b.l(model4, i3, 0, i3, i3, null, false, 50);
        ListSubheaderDelegate.Model model5 = new ListSubheaderDelegate.Model("PREVIEW_ROW_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.direct_deposit_form_creation_preview_item_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.direct_deposit_form_creation_preview_item_button, null, null, 14), z, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
        String form = domainState.f172292c;
        if (form != null) {
            Intrinsics.checkNotNullParameter(form, "form");
            kjVar = new kj("DIRECT_DEPOSIT_FORM_ID", new lj(form, "utf-8"), new cp0(false, null, null, null, 114), Constants.TAG_FULL_SVPP_IDENTIFICATION);
        } else {
            kjVar = null;
        }
        koi.j[] elements = {model2, modelA, model4, model5, kjVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new d(kotlin.collections.d.L(elements), z);
    }
}
