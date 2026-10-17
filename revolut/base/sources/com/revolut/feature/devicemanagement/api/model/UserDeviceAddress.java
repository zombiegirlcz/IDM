package com.revolut.feature.devicemanagement.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/devicemanagement/api/model/UserDeviceAddress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_device_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDeviceAddress implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71930c;
    public final String d;
    public final double e;
    public final double f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<UserDeviceAddress> CREATOR = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final UserDeviceAddress f71927g = new UserDeviceAddress(0.0d, 0.0d, "", "", "", "");

    /* JADX INFO: renamed from: com.revolut.feature.devicemanagement.api.model.UserDeviceAddress$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserDeviceAddress(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserDeviceAddress[i];
        }
    }

    public UserDeviceAddress(double d, double d5, String postcode, String country, String region, String city) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(city, "city");
        this.f71928a = postcode;
        this.f71929b = country;
        this.f71930c = region;
        this.d = city;
        this.e = d;
        this.f = d5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserDeviceAddress)) {
            return false;
        }
        UserDeviceAddress userDeviceAddress = (UserDeviceAddress) obj2;
        return Intrinsics.f(this.f71928a, userDeviceAddress.f71928a) && Intrinsics.f(this.f71929b, userDeviceAddress.f71929b) && Intrinsics.f(this.f71930c, userDeviceAddress.f71930c) && Intrinsics.f(this.d, userDeviceAddress.d) && Double.compare(this.e, userDeviceAddress.e) == 0 && Double.compare(this.f, userDeviceAddress.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + m72.b.c(a.c(a.c(a.c(this.f71928a.hashCode() * 31, 31, this.f71929b), 31, this.f71930c), 31, this.d), this.e, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71928a);
        dest.writeString(this.f71929b);
        dest.writeString(this.f71930c);
        dest.writeString(this.d);
        dest.writeDouble(this.e);
        dest.writeDouble(this.f);
    }
}
