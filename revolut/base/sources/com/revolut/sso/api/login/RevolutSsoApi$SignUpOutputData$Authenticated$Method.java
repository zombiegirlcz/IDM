package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$SignUpOutputData$Authenticated$Method", "Landroid/os/Parcelable;", "Phone", "Email", "Lcom/revolut/sso/api/login/RevolutSsoApi$SignUpOutputData$Authenticated$Method$Email;", "Lcom/revolut/sso/api/login/RevolutSsoApi$SignUpOutputData$Authenticated$Method$Phone;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutSsoApi$SignUpOutputData$Authenticated$Method extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$SignUpOutputData$Authenticated$Method$Email;", "Lcom/revolut/sso/api/login/RevolutSsoApi$SignUpOutputData$Authenticated$Method;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email implements RevolutSsoApi$SignUpOutputData$Authenticated$Method {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105873a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105873a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Email) && Intrinsics.f(this.f105873a, ((Email) obj2).f105873a);
        }

        public final int hashCode() {
            return this.f105873a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105873a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$SignUpOutputData$Authenticated$Method$Phone;", "Lcom/revolut/sso/api/login/RevolutSsoApi$SignUpOutputData$Authenticated$Method;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone implements RevolutSsoApi$SignUpOutputData$Authenticated$Method {

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f105875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f105876c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Phone(((fj0.b) parcel.readSerializable()).f135518a, parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Phone[i];
            }
        }

        public Phone(int i, String phoneNumber, b phoneCountryCode) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(phoneCountryCode, "phoneCountryCode");
            this.f105874a = phoneNumber;
            this.f105875b = i;
            this.f105876c = phoneCountryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj2;
            return Intrinsics.f(this.f105874a, phone.f105874a) && this.f105875b == phone.f105875b && Intrinsics.f(this.f105876c, phone.f105876c);
        }

        public final int hashCode() {
            return this.f105876c.f297794a.hashCode() + j6.a.b(this.f105875b, this.f105874a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105874a);
            dest.writeSerializable(new fj0.b(this.f105875b));
            dest.writeSerializable(this.f105876c);
        }
    }
}
