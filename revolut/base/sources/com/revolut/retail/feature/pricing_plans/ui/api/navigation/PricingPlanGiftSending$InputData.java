package com.revolut.retail.feature.pricing_plans.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanGiftSending$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanGiftSending$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PricingPlanGiftSending$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102958b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanGiftSending$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanGiftSending$InputData[i];
        }
    }

    public PricingPlanGiftSending$InputData(String receiverRevTag, String receiverVisibleName) {
        Intrinsics.checkNotNullParameter(receiverRevTag, "receiverRevTag");
        Intrinsics.checkNotNullParameter(receiverVisibleName, "receiverVisibleName");
        this.f102957a = receiverRevTag;
        this.f102958b = receiverVisibleName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF102957a() {
        return this.f102957a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF102958b() {
        return this.f102958b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanGiftSending$InputData)) {
            return false;
        }
        PricingPlanGiftSending$InputData pricingPlanGiftSending$InputData = (PricingPlanGiftSending$InputData) obj2;
        return Intrinsics.f(this.f102957a, pricingPlanGiftSending$InputData.f102957a) && Intrinsics.f(this.f102958b, pricingPlanGiftSending$InputData.f102958b);
    }

    public final int hashCode() {
        return this.f102958b.hashCode() + (this.f102957a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102957a);
        dest.writeString(this.f102958b);
    }
}
