package com.revolut.feature.teen_profile.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import java.time.LocalDate;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/teen_profile/api/models/TeenProfile;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_teen_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TeenProfile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TeenProfile> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90336c;
    public final LocalDate d;
    public final Address e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f90337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90338h;
    public final tqe.a i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TeenProfile(((RegisteredIdentityId) parcel.readParcelable(TeenProfile.class.getClassLoader())).f74764a, parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (Address) parcel.readParcelable(TeenProfile.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), tqe.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TeenProfile[i];
        }
    }

    public TeenProfile(String registeredIdentityId, String firstName, String lastName, LocalDate dateOfBirth, Address address, String str, String code, String str2, tqe.a kycStatus) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        this.f90334a = registeredIdentityId;
        this.f90335b = firstName;
        this.f90336c = lastName;
        this.d = dateOfBirth;
        this.e = address;
        this.f = str;
        this.f90337g = code;
        this.f90338h = str2;
        this.i = kycStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TeenProfile)) {
            return false;
        }
        TeenProfile teenProfile = (TeenProfile) obj2;
        return Intrinsics.f(this.f90334a, teenProfile.f90334a) && Intrinsics.f(this.f90335b, teenProfile.f90335b) && Intrinsics.f(this.f90336c, teenProfile.f90336c) && Intrinsics.f(this.d, teenProfile.d) && Intrinsics.f(this.e, teenProfile.e) && Intrinsics.f(this.f, teenProfile.f) && Intrinsics.f(this.f90337g, teenProfile.f90337g) && Intrinsics.f(this.f90338h, teenProfile.f90338h) && this.i == teenProfile.i;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + y.a(p.a.c(p.a.c(this.f90334a.hashCode() * 31, 31, this.f90335b), 31, this.f90336c), 31, this.d)) * 31;
        String str = this.f;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f90337g);
        String str2 = this.f90338h;
        return this.i.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e.x(this.f90334a, dest, i);
        dest.writeString(this.f90335b);
        dest.writeString(this.f90336c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f90337g);
        dest.writeString(this.f90338h);
        dest.writeString(this.i.name());
    }
}
