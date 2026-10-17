package com.revolut.retail.feature.plan_gifting.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/plan_gifting/api/navigation/PricingPlanSenderFlow$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanSenderFlow$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PricingPlanSenderFlow$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f102455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbk.l f102456b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanSenderFlow$InputData((l) parcel.readSerializable(), kbk.l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanSenderFlow$InputData[i];
        }
    }

    public PricingPlanSenderFlow$InputData(l receiver, kbk.l source) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f102455a = receiver;
        this.f102456b = source;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getF102455a() {
        return this.f102455a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final kbk.l getF102456b() {
        return this.f102456b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanSenderFlow$InputData)) {
            return false;
        }
        PricingPlanSenderFlow$InputData pricingPlanSenderFlow$InputData = (PricingPlanSenderFlow$InputData) obj2;
        return Intrinsics.f(this.f102455a, pricingPlanSenderFlow$InputData.f102455a) && this.f102456b == pricingPlanSenderFlow$InputData.f102456b;
    }

    public final int hashCode() {
        return this.f102456b.hashCode() + (this.f102455a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f102455a);
        dest.writeString(this.f102456b.name());
    }
}
