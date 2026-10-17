package i65;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalControllerContract$InputData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import mx4.f0;
import mx4.z;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanConfirmWithdrawalControllerContract$InputData f158876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f158877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f158878c;

    public t(LoanConfirmWithdrawalControllerContract$InputData inputData, f0 headerMapper, z creditScreenConstructorMapper, ix4.b checkboxValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        Intrinsics.checkNotNullParameter(checkboxValidator, "checkboxValidator");
        this.f158876a = inputData;
        this.f158877b = headerMapper;
        this.f158878c = creditScreenConstructorMapper;
    }

    public static n6 a(z45.b bVar, int i, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton, boolean z) {
        return m6.c(n6.Companion, new TextLocalisedClause(i, u.c(bVar.f319313a), null, 12), defaultFilledButton, null, null, z, null, null, bVar.f319314b, 476);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LoanConfirmWithdrawalControllerContract$InputData loanConfirmWithdrawalControllerContract$InputData = this.f158876a;
        hx4.a aVarA = this.f158877b.a(loanConfirmWithdrawalControllerContract$InputData.f70369b.f319318a, R$string.loan_management_cancellation_confirmation_title);
        z45.d dVar = loanConfirmWithdrawalControllerContract$InputData.f70369b;
        ArrayList arrayListB = this.f158878c.b(dVar.d, domainState.f158862a);
        n6 n6VarA = a(dVar.f319319b, R$string.loan_management_cancellation_confirmation_button_primary, LargeActionButton.ButtonStyle.f58725a, ix4.b.a(dVar.d, domainState.f158862a));
        z45.b bVar = dVar.f319320c;
        n6 n6VarA2 = bVar != null ? a(bVar, R$string.loan_management_cancellation_confirmation_button_secondary, LargeActionButton.ButtonStyle.f58726b, true) : null;
        return new o(arrayListB, aVarA, n6VarA2 == null ? new aw0.e(false, null, null, n6VarA, null, null, 55) : new aw0.h(false, n6VarA, n6VarA2, null, null, null, 121));
    }
}
