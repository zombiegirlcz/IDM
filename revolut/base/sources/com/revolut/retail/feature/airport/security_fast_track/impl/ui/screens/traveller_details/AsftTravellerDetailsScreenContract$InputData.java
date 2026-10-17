package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTermsAndConditions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/traveller_details/AsftTravellerDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftTravellerDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AsftTravellerDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98908c;
    public final boolean d;
    public final AsftTermsAndConditions e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftTravellerDetailsScreenContract$InputData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (AsftTermsAndConditions) parcel.readParcelable(AsftTravellerDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftTravellerDetailsScreenContract$InputData[i];
        }
    }

    public AsftTravellerDetailsScreenContract$InputData(int i, String prebookedSlotId, String str, boolean z, AsftTermsAndConditions asftTermsAndConditions) {
        Intrinsics.checkNotNullParameter(prebookedSlotId, "prebookedSlotId");
        this.f98906a = i;
        this.f98907b = prebookedSlotId;
        this.f98908c = str;
        this.d = z;
        this.e = asftTermsAndConditions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftTravellerDetailsScreenContract$InputData)) {
            return false;
        }
        AsftTravellerDetailsScreenContract$InputData asftTravellerDetailsScreenContract$InputData = (AsftTravellerDetailsScreenContract$InputData) obj2;
        return this.f98906a == asftTravellerDetailsScreenContract$InputData.f98906a && Intrinsics.f(this.f98907b, asftTravellerDetailsScreenContract$InputData.f98907b) && Intrinsics.f(this.f98908c, asftTravellerDetailsScreenContract$InputData.f98908c) && this.d == asftTravellerDetailsScreenContract$InputData.d && Intrinsics.f(this.e, asftTravellerDetailsScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.f98906a) * 31, 31, this.f98907b);
        String str = this.f98908c;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        AsftTermsAndConditions asftTermsAndConditions = this.e;
        return iC2 + (asftTermsAndConditions != null ? asftTermsAndConditions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98906a);
        dest.writeString(this.f98907b);
        dest.writeString(this.f98908c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }
}
