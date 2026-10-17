package com.revolut.retail.feature.airport.security_fast_track.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/model/AsftConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsftTermsAndConditions f98712c;
    public final Integer d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftConfig(parcel.readString(), parcel.readInt() != 0, AsftTermsAndConditions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftConfig[i];
        }
    }

    public AsftConfig(String planName, boolean z, AsftTermsAndConditions termsAndConditions, Integer num, String str) {
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f98710a = planName;
        this.f98711b = z;
        this.f98712c = termsAndConditions;
        this.d = num;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftConfig)) {
            return false;
        }
        AsftConfig asftConfig = (AsftConfig) obj2;
        return Intrinsics.f(this.f98710a, asftConfig.f98710a) && this.f98711b == asftConfig.f98711b && Intrinsics.f(this.f98712c, asftConfig.f98712c) && Intrinsics.f(this.d, asftConfig.d) && Intrinsics.f(this.e, asftConfig.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f98712c.hashCode() + j6.a.c(this.f98710a.hashCode() * 31, 31, this.f98711b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98710a);
        dest.writeInt(this.f98711b ? 1 : 0);
        this.f98712c.writeToParcel(dest, i);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.e);
    }
}
