package c45;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsControllerContract$ChangeAccountParcel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jmrtd.cbeff.ISO781611;
import x35.e;
import x35.h;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    public static TextClause a(e eVar, w35.a aVar) {
        String strA;
        h hVarB = eVar.b();
        int i = a.f21079b[aVar.ordinal()];
        if (i == 1) {
            strA = hVarB.a();
        } else if (i == 2) {
            strA = hVarB.b();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            strA = j6.a.q("····", f0.V0(4, hVarB.f302658a));
        }
        return new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static RetailBadge e(e account) {
        Intrinsics.checkNotNullParameter(account, "account");
        if (account instanceof x35.a) {
            return RetailBadge.f58066a;
        }
        if ((account instanceof x35.b) || (account instanceof x35.d)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause f(x35.d dVar) {
        return new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_account_details_internal_description, u.c(new MoneyClause(dVar.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }

    public final Clause b(e account, w35.a externalIbanFormat) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(externalIbanFormat, "externalIbanFormat");
        if (account instanceof x35.d) {
            return f((x35.d) account);
        }
        if (account instanceof x35.b) {
            return a(account, externalIbanFormat);
        }
        if (account instanceof x35.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause c(e account) {
        Intrinsics.checkNotNullParameter(account, "account");
        if (account instanceof x35.d) {
            return f((x35.d) account);
        }
        if ((account instanceof x35.b) || (account instanceof x35.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Image d(e account) {
        Intrinsics.checkNotNullParameter(account, "account");
        if (account instanceof x35.d) {
            return new CurrencyImage(((x35.d) account).d.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (account instanceof x35.b) {
            return new UrlImage(((x35.b) account).f302650c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
        }
        if (!(account instanceof x35.a)) {
            throw new NoWhenBranchMatchedException();
        }
        x35.a aVar = (x35.a) account;
        return new ContactImage(aVar.f302649c, (String) null, (String) null, (String) null, (String) null, aVar.f302655b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062);
    }

    public final Clause g(e account) {
        Intrinsics.checkNotNullParameter(account, "account");
        if (!(account instanceof x35.d)) {
            if (account instanceof x35.b) {
                return new TextClause(((x35.b) account).d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            if (account instanceof x35.a) {
                return new TextClause(((x35.a) account).f302655b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            throw new NoWhenBranchMatchedException();
        }
        x35.d dVar = (x35.d) account;
        x35.c cVar = dVar.e;
        dj0.d dVar2 = dVar.d;
        int i = a.f21078a[cVar.ordinal()];
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (i == 1) {
            return new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_account_details_personal_title, u.c(new CurrencyClause(dVar2.f115083b, ticker, null, 4)), null, 12);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_account_details_joint_title, u.c(new CurrencyClause(dVar2.f115083b, ticker, null, 4)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RowDelegate.Model h(Parcelable parcelable) {
        return new RowDelegate.Model("empty_account_list_id", null, new TextLocalisedClause(R$string.loan_management_manage_repayments_mandate_set_up, null, null, 14), null, 0, null, null, null, 0, new pf(new TextLocalisedClause(R$string.loan_management_manage_repayments_account_change, null, null, 14), null, null, false, parcelable, null, 478), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
    }

    public final RowDelegate.Model i(e account, LoanManageRepaymentsControllerContract$ChangeAccountParcel loanManageRepaymentsControllerContract$ChangeAccountParcel) {
        Intrinsics.checkNotNullParameter(account, "account");
        Clause clauseG = g(account);
        TextLocalisedClause textLocalisedClauseC = c(account);
        return new RowDelegate.Model("account_list_id", new RowDelegate.Model.MainImage.Image40(d(account), e(account), null, false, null, false, 60), clauseG, null, 0, textLocalisedClauseC, null, null, 0, loanManageRepaymentsControllerContract$ChangeAccountParcel != null ? new pf(new TextLocalisedClause(R$string.loan_management_manage_repayments_account_change, null, null, 14), null, null, false, loanManageRepaymentsControllerContract$ChangeAccountParcel, null, 478) : null, loanManageRepaymentsControllerContract$ChangeAccountParcel != null, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    public final RowDelegate.Model j(e account, Parcelable parcelable, w35.a externalIbanFormat) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(externalIbanFormat, "externalIbanFormat");
        Clause clauseG = g(account);
        Clause clauseB = b(account, externalIbanFormat);
        return new RowDelegate.Model("account_list_id", new RowDelegate.Model.MainImage.Image40(d(account), e(account), null, false, null, false, 60), clauseG, null, 0, clauseB, null, null, 0, parcelable != null ? new pf(new TextLocalisedClause(R$string.loan_management_manage_repayments_account_change, null, null, 14), null, null, false, parcelable, null, 478) : null, parcelable != null, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }
}
