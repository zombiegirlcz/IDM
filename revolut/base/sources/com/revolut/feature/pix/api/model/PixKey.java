package com.revolut.feature.pix.api.model;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKey;", "Landroid/os/Parcelable;", "Laii/r;", "Document", "PhoneNumber", "Email", "Random", "Lcom/revolut/feature/pix/api/model/PixKey$Document;", "Lcom/revolut/feature/pix/api/model/PixKey$Email;", "Lcom/revolut/feature/pix/api/model/PixKey$PhoneNumber;", "Lcom/revolut/feature/pix/api/model/PixKey$Random;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PixKey implements Parcelable, r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKey$Document;", "Lcom/revolut/feature/pix/api/model/PixKey;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document extends PixKey {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixKeyStatus f80400b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document(parcel.readString(), (PixKeyStatus) parcel.readParcelable(Document.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(String value, PixKeyStatus status) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(status, "status");
            this.f80399a = value;
            this.f80400b = status;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Document)) {
                return false;
            }
            Document document = (Document) obj2;
            return Intrinsics.f(this.f80399a, document.f80399a) && Intrinsics.f(this.f80400b, document.f80400b);
        }

        @Override // com.revolut.feature.pix.api.model.PixKey
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF80405a() {
            return this.f80399a;
        }

        public final int hashCode() {
            return this.f80400b.hashCode() + (this.f80399a.hashCode() * 31);
        }

        @Override // com.revolut.feature.pix.api.model.PixKey
        /* JADX INFO: renamed from: j, reason: from getter */
        public final PixKeyStatus getF80406b() {
            return this.f80400b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80399a);
            dest.writeParcelable(this.f80400b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKey$Email;", "Lcom/revolut/feature/pix/api/model/PixKey;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email extends PixKey {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixKeyStatus f80402b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString(), (PixKeyStatus) parcel.readParcelable(Email.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(String value, PixKeyStatus status) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(status, "status");
            this.f80401a = value;
            this.f80402b = status;
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
            return Intrinsics.f(this.f80401a, email.f80401a) && Intrinsics.f(this.f80402b, email.f80402b);
        }

        @Override // com.revolut.feature.pix.api.model.PixKey
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF80405a() {
            return this.f80401a;
        }

        public final int hashCode() {
            return this.f80402b.hashCode() + (this.f80401a.hashCode() * 31);
        }

        @Override // com.revolut.feature.pix.api.model.PixKey
        /* JADX INFO: renamed from: j, reason: from getter */
        public final PixKeyStatus getF80406b() {
            return this.f80402b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80401a);
            dest.writeParcelable(this.f80402b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKey$PhoneNumber;", "Lcom/revolut/feature/pix/api/model/PixKey;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneNumber extends PixKey {

        @NotNull
        public static final Parcelable.Creator<PhoneNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixKeyStatus f80404b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneNumber(parcel.readString(), (PixKeyStatus) parcel.readParcelable(PhoneNumber.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneNumber[i];
            }
        }

        public PhoneNumber(String value, PixKeyStatus status) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(status, "status");
            this.f80403a = value;
            this.f80404b = status;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PhoneNumber)) {
                return false;
            }
            PhoneNumber phoneNumber = (PhoneNumber) obj2;
            return Intrinsics.f(this.f80403a, phoneNumber.f80403a) && Intrinsics.f(this.f80404b, phoneNumber.f80404b);
        }

        @Override // com.revolut.feature.pix.api.model.PixKey
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF80405a() {
            return this.f80403a;
        }

        public final int hashCode() {
            return this.f80404b.hashCode() + (this.f80403a.hashCode() * 31);
        }

        @Override // com.revolut.feature.pix.api.model.PixKey
        /* JADX INFO: renamed from: j, reason: from getter */
        public final PixKeyStatus getF80406b() {
            return this.f80404b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80403a);
            dest.writeParcelable(this.f80404b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKey$Random;", "Lcom/revolut/feature/pix/api/model/PixKey;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Random extends PixKey {

        @NotNull
        public static final Parcelable.Creator<Random> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixKeyStatus f80406b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Random(parcel.readString(), (PixKeyStatus) parcel.readParcelable(Random.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Random[i];
            }
        }

        public Random(String value, PixKeyStatus status) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(status, "status");
            this.f80405a = value;
            this.f80406b = status;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Random)) {
                return false;
            }
            Random random = (Random) obj2;
            return Intrinsics.f(this.f80405a, random.f80405a) && Intrinsics.f(this.f80406b, random.f80406b);
        }

        @Override // com.revolut.feature.pix.api.model.PixKey
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF80405a() {
            return this.f80405a;
        }

        public final int hashCode() {
            return this.f80406b.hashCode() + (this.f80405a.hashCode() * 31);
        }

        @Override // com.revolut.feature.pix.api.model.PixKey
        /* JADX INFO: renamed from: j, reason: from getter */
        public final PixKeyStatus getF80406b() {
            return this.f80406b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80405a);
            dest.writeParcelable(this.f80406b, i);
        }
    }

    /* JADX INFO: renamed from: getValue */
    public abstract String getF80405a();

    /* JADX INFO: renamed from: j */
    public abstract PixKeyStatus getF80406b();
}
