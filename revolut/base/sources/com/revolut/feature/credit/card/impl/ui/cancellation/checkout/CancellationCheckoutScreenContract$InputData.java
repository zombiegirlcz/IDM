package com.revolut.feature.credit.card.impl.ui.cancellation.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/cancellation/checkout/CancellationCheckoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancellationCheckoutScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CancellationCheckoutScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f69102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RepaymentDeferral f69104c;
    public final PayoffBreakdown d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CancellationCheckoutScreenContract$InputData((d) parcel.readSerializable(), parcel.readString(), (RepaymentDeferral) parcel.readParcelable(CancellationCheckoutScreenContract$InputData.class.getClassLoader()), (PayoffBreakdown) parcel.readParcelable(CancellationCheckoutScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancellationCheckoutScreenContract$InputData[i];
        }
    }

    public CancellationCheckoutScreenContract$InputData(d repaymentAmount, String facilityId, RepaymentDeferral repaymentDeferral, PayoffBreakdown payoffBreakdown) {
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f69102a = repaymentAmount;
        this.f69103b = facilityId;
        this.f69104c = repaymentDeferral;
        this.d = payoffBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CancellationCheckoutScreenContract$InputData)) {
            return false;
        }
        CancellationCheckoutScreenContract$InputData cancellationCheckoutScreenContract$InputData = (CancellationCheckoutScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69102a, cancellationCheckoutScreenContract$InputData.f69102a) && Intrinsics.f(this.f69103b, cancellationCheckoutScreenContract$InputData.f69103b) && Intrinsics.f(this.f69104c, cancellationCheckoutScreenContract$InputData.f69104c) && Intrinsics.f(this.d, cancellationCheckoutScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f69102a.hashCode() * 31, 31, this.f69103b);
        RepaymentDeferral repaymentDeferral = this.f69104c;
        int iHashCode = (iC + (repaymentDeferral == null ? 0 : repaymentDeferral.hashCode())) * 31;
        PayoffBreakdown payoffBreakdown = this.d;
        return iHashCode + (payoffBreakdown != null ? payoffBreakdown.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f69102a);
        dest.writeString(this.f69103b);
        dest.writeParcelable(this.f69104c, i);
        dest.writeParcelable(this.d, i);
    }
}
