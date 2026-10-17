package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier", "Landroid/os/Parcelable;", "Preferred", "Predefined", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Predefined;", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Preferred;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutSsoApi$DefaultIdentifier extends Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Predefined;", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier;", "Phone", "Email", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Predefined$Email;", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Predefined$Phone;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Predefined extends RevolutSsoApi$DefaultIdentifier {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Predefined$Email;", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Predefined;", "value", "", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Email implements Predefined {

            @NotNull
            public static final Parcelable.Creator<Email> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105841a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new Email(v7.t(parcel, "parcel", "value"));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Email[i];
                }
            }

            public /* synthetic */ Email(String str) {
                this.f105841a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (obj2 instanceof Email) {
                    return Intrinsics.f(this.f105841a, ((Email) obj2).f105841a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f105841a.hashCode();
            }

            public final String toString() {
                return p.a.p("Email(value=", this.f105841a, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105841a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Predefined$Phone;", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Predefined;", "value", "", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Phone implements Predefined {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105842a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new Phone(v7.t(parcel, "parcel", "value"));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Phone[i];
                }
            }

            public /* synthetic */ Phone(String str) {
                this.f105842a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (obj2 instanceof Phone) {
                    return Intrinsics.f(this.f105842a, ((Phone) obj2).f105842a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f105842a.hashCode();
            }

            public final String toString() {
                return p.a.p("Phone(value=", this.f105842a, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105842a);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier$Preferred;", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier;", "", "Phone", "Email", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Preferred implements RevolutSsoApi$DefaultIdentifier {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Preferred[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<Preferred> CREATOR;
        public static final Preferred Email;
        public static final Preferred Phone;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Preferred.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Preferred[i];
            }
        }

        static {
            Preferred preferred = new Preferred("Phone", 0);
            Phone = preferred;
            Preferred preferred2 = new Preferred("Email", 1);
            Email = preferred2;
            Preferred[] preferredArr = {preferred, preferred2};
            $VALUES = preferredArr;
            $ENTRIES = s.n(preferredArr);
            CREATOR = new a();
        }

        public static Preferred valueOf(String str) {
            return (Preferred) Enum.valueOf(Preferred.class, str);
        }

        public static Preferred[] values() {
            return (Preferred[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }
}
