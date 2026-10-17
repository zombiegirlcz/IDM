package com.revolut.feature.extension_auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/AppChallengeDevice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Location", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class AppChallengeDevice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AppChallengeDevice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Location f72166c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/AppChallengeDevice$Location;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Location implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Location> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f72167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f72169c;
        public final Double d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Location(parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Location[i];
            }
        }

        public Location(boolean z, String str, Double d, Double d5) {
            this.f72167a = z;
            this.f72168b = str;
            this.f72169c = d;
            this.d = d5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Location)) {
                return false;
            }
            Location location = (Location) obj2;
            return this.f72167a == location.f72167a && Intrinsics.f(this.f72168b, location.f72168b) && Intrinsics.f(this.f72169c, location.f72169c) && Intrinsics.f(this.d, location.d);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f72167a) * 31;
            String str = this.f72168b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Double d = this.f72169c;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            Double d5 = this.d;
            return iHashCode3 + (d5 != null ? d5.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f72167a ? 1 : 0);
            dest.writeString(this.f72168b);
            Double d = this.f72169c;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
            Double d5 = this.d;
            if (d5 == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppChallengeDevice(parcel.readString(), parcel.readString(), Location.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppChallengeDevice[i];
        }
    }

    public AppChallengeDevice(String name, String str, Location location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f72164a = name;
        this.f72165b = str;
        this.f72166c = location;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AppChallengeDevice)) {
            return false;
        }
        AppChallengeDevice appChallengeDevice = (AppChallengeDevice) obj2;
        return Intrinsics.f(this.f72164a, appChallengeDevice.f72164a) && Intrinsics.f(this.f72165b, appChallengeDevice.f72165b) && Intrinsics.f(this.f72166c, appChallengeDevice.f72166c);
    }

    public final int hashCode() {
        int iHashCode = this.f72164a.hashCode() * 31;
        String str = this.f72165b;
        return this.f72166c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72164a);
        dest.writeString(this.f72165b);
        this.f72166c.writeToParcel(dest, i);
    }
}
