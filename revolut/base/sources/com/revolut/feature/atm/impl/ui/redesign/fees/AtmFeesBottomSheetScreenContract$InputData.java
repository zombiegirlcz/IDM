package com.revolut.feature.atm.impl.ui.redesign.fees;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/atm/impl/ui/redesign/fees/AtmFeesBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "WithdrawalFee", "ExchangeFee", "Lcom/revolut/feature/atm/impl/ui/redesign/fees/AtmFeesBottomSheetScreenContract$InputData$ExchangeFee;", "Lcom/revolut/feature/atm/impl/ui/redesign/fees/AtmFeesBottomSheetScreenContract$InputData$WithdrawalFee;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AtmFeesBottomSheetScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/fees/AtmFeesBottomSheetScreenContract$InputData$ExchangeFee;", "Lcom/revolut/feature/atm/impl/ui/redesign/fees/AtmFeesBottomSheetScreenContract$InputData;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExchangeFee extends AtmFeesBottomSheetScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExchangeFee f63172a = new ExchangeFee();

        @NotNull
        public static final Parcelable.Creator<ExchangeFee> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExchangeFee.f63172a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeFee[i];
            }
        }

        private ExchangeFee() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/fees/AtmFeesBottomSheetScreenContract$InputData$WithdrawalFee;", "Lcom/revolut/feature/atm/impl/ui/redesign/fees/AtmFeesBottomSheetScreenContract$InputData;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WithdrawalFee extends AtmFeesBottomSheetScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WithdrawalFee f63173a = new WithdrawalFee();

        @NotNull
        public static final Parcelable.Creator<WithdrawalFee> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WithdrawalFee.f63173a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawalFee[i];
            }
        }

        private WithdrawalFee() {
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

    private AtmFeesBottomSheetScreenContract$InputData() {
    }
}
