package ro2;

import cli.n;
import cli.y;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements dli.b {
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f255817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f255818q;

    public k(n stateMapper, BankAccountSwitchingPaymentScheduleScreenContract$InputData inputData, j60.a bottomExpandableDialogControllerExtension, b bottomSheetMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(bottomSheetMapper, "bottomSheetMapper");
        this.o = bottomExpandableDialogControllerExtension;
        this.f255817p = bottomSheetMapper;
        this.f255818q = mra.d.b(this, new h(inputData.f63954a, inputData.f63955b, inputData.f63956c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f255818q;
    }
}
