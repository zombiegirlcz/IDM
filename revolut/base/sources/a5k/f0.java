package a5k;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.strings_provider.R$string;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.transfer.BankTransferResultDialogFactory$BankTransferParcel;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.l1;
import nii.m0;
import nii.n1;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends yji.n {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BankTransferFlowInputData f1450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b0 f1451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cpf.c f1452n;
    public final jvh.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final til.m f1453p;

    public f0(BankTransferFlowInputData inputData, b0 dialogFactory, cpf.c transferResultHandlerExtension, jvh.a workflowInteractor, til.m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(transferResultHandlerExtension, "transferResultHandlerExtension");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.f1450l = inputData;
        this.f1451m = dialogFactory;
        this.f1452n = transferResultHandlerExtension;
        this.o = workflowInteractor;
        this.f1453p = workflowFlowProvider;
    }

    public final m0 Z2(Throwable throwable) {
        y0 y0VarA;
        Intrinsics.checkNotNullParameter(throwable, "error");
        b0 b0Var = this.f1451m;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = b0Var.f1438c.a(throwable);
        if (serverErrorA != null) {
            int i = serverErrorA.f51362a;
            if (i == 4110) {
                y0VarA = new y0("BankTransferResultDialogFactory#ID_STATUS_VIEW_INVALID_USER_TAX_ID", new nii.z(new TextLocalisedClause(R$string.error_api_4110, null, null, 14), null, new TextLocalisedClause(R.string.common_action_update, null, null, 14), new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), null, BankTransferResultDialogFactory$BankTransferParcel.INVALID_USER_TAX_ID, false, null, null, null, null, null, null, 32598), false, 4);
            } else {
                y0VarA = b0Var.f1437b.a(i);
            }
        } else {
            y0VarA = null;
        }
        if (y0VarA != null) {
            return y0VarA.f216244b;
        }
        return null;
    }

    public final void b3(n1 result, Function1 onFinish, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Parcelable parcelableA = result.a().a();
        BankTransferResultDialogFactory$BankTransferParcel bankTransferResultDialogFactory$BankTransferParcel = parcelableA instanceof BankTransferResultDialogFactory$BankTransferParcel ? (BankTransferResultDialogFactory$BankTransferParcel) parcelableA : null;
        int i = bankTransferResultDialogFactory$BankTransferParcel == null ? -1 : d0.f1442a[bankTransferResultDialogFactory$BankTransferParcel.ordinal()];
        if (i == -1) {
            ((wpf.c) this.f1452n).Z2(result, onFinish);
        } else {
            if (i != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (result instanceof l1) {
                T2(new a1a.c(3, this, onFinish, result, onComplete, (Continuation) null), new yi5.b(27));
            } else {
                onComplete.invoke();
            }
        }
    }

    public final m0 c3(kq2.b transferDetails, BankTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferDetails, "transferDetails");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        dj0.d amount = transferData.u;
        BankTransferFlowInputData bankTransferFlowInputData = this.f1450l;
        String beneficiaryName = n61.j.c(bankTransferFlowInputData.getF101940a());
        f5j.r rVar = bankTransferFlowInputData.getF101940a().f132335l;
        b0 b0Var = this.f1451m;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        TextClause textClause = new TextClause(beneficiaryName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        return ((rVar == null ? -1 : a0.f1432a[rVar.ordinal()]) == 1 ? new y0("TransferResultHandlerExtension#ID_STATUS_VIEW_OUTGOING_PENDING", new g0(new TextLocalisedClause(com.revolut.retail.feature.payments.bank_transfer.impl.R$string.payments_send_check_result_workflow_pending_title, zhm.v.k(textClause, new MoneyClause(amount.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, null, null, null, false, null, false, null, 16380), false, 4) : ((wpf.a) b0Var.f1436a).a(amount.a(), textClause)).f216244b;
    }
}
