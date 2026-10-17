package com.revolut.retail.feature.payments.bank_transfer.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "Landroid/os/Parcelable;", "UNKNOWN", "BANK", "CARD", "Internal", "MobileWallet", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$BANK;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$CARD;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$Internal;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$MobileWallet;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$UNKNOWN;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RemittanceRouteId implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101913a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$BANK;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "<init>", "()V", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BANK extends RemittanceRouteId {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final BANK f101914b = new BANK();

        @NotNull
        public static final Parcelable.Creator<BANK> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BANK.f101914b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BANK[i];
            }
        }

        private BANK() {
            super("BANK");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$CARD;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "<init>", "()V", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CARD extends RemittanceRouteId {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CARD f101915b = new CARD();

        @NotNull
        public static final Parcelable.Creator<CARD> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CARD.f101915b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CARD[i];
            }
        }

        private CARD() {
            super("CARD");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$Internal;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "<init>", "()V", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Internal extends RemittanceRouteId {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Internal f101916b = new Internal();

        @NotNull
        public static final Parcelable.Creator<Internal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Internal.f101916b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Internal[i];
            }
        }

        private Internal() {
            super("INTERNAL");
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$MobileWallet;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobileWallet extends RemittanceRouteId {

        @NotNull
        public static final Parcelable.Creator<MobileWallet> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101918c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobileWallet(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobileWallet[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MobileWallet(String walletVendorId, String str) {
            super("MOBILE_WALLET");
            Intrinsics.checkNotNullParameter(walletVendorId, "walletVendorId");
            this.f101917b = walletVendorId;
            this.f101918c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobileWallet)) {
                return false;
            }
            MobileWallet mobileWallet = (MobileWallet) obj2;
            return Intrinsics.f(this.f101917b, mobileWallet.f101917b) && Intrinsics.f(this.f101918c, mobileWallet.f101918c);
        }

        public final int hashCode() {
            int iHashCode = this.f101917b.hashCode() * 31;
            String str = this.f101918c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101917b);
            dest.writeString(this.f101918c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId$UNKNOWN;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "<init>", "()V", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UNKNOWN extends RemittanceRouteId {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UNKNOWN f101919b = new UNKNOWN();

        @NotNull
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UNKNOWN.f101919b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UNKNOWN[i];
            }
        }

        private UNKNOWN() {
            super("");
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

    public RemittanceRouteId(String str) {
        this.f101913a = str;
    }
}
