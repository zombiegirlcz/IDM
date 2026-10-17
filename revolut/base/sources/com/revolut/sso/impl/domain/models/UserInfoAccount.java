package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import gkl.r1;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/sso/impl/domain/models/UserInfoAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "gkl/r1", "Claim", "Address", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserInfoAccount implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106205c;
    public final UserInfoPicture d;
    public final r1 e;
    public final Claim f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Claim f106206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Address f106207h;

    @NotNull
    public static final Parcelable.Creator<UserInfoAccount> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/UserInfoAccount$Address;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Address implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106210c;
        public final String d;
        public final String e;

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address(String streetAddress, String postalCode, String country, String str, String str2) {
            Intrinsics.checkNotNullParameter(streetAddress, "streetAddress");
            Intrinsics.checkNotNullParameter(postalCode, "postalCode");
            Intrinsics.checkNotNullParameter(country, "country");
            this.f106208a = streetAddress;
            this.f106209b = postalCode;
            this.f106210c = country;
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Address)) {
                return false;
            }
            Address address = (Address) obj2;
            return Intrinsics.f(this.f106208a, address.f106208a) && Intrinsics.f(this.f106209b, address.f106209b) && Intrinsics.f(this.f106210c, address.f106210c) && Intrinsics.f(this.d, address.d) && Intrinsics.f(this.e, address.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f106208a.hashCode() * 31, 31, this.f106209b), 31, this.f106210c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106208a);
            dest.writeString(this.f106209b);
            dest.writeString(this.f106210c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/UserInfoAccount$Claim;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Claim implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f106212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106213c;

        @NotNull
        public static final Parcelable.Creator<Claim> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Claim(string, parcel.readString(), boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Claim[i];
            }
        }

        public Claim(String value, String unmaskedValue, Boolean bool) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unmaskedValue, "unmaskedValue");
            this.f106211a = value;
            this.f106212b = bool;
            this.f106213c = unmaskedValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Claim)) {
                return false;
            }
            Claim claim = (Claim) obj2;
            return Intrinsics.f(this.f106211a, claim.f106211a) && Intrinsics.f(this.f106212b, claim.f106212b) && Intrinsics.f(this.f106213c, claim.f106213c);
        }

        public final int hashCode() {
            int iHashCode = this.f106211a.hashCode() * 31;
            Boolean bool = this.f106212b;
            return this.f106213c.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106211a);
            Boolean bool = this.f106212b;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeString(this.f106213c);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserInfoAccount(((RegisteredIdentityId) parcel.readParcelable(UserInfoAccount.class.getClassLoader())).f74764a, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UserInfoPicture.CREATOR.createFromParcel(parcel), r1.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Claim.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Claim.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserInfoAccount[i];
        }
    }

    public UserInfoAccount(String id10, String displayTitle, String displaySubtitle, UserInfoPicture userInfoPicture, r1 profileType, Claim claim, Claim claim2, Address address) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
        Intrinsics.checkNotNullParameter(displaySubtitle, "displaySubtitle");
        Intrinsics.checkNotNullParameter(profileType, "profileType");
        this.f106203a = id10;
        this.f106204b = displayTitle;
        this.f106205c = displaySubtitle;
        this.d = userInfoPicture;
        this.e = profileType;
        this.f = claim;
        this.f106206g = claim2;
        this.f106207h = address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserInfoAccount)) {
            return false;
        }
        UserInfoAccount userInfoAccount = (UserInfoAccount) obj2;
        return Intrinsics.f(this.f106203a, userInfoAccount.f106203a) && Intrinsics.f(this.f106204b, userInfoAccount.f106204b) && Intrinsics.f(this.f106205c, userInfoAccount.f106205c) && Intrinsics.f(this.d, userInfoAccount.d) && this.e == userInfoAccount.e && Intrinsics.f(this.f, userInfoAccount.f) && Intrinsics.f(this.f106206g, userInfoAccount.f106206g) && Intrinsics.f(this.f106207h, userInfoAccount.f106207h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f106203a.hashCode() * 31, 31, this.f106204b), 31, this.f106205c);
        UserInfoPicture userInfoPicture = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (userInfoPicture == null ? 0 : userInfoPicture.hashCode())) * 31)) * 31;
        Claim claim = this.f;
        int iHashCode2 = (iHashCode + (claim == null ? 0 : claim.hashCode())) * 31;
        Claim claim2 = this.f106206g;
        int iHashCode3 = (iHashCode2 + (claim2 == null ? 0 : claim2.hashCode())) * 31;
        Address address = this.f106207h;
        return iHashCode3 + (address != null ? address.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e.x(this.f106203a, dest, i);
        dest.writeString(this.f106204b);
        dest.writeString(this.f106205c);
        UserInfoPicture userInfoPicture = this.d;
        if (userInfoPicture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            userInfoPicture.writeToParcel(dest, i);
        }
        dest.writeString(this.e.name());
        Claim claim = this.f;
        if (claim == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            claim.writeToParcel(dest, i);
        }
        Claim claim2 = this.f106206g;
        if (claim2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            claim2.writeToParcel(dest, i);
        }
        Address address = this.f106207h;
        if (address == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            address.writeToParcel(dest, i);
        }
    }
}
