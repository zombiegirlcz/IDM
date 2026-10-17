package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Identifier;", "Landroid/os/Parcelable;", "Phone", "Email", "Lcom/revolut/sso/impl/domain/models/Identifier$Email;", "Lcom/revolut/sso/impl/domain/models/Identifier$Phone;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Identifier extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Identifier$Email;", "Lcom/revolut/sso/impl/domain/models/Identifier;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email implements Identifier {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106149a;

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

        public Email(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f106149a = id10;
        }

        public static Email a(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            return new Email(id10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Email) && Intrinsics.f(this.f106149a, ((Email) obj2).f106149a);
        }

        public final int hashCode() {
            return this.f106149a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106149a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Identifier$Phone;", "Lcom/revolut/sso/impl/domain/models/Identifier;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone implements Identifier {

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f106152c;

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

        public Phone(int i, String number, b countryCode) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f106150a = number;
            this.f106151b = i;
            this.f106152c = countryCode;
        }

        public static Phone a(Phone phone, String number, int i, b countryCode, int i2) {
            if ((i2 & 1) != 0) {
                number = phone.f106150a;
            }
            if ((i2 & 2) != 0) {
                i = phone.f106151b;
            }
            if ((i2 & 4) != 0) {
                countryCode = phone.f106152c;
            }
            phone.getClass();
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new Phone(i, number, countryCode);
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
            return Intrinsics.f(this.f106150a, phone.f106150a) && this.f106151b == phone.f106151b && Intrinsics.f(this.f106152c, phone.f106152c);
        }

        public final int hashCode() {
            return this.f106152c.f297794a.hashCode() + j6.a.b(this.f106151b, this.f106150a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106150a);
            dest.writeSerializable(new fj0.b(this.f106151b));
            dest.writeSerializable(this.f106152c);
        }
    }
}
