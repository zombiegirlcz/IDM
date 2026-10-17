package com.revolut.retail.feature.airportlounges.impl.ui.screens.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesUnlimitedCountryProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AirportLoungesUnlimitedCountryProfile f99086c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData(parcel.readString(), parcel.readString(), (AirportLoungesUnlimitedCountryProfile) parcel.readParcelable(AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData[i];
        }
    }

    public AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData(String currentCountryName, String planNameWithUnlimitedPass, AirportLoungesUnlimitedCountryProfile airportLoungesUnlimitedCountryProfile) {
        Intrinsics.checkNotNullParameter(currentCountryName, "currentCountryName");
        Intrinsics.checkNotNullParameter(planNameWithUnlimitedPass, "planNameWithUnlimitedPass");
        this.f99084a = currentCountryName;
        this.f99085b = planNameWithUnlimitedPass;
        this.f99086c = airportLoungesUnlimitedCountryProfile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData)) {
            return false;
        }
        AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData airportLoungesHomeScreenContract$UnlimitedProfileSwitchData = (AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData) obj2;
        return Intrinsics.f(this.f99084a, airportLoungesHomeScreenContract$UnlimitedProfileSwitchData.f99084a) && Intrinsics.f(this.f99085b, airportLoungesHomeScreenContract$UnlimitedProfileSwitchData.f99085b) && Intrinsics.f(this.f99086c, airportLoungesHomeScreenContract$UnlimitedProfileSwitchData.f99086c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f99084a.hashCode() * 31, 31, this.f99085b);
        AirportLoungesUnlimitedCountryProfile airportLoungesUnlimitedCountryProfile = this.f99086c;
        return iC + (airportLoungesUnlimitedCountryProfile == null ? 0 : airportLoungesUnlimitedCountryProfile.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99084a);
        dest.writeString(this.f99085b);
        dest.writeParcelable(this.f99086c, i);
    }
}
