package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/StreetModeTrustedLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StreetModeTrustedLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StreetModeTrustedLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationDomain f85430c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StreetModeTrustedLocation(parcel.readString(), parcel.readString(), (LocationDomain) parcel.readParcelable(StreetModeTrustedLocation.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StreetModeTrustedLocation[i];
        }
    }

    public StreetModeTrustedLocation(String id10, String label, LocationDomain location, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f85428a = id10;
        this.f85429b = label;
        this.f85430c = location;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StreetModeTrustedLocation)) {
            return false;
        }
        StreetModeTrustedLocation streetModeTrustedLocation = (StreetModeTrustedLocation) obj2;
        return Intrinsics.f(this.f85428a, streetModeTrustedLocation.f85428a) && Intrinsics.f(this.f85429b, streetModeTrustedLocation.f85429b) && Intrinsics.f(this.f85430c, streetModeTrustedLocation.f85430c) && this.d == streetModeTrustedLocation.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.f85430c.hashCode() + p.a.c(this.f85428a.hashCode() * 31, 31, this.f85429b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85428a);
        dest.writeString(this.f85429b);
        dest.writeParcelable(this.f85430c, i);
        dest.writeInt(this.d);
    }
}
