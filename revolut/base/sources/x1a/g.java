package x1a;

import cli.k;
import cli.y;
import cli.z;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends oki.h implements z {
    public final RecurringPaymentsManageSplitDialogContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1a.g f302360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f302361q;

    public g(RecurringPaymentsManageSplitDialogContract$InputData inputData, k1a.g recurringSplitInteractor, com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.b stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringSplitInteractor, "recurringSplitInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f302360p = recurringSplitInteractor;
        this.f302361q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f302361q;
    }
}
