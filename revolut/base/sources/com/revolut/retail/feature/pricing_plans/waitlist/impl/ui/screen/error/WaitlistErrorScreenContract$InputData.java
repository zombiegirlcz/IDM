package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/error/WaitlistErrorScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WaitlistErrorScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WaitlistErrorScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gok.a f103696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanWaitlistEntry f103697b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WaitlistErrorScreenContract$InputData(gok.a.valueOf(parcel.readString()), (PricingPlanWaitlistEntry) parcel.readParcelable(WaitlistErrorScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WaitlistErrorScreenContract$InputData[i];
        }
    }

    public WaitlistErrorScreenContract$InputData(gok.a errorType, PricingPlanWaitlistEntry entry) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f103696a = errorType;
        this.f103697b = entry;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WaitlistErrorScreenContract$InputData)) {
            return false;
        }
        WaitlistErrorScreenContract$InputData waitlistErrorScreenContract$InputData = (WaitlistErrorScreenContract$InputData) obj2;
        return this.f103696a == waitlistErrorScreenContract$InputData.f103696a && Intrinsics.f(this.f103697b, waitlistErrorScreenContract$InputData.f103697b);
    }

    public final int hashCode() {
        return this.f103697b.hashCode() + (this.f103696a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103696a.name());
        dest.writeParcelable(this.f103697b, i);
    }
}
