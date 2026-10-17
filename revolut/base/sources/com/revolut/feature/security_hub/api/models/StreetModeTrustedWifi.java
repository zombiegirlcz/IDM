package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/StreetModeTrustedWifi;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StreetModeTrustedWifi implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StreetModeTrustedWifi> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationDomain f85433c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StreetModeTrustedWifi(parcel.readString(), parcel.readString(), (LocationDomain) parcel.readParcelable(StreetModeTrustedWifi.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StreetModeTrustedWifi[i];
        }
    }

    public StreetModeTrustedWifi(String id10, String ssid, LocationDomain location) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f85431a = id10;
        this.f85432b = ssid;
        this.f85433c = location;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StreetModeTrustedWifi)) {
            return false;
        }
        StreetModeTrustedWifi streetModeTrustedWifi = (StreetModeTrustedWifi) obj2;
        return Intrinsics.f(this.f85431a, streetModeTrustedWifi.f85431a) && Intrinsics.f(this.f85432b, streetModeTrustedWifi.f85432b) && Intrinsics.f(this.f85433c, streetModeTrustedWifi.f85433c);
    }

    public final int hashCode() {
        return this.f85433c.hashCode() + p.a.c(this.f85431a.hashCode() * 31, 31, this.f85432b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85431a);
        dest.writeString(this.f85432b);
        dest.writeParcelable(this.f85433c, i);
    }
}
