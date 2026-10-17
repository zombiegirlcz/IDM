package com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AnnualInterestRateExplanation", "NextPaymentDateExplanation", "AccruedFeesMonthlyExplanation", "Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep$AccruedFeesMonthlyExplanation;", "Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep$AnnualInterestRateExplanation;", "Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep$NextPaymentDateExplanation;", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthMarginBorrowingInterestScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep$AccruedFeesMonthlyExplanation;", "Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccruedFeesMonthlyExplanation implements WealthMarginBorrowingInterestScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccruedFeesMonthlyExplanation f95459a = new AccruedFeesMonthlyExplanation();

        @NotNull
        public static final Parcelable.Creator<AccruedFeesMonthlyExplanation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccruedFeesMonthlyExplanation.f95459a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccruedFeesMonthlyExplanation[i];
            }
        }

        private AccruedFeesMonthlyExplanation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep$AnnualInterestRateExplanation;", "Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnnualInterestRateExplanation implements WealthMarginBorrowingInterestScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnnualInterestRateExplanation f95460a = new AnnualInterestRateExplanation();

        @NotNull
        public static final Parcelable.Creator<AnnualInterestRateExplanation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnnualInterestRateExplanation.f95460a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnnualInterestRateExplanation[i];
            }
        }

        private AnnualInterestRateExplanation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep$NextPaymentDateExplanation;", "Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NextPaymentDateExplanation implements WealthMarginBorrowingInterestScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextPaymentDateExplanation f95461a = new NextPaymentDateExplanation();

        @NotNull
        public static final Parcelable.Creator<NextPaymentDateExplanation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NextPaymentDateExplanation.f95461a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NextPaymentDateExplanation[i];
            }
        }

        private NextPaymentDateExplanation() {
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
