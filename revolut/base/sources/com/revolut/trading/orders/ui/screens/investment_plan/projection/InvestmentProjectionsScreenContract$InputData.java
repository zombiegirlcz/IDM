package com.revolut.trading.orders.ui.screens.investment_plan.projection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$Context;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/screens/investment_plan/projection/InvestmentProjectionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestmentProjectionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvestmentProjectionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f107032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvestmentProjectionsContract$Context f107033c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestmentProjectionsScreenContract$InputData(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (InvestmentProjectionsContract$Context) parcel.readParcelable(InvestmentProjectionsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestmentProjectionsScreenContract$InputData[i];
        }
    }

    public InvestmentProjectionsScreenContract$InputData(String securityRef, Long l2, InvestmentProjectionsContract$Context context) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107031a = securityRef;
        this.f107032b = l2;
        this.f107033c = context;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestmentProjectionsScreenContract$InputData)) {
            return false;
        }
        InvestmentProjectionsScreenContract$InputData investmentProjectionsScreenContract$InputData = (InvestmentProjectionsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f107031a, investmentProjectionsScreenContract$InputData.f107031a) && Intrinsics.f(this.f107032b, investmentProjectionsScreenContract$InputData.f107032b) && Intrinsics.f(this.f107033c, investmentProjectionsScreenContract$InputData.f107033c);
    }

    public final int hashCode() {
        int iHashCode = this.f107031a.hashCode() * 31;
        Long l2 = this.f107032b;
        return this.f107033c.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f107031a);
        Long l2 = this.f107032b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeParcelable(this.f107033c, i);
    }
}
