package com.revolut.retail.feature.pricing_plans.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.SubscriptionPreviewId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/navigation/GlobalPlanSubscriptionPreview$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GlobalPlanSubscriptionPreview$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GlobalPlanSubscriptionPreview$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionPreviewId f102860a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GlobalPlanSubscriptionPreview$InputData((SubscriptionPreviewId) parcel.readParcelable(GlobalPlanSubscriptionPreview$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GlobalPlanSubscriptionPreview$InputData[i];
        }
    }

    public GlobalPlanSubscriptionPreview$InputData(SubscriptionPreviewId previewId) {
        Intrinsics.checkNotNullParameter(previewId, "previewId");
        this.f102860a = previewId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SubscriptionPreviewId getF102860a() {
        return this.f102860a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof GlobalPlanSubscriptionPreview$InputData) && Intrinsics.f(this.f102860a, ((GlobalPlanSubscriptionPreview$InputData) obj2).f102860a);
    }

    public final int hashCode() {
        return this.f102860a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102860a, i);
    }
}
