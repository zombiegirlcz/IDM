package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.HintDialogMapper$HintDialogReason;
import ehe.n;
import h30.l;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectOrderType", "Tutorial", "TargetPrice", "TradingAccountPicker", "CurrencyPicker", "BalancePicker", "HintDialog", "ScheduleSettings", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$BalancePicker;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$HintDialog;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$ScheduleSettings;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$SelectOrderType;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$TargetPrice;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$TradingAccountPicker;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$Tutorial;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CommodityOrderEditScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$BalancePicker;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalancePicker extends CommodityOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalancePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f99826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f99828c;
        public final Set d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashSet.add(k1j.a.valueOf(parcel.readString()));
                }
                return new BalancePicker(bVar, string, arrayList, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalancePicker[i];
            }
        }

        public BalancePicker(xi0.b counterCurrency, String str, ArrayList availableCounterCurrencies, Set allowedGroups) {
            Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
            Intrinsics.checkNotNullParameter(availableCounterCurrencies, "availableCounterCurrencies");
            Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
            this.f99826a = counterCurrency;
            this.f99827b = str;
            this.f99828c = availableCounterCurrencies;
            this.d = allowedGroups;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalancePicker)) {
                return false;
            }
            BalancePicker balancePicker = (BalancePicker) obj2;
            return Intrinsics.f(this.f99826a, balancePicker.f99826a) && Intrinsics.f(this.f99827b, balancePicker.f99827b) && this.f99828c.equals(balancePicker.f99828c) && this.d.equals(balancePicker.d);
        }

        public final int hashCode() {
            int iHashCode = this.f99826a.hashCode() * 31;
            String str = this.f99827b;
            return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f99828c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99826a);
            dest.writeString(this.f99827b);
            Iterator itY = j6.a.y(this.f99828c, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString(((k1j.a) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPicker extends CommodityOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f99829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f99830b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new CurrencyPicker(arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        public CurrencyPicker(ArrayList availableCounterCurrencies, xi0.b counterCurrency) {
            Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
            Intrinsics.checkNotNullParameter(availableCounterCurrencies, "availableCounterCurrencies");
            this.f99829a = counterCurrency;
            this.f99830b = availableCounterCurrencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyPicker)) {
                return false;
            }
            CurrencyPicker currencyPicker = (CurrencyPicker) obj2;
            return Intrinsics.f(this.f99829a, currencyPicker.f99829a) && this.f99830b.equals(currencyPicker.f99830b);
        }

        public final int hashCode() {
            return this.f99830b.hashCode() + (this.f99829a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99829a);
            Iterator itY = j6.a.y(this.f99830b, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$HintDialog;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HintDialog extends CommodityOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<HintDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HintDialogMapper$HintDialogReason f99831a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HintDialog((HintDialogMapper$HintDialogReason) parcel.readParcelable(HintDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HintDialog[i];
            }
        }

        public HintDialog(HintDialogMapper$HintDialogReason dialogReason) {
            Intrinsics.checkNotNullParameter(dialogReason, "dialogReason");
            this.f99831a = dialogReason;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HintDialog) && Intrinsics.f(this.f99831a, ((HintDialog) obj2).f99831a);
        }

        public final int hashCode() {
            return this.f99831a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99831a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$ScheduleSettings;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScheduleSettings extends CommodityOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ScheduleSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f99832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f99833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f99834c;
        public final boolean d;
        public final List e;
        public final sel.a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f99835g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                LocalDate localDate3 = (LocalDate) parcel.readSerializable();
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iC = 0;
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, i);
                }
                sel.a aVarValueOf = sel.a.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    arrayList2.add(sel.a.valueOf(parcel.readString()));
                }
                return new ScheduleSettings(localDate, localDate2, localDate3, z, arrayList, aVarValueOf, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScheduleSettings[i];
            }
        }

        public ScheduleSettings(LocalDate startDate, LocalDate localDate, LocalDate localDate2, boolean z, List excludeDates, sel.a period, List availablePeriods) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(excludeDates, "excludeDates");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
            this.f99832a = startDate;
            this.f99833b = localDate;
            this.f99834c = localDate2;
            this.d = z;
            this.e = excludeDates;
            this.f = period;
            this.f99835g = availablePeriods;
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
            return Intrinsics.f(this.f99832a, scheduleSettings.f99832a) && Intrinsics.f(this.f99833b, scheduleSettings.f99833b) && Intrinsics.f(this.f99834c, scheduleSettings.f99834c) && this.d == scheduleSettings.d && Intrinsics.f(this.e, scheduleSettings.e) && this.f == scheduleSettings.f && Intrinsics.f(this.f99835g, scheduleSettings.f99835g);
        }

        public final int hashCode() {
            int iHashCode = this.f99832a.hashCode() * 31;
            LocalDate localDate = this.f99833b;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.f99834c;
            return this.f99835g.hashCode() + ((this.f.hashCode() + p.a.d(j6.a.c((iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31, 31, this.d), 31, this.e)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99832a);
            dest.writeSerializable(this.f99833b);
            dest.writeSerializable(this.f99834c);
            dest.writeInt(this.d ? 1 : 0);
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeString(this.f.name());
            Iterator itV2 = p.a.v(this.f99835g, dest);
            while (itV2.hasNext()) {
                dest.writeString(((sel.a) itV2.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$SelectOrderType;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectOrderType extends CommodityOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectOrderType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f99836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wd6.e f99837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f99838c;
        public final Set d;
        public final Set e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                wd6.e eVarValueOf = wd6.e.valueOf(parcel.readString());
                h hVarValueOf = h.valueOf(parcel.readString());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(h.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    linkedHashSet2.add(h.valueOf(parcel.readString()));
                }
                return new SelectOrderType(bVar, eVarValueOf, hVarValueOf, linkedHashSet, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectOrderType[i];
            }
        }

        public SelectOrderType(xi0.b orderBaseCurrency, wd6.e exchangeMode, h currentOrderType, Set availableOrderTypes, Set disabledOrderTypes) {
            Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            Intrinsics.checkNotNullParameter(currentOrderType, "currentOrderType");
            Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
            Intrinsics.checkNotNullParameter(disabledOrderTypes, "disabledOrderTypes");
            this.f99836a = orderBaseCurrency;
            this.f99837b = exchangeMode;
            this.f99838c = currentOrderType;
            this.d = availableOrderTypes;
            this.e = disabledOrderTypes;
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
            return Intrinsics.f(this.f99836a, selectOrderType.f99836a) && this.f99837b == selectOrderType.f99837b && this.f99838c == selectOrderType.f99838c && Intrinsics.f(this.d, selectOrderType.d) && Intrinsics.f(this.e, selectOrderType.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.f(v1.c.b(this.f99838c, y.g(this.f99837b, this.f99836a.hashCode() * 31, 31), 31), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99836a);
            dest.writeString(this.f99837b.name());
            dest.writeString(this.f99838c.name());
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString(((h) itV.next()).name());
            }
            Iterator itV2 = n.v(this.e, dest);
            while (itV2.hasNext()) {
                dest.writeString(((h) itV2.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$TargetPrice;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetPrice extends CommodityOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TargetPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f99839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f99840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f99841c;
        public final xi0.b d;
        public final wd6.e e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetPrice((BigDecimal) parcel.readSerializable(), h.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), wd6.e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetPrice[i];
            }
        }

        public TargetPrice(BigDecimal bigDecimal, h orderType, xi0.b orderBaseCurrency, xi0.b counterCurrency, wd6.e exchangeMode) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
            Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            this.f99839a = bigDecimal;
            this.f99840b = orderType;
            this.f99841c = orderBaseCurrency;
            this.d = counterCurrency;
            this.e = exchangeMode;
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
            return Intrinsics.f(this.f99839a, targetPrice.f99839a) && this.f99840b == targetPrice.f99840b && Intrinsics.f(this.f99841c, targetPrice.f99841c) && Intrinsics.f(this.d, targetPrice.d) && this.e == targetPrice.e;
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.f99839a;
            return this.e.hashCode() + l.j(this.d, l.j(this.f99841c, v1.c.b(this.f99840b, (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31, 31), 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99839a);
            dest.writeString(this.f99840b.name());
            dest.writeSerializable(this.f99841c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$TradingAccountPicker;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingAccountPicker extends CommodityOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TradingAccountPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f99843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bfl.g f99844c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TradingAccountPicker.class, parcel, arrayList, iE, 1);
                }
                return new TradingAccountPicker(bfl.g.valueOf(parcel.readString()), string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingAccountPicker[i];
            }
        }

        public TradingAccountPicker(bfl.g tradeSide, String selectedPocketId, List investSectionParams) {
            Intrinsics.checkNotNullParameter(selectedPocketId, "selectedPocketId");
            Intrinsics.checkNotNullParameter(investSectionParams, "investSectionParams");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            this.f99842a = selectedPocketId;
            this.f99843b = investSectionParams;
            this.f99844c = tradeSide;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingAccountPicker)) {
                return false;
            }
            TradingAccountPicker tradingAccountPicker = (TradingAccountPicker) obj2;
            return Intrinsics.f(this.f99842a, tradingAccountPicker.f99842a) && Intrinsics.f(this.f99843b, tradingAccountPicker.f99843b) && this.f99844c == tradingAccountPicker.f99844c;
        }

        public final int hashCode() {
            return this.f99844c.hashCode() + p.a.d(this.f99842a.hashCode() * 31, 31, this.f99843b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99842a);
            Iterator itV = p.a.v(this.f99843b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f99844c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep$Tutorial;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tutorial extends CommodityOrderEditScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Tutorial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wd6.e f99845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f99846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f99847c;
        public final l6j.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tutorial(wd6.e.valueOf(parcel.readString()), h.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable(), l6j.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tutorial[i];
            }
        }

        public Tutorial(wd6.e exchangeMode, h orderType, xi0.b orderBaseCurrency, l6j.a popUpKey) {
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
            Intrinsics.checkNotNullParameter(popUpKey, "popUpKey");
            this.f99845a = exchangeMode;
            this.f99846b = orderType;
            this.f99847c = orderBaseCurrency;
            this.d = popUpKey;
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
            return this.f99845a == tutorial.f99845a && this.f99846b == tutorial.f99846b && Intrinsics.f(this.f99847c, tutorial.f99847c) && this.d == tutorial.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + l.j(this.f99847c, v1.c.b(this.f99846b, this.f99845a.hashCode() * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99845a.name());
            dest.writeString(this.f99846b.name());
            dest.writeSerializable(this.f99847c);
            dest.writeString(this.d.name());
        }
    }

    private CommodityOrderEditScreenContract$ModalStep() {
    }
}
