package h6d;

import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationOfPayeeScreenContract$InputData f149613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f149614b;

    public e(ConfirmationOfPayeeScreenContract$InputData inputData, g6d.c copUtils, c copCommonDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(copUtils, "copUtils");
        Intrinsics.checkNotNullParameter(copCommonDialogMapper, "copCommonDialogMapper");
        this.f149613a = inputData;
        this.f149614b = copCommonDialogMapper;
    }
}
