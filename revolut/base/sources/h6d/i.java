package h6d;

import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationOfPayeeScreenContract$InputData f149618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f149619b;

    public i(ConfirmationOfPayeeScreenContract$InputData inputData, c copCommonDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(copCommonDialogMapper, "copCommonDialogMapper");
        this.f149618a = inputData;
        this.f149619b = copCommonDialogMapper;
    }
}
