package com.revolut.feature_move_money.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import j8l.d;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5i.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_move_money/api/model/OrderMode;", "Landroid/os/Parcelable;", "Market", "Scheduling", "Threshold", "Automation", "Lcom/revolut/feature_move_money/api/model/OrderMode$Automation;", "Lcom/revolut/feature_move_money/api/model/OrderMode$Market;", "Lcom/revolut/feature_move_money/api/model/OrderMode$Scheduling;", "Lcom/revolut/feature_move_money/api/model/OrderMode$Threshold;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/OrderMode$Automation;", "Lcom/revolut/feature_move_money/api/model/OrderMode;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Automation implements OrderMode {

        @NotNull
        public static final Parcelable.Creator<Automation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletAutomation f97227a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Automation((WalletAutomation) parcel.readParcelable(Automation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Automation[i];
            }
        }

        public Automation(WalletAutomation automation) {
            Intrinsics.checkNotNullParameter(automation, "automation");
            this.f97227a = automation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Automation) && Intrinsics.f(this.f97227a, ((Automation) obj2).f97227a);
        }

        public final int hashCode() {
            return this.f97227a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97227a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/OrderMode$Market;", "Lcom/revolut/feature_move_money/api/model/OrderMode;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Market implements OrderMode {

        @NotNull
        public static final Parcelable.Creator<Market> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97228a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Market(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Market[i];
            }
        }

        public Market() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Market) && Intrinsics.f(this.f97228a, ((Market) obj2).f97228a);
        }

        public final int hashCode() {
            String str = this.f97228a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97228a);
        }

        public Market(String str) {
            this.f97228a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/OrderMode$Scheduling;", "Lcom/revolut/feature_move_money/api/model/OrderMode;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Scheduling implements OrderMode {

        @NotNull
        public static final Parcelable.Creator<Scheduling> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferScheduleData f97229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97230b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Scheduling((TransferScheduleData) parcel.readParcelable(Scheduling.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scheduling[i];
            }
        }

        public Scheduling(TransferScheduleData scheduleData, String str) {
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            this.f97229a = scheduleData;
            this.f97230b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Scheduling)) {
                return false;
            }
            Scheduling scheduling = (Scheduling) obj2;
            return Intrinsics.f(this.f97229a, scheduling.f97229a) && Intrinsics.f(this.f97230b, scheduling.f97230b);
        }

        public final int hashCode() {
            int iHashCode = this.f97229a.hashCode() * 31;
            String str = this.f97230b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97229a, i);
            dest.writeString(this.f97230b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/OrderMode$Threshold;", "Lcom/revolut/feature_move_money/api/model/OrderMode;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Threshold implements OrderMode {

        @NotNull
        public static final Parcelable.Creator<Threshold> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f97231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f97232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f97233c;
        public final d d;
        public final BigDecimal e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Threshold(d.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), l.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Threshold[i];
            }
        }

        public Threshold(d buyMode, BigDecimal rate, l type, xi0.b sourceCurrency, xi0.b targetCurrency) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
            Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
            Intrinsics.checkNotNullParameter(buyMode, "buyMode");
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.f97231a = type;
            this.f97232b = sourceCurrency;
            this.f97233c = targetCurrency;
            this.d = buyMode;
            this.e = rate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Threshold)) {
                return false;
            }
            Threshold threshold = (Threshold) obj2;
            return this.f97231a == threshold.f97231a && Intrinsics.f(this.f97232b, threshold.f97232b) && Intrinsics.f(this.f97233c, threshold.f97233c) && this.d == threshold.d && Intrinsics.f(this.e, threshold.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + h30.l.j(this.f97233c, h30.l.j(this.f97232b, this.f97231a.hashCode() * 31, 31), 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97231a.name());
            dest.writeSerializable(this.f97232b);
            dest.writeSerializable(this.f97233c);
            dest.writeString(this.d.name());
            dest.writeSerializable(this.e);
        }
    }
}
