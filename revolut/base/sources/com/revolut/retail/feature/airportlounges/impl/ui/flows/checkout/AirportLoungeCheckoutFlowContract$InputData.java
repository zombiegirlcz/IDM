package com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/flows/checkout/AirportLoungeCheckoutFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungeCheckoutFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AirportLoungeCheckoutFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98956b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungeCheckoutFlowContract$InputData(parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungeCheckoutFlowContract$InputData[i];
        }
    }

    public AirportLoungeCheckoutFlowContract$InputData(int i, boolean z) {
        this.f98955a = i;
        this.f98956b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungeCheckoutFlowContract$InputData)) {
            return false;
        }
        AirportLoungeCheckoutFlowContract$InputData airportLoungeCheckoutFlowContract$InputData = (AirportLoungeCheckoutFlowContract$InputData) obj2;
        return this.f98955a == airportLoungeCheckoutFlowContract$InputData.f98955a && this.f98956b == airportLoungeCheckoutFlowContract$InputData.f98956b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98956b) + (Integer.hashCode(this.f98955a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98955a);
        dest.writeInt(this.f98956b ? 1 : 0);
    }
}
