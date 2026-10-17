package com.revolut.retail.feature.pending_payments.impl.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/impl/common/PendingPaymentBottomSheetDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pending_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PendingPaymentBottomSheetDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PendingPaymentBottomSheetDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingPaymentBottomSheetInputData f102418a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PendingPaymentBottomSheetDestination(PendingPaymentBottomSheetInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPaymentBottomSheetDestination[i];
        }
    }

    public PendingPaymentBottomSheetDestination(PendingPaymentBottomSheetInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f102418a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PendingPaymentBottomSheetDestination) && Intrinsics.f(this.f102418a, ((PendingPaymentBottomSheetDestination) obj2).f102418a);
    }

    public final int hashCode() {
        return this.f102418a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f102418a.writeToParcel(dest, i);
    }
}
