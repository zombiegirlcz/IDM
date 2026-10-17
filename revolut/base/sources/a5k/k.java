package a5k;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.t1;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import w4k.b;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankTransferData f1464c;

    public /* synthetic */ k(t tVar, BankTransferData bankTransferData, int i) {
        this.f1462a = i;
        this.f1463b = tVar;
        this.f1464c = bankTransferData;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        int i = this.f1462a;
        Clause compositeClause = null;
        BankTransferData transferData = this.f1464c;
        t tVar = this.f1463b;
        switch (i) {
            case 0:
                qua.p recurringPayment = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(recurringPayment, "result");
                f0 f0Var = tVar.f1486l;
                f0Var.getClass();
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                b0 b0Var = f0Var.f1451m;
                dj0.d amount = transferData.u;
                String beneficiaryName = n61.j.c(f0Var.f1450l.getF101940a());
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
                TextClause textClause = new TextClause(beneficiaryName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Period period = recurringPayment.f249314a.f160151b;
                jli.c cVarK = period != null ? jli.e.k(period) : null;
                LocalDate localDate = recurringPayment.f249314a.e;
                if (cVarK == null || localDate == null || !edl.a.m(localDate)) {
                    if (cVarK != null && localDate != null) {
                        java.time.LocalDate localDateE = jli.b.e(localDate);
                        Clause clauseE = epf.b.e(cVarK);
                        LocalDateTime localDateTimeAtStartOfDay = localDateE.atStartOfDay();
                        Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "atStartOfDay(...)");
                        long jR = oi0.d.R(localDateTimeAtStartOfDay);
                        TimeClause.Format.INSTANCE.getClass();
                        textLocalisedClause = new TextLocalisedClause(R$string.payments_bank_transfer_result_success_scheduled_description_recurring_from_date, zhm.v.k(clauseE, new TimeClause(jR, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                    } else if (localDate != null) {
                        LocalDateTime localDateTimeAtStartOfDay2 = jli.b.e(localDate).atStartOfDay();
                        Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay2, "atStartOfDay(...)");
                        long jR2 = oi0.d.R(localDateTimeAtStartOfDay2);
                        TimeClause.Format.INSTANCE.getClass();
                        textLocalisedClause = new TextLocalisedClause(R$string.payments_bank_transfer_result_success_scheduled_description_one_of, zhm.u.c(new TimeClause(jR2, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                    }
                    compositeClause = textLocalisedClause;
                } else {
                    compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.payments_bank_transfer_result_success_scheduled_description_recurring_from_today, zhm.u.c(epf.b.e(cVarK)), null, 12), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_bank_transfer_result_success_scheduled_description_recurring_first_payment, null, null, 14)), null, null, null, 14);
                }
                return ((wpf.a) b0Var.f1436a).b(amount.a(), textClause, compositeClause).f216244b;
            default:
                w4k.b transactionResult = (w4k.b) obj2;
                Intrinsics.checkNotNullParameter(transactionResult, "transactionResult");
                f0 f0Var2 = tVar.f1487m.f294621c;
                Intrinsics.checkNotNullParameter(transactionResult, "transactionResult");
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                if ((transactionResult instanceof w4k.a) || (transactionResult instanceof w4k.c) || Intrinsics.f(transactionResult, b.a.f294605a)) {
                    return null;
                }
                if (transactionResult instanceof w4k.d) {
                    return f0Var2.c3(((w4k.d) transactionResult).f294608a, transferData);
                }
                if (transactionResult instanceof w4k.e) {
                    return f0Var2.c3(((w4k.e) transactionResult).f294609a, transferData);
                }
                if (!(transactionResult instanceof w4k.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                w4k.g gVar = (w4k.g) transactionResult;
                bgf.h hVar = gVar.f294611b;
                int i2 = w4k.h.f294614b[gVar.f294610a.ordinal()];
                if (i2 == 1) {
                    bgf.e popup = hVar.f15198c;
                    if (popup == null) {
                        return null;
                    }
                    f0Var2.getClass();
                    Intrinsics.checkNotNullParameter(popup, "popup");
                    b0 b0Var2 = f0Var2.f1451m;
                    String title = popup.f15192b;
                    String str = popup.f15193c;
                    bgf.d dVar = popup.e;
                    String str2 = dVar != null ? dVar.f15190a : null;
                    b0Var2.getClass();
                    Intrinsics.checkNotNullParameter(title, "title");
                    return ((wpf.a) b0Var2.f1436a).d(title, str, str2).f216244b;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bgf.e popup2 = hVar.f15198c;
                if (popup2 == null) {
                    return null;
                }
                f0Var2.getClass();
                Intrinsics.checkNotNullParameter(popup2, "popup");
                b0 b0Var3 = f0Var2.f1451m;
                String title2 = popup2.f15192b;
                String str3 = popup2.f15193c;
                bgf.d dVar2 = popup2.e;
                String str4 = dVar2 != null ? dVar2.f15190a : null;
                b0Var3.getClass();
                Intrinsics.checkNotNullParameter(title2, "title");
                return ((wpf.a) b0Var3.f1436a).e(title2, str3, str4).f216244b;
        }
    }
}
