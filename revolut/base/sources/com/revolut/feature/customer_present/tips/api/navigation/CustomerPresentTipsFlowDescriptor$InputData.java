package com.revolut.feature.customer_present.tips.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/customer_present/tips/api/navigation/CustomerPresentTipsFlowDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_customer_present_tips_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomerPresentTipsFlowDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CustomerPresentTipsFlowDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71616b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomerPresentTipsFlowDescriptor$InputData((d) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomerPresentTipsFlowDescriptor$InputData[i];
        }
    }

    public CustomerPresentTipsFlowDescriptor$InputData(d cartAmount, boolean z) {
        Intrinsics.checkNotNullParameter(cartAmount, "cartAmount");
        this.f71615a = cartAmount;
        this.f71616b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomerPresentTipsFlowDescriptor$InputData)) {
            return false;
        }
        CustomerPresentTipsFlowDescriptor$InputData customerPresentTipsFlowDescriptor$InputData = (CustomerPresentTipsFlowDescriptor$InputData) obj2;
        return Intrinsics.f(this.f71615a, customerPresentTipsFlowDescriptor$InputData.f71615a) && this.f71616b == customerPresentTipsFlowDescriptor$InputData.f71616b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71616b) + (this.f71615a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71615a);
        dest.writeInt(this.f71616b ? 1 : 0);
    }
}
