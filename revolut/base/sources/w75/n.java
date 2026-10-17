package w75;

import c55.d0;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import d9.t0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c55.k f295483a;

    public n(c55.k loanBackupCardToggleCommonMapper, d0 loanRepaymentMethodsItemMapper) {
        Intrinsics.checkNotNullParameter(loanBackupCardToggleCommonMapper, "loanBackupCardToggleCommonMapper");
        Intrinsics.checkNotNullParameter(loanRepaymentMethodsItemMapper, "loanRepaymentMethodsItemMapper");
        this.f295483a = loanBackupCardToggleCommonMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f295469a;
        List list = domainState.f295470b;
        return new h(new TextLocalisedClause(t0.i(list) ? R$string.credit_loan_management_repayment_management_multi_borrower_title : R$string.loan_management_details_backup_card, null, null, 14), new TextLocalisedClause(t0.i(list) ? R$string.credit_loan_management_repayment_management_multi_borrower_description : R$string.backup_card_toggle_subtitle, null, null, 14), (List) iii.c.f(domainState.f295471c, new w6h.f(3), new w6b.a(4), new soc.f(this, 12, str, list)));
    }
}
