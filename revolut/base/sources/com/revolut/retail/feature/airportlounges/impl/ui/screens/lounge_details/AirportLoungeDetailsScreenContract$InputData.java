package com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/lounge_details/AirportLoungeDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungeDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AirportLoungeDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99108c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungeDetailsScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungeDetailsScreenContract$InputData[i];
        }
    }

    public AirportLoungeDetailsScreenContract$InputData(String loungeId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        this.f99106a = loungeId;
        this.f99107b = z;
        this.f99108c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungeDetailsScreenContract$InputData)) {
            return false;
        }
        AirportLoungeDetailsScreenContract$InputData airportLoungeDetailsScreenContract$InputData = (AirportLoungeDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99106a, airportLoungeDetailsScreenContract$InputData.f99106a) && this.f99107b == airportLoungeDetailsScreenContract$InputData.f99107b && Intrinsics.f(this.f99108c, airportLoungeDetailsScreenContract$InputData.f99108c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f99106a.hashCode() * 31, 31, this.f99107b);
        String str = this.f99108c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99106a);
        dest.writeInt(this.f99107b ? 1 : 0);
        dest.writeString(this.f99108c);
    }
}
