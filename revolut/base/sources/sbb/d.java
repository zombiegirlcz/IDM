package sbb;

import android.os.Parcelable;
import com.revolut.feature.retail.main_screen.container.models.action_payload.APMConfirmationPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends yji.n implements etb.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ad2.a f261538l;

    public d(ad2.a iDealRepository) {
        Intrinsics.checkNotNullParameter(iDealRepository, "iDealRepository");
        this.f261538l = iDealRepository;
    }

    @Override // etb.a
    public final void E(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        Parcelable parcelable = actionData.f83422b;
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        APMConfirmationPayload aPMConfirmationPayload = (APMConfirmationPayload) parcelable;
        if (!(aPMConfirmationPayload instanceof APMConfirmationPayload.IdealConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        T2(new c(this, (APMConfirmationPayload.IdealConfirmation) aPMConfirmationPayload, null), new yi5.b(27));
    }

    @Override // etb.a
    public final boolean i2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        return actionData.f83422b instanceof APMConfirmationPayload;
    }
}
