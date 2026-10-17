package kkf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h3 {

    @NotNull
    public static final e3 Companion = new e3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m35.k f184719b;

    public h3(klf.h0 commonDataSource, m35.k loanSharedItemsFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(loanSharedItemsFactory, "loanSharedItemsFactory");
        this.f184718a = commonDataSource;
        this.f184719b = loanSharedItemsFactory;
    }

    public static final MoneyClause a(tof.a3 a3Var, Long... lArr) {
        List list = (List) ue0.e.M(kotlin.collections.d.L(lArr));
        if (list != null) {
            return new MoneyClause(new dj0.d(zhm.d0.U0(list), a3Var.f272606p.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        return null;
    }

    public static CellDetailsDelegate.Model b(String str, b95.a aVar) {
        TextLocalisedClause textLocalisedClause;
        int i = aVar == null ? -1 : f3.f184677a[aVar.ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.loan_management_transaction_loan, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.loan_management_transaction_mortgage, null, null, 14);
        }
        return new CellDetailsDelegate.Model("loan-name-item", new aw0.t0((Clause) textLocalisedClause, (Image) null, 0, false, 28), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : aVar == b95.a.MORTGAGE_LOAN ? new TextLocalisedClause(R$string.credit_loan_account_product_name_mortgage, null, null, 14) : new TextLocalisedClause(R$string.loan_management_details_personal_loan, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
