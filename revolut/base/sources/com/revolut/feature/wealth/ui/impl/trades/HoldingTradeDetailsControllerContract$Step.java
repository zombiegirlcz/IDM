package com.revolut.feature.wealth.ui.impl.trades;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SettlementDateDialog", "TaxInfoDialog", "ExchangeBreakdownDialog", "Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step$ExchangeBreakdownDialog;", "Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step$SettlementDateDialog;", "Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step$TaxInfoDialog;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HoldingTradeDetailsControllerContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step$ExchangeBreakdownDialog;", "Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeBreakdownDialog extends HoldingTradeDetailsControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExchangeBreakdownDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dfl.a f96045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dfl.a f96046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f96047c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeBreakdownDialog((dfl.a) parcel.readSerializable(), (dfl.a) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeBreakdownDialog[i];
            }
        }

        public ExchangeBreakdownDialog(dfl.a amount, dfl.a exchangedValue, BigDecimal rate) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(exchangedValue, "exchangedValue");
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.f96045a = amount;
            this.f96046b = exchangedValue;
            this.f96047c = rate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExchangeBreakdownDialog)) {
                return false;
            }
            ExchangeBreakdownDialog exchangeBreakdownDialog = (ExchangeBreakdownDialog) obj2;
            return Intrinsics.f(this.f96045a, exchangeBreakdownDialog.f96045a) && Intrinsics.f(this.f96046b, exchangeBreakdownDialog.f96046b) && Intrinsics.f(this.f96047c, exchangeBreakdownDialog.f96047c);
        }

        public final int hashCode() {
            return this.f96047c.hashCode() + ((this.f96046b.hashCode() + (this.f96045a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96045a);
            dest.writeSerializable(this.f96046b);
            dest.writeSerializable(this.f96047c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step$SettlementDateDialog;", "Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettlementDateDialog extends HoldingTradeDetailsControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<SettlementDateDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hel.b f96048a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SettlementDateDialog(hel.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettlementDateDialog[i];
            }
        }

        public SettlementDateDialog(hel.b tradingContext) {
            Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
            this.f96048a = tradingContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SettlementDateDialog) && this.f96048a == ((SettlementDateDialog) obj2).f96048a;
        }

        public final int hashCode() {
            return this.f96048a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96048a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step$TaxInfoDialog;", "Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxInfoDialog extends HoldingTradeDetailsControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f96049a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxInfoDialog((n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxInfoDialog[i];
            }
        }

        public TaxInfoDialog(n nVar) {
            this.f96049a = nVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxInfoDialog) && Intrinsics.f(this.f96049a, ((TaxInfoDialog) obj2).f96049a);
        }

        public final int hashCode() {
            n nVar = this.f96049a;
            if (nVar == null) {
                return 0;
            }
            return nVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96049a);
        }
    }

    private HoldingTradeDetailsControllerContract$Step() {
    }
}
