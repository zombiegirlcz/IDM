package com.revolut.feature.transfer.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/CountryProfile;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryProfile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CountryProfile> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f92232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92233c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CountryProfile(parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountryProfile[i];
        }
    }

    public CountryProfile(String id10, b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f92231a = id10;
        this.f92232b = countryCode;
        this.f92233c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountryProfile)) {
            return false;
        }
        CountryProfile countryProfile = (CountryProfile) obj2;
        return Intrinsics.f(this.f92231a, countryProfile.f92231a) && Intrinsics.f(this.f92232b, countryProfile.f92232b) && this.f92233c == countryProfile.f92233c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92233c) + p.a.c(this.f92231a.hashCode() * 31, 31, this.f92232b.f297794a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92231a);
        dest.writeSerializable(this.f92232b);
        dest.writeInt(this.f92233c ? 1 : 0);
    }
}
