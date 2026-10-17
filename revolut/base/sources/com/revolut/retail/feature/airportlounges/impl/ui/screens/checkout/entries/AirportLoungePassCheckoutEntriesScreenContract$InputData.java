package com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.i0;
import svi.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/entries/AirportLoungePassCheckoutEntriesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungePassCheckoutEntriesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AirportLoungePassCheckoutEntriesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f99066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f99067b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungePassCheckoutEntriesScreenContract$InputData(y.valueOf(parcel.readString()), (i0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungePassCheckoutEntriesScreenContract$InputData[i];
        }
    }

    public AirportLoungePassCheckoutEntriesScreenContract$InputData(y passType, i0 pricing) {
        Intrinsics.checkNotNullParameter(passType, "passType");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.f99066a = passType;
        this.f99067b = pricing;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungePassCheckoutEntriesScreenContract$InputData)) {
            return false;
        }
        AirportLoungePassCheckoutEntriesScreenContract$InputData airportLoungePassCheckoutEntriesScreenContract$InputData = (AirportLoungePassCheckoutEntriesScreenContract$InputData) obj2;
        return this.f99066a == airportLoungePassCheckoutEntriesScreenContract$InputData.f99066a && Intrinsics.f(this.f99067b, airportLoungePassCheckoutEntriesScreenContract$InputData.f99067b);
    }

    public final int hashCode() {
        return this.f99067b.hashCode() + (this.f99066a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99066a.name());
        dest.writeSerializable(this.f99067b);
    }
}
