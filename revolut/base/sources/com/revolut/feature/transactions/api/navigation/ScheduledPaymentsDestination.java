package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScheduledPaymentsDestination extends InternalDestination<ScheduledPaymentsInputData> {

    @NotNull
    public static final Parcelable.Creator<ScheduledPaymentsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledPaymentsInputData f91969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoomTarget f91970c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScheduledPaymentsDestination(ScheduledPaymentsInputData.CREATOR.createFromParcel(parcel), (ZoomTarget) parcel.readParcelable(ScheduledPaymentsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScheduledPaymentsDestination[i];
        }
    }

    public ScheduledPaymentsDestination() {
        this((ScheduledPaymentsInputData) null, 3);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0 */
    public final TransitionAnimation getF() {
        ZoomTarget zoomTarget = this.f91970c;
        if (zoomTarget == null) {
            return null;
        }
        TransitionAnimation.Companion companion = TransitionAnimation.INSTANCE;
        HomeOverlayConfig.INSTANCE.getClass();
        return com.revolut.kompot.common.transition.a.d(companion, zoomTarget, HomeOverlayConfig.f59654b);
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f91969b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScheduledPaymentsDestination)) {
            return false;
        }
        ScheduledPaymentsDestination scheduledPaymentsDestination = (ScheduledPaymentsDestination) obj2;
        return Intrinsics.f(this.f91969b, scheduledPaymentsDestination.f91969b) && Intrinsics.f(this.f91970c, scheduledPaymentsDestination.f91970c);
    }

    public final int hashCode() {
        int iHashCode = this.f91969b.hashCode() * 31;
        ZoomTarget zoomTarget = this.f91970c;
        return iHashCode + (zoomTarget == null ? 0 : zoomTarget.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f91969b.writeToParcel(dest, i);
        dest.writeParcelable(this.f91970c, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPaymentsDestination(ScheduledPaymentsInputData inputData, ZoomTarget zoomTarget) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f91969b = inputData;
        this.f91970c = zoomTarget;
    }

    public /* synthetic */ ScheduledPaymentsDestination(ScheduledPaymentsInputData scheduledPaymentsInputData, int i) {
        this((i & 1) != 0 ? new ScheduledPaymentsInputData((RecurringPaymentAccount) null, (ScheduledPaymentsInputData.InitialAction) null, 7) : scheduledPaymentsInputData, (ZoomTarget) null);
    }
}
