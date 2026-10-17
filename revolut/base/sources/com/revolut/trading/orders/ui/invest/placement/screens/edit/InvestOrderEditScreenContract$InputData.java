package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.math.BigDecimal;
import java.util.UUID;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOrderEditScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvestOrderEditScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f106880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f106881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f106882c;
    public final r0 d;
    public final BigDecimal e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sel.a f106883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Amount f106884h;
    public final aul.b i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestOrderEditScreenContract$InputData((n) parcel.readSerializable(), (UUID) parcel.readSerializable(), g.valueOf(parcel.readString()), r0.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, sel.a.valueOf(parcel.readString()), (Amount) parcel.readParcelable(InvestOrderEditScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : aul.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOrderEditScreenContract$InputData[i];
        }
    }

    public InvestOrderEditScreenContract$InputData(n instrument, UUID tradingAccountId, g tradeSide, r0 orderType, BigDecimal initialInputValue, boolean z, sel.a defaultPeriod, Amount amount, aul.b bVar) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(initialInputValue, "initialInputValue");
        Intrinsics.checkNotNullParameter(defaultPeriod, "defaultPeriod");
        this.f106880a = instrument;
        this.f106881b = tradingAccountId;
        this.f106882c = tradeSide;
        this.d = orderType;
        this.e = initialInputValue;
        this.f = z;
        this.f106883g = defaultPeriod;
        this.f106884h = amount;
        this.i = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestOrderEditScreenContract$InputData)) {
            return false;
        }
        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = (InvestOrderEditScreenContract$InputData) obj2;
        return Intrinsics.f(this.f106880a, investOrderEditScreenContract$InputData.f106880a) && Intrinsics.f(this.f106881b, investOrderEditScreenContract$InputData.f106881b) && this.f106882c == investOrderEditScreenContract$InputData.f106882c && this.d == investOrderEditScreenContract$InputData.d && Intrinsics.f(this.e, investOrderEditScreenContract$InputData.e) && this.f == investOrderEditScreenContract$InputData.f && this.f106883g == investOrderEditScreenContract$InputData.f106883g && Intrinsics.f(this.f106884h, investOrderEditScreenContract$InputData.f106884h) && this.i == investOrderEditScreenContract$InputData.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f106883g.hashCode() + j6.a.c(t61.a.d(this.e, com.revolut.data.database.models.openbanking.d.f(this.d, y.b(this.f106882c, t61.a.f(this.f106881b, this.f106880a.hashCode() * 31, 31), 31), 31), 31), 31, this.f)) * 31;
        Amount amount = this.f106884h;
        int iHashCode2 = (iHashCode + (amount == null ? 0 : amount.hashCode())) * 31;
        aul.b bVar = this.i;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f106880a);
        dest.writeSerializable(this.f106881b);
        dest.writeString(this.f106882c.name());
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f106883g.name());
        dest.writeParcelable(this.f106884h, i);
        aul.b bVar = this.i;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
