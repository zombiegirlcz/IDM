package com.revolut.trading.orders.ui.invest.placement.screens.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesLimit;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4l.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ScheduleSettings", "CancellationDeadlineDialog", "CustodyFeeDialog", "SettlementDate", "LargeOrderWarning", "PriceDetails", "HardLockup", "SoftLockup", "EarlyRedemptionFee", "OngoingFees", "IlliquidityWarningLearnMore", "OrderPlacementWarning", "CommissionFreeTradeDialog", "CbpDisclosure", "TotalExchangeFeesDialog", "NoteTradeDateDialog", "NoteIssueDateDialog", "NoteFeesBreakdownDialog", "NoteFeesBreakdownDistributionFeeInfoDialog", "NoteFeesBreakdownCustodyFeeInfoDialog", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$CancellationDeadlineDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$CbpDisclosure;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$CommissionFreeTradeDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$CustodyFeeDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$EarlyRedemptionFee;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$HardLockup;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$IlliquidityWarningLearnMore;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$LargeOrderWarning;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteFeesBreakdownCustodyFeeInfoDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteFeesBreakdownDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteFeesBreakdownDistributionFeeInfoDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteIssueDateDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteTradeDateDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OngoingFees;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$PriceDetails;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$ScheduleSettings;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$SettlementDate;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$SoftLockup;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$TotalExchangeFeesDialog;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InvestOrderReviewScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$CancellationDeadlineDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationDeadlineDialog extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancellationDeadlineDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f106945a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationDeadlineDialog((Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationDeadlineDialog[i];
            }
        }

        public CancellationDeadlineDialog(Instant cancellationDeadline) {
            Intrinsics.checkNotNullParameter(cancellationDeadline, "cancellationDeadline");
            this.f106945a = cancellationDeadline;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationDeadlineDialog) && Intrinsics.f(this.f106945a, ((CancellationDeadlineDialog) obj2).f106945a);
        }

        public final int hashCode() {
            return this.f106945a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106945a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$CbpDisclosure;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CbpDisclosure extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CbpDisclosure> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingLegalEntityInformation f106946a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CbpDisclosure((TradingLegalEntityInformation) parcel.readParcelable(CbpDisclosure.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CbpDisclosure[i];
            }
        }

        public CbpDisclosure(TradingLegalEntityInformation tradingLegalEntityInformation) {
            Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
            this.f106946a = tradingLegalEntityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CbpDisclosure) && Intrinsics.f(this.f106946a, ((CbpDisclosure) obj2).f106946a);
        }

        public final int hashCode() {
            return this.f106946a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106946a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$CommissionFreeTradeDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CommissionFreeTradeDialog extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CommissionFreeTradeDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreeTradesIncentiveContract$FreeTradesLimit f106947a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CommissionFreeTradeDialog((FreeTradesIncentiveContract$FreeTradesLimit) parcel.readParcelable(CommissionFreeTradeDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommissionFreeTradeDialog[i];
            }
        }

        public CommissionFreeTradeDialog(FreeTradesIncentiveContract$FreeTradesLimit freeTradesInfo) {
            Intrinsics.checkNotNullParameter(freeTradesInfo, "freeTradesInfo");
            this.f106947a = freeTradesInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CommissionFreeTradeDialog) && Intrinsics.f(this.f106947a, ((CommissionFreeTradeDialog) obj2).f106947a);
        }

        public final int hashCode() {
            return this.f106947a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106947a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$CustodyFeeDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CustodyFeeDialog extends InvestOrderReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CustodyFeeDialog f106948a = new CustodyFeeDialog();

        @NotNull
        public static final Parcelable.Creator<CustodyFeeDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CustodyFeeDialog.f106948a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustodyFeeDialog[i];
            }
        }

        private CustodyFeeDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$EarlyRedemptionFee;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EarlyRedemptionFee extends InvestOrderReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EarlyRedemptionFee f106949a = new EarlyRedemptionFee();

        @NotNull
        public static final Parcelable.Creator<EarlyRedemptionFee> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EarlyRedemptionFee.f106949a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarlyRedemptionFee[i];
            }
        }

        private EarlyRedemptionFee() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$HardLockup;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HardLockup extends InvestOrderReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HardLockup f106950a = new HardLockup();

        @NotNull
        public static final Parcelable.Creator<HardLockup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HardLockup.f106950a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HardLockup[i];
            }
        }

        private HardLockup() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$IlliquidityWarningLearnMore;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IlliquidityWarningLearnMore extends InvestOrderReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IlliquidityWarningLearnMore f106951a = new IlliquidityWarningLearnMore();

        @NotNull
        public static final Parcelable.Creator<IlliquidityWarningLearnMore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IlliquidityWarningLearnMore.f106951a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IlliquidityWarningLearnMore[i];
            }
        }

        private IlliquidityWarningLearnMore() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$LargeOrderWarning;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LargeOrderWarning extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LargeOrderWarning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderQuote.Slippage.Available f106952a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LargeOrderWarning((OrderQuote.Slippage.Available) parcel.readParcelable(LargeOrderWarning.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LargeOrderWarning[i];
            }
        }

        public LargeOrderWarning(OrderQuote.Slippage.Available slippage) {
            Intrinsics.checkNotNullParameter(slippage, "slippage");
            this.f106952a = slippage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LargeOrderWarning) && Intrinsics.f(this.f106952a, ((LargeOrderWarning) obj2).f106952a);
        }

        public final int hashCode() {
            return this.f106952a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106952a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteFeesBreakdownCustodyFeeInfoDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoteFeesBreakdownCustodyFeeInfoDialog extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<NoteFeesBreakdownCustodyFeeInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f106953a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoteFeesBreakdownCustodyFeeInfoDialog((BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoteFeesBreakdownCustodyFeeInfoDialog[i];
            }
        }

        public NoteFeesBreakdownCustodyFeeInfoDialog(BigDecimal bigDecimal) {
            this.f106953a = bigDecimal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NoteFeesBreakdownCustodyFeeInfoDialog) && Intrinsics.f(this.f106953a, ((NoteFeesBreakdownCustodyFeeInfoDialog) obj2).f106953a);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.f106953a;
            if (bigDecimal == null) {
                return 0;
            }
            return bigDecimal.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106953a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteFeesBreakdownDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoteFeesBreakdownDialog extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<NoteFeesBreakdownDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0 f106954a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoteFeesBreakdownDialog((k0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoteFeesBreakdownDialog[i];
            }
        }

        public NoteFeesBreakdownDialog(k0 limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            this.f106954a = limits;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NoteFeesBreakdownDialog) && Intrinsics.f(this.f106954a, ((NoteFeesBreakdownDialog) obj2).f106954a);
        }

        public final int hashCode() {
            return this.f106954a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106954a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteFeesBreakdownDistributionFeeInfoDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoteFeesBreakdownDistributionFeeInfoDialog extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<NoteFeesBreakdownDistributionFeeInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f106955a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoteFeesBreakdownDistributionFeeInfoDialog((BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoteFeesBreakdownDistributionFeeInfoDialog[i];
            }
        }

        public NoteFeesBreakdownDistributionFeeInfoDialog(BigDecimal bigDecimal) {
            this.f106955a = bigDecimal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NoteFeesBreakdownDistributionFeeInfoDialog) && Intrinsics.f(this.f106955a, ((NoteFeesBreakdownDistributionFeeInfoDialog) obj2).f106955a);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.f106955a;
            if (bigDecimal == null) {
                return 0;
            }
            return bigDecimal.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106955a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteIssueDateDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoteIssueDateDialog extends InvestOrderReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoteIssueDateDialog f106956a = new NoteIssueDateDialog();

        @NotNull
        public static final Parcelable.Creator<NoteIssueDateDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoteIssueDateDialog.f106956a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoteIssueDateDialog[i];
            }
        }

        private NoteIssueDateDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$NoteTradeDateDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoteTradeDateDialog extends InvestOrderReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoteTradeDateDialog f106957a = new NoteTradeDateDialog();

        @NotNull
        public static final Parcelable.Creator<NoteTradeDateDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoteTradeDateDialog.f106957a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoteTradeDateDialog[i];
            }
        }

        private NoteTradeDateDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OngoingFees;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OngoingFees extends InvestOrderReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OngoingFees f106958a = new OngoingFees();

        @NotNull
        public static final Parcelable.Creator<OngoingFees> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OngoingFees.f106958a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OngoingFees[i];
            }
        }

        private OngoingFees() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "FundLiquidityOrderPlacementWarning", "OtcExchangeOrderPlacementWarning", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning$FundLiquidityOrderPlacementWarning;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning$OtcExchangeOrderPlacementWarning;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class OrderPlacementWarning extends InvestOrderReviewScreenContract$ModalStep {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning$FundLiquidityOrderPlacementWarning;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FundLiquidityOrderPlacementWarning extends OrderPlacementWarning {

            @NotNull
            public static final Parcelable.Creator<FundLiquidityOrderPlacementWarning> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Boolean f106959a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new FundLiquidityOrderPlacementWarning(boolValueOf);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FundLiquidityOrderPlacementWarning[i];
                }
            }

            public FundLiquidityOrderPlacementWarning(Boolean bool) {
                this.f106959a = bool;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof FundLiquidityOrderPlacementWarning) && Intrinsics.f(this.f106959a, ((FundLiquidityOrderPlacementWarning) obj2).f106959a);
            }

            public final int hashCode() {
                Boolean bool = this.f106959a;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Boolean bool = this.f106959a;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    p.a.A(dest, 1, bool);
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning$OtcExchangeOrderPlacementWarning;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class OtcExchangeOrderPlacementWarning extends OrderPlacementWarning {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OtcExchangeOrderPlacementWarning f106960a = new OtcExchangeOrderPlacementWarning();

            @NotNull
            public static final Parcelable.Creator<OtcExchangeOrderPlacementWarning> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OtcExchangeOrderPlacementWarning.f106960a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OtcExchangeOrderPlacementWarning[i];
                }
            }

            private OtcExchangeOrderPlacementWarning() {
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

        private OrderPlacementWarning() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$PriceDetails;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceDetails extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PriceDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderQuote.Slippage.Available f106961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OrderQuote.LastTrade f106962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106963c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PriceDetails((OrderQuote.Slippage.Available) parcel.readParcelable(PriceDetails.class.getClassLoader()), (OrderQuote.LastTrade) parcel.readParcelable(PriceDetails.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceDetails[i];
            }
        }

        public PriceDetails(OrderQuote.Slippage.Available slippage, OrderQuote.LastTrade lastTrade, String ticker) {
            Intrinsics.checkNotNullParameter(slippage, "slippage");
            Intrinsics.checkNotNullParameter(ticker, "ticker");
            this.f106961a = slippage;
            this.f106962b = lastTrade;
            this.f106963c = ticker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PriceDetails)) {
                return false;
            }
            PriceDetails priceDetails = (PriceDetails) obj2;
            return Intrinsics.f(this.f106961a, priceDetails.f106961a) && Intrinsics.f(this.f106962b, priceDetails.f106962b) && Intrinsics.f(this.f106963c, priceDetails.f106963c);
        }

        public final int hashCode() {
            int iHashCode = this.f106961a.hashCode() * 31;
            OrderQuote.LastTrade lastTrade = this.f106962b;
            return this.f106963c.hashCode() + ((iHashCode + (lastTrade == null ? 0 : lastTrade.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106961a, i);
            dest.writeParcelable(this.f106962b, i);
            dest.writeString(this.f106963c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$ScheduleSettings;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScheduleSettings extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ScheduleSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f106964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f106965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f106966c;
        public final ArrayList d;
        public final sel.a e;
        public final List f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                LocalDate localDate3 = (LocalDate) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                sel.a aVarValueOf = sel.a.valueOf(parcel.readString());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(sel.a.valueOf(parcel.readString()));
                }
                return new ScheduleSettings(localDate, localDate2, localDate3, arrayList, aVarValueOf, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScheduleSettings[i];
            }
        }

        public ScheduleSettings(LocalDate startDate, LocalDate minAvailableDate, LocalDate maxAvailableDate, ArrayList excludeDates, sel.a period, List availablePeriods) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
            Intrinsics.checkNotNullParameter(maxAvailableDate, "maxAvailableDate");
            Intrinsics.checkNotNullParameter(excludeDates, "excludeDates");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
            this.f106964a = startDate;
            this.f106965b = minAvailableDate;
            this.f106966c = maxAvailableDate;
            this.d = excludeDates;
            this.e = period;
            this.f = availablePeriods;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScheduleSettings)) {
                return false;
            }
            ScheduleSettings scheduleSettings = (ScheduleSettings) obj2;
            return Intrinsics.f(this.f106964a, scheduleSettings.f106964a) && Intrinsics.f(this.f106965b, scheduleSettings.f106965b) && Intrinsics.f(this.f106966c, scheduleSettings.f106966c) && this.d.equals(scheduleSettings.d) && this.e == scheduleSettings.e && Intrinsics.f(this.f, scheduleSettings.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, y.a(y.a(this.f106964a.hashCode() * 31, 31, this.f106965b), 31, this.f106966c), 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106964a);
            dest.writeSerializable(this.f106965b);
            dest.writeSerializable(this.f106966c);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
            dest.writeString(this.e.name());
            Iterator itV = p.a.v(this.f, dest);
            while (itV.hasNext()) {
                dest.writeString(((sel.a) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$SettlementDate;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettlementDate extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SettlementDate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bfl.g f106967a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SettlementDate(bfl.g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettlementDate[i];
            }
        }

        public SettlementDate(bfl.g tradeSide) {
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            this.f106967a = tradeSide;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SettlementDate) && this.f106967a == ((SettlementDate) obj2).f106967a;
        }

        public final int hashCode() {
            return this.f106967a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106967a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$SoftLockup;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SoftLockup extends InvestOrderReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SoftLockup f106968a = new SoftLockup();

        @NotNull
        public static final Parcelable.Creator<SoftLockup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SoftLockup.f106968a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SoftLockup[i];
            }
        }

        private SoftLockup() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep$TotalExchangeFeesDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalExchangeFeesDialog extends InvestOrderReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TotalExchangeFeesDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FiatExchangeOrderQuoteParams f106969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingLegalEntityInformation f106970b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TotalExchangeFeesDialog((FiatExchangeOrderQuoteParams) parcel.readParcelable(TotalExchangeFeesDialog.class.getClassLoader()), (TradingLegalEntityInformation) parcel.readParcelable(TotalExchangeFeesDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalExchangeFeesDialog[i];
            }
        }

        public TotalExchangeFeesDialog(FiatExchangeOrderQuoteParams orderQuoteParams, TradingLegalEntityInformation tradingLegalEntityInformation) {
            Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
            Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
            this.f106969a = orderQuoteParams;
            this.f106970b = tradingLegalEntityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TotalExchangeFeesDialog)) {
                return false;
            }
            TotalExchangeFeesDialog totalExchangeFeesDialog = (TotalExchangeFeesDialog) obj2;
            return Intrinsics.f(this.f106969a, totalExchangeFeesDialog.f106969a) && Intrinsics.f(this.f106970b, totalExchangeFeesDialog.f106970b);
        }

        public final int hashCode() {
            return this.f106970b.hashCode() + (this.f106969a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106969a, i);
            dest.writeParcelable(this.f106970b, i);
        }
    }

    private InvestOrderReviewScreenContract$ModalStep() {
    }
}
