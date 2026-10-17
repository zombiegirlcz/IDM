package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.retail.trading.core.domain.orders.OrderExpiry;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOrderEditScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<InvestOrderEditScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f106907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aul.b f106909c;
    public final InvestInputValue d;
    public final xi0.b e;
    public final InvestOutputValue f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Amount f106910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SourcePocket f106911h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OrderExpiry f106912j;
    public final FrequencySettings k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AutoTopUpStatus f106913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f106914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f106915n;
    public final Boolean o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Class cls;
            Amount amount;
            SourcePocket sourcePocket;
            boolean z;
            boolean z3;
            AutoTopUpStatus autoTopUpStatus;
            OrderExpiry orderExpiry;
            boolean z4;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            r0 r0VarValueOf = r0.valueOf(parcel.readString());
            String string = parcel.readString();
            aul.b bVarValueOf = parcel.readInt() == 0 ? null : aul.b.valueOf(parcel.readString());
            InvestInputValue investInputValueCreateFromParcel = InvestInputValue.CREATOR.createFromParcel(parcel);
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            InvestOutputValue investOutputValueCreateFromParcel = InvestOutputValue.CREATOR.createFromParcel(parcel);
            Amount amount2 = (Amount) parcel.readParcelable(InvestOrderEditScreenContract$RetainedState.class.getClassLoader());
            SourcePocket sourcePocket2 = (SourcePocket) parcel.readParcelable(InvestOrderEditScreenContract$RetainedState.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = InvestOrderEditScreenContract$RetainedState.class;
                amount = amount2;
                sourcePocket = sourcePocket2;
                z = true;
            } else {
                cls = InvestOrderEditScreenContract$RetainedState.class;
                amount = amount2;
                sourcePocket = sourcePocket2;
                z = false;
            }
            OrderExpiry orderExpiry2 = (OrderExpiry) parcel.readParcelable(cls.getClassLoader());
            FrequencySettings frequencySettings = (FrequencySettings) parcel.readParcelable(cls.getClassLoader());
            AutoTopUpStatus autoTopUpStatus2 = (AutoTopUpStatus) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = true;
                autoTopUpStatus = autoTopUpStatus2;
                orderExpiry = orderExpiry2;
                z4 = true;
            } else {
                z3 = true;
                autoTopUpStatus = autoTopUpStatus2;
                orderExpiry = orderExpiry2;
                z4 = false;
            }
            boolean z6 = parcel.readInt() != 0 ? z3 : false;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z3 : false);
            }
            return new InvestOrderEditScreenContract$RetainedState(r0VarValueOf, string, bVarValueOf, investInputValueCreateFromParcel, bVar, investOutputValueCreateFromParcel, amount, sourcePocket, z, orderExpiry, frequencySettings, autoTopUpStatus, z4, z6, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOrderEditScreenContract$RetainedState[i];
        }
    }

    public InvestOrderEditScreenContract$RetainedState(r0 orderType, String idempotencyKey, aul.b bVar, InvestInputValue inputValue, xi0.b bVar2, InvestOutputValue outputValue, Amount amount, SourcePocket sourcePocket, boolean z, OrderExpiry orderExpiry, FrequencySettings frequencySettings, AutoTopUpStatus autoTopUpStatus, boolean z3, boolean z4, Boolean bool) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(outputValue, "outputValue");
        this.f106907a = orderType;
        this.f106908b = idempotencyKey;
        this.f106909c = bVar;
        this.d = inputValue;
        this.e = bVar2;
        this.f = outputValue;
        this.f106910g = amount;
        this.f106911h = sourcePocket;
        this.i = z;
        this.f106912j = orderExpiry;
        this.k = frequencySettings;
        this.f106913l = autoTopUpStatus;
        this.f106914m = z3;
        this.f106915n = z4;
        this.o = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestOrderEditScreenContract$RetainedState)) {
            return false;
        }
        InvestOrderEditScreenContract$RetainedState investOrderEditScreenContract$RetainedState = (InvestOrderEditScreenContract$RetainedState) obj2;
        return this.f106907a == investOrderEditScreenContract$RetainedState.f106907a && Intrinsics.f(this.f106908b, investOrderEditScreenContract$RetainedState.f106908b) && this.f106909c == investOrderEditScreenContract$RetainedState.f106909c && Intrinsics.f(this.d, investOrderEditScreenContract$RetainedState.d) && Intrinsics.f(this.e, investOrderEditScreenContract$RetainedState.e) && Intrinsics.f(this.f, investOrderEditScreenContract$RetainedState.f) && Intrinsics.f(this.f106910g, investOrderEditScreenContract$RetainedState.f106910g) && Intrinsics.f(this.f106911h, investOrderEditScreenContract$RetainedState.f106911h) && this.i == investOrderEditScreenContract$RetainedState.i && Intrinsics.f(this.f106912j, investOrderEditScreenContract$RetainedState.f106912j) && Intrinsics.f(this.k, investOrderEditScreenContract$RetainedState.k) && Intrinsics.f(this.f106913l, investOrderEditScreenContract$RetainedState.f106913l) && this.f106914m == investOrderEditScreenContract$RetainedState.f106914m && this.f106915n == investOrderEditScreenContract$RetainedState.f106915n && Intrinsics.f(this.o, investOrderEditScreenContract$RetainedState.o);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f106907a.hashCode() * 31, 31, this.f106908b);
        aul.b bVar = this.f106909c;
        int iHashCode = (this.d.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        xi0.b bVar2 = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31)) * 31;
        Amount amount = this.f106910g;
        int iHashCode3 = (iHashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        SourcePocket sourcePocket = this.f106911h;
        int iC2 = j6.a.c((iHashCode3 + (sourcePocket == null ? 0 : sourcePocket.hashCode())) * 31, 31, this.i);
        OrderExpiry orderExpiry = this.f106912j;
        int iHashCode4 = (iC2 + (orderExpiry == null ? 0 : orderExpiry.hashCode())) * 31;
        FrequencySettings frequencySettings = this.k;
        int iHashCode5 = (iHashCode4 + (frequencySettings == null ? 0 : frequencySettings.hashCode())) * 31;
        AutoTopUpStatus autoTopUpStatus = this.f106913l;
        int iC3 = j6.a.c(j6.a.c((iHashCode5 + (autoTopUpStatus == null ? 0 : autoTopUpStatus.hashCode())) * 31, 31, this.f106914m), 31, this.f106915n);
        Boolean bool = this.o;
        return iC3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106907a.name());
        dest.writeString(this.f106908b);
        aul.b bVar = this.f106909c;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        this.d.writeToParcel(dest, i);
        dest.writeSerializable(this.e);
        this.f.writeToParcel(dest, i);
        dest.writeParcelable(this.f106910g, i);
        dest.writeParcelable(this.f106911h, i);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f106912j, i);
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f106913l, i);
        dest.writeInt(this.f106914m ? 1 : 0);
        dest.writeInt(this.f106915n ? 1 : 0);
        Boolean bool = this.o;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
