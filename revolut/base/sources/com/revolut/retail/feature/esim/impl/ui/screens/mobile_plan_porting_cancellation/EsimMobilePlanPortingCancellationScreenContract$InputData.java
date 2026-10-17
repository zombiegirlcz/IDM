package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_porting_cancellation/EsimMobilePlanPortingCancellationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPortingCancellationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPortingCancellationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant f101396b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanPortingCancellationScreenContract$InputData(parcel.readString(), (EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant) parcel.readParcelable(EsimMobilePlanPortingCancellationScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPortingCancellationScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanPortingCancellationScreenContract$InputData(String phoneNumber, EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant bottomSheetVariant) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(bottomSheetVariant, "bottomSheetVariant");
        this.f101395a = phoneNumber;
        this.f101396b = bottomSheetVariant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPortingCancellationScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanPortingCancellationScreenContract$InputData esimMobilePlanPortingCancellationScreenContract$InputData = (EsimMobilePlanPortingCancellationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101395a, esimMobilePlanPortingCancellationScreenContract$InputData.f101395a) && Intrinsics.f(this.f101396b, esimMobilePlanPortingCancellationScreenContract$InputData.f101396b);
    }

    public final int hashCode() {
        return this.f101396b.hashCode() + (this.f101395a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101395a);
        dest.writeParcelable(this.f101396b, i);
    }
}
