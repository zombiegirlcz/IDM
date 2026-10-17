package com.revolut.feature.transfer_reasons.models.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import gk3.i;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest;", "Landroid/os/Parcelable;", "ForTransaction", "ForTransferWithCountry", "ForTransferWithIdentification", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest$ForTransaction;", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest$ForTransferWithCountry;", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest$ForTransferWithIdentification;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferReasonsRequest extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest$ForTransaction;", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForTransaction implements TransferReasonsRequest {

        @NotNull
        public static final Parcelable.Creator<ForTransaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92425b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForTransaction(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForTransaction[i];
            }
        }

        public ForTransaction(String transactionId, String str) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f92424a = transactionId;
            this.f92425b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForTransaction)) {
                return false;
            }
            ForTransaction forTransaction = (ForTransaction) obj2;
            return Intrinsics.f(this.f92424a, forTransaction.f92424a) && Intrinsics.f(this.f92425b, forTransaction.f92425b);
        }

        public final int hashCode() {
            int iHashCode = this.f92424a.hashCode() * 31;
            String str = this.f92425b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92424a);
            dest.writeString(this.f92425b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest$ForTransferWithCountry;", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForTransferWithCountry implements TransferReasonsRequest {

        @NotNull
        public static final Parcelable.Creator<ForTransferWithCountry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f92426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f92427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f92428c;
        public final String d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForTransferWithCountry(parcel.readLong(), (b) parcel.readSerializable(), i.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForTransferWithCountry[i];
            }
        }

        public ForTransferWithCountry(long j2, b transferCurrency, i transferType, String recipientCountry, String fromPocketId, String str) {
            Intrinsics.checkNotNullParameter(transferCurrency, "transferCurrency");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
            Intrinsics.checkNotNullParameter(fromPocketId, "fromPocketId");
            this.f92426a = j2;
            this.f92427b = transferCurrency;
            this.f92428c = transferType;
            this.d = recipientCountry;
            this.e = fromPocketId;
            this.f = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForTransferWithCountry)) {
                return false;
            }
            ForTransferWithCountry forTransferWithCountry = (ForTransferWithCountry) obj2;
            return this.f92426a == forTransferWithCountry.f92426a && Intrinsics.f(this.f92427b, forTransferWithCountry.f92427b) && this.f92428c == forTransferWithCountry.f92428c && Intrinsics.f(this.d, forTransferWithCountry.d) && Intrinsics.f(this.e, forTransferWithCountry.e) && Intrinsics.f(this.f, forTransferWithCountry.f);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c((this.f92428c.hashCode() + l.j(this.f92427b, Long.hashCode(this.f92426a) * 31, 31)) * 31, 31, this.d), 31, this.e);
            String str = this.f;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f92426a);
            dest.writeSerializable(this.f92427b);
            dest.writeString(this.f92428c.name());
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest$ForTransferWithIdentification;", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonsRequest;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForTransferWithIdentification implements TransferReasonsRequest {

        @NotNull
        public static final Parcelable.Creator<ForTransferWithIdentification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f92429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f92430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f92431c;
        public final TransferReasonRecipientIdentification d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForTransferWithIdentification(parcel.readLong(), (b) parcel.readSerializable(), i.valueOf(parcel.readString()), (TransferReasonRecipientIdentification) parcel.readParcelable(ForTransferWithIdentification.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForTransferWithIdentification[i];
            }
        }

        public ForTransferWithIdentification(long j2, b transferCurrency, i transferType, TransferReasonRecipientIdentification recipientIdentification, String fromPocketId, String str) {
            Intrinsics.checkNotNullParameter(transferCurrency, "transferCurrency");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(recipientIdentification, "recipientIdentification");
            Intrinsics.checkNotNullParameter(fromPocketId, "fromPocketId");
            this.f92429a = j2;
            this.f92430b = transferCurrency;
            this.f92431c = transferType;
            this.d = recipientIdentification;
            this.e = fromPocketId;
            this.f = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForTransferWithIdentification)) {
                return false;
            }
            ForTransferWithIdentification forTransferWithIdentification = (ForTransferWithIdentification) obj2;
            return this.f92429a == forTransferWithIdentification.f92429a && Intrinsics.f(this.f92430b, forTransferWithIdentification.f92430b) && this.f92431c == forTransferWithIdentification.f92431c && Intrinsics.f(this.d, forTransferWithIdentification.d) && Intrinsics.f(this.e, forTransferWithIdentification.e) && Intrinsics.f(this.f, forTransferWithIdentification.f);
        }

        public final int hashCode() {
            int iC = p.a.c((this.d.hashCode() + ((this.f92431c.hashCode() + l.j(this.f92430b, Long.hashCode(this.f92429a) * 31, 31)) * 31)) * 31, 31, this.e);
            String str = this.f;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f92429a);
            dest.writeSerializable(this.f92430b);
            dest.writeString(this.f92431c.name());
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }
}
