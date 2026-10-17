package com.revolut.trading.orders.ui.invest.placement.models;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.retail.trading.core.domain.orders.OrderExpiry;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import h30.l;
import k4l.e0;
import k4l.q0;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/InvestOrderDraft;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOrderDraft implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestOrderDraft> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f106847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f106848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f106849c;
    public final ProcessedInputAmount d;
    public final OrderQuoteParams e;
    public final SourcePocketWrapper f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f106850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f106851h;
    public final Amount i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExtendedHoursStatus f106852j;
    public final OrderExpiry k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FrequencySettings f106853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AutoTopUpStatus f106854m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestOrderDraft(g.valueOf(parcel.readString()), r0.valueOf(parcel.readString()), (b) parcel.readSerializable(), (ProcessedInputAmount) parcel.readParcelable(InvestOrderDraft.class.getClassLoader()), (OrderQuoteParams) parcel.readParcelable(InvestOrderDraft.class.getClassLoader()), (SourcePocketWrapper) parcel.readParcelable(InvestOrderDraft.class.getClassLoader()), q0.valueOf(parcel.readString()), (e0) parcel.readSerializable(), (Amount) parcel.readParcelable(InvestOrderDraft.class.getClassLoader()), (ExtendedHoursStatus) parcel.readParcelable(InvestOrderDraft.class.getClassLoader()), (OrderExpiry) parcel.readParcelable(InvestOrderDraft.class.getClassLoader()), (FrequencySettings) parcel.readParcelable(InvestOrderDraft.class.getClassLoader()), (AutoTopUpStatus) parcel.readParcelable(InvestOrderDraft.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOrderDraft[i];
        }
    }

    public InvestOrderDraft(g tradeSide, r0 orderType, b displayCurrency, ProcessedInputAmount processedInputAmount, OrderQuoteParams orderQuoteParams, SourcePocketWrapper sourcePocketWrapper, q0 timeInForce, e0 orderLimits, Amount amount, ExtendedHoursStatus extendedHoursStatus, OrderExpiry orderExpiry, FrequencySettings frequencySettings, AutoTopUpStatus autoTopUpStatus) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(processedInputAmount, "processedInputAmount");
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(extendedHoursStatus, "extendedHoursStatus");
        Intrinsics.checkNotNullParameter(orderExpiry, "orderExpiry");
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        this.f106847a = tradeSide;
        this.f106848b = orderType;
        this.f106849c = displayCurrency;
        this.d = processedInputAmount;
        this.e = orderQuoteParams;
        this.f = sourcePocketWrapper;
        this.f106850g = timeInForce;
        this.f106851h = orderLimits;
        this.i = amount;
        this.f106852j = extendedHoursStatus;
        this.k = orderExpiry;
        this.f106853l = frequencySettings;
        this.f106854m = autoTopUpStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestOrderDraft)) {
            return false;
        }
        InvestOrderDraft investOrderDraft = (InvestOrderDraft) obj2;
        return this.f106847a == investOrderDraft.f106847a && this.f106848b == investOrderDraft.f106848b && Intrinsics.f(this.f106849c, investOrderDraft.f106849c) && Intrinsics.f(this.d, investOrderDraft.d) && Intrinsics.f(this.e, investOrderDraft.e) && Intrinsics.f(this.f, investOrderDraft.f) && this.f106850g == investOrderDraft.f106850g && Intrinsics.f(this.f106851h, investOrderDraft.f106851h) && Intrinsics.f(this.i, investOrderDraft.i) && Intrinsics.f(this.f106852j, investOrderDraft.f106852j) && Intrinsics.f(this.k, investOrderDraft.k) && Intrinsics.f(this.f106853l, investOrderDraft.f106853l) && Intrinsics.f(this.f106854m, investOrderDraft.f106854m);
    }

    public final int hashCode() {
        int iHashCode = (this.f106851h.hashCode() + ((this.f106850g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + l.j(this.f106849c, d.f(this.f106848b, this.f106847a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Amount amount = this.i;
        int iHashCode2 = (this.k.hashCode() + ((this.f106852j.hashCode() + ((iHashCode + (amount == null ? 0 : amount.hashCode())) * 31)) * 31)) * 31;
        FrequencySettings frequencySettings = this.f106853l;
        return this.f106854m.hashCode() + ((iHashCode2 + (frequencySettings != null ? frequencySettings.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106847a.name());
        dest.writeString(this.f106848b.name());
        dest.writeSerializable(this.f106849c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f106850g.name());
        dest.writeSerializable(this.f106851h);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f106852j, i);
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f106853l, i);
        dest.writeParcelable(this.f106854m, i);
    }
}
