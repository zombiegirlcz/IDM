package com.revolut.trading.orders.ui.invest.placement.screens.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOrderDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOrderReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvestOrderReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f106941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f106942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvestOrderDraft f106943c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            nel.n nVar = (nel.n) parcel.readSerializable();
            UUID uuid = (UUID) parcel.readSerializable();
            InvestOrderDraft investOrderDraftCreateFromParcel = InvestOrderDraft.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(sel.a.valueOf(parcel.readString()));
            }
            return new InvestOrderReviewScreenContract$InputData(nVar, uuid, investOrderDraftCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOrderReviewScreenContract$InputData[i];
        }
    }

    public InvestOrderReviewScreenContract$InputData(nel.n instrument, UUID tradingAccountId, InvestOrderDraft orderDraft, List availablePeriods) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        this.f106941a = instrument;
        this.f106942b = tradingAccountId;
        this.f106943c = orderDraft;
        this.d = availablePeriods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestOrderReviewScreenContract$InputData)) {
            return false;
        }
        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = (InvestOrderReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f106941a, investOrderReviewScreenContract$InputData.f106941a) && Intrinsics.f(this.f106942b, investOrderReviewScreenContract$InputData.f106942b) && Intrinsics.f(this.f106943c, investOrderReviewScreenContract$InputData.f106943c) && Intrinsics.f(this.d, investOrderReviewScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f106943c.hashCode() + t61.a.f(this.f106942b, this.f106941a.hashCode() * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f106941a);
        dest.writeSerializable(this.f106942b);
        this.f106943c.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((sel.a) itV.next()).name());
        }
    }
}
