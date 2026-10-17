package com.revolut.feature.payments.who_to_transfer.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006.À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "Landroid/os/Parcelable;", "Revolut", "Device", "ApmAani", "ApmBizum", "ApmBlik", "ApmBreb", "ApmIris", "ApmMultibanco", "ApmPayId", "ApmPix", "ApmQvik", "ApmSpin", "ApmUpi", "ApmWero", "Accounts", "Groups", "Cards", "CryptoWallets", "Charities", "Checks", "Billers", "MobileWallet", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Accounts;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmAani;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmBizum;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmBlik;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmBreb;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmIris;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmMultibanco;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmPayId;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmPix;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmQvik;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmSpin;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmUpi;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmWero;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Billers;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Cards;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Charities;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Checks;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$CryptoWallets;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Device;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Groups;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$MobileWallet;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Revolut;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WhoToTransferFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Accounts;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Accounts implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Accounts f79984a = new Accounts();

        @NotNull
        public static final Parcelable.Creator<Accounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Accounts.f79984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Accounts[i];
            }
        }

        private Accounts() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmAani;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmAani implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmAani f79985a = new ApmAani();

        @NotNull
        public static final Parcelable.Creator<ApmAani> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmAani.f79985a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmAani[i];
            }
        }

        private ApmAani() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmBizum;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBizum implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBizum f79986a = new ApmBizum();

        @NotNull
        public static final Parcelable.Creator<ApmBizum> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBizum.f79986a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBizum[i];
            }
        }

        private ApmBizum() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmBlik;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBlik implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBlik f79987a = new ApmBlik();

        @NotNull
        public static final Parcelable.Creator<ApmBlik> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBlik.f79987a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBlik[i];
            }
        }

        private ApmBlik() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmBreb;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmBreb implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmBreb f79988a = new ApmBreb();

        @NotNull
        public static final Parcelable.Creator<ApmBreb> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmBreb.f79988a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmBreb[i];
            }
        }

        private ApmBreb() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmIris;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmIris implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmIris f79989a = new ApmIris();

        @NotNull
        public static final Parcelable.Creator<ApmIris> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmIris.f79989a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmIris[i];
            }
        }

        private ApmIris() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmMultibanco;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmMultibanco implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmMultibanco f79990a = new ApmMultibanco();

        @NotNull
        public static final Parcelable.Creator<ApmMultibanco> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmMultibanco.f79990a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmMultibanco[i];
            }
        }

        private ApmMultibanco() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmPayId;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmPayId implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmPayId f79991a = new ApmPayId();

        @NotNull
        public static final Parcelable.Creator<ApmPayId> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmPayId.f79991a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmPayId[i];
            }
        }

        private ApmPayId() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmPix;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmPix implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmPix f79992a = new ApmPix();

        @NotNull
        public static final Parcelable.Creator<ApmPix> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmPix.f79992a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmPix[i];
            }
        }

        private ApmPix() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmQvik;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmQvik implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmQvik f79993a = new ApmQvik();

        @NotNull
        public static final Parcelable.Creator<ApmQvik> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmQvik.f79993a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmQvik[i];
            }
        }

        private ApmQvik() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmSpin;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmSpin implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmSpin f79994a = new ApmSpin();

        @NotNull
        public static final Parcelable.Creator<ApmSpin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmSpin.f79994a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmSpin[i];
            }
        }

        private ApmSpin() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmUpi;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmUpi implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmUpi f79995a = new ApmUpi();

        @NotNull
        public static final Parcelable.Creator<ApmUpi> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmUpi.f79995a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmUpi[i];
            }
        }

        private ApmUpi() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$ApmWero;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApmWero implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApmWero f79996a = new ApmWero();

        @NotNull
        public static final Parcelable.Creator<ApmWero> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApmWero.f79996a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmWero[i];
            }
        }

        private ApmWero() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Billers;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Billers implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Billers f79997a = new Billers();

        @NotNull
        public static final Parcelable.Creator<Billers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Billers.f79997a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Billers[i];
            }
        }

        private Billers() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Cards;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cards implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cards f79998a = new Cards();

        @NotNull
        public static final Parcelable.Creator<Cards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cards.f79998a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cards[i];
            }
        }

        private Cards() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Charities;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Charities implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Charities f79999a = new Charities();

        @NotNull
        public static final Parcelable.Creator<Charities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Charities.f79999a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Charities[i];
            }
        }

        private Charities() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Checks;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Checks implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Checks f80000a = new Checks();

        @NotNull
        public static final Parcelable.Creator<Checks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Checks.f80000a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checks[i];
            }
        }

        private Checks() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$CryptoWallets;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoWallets implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CryptoWallets f80001a = new CryptoWallets();

        @NotNull
        public static final Parcelable.Creator<CryptoWallets> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoWallets.f80001a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoWallets[i];
            }
        }

        private CryptoWallets() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Device;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Device implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Device f80002a = new Device();

        @NotNull
        public static final Parcelable.Creator<Device> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Device.f80002a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Device[i];
            }
        }

        private Device() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Groups;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Groups implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Groups f80003a = new Groups();

        @NotNull
        public static final Parcelable.Creator<Groups> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Groups.f80003a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Groups[i];
            }
        }

        private Groups() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$MobileWallet;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobileWallet implements WhoToTransferFilter {

        @NotNull
        public static final Parcelable.Creator<MobileWallet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80004a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobileWallet(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobileWallet[i];
            }
        }

        public MobileWallet(String vendorId) {
            Intrinsics.checkNotNullParameter(vendorId, "vendorId");
            this.f80004a = vendorId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobileWallet) && Intrinsics.f(this.f80004a, ((MobileWallet) obj2).f80004a);
        }

        public final int hashCode() {
            return this.f80004a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80004a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter$Revolut;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferFilter;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Revolut implements WhoToTransferFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Revolut f80005a = new Revolut();

        @NotNull
        public static final Parcelable.Creator<Revolut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Revolut.f80005a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Revolut[i];
            }
        }

        private Revolut() {
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
}
