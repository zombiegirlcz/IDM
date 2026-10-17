package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesLimit;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import h30.l;
import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k4l.e0;
import k4l.k;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectOrderType", "SourcePocketPicker", "Tutorial", "TargetPrice", "ScheduleSettings", "ExpiryDate", "TaaAllowanceDetail", "CommissionFreeTradeDialog", "BalanceBreakdown", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$BalanceBreakdown;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$CommissionFreeTradeDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$ExpiryDate;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$ScheduleSettings;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$SelectOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$SourcePocketPicker;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$TaaAllowanceDetail;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$TargetPrice;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$Tutorial;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InvestOrderEditScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$BalanceBreakdown;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalanceBreakdown extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalanceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f106885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f106886b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalanceBreakdown((n) parcel.readSerializable(), (e0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalanceBreakdown[i];
            }
        }

        public BalanceBreakdown(n instrument, e0 e0Var) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.f106885a = instrument;
            this.f106886b = e0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalanceBreakdown)) {
                return false;
            }
            BalanceBreakdown balanceBreakdown = (BalanceBreakdown) obj2;
            return Intrinsics.f(this.f106885a, balanceBreakdown.f106885a) && Intrinsics.f(this.f106886b, balanceBreakdown.f106886b);
        }

        public final int hashCode() {
            int iHashCode = this.f106885a.hashCode() * 31;
            e0 e0Var = this.f106886b;
            return iHashCode + (e0Var == null ? 0 : e0Var.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106885a);
            dest.writeSerializable(this.f106886b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$CommissionFreeTradeDialog;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CommissionFreeTradeDialog extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CommissionFreeTradeDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreeTradesIncentiveContract$FreeTradesLimit f106887a;

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
            this.f106887a = freeTradesInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CommissionFreeTradeDialog) && Intrinsics.f(this.f106887a, ((CommissionFreeTradeDialog) obj2).f106887a);
        }

        public final int hashCode() {
            return this.f106887a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106887a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$ExpiryDate;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpiryDate extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExpiryDate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f106888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f106889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f106890c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                k kVarValueOf = k.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new ExpiryDate(localDate, kVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiryDate[i];
            }
        }

        public ExpiryDate(LocalDate expiryDate, k expiryDateType, List calendarExcludeDates) {
            Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
            Intrinsics.checkNotNullParameter(expiryDateType, "expiryDateType");
            Intrinsics.checkNotNullParameter(calendarExcludeDates, "calendarExcludeDates");
            this.f106888a = expiryDate;
            this.f106889b = expiryDateType;
            this.f106890c = calendarExcludeDates;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExpiryDate)) {
                return false;
            }
            ExpiryDate expiryDate = (ExpiryDate) obj2;
            return Intrinsics.f(this.f106888a, expiryDate.f106888a) && this.f106889b == expiryDate.f106889b && Intrinsics.f(this.f106890c, expiryDate.f106890c);
        }

        public final int hashCode() {
            return this.f106890c.hashCode() + ((this.f106889b.hashCode() + (this.f106888a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106888a);
            dest.writeString(this.f106889b.name());
            Iterator itV = p.a.v(this.f106890c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$ScheduleSettings;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScheduleSettings extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ScheduleSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f106891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f106892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f106893c;
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
            this.f106891a = startDate;
            this.f106892b = minAvailableDate;
            this.f106893c = maxAvailableDate;
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
            return Intrinsics.f(this.f106891a, scheduleSettings.f106891a) && Intrinsics.f(this.f106892b, scheduleSettings.f106892b) && Intrinsics.f(this.f106893c, scheduleSettings.f106893c) && this.d.equals(scheduleSettings.d) && this.e == scheduleSettings.e && Intrinsics.f(this.f, scheduleSettings.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, y.a(y.a(this.f106891a.hashCode() * 31, 31, this.f106892b), 31, this.f106893c), 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106891a);
            dest.writeSerializable(this.f106892b);
            dest.writeSerializable(this.f106893c);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$SelectOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectOrderType extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectOrderType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f106894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f106895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f106896c;
        public final n d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SelectOrderType.class, parcel, arrayList, iE, 1);
                }
                return new SelectOrderType(arrayList, r0.valueOf(parcel.readString()), g.valueOf(parcel.readString()), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectOrderType[i];
            }
        }

        public SelectOrderType(List availableOrderTypes, r0 selectedOrderType, g tradeSide, n instrument) {
            Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
            Intrinsics.checkNotNullParameter(selectedOrderType, "selectedOrderType");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.f106894a = availableOrderTypes;
            this.f106895b = selectedOrderType;
            this.f106896c = tradeSide;
            this.d = instrument;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectOrderType)) {
                return false;
            }
            SelectOrderType selectOrderType = (SelectOrderType) obj2;
            return Intrinsics.f(this.f106894a, selectOrderType.f106894a) && this.f106895b == selectOrderType.f106895b && this.f106896c == selectOrderType.f106896c && Intrinsics.f(this.d, selectOrderType.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + y.b(this.f106896c, com.revolut.data.database.models.openbanking.d.f(this.f106895b, this.f106894a.hashCode() * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f106894a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f106895b.name());
            dest.writeString(this.f106896c.name());
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$SourcePocketPicker;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SourcePocketPicker extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SourcePocketPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f106897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f106898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f106899c;
        public final String d;
        public final n e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iC = 0;
                int iD = 0;
                while (iD != i) {
                    iD = v7.d(parcel, linkedHashSet, iD, 1);
                }
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new SourcePocketPicker(linkedHashSet, bVar, arrayList, parcel.readString(), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SourcePocketPicker[i];
            }
        }

        public SourcePocketPicker(Set availableDisplayCurrencies, xi0.b displayCurrency, List sectionConfigs, String selectedSourcePocketId, n instrument) {
            Intrinsics.checkNotNullParameter(availableDisplayCurrencies, "availableDisplayCurrencies");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            Intrinsics.checkNotNullParameter(sectionConfigs, "sectionConfigs");
            Intrinsics.checkNotNullParameter(selectedSourcePocketId, "selectedSourcePocketId");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.f106897a = availableDisplayCurrencies;
            this.f106898b = displayCurrency;
            this.f106899c = sectionConfigs;
            this.d = selectedSourcePocketId;
            this.e = instrument;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SourcePocketPicker)) {
                return false;
            }
            SourcePocketPicker sourcePocketPicker = (SourcePocketPicker) obj2;
            return Intrinsics.f(this.f106897a, sourcePocketPicker.f106897a) && Intrinsics.f(this.f106898b, sourcePocketPicker.f106898b) && Intrinsics.f(this.f106899c, sourcePocketPicker.f106899c) && Intrinsics.f(this.d, sourcePocketPicker.d) && Intrinsics.f(this.e, sourcePocketPicker.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.d(l.j(this.f106898b, this.f106897a.hashCode() * 31, 31), 31, this.f106899c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = ehe.n.v(this.f106897a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeSerializable(this.f106898b);
            Iterator itV2 = p.a.v(this.f106899c, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$TaaAllowanceDetail;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaaAllowanceDetail extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TaaAllowanceDetail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount.TaxAdvantage f106900a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaaAllowanceDetail((TradingAccount.TaxAdvantage) parcel.readParcelable(TaaAllowanceDetail.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaaAllowanceDetail[i];
            }
        }

        public TaaAllowanceDetail(TradingAccount.TaxAdvantage tradingAccount) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f106900a = tradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaaAllowanceDetail) && Intrinsics.f(this.f106900a, ((TaaAllowanceDetail) obj2).f106900a);
        }

        public final int hashCode() {
            return this.f106900a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106900a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$TargetPrice;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetPrice extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TargetPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f106901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f106902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Amount f106903c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetPrice(g.valueOf(parcel.readString()), r0.valueOf(parcel.readString()), (Amount) parcel.readParcelable(TargetPrice.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetPrice[i];
            }
        }

        public TargetPrice(g tradeSide, r0 orderType, Amount amount, boolean z) {
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f106901a = tradeSide;
            this.f106902b = orderType;
            this.f106903c = amount;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TargetPrice)) {
                return false;
            }
            TargetPrice targetPrice = (TargetPrice) obj2;
            return this.f106901a == targetPrice.f106901a && this.f106902b == targetPrice.f106902b && Intrinsics.f(this.f106903c, targetPrice.f106903c) && this.d == targetPrice.d;
        }

        public final int hashCode() {
            int iF = com.revolut.data.database.models.openbanking.d.f(this.f106902b, this.f106901a.hashCode() * 31, 31);
            Amount amount = this.f106903c;
            return Boolean.hashCode(this.d) + ((iF + (amount == null ? 0 : amount.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106901a.name());
            dest.writeString(this.f106902b.name());
            dest.writeParcelable(this.f106903c, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep$Tutorial;", "Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tutorial extends InvestOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Tutorial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f106904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f106905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f106906c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tutorial(g.valueOf(parcel.readString()), r0.valueOf(parcel.readString()), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tutorial[i];
            }
        }

        public Tutorial(g tradeSide, r0 orderType, n instrument) {
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.f106904a = tradeSide;
            this.f106905b = orderType;
            this.f106906c = instrument;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tutorial)) {
                return false;
            }
            Tutorial tutorial = (Tutorial) obj2;
            return this.f106904a == tutorial.f106904a && this.f106905b == tutorial.f106905b && Intrinsics.f(this.f106906c, tutorial.f106906c);
        }

        public final int hashCode() {
            return this.f106906c.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f106905b, this.f106904a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106904a.name());
            dest.writeString(this.f106905b.name());
            dest.writeSerializable(this.f106906c);
        }
    }

    private InvestOrderEditScreenContract$ModalStep() {
    }
}
