package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yvh.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/bottomsheet/spare_change/SpareChangeContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpareChangeContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SpareChangeContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f72011b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpareChangeContract$InputData(parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpareChangeContract$InputData[i];
        }
    }

    public SpareChangeContract$InputData(String charityId, b bVar) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f72010a = charityId;
        this.f72011b = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpareChangeContract$InputData)) {
            return false;
        }
        SpareChangeContract$InputData spareChangeContract$InputData = (SpareChangeContract$InputData) obj2;
        return Intrinsics.f(this.f72010a, spareChangeContract$InputData.f72010a) && Intrinsics.f(this.f72011b, spareChangeContract$InputData.f72011b);
    }

    public final int hashCode() {
        int iHashCode = this.f72010a.hashCode() * 31;
        b bVar = this.f72011b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72010a);
        dest.writeSerializable(this.f72011b);
    }
}
