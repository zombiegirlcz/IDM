package com.revolut.feature.atm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/atm/api/model/AtmAddress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AtmAddress implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63131c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AtmAddress> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.atm.api.model.AtmAddress$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AtmAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmAddress[i];
        }
    }

    public AtmAddress(String streetLine, String city, String postCode, String country) {
        Intrinsics.checkNotNullParameter(streetLine, "streetLine");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f63129a = streetLine;
        this.f63130b = city;
        this.f63131c = postCode;
        this.d = country;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AtmAddress)) {
            return false;
        }
        AtmAddress atmAddress = (AtmAddress) obj2;
        return Intrinsics.f(this.f63129a, atmAddress.f63129a) && Intrinsics.f(this.f63130b, atmAddress.f63130b) && Intrinsics.f(this.f63131c, atmAddress.f63131c) && Intrinsics.f(this.d, atmAddress.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.c(a.c(this.f63129a.hashCode() * 31, 31, this.f63130b), 31, this.f63131c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63129a);
        dest.writeString(this.f63130b);
        dest.writeString(this.f63131c);
        dest.writeString(this.d);
    }
}
