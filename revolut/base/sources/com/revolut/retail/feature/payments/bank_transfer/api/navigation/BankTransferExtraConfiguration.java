package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferExtraConfiguration;", "Landroid/os/Parcelable;", "NoCurrencyPicker", "NoBalanceValidation", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferExtraConfiguration$NoBalanceValidation;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferExtraConfiguration$NoCurrencyPicker;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankTransferExtraConfiguration extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferExtraConfiguration$NoBalanceValidation;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferExtraConfiguration;", "<init>", "()V", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoBalanceValidation implements BankTransferExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoBalanceValidation f101938a = new NoBalanceValidation();

        @NotNull
        public static final Parcelable.Creator<NoBalanceValidation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoBalanceValidation.f101938a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoBalanceValidation[i];
            }
        }

        private NoBalanceValidation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferExtraConfiguration$NoCurrencyPicker;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferExtraConfiguration;", "<init>", "()V", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoCurrencyPicker implements BankTransferExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoCurrencyPicker f101939a = new NoCurrencyPicker();

        @NotNull
        public static final Parcelable.Creator<NoCurrencyPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoCurrencyPicker.f101939a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoCurrencyPicker[i];
            }
        }

        private NoCurrencyPicker() {
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
