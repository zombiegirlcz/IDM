package com.revolut.feature.pix.api.model;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\u0004\u0005\u0006\u0007\b\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationType;", "Landroid/os/Parcelable;", "Laii/r;", "Lcom/revolut/kompot/common/IOData$Input;", "Inputtable", "RandomKey", "Phone", "Email", "UserDocument", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType$Inputtable;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType$RandomKey;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType$UserDocument;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AliasRegistrationType extends Parcelable, r, IOData$Input {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationType$Inputtable;", "T", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType$Email;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType$Phone;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Inputtable<T> implements AliasRegistrationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f80390a;

        public Inputtable(Object obj2) {
            this.f80390a = obj2;
        }

        public abstract Object getValue();

        /* JADX INFO: renamed from: j */
        public abstract String getF80392c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationType$Phone;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType$Inputtable;", "Lcom/revolut/feature/pix/api/model/PhoneNumber;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone extends Inputtable<PhoneNumber> {

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PhoneNumber f80391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f80392c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Phone(PhoneNumber.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Phone[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(PhoneNumber value, String str) {
            super(value);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f80391b = value;
            this.f80392c = str;
        }

        public static Phone z(Phone phone, PhoneNumber value, String str, int i) {
            if ((i & 1) != 0) {
                value = phone.f80391b;
            }
            if ((i & 2) != 0) {
                str = phone.f80392c;
            }
            phone.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            return new Phone(value, str);
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
            return Intrinsics.f(this.f80391b, phone.f80391b) && Intrinsics.f(this.f80392c, phone.f80392c);
        }

        @Override // com.revolut.feature.pix.api.model.AliasRegistrationType.Inputtable
        public final Object getValue() {
            return this.f80391b;
        }

        public final int hashCode() {
            int iHashCode = this.f80391b.hashCode() * 31;
            String str = this.f80392c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.feature.pix.api.model.AliasRegistrationType.Inputtable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getF80392c() {
            return this.f80392c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f80391b.writeToParcel(dest, i);
            dest.writeString(this.f80392c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationType$RandomKey;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RandomKey implements AliasRegistrationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RandomKey f80393a = new RandomKey();

        @NotNull
        public static final Parcelable.Creator<RandomKey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RandomKey.f80393a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RandomKey[i];
            }
        }

        private RandomKey() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationType$UserDocument;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UserDocument implements AliasRegistrationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserDocument f80394a = new UserDocument();

        @NotNull
        public static final Parcelable.Creator<UserDocument> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UserDocument.f80394a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserDocument[i];
            }
        }

        private UserDocument() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationType$Email;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType$Inputtable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email extends Inputtable<String> {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f80389c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(String str, String str2) {
            super(str);
            this.f80388b = str;
            this.f80389c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Email)) {
                return false;
            }
            Email email = (Email) obj2;
            return Intrinsics.f(this.f80388b, email.f80388b) && Intrinsics.f(this.f80389c, email.f80389c);
        }

        @Override // com.revolut.feature.pix.api.model.AliasRegistrationType.Inputtable
        public final Object getValue() {
            return this.f80388b;
        }

        public final int hashCode() {
            String str = this.f80388b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f80389c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.revolut.feature.pix.api.model.AliasRegistrationType.Inputtable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getF80392c() {
            return this.f80389c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80388b);
            dest.writeString(this.f80389c);
        }

        public Email() {
            this(null, null);
        }
    }
}
