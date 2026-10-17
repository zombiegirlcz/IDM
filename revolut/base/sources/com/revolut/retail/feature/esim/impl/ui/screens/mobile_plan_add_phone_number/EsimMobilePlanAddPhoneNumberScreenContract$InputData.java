package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_add_phone_number/EsimMobilePlanAddPhoneNumberScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanAddPhoneNumberScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanAddPhoneNumberScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101092a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanAddPhoneNumberScreenContract$InputData(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanAddPhoneNumberScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanAddPhoneNumberScreenContract$InputData(String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f101092a = subscriptionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EsimMobilePlanAddPhoneNumberScreenContract$InputData) && Intrinsics.f(this.f101092a, ((EsimMobilePlanAddPhoneNumberScreenContract$InputData) obj2).f101092a);
    }

    public final int hashCode() {
        return this.f101092a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101092a);
    }
}
