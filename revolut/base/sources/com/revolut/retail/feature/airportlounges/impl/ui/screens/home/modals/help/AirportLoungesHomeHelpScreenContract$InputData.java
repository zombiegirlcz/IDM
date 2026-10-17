package com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.k;
import svi.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/home/modals/help/AirportLoungesHomeHelpScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungesHomeHelpScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesHomeHelpScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f99101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f99102b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungesHomeHelpScreenContract$InputData((k) parcel.readSerializable(), (w) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesHomeHelpScreenContract$InputData[i];
        }
    }

    public AirportLoungesHomeHelpScreenContract$InputData(k pass, w wVar) {
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f99101a = pass;
        this.f99102b = wVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungesHomeHelpScreenContract$InputData)) {
            return false;
        }
        AirportLoungesHomeHelpScreenContract$InputData airportLoungesHomeHelpScreenContract$InputData = (AirportLoungesHomeHelpScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99101a, airportLoungesHomeHelpScreenContract$InputData.f99101a) && Intrinsics.f(this.f99102b, airportLoungesHomeHelpScreenContract$InputData.f99102b);
    }

    public final int hashCode() {
        int iHashCode = this.f99101a.hashCode() * 31;
        w wVar = this.f99102b;
        return iHashCode + (wVar == null ? 0 : wVar.f266012a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99101a);
        dest.writeSerializable(this.f99102b);
    }
}
