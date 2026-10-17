package com.revolut.feature.crypto.tfr.validation.impl.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData;", "Landroid/os/Parcelable;", "<init>", "()V", "Mesh", "DateAndPlaceOfBirth", "LegalEntityId", "Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData$DateAndPlaceOfBirth;", "Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData$LegalEntityId;", "Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData$Mesh;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OwnershipPayloadData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData$DateAndPlaceOfBirth;", "Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateAndPlaceOfBirth extends OwnershipPayloadData {

        @NotNull
        public static final Parcelable.Creator<DateAndPlaceOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Date f71035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71036b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateAndPlaceOfBirth(parcel.readString(), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateAndPlaceOfBirth[i];
            }
        }

        public DateAndPlaceOfBirth(String placeOfBirth, Date dateOfBirth) {
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            Intrinsics.checkNotNullParameter(placeOfBirth, "placeOfBirth");
            this.f71035a = dateOfBirth;
            this.f71036b = placeOfBirth;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DateAndPlaceOfBirth)) {
                return false;
            }
            DateAndPlaceOfBirth dateAndPlaceOfBirth = (DateAndPlaceOfBirth) obj2;
            return Intrinsics.f(this.f71035a, dateAndPlaceOfBirth.f71035a) && Intrinsics.f(this.f71036b, dateAndPlaceOfBirth.f71036b);
        }

        public final int hashCode() {
            return this.f71036b.hashCode() + (this.f71035a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71035a);
            dest.writeString(this.f71036b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData$LegalEntityId;", "Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LegalEntityId extends OwnershipPayloadData {

        @NotNull
        public static final Parcelable.Creator<LegalEntityId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71037a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LegalEntityId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LegalEntityId[i];
            }
        }

        public LegalEntityId(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f71037a = identifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LegalEntityId) && Intrinsics.f(this.f71037a, ((LegalEntityId) obj2).f71037a);
        }

        public final int hashCode() {
            return this.f71037a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71037a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData$Mesh;", "Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/OwnershipPayloadData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Mesh extends OwnershipPayloadData {

        @NotNull
        public static final Parcelable.Creator<Mesh> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71039b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Mesh(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Mesh[i];
            }
        }

        public Mesh(String signature, String address) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(address, "address");
            this.f71038a = signature;
            this.f71039b = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Mesh)) {
                return false;
            }
            Mesh mesh = (Mesh) obj2;
            return Intrinsics.f(this.f71038a, mesh.f71038a) && Intrinsics.f(this.f71039b, mesh.f71039b);
        }

        public final int hashCode() {
            return this.f71039b.hashCode() + (this.f71038a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71038a);
            dest.writeString(this.f71039b);
        }
    }

    private OwnershipPayloadData() {
    }
}
