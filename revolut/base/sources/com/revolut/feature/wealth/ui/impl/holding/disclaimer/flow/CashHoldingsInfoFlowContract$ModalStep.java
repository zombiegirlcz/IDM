package com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AvailableExplanation", "AvailableToWithdraw", "UnsettledCash", "Selector", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep$AvailableExplanation;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep$AvailableToWithdraw;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep$Selector;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep$UnsettledCash;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CashHoldingsInfoFlowContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep$AvailableExplanation;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AvailableExplanation extends CashHoldingsInfoFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AvailableExplanation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f96007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthDisclaimersContract$Disclaimer$Investment f96008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final kel.b f96009c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AvailableExplanation((Clause) parcel.readParcelable(AvailableExplanation.class.getClassLoader()), (WealthDisclaimersContract$Disclaimer$Investment) parcel.readParcelable(AvailableExplanation.class.getClassLoader()), (kel.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AvailableExplanation[i];
            }
        }

        public AvailableExplanation(Clause title, WealthDisclaimersContract$Disclaimer$Investment disclaimersData, kel.b cashHolding) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            this.f96007a = title;
            this.f96008b = disclaimersData;
            this.f96009c = cashHolding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AvailableExplanation)) {
                return false;
            }
            AvailableExplanation availableExplanation = (AvailableExplanation) obj2;
            return Intrinsics.f(this.f96007a, availableExplanation.f96007a) && Intrinsics.f(this.f96008b, availableExplanation.f96008b) && Intrinsics.f(this.f96009c, availableExplanation.f96009c);
        }

        public final int hashCode() {
            return this.f96009c.hashCode() + ((this.f96008b.hashCode() + (this.f96007a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96007a, i);
            dest.writeParcelable(this.f96008b, i);
            dest.writeSerializable(this.f96009c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep$AvailableToWithdraw;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AvailableToWithdraw extends CashHoldingsInfoFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AvailableToWithdraw> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kel.b f96010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f96011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hel.b f96012c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AvailableToWithdraw((kel.b) parcel.readSerializable(), (TradingAccount) parcel.readParcelable(AvailableToWithdraw.class.getClassLoader()), hel.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AvailableToWithdraw[i];
            }
        }

        public AvailableToWithdraw(kel.b cashHolding, TradingAccount tradingAccount, hel.b tradingContext) {
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
            this.f96010a = cashHolding;
            this.f96011b = tradingAccount;
            this.f96012c = tradingContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AvailableToWithdraw)) {
                return false;
            }
            AvailableToWithdraw availableToWithdraw = (AvailableToWithdraw) obj2;
            return Intrinsics.f(this.f96010a, availableToWithdraw.f96010a) && Intrinsics.f(this.f96011b, availableToWithdraw.f96011b) && this.f96012c == availableToWithdraw.f96012c;
        }

        public final int hashCode() {
            return this.f96012c.hashCode() + o.b(this.f96011b, this.f96010a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96010a);
            dest.writeParcelable(this.f96011b, i);
            dest.writeString(this.f96012c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep$Selector;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selector extends CashHoldingsInfoFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Selector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f96013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f96014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f96015c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", Selector.class);
                TradingAccount tradingAccount = (TradingAccount) parcel.readParcelable(Selector.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Selector(clause, tradingAccount, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selector[i];
            }
        }

        public Selector(Clause selectorTitle, TradingAccount tradingAccount, List cashHoldings) {
            Intrinsics.checkNotNullParameter(selectorTitle, "selectorTitle");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
            this.f96013a = selectorTitle;
            this.f96014b = tradingAccount;
            this.f96015c = cashHoldings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Selector)) {
                return false;
            }
            Selector selector = (Selector) obj2;
            return Intrinsics.f(this.f96013a, selector.f96013a) && Intrinsics.f(this.f96014b, selector.f96014b) && Intrinsics.f(this.f96015c, selector.f96015c);
        }

        public final int hashCode() {
            return this.f96015c.hashCode() + o.b(this.f96014b, this.f96013a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96013a, i);
            dest.writeParcelable(this.f96014b, i);
            Iterator itV = p.a.v(this.f96015c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep$UnsettledCash;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnsettledCash extends CashHoldingsInfoFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnsettledCash> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kel.b f96016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f96017b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnsettledCash((kel.b) parcel.readSerializable(), (TradingAccount) parcel.readParcelable(UnsettledCash.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnsettledCash[i];
            }
        }

        public UnsettledCash(kel.b cashHolding, TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f96016a = cashHolding;
            this.f96017b = tradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnsettledCash)) {
                return false;
            }
            UnsettledCash unsettledCash = (UnsettledCash) obj2;
            return Intrinsics.f(this.f96016a, unsettledCash.f96016a) && Intrinsics.f(this.f96017b, unsettledCash.f96017b);
        }

        public final int hashCode() {
            return this.f96017b.hashCode() + (this.f96016a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96016a);
            dest.writeParcelable(this.f96017b, i);
        }
    }

    private CashHoldingsInfoFlowContract$ModalStep() {
    }
}
