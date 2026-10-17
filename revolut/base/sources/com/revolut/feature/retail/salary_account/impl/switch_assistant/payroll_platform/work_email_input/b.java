package com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData;
import ip0.lr;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhb.e;
import zhb.l;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayrollPlatformEmailInputContract$InputData f83060a;

    public b(PayrollPlatformEmailInputContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f83060a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        zhb.a domainState = (zhb.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        zhb.b bVar = domainState.f322381b;
        String str = bVar.f322382a;
        String str2 = domainState.f322380a;
        boolean z = Intrinsics.f(str, str2) && bVar.f322383b;
        zhb.b bVar2 = domainState.f322381b;
        boolean z3 = (d0.W(str2) || !Intrinsics.f(bVar2.f322382a, str2) || bVar2.f322383b) ? false : true;
        TextClause textClause = new TextClause(domainState.f322380a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        PayrollPlatformEmailInputContract$InputData.UpdatePayrollPlatform updatePayrollPlatform = PayrollPlatformEmailInputContract$InputData.UpdatePayrollPlatform.f83058a;
        PayrollPlatformEmailInputContract$InputData payrollPlatformEmailInputContract$InputData = this.f83060a;
        if (Intrinsics.f(payrollPlatformEmailInputContract$InputData, updatePayrollPlatform)) {
            i = R$string.salary_switch_assistant_payroll_platform_email_input_email_placeholder;
        } else {
            if (!(payrollPlatformEmailInputContract$InputData instanceof PayrollPlatformEmailInputContract$InputData.AccountToWorkEmail)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.salary_switch_assistant_account_to_work_email_input_email_placeholder;
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, null, null, 14);
        lr lrVar = new lr(33);
        if (z3) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.salary_switch_assistant_payroll_platform_email_input_email_error, null, null, 14);
        } else {
            if (!(payrollPlatformEmailInputContract$InputData instanceof PayrollPlatformEmailInputContract$InputData.UpdatePayrollPlatform)) {
                textLocalisedClause = null;
                InputTextDelegate.Model model = new InputTextDelegate.Model("EMAIL_INPUT_ID", textClause, textLocalisedClause3, null, false, null, false, textLocalisedClause, null, null, null, null, null, false, null, null, z3, false, false, false, lrVar, 6, null, null, false, false, "emailAddress", 1, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -945946760, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new e(u.c(model), z);
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.salary_switch_assistant_payroll_platform_email_input_email_helper, null, null, 14);
        }
        textLocalisedClause = textLocalisedClause2;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("EMAIL_INPUT_ID", textClause, textLocalisedClause3, null, false, null, false, textLocalisedClause, null, null, null, null, null, false, null, null, z3, false, false, false, lrVar, 6, null, null, false, false, "emailAddress", 1, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -945946760, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new e(u.c(model2), z);
    }
}
