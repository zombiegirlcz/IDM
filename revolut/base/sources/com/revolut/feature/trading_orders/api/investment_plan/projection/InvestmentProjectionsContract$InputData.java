package com.revolut.feature.trading_orders.api.investment_plan.projection;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$Context;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/investment_plan/projection/InvestmentProjectionsContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestmentProjectionsContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestmentProjectionsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f91736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f91737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f91738c;
    public final InvestmentProjectionsContract$Context d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestmentProjectionsContract$InputData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (n) parcel.readSerializable(), (UUID) parcel.readSerializable(), (InvestmentProjectionsContract$Context) parcel.readParcelable(InvestmentProjectionsContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestmentProjectionsContract$InputData[i];
        }
    }

    public InvestmentProjectionsContract$InputData(Long l2, n instrument, UUID tradingAccountId, InvestmentProjectionsContract$Context context) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91736a = l2;
        this.f91737b = instrument;
        this.f91738c = tradingAccountId;
        this.d = context;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestmentProjectionsContract$InputData)) {
            return false;
        }
        InvestmentProjectionsContract$InputData investmentProjectionsContract$InputData = (InvestmentProjectionsContract$InputData) obj2;
        return Intrinsics.f(this.f91736a, investmentProjectionsContract$InputData.f91736a) && Intrinsics.f(this.f91737b, investmentProjectionsContract$InputData.f91737b) && Intrinsics.f(this.f91738c, investmentProjectionsContract$InputData.f91738c) && Intrinsics.f(this.d, investmentProjectionsContract$InputData.d);
    }

    public final int hashCode() {
        Long l2 = this.f91736a;
        return this.d.hashCode() + t61.a.f(this.f91738c, b.d(this.f91737b, (l2 == null ? 0 : l2.hashCode()) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l2 = this.f91736a;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeSerializable(this.f91737b);
        dest.writeSerializable(this.f91738c);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ InvestmentProjectionsContract$InputData(Long l2, n nVar, UUID uuid, InvestmentProjectionsContract$Context.InvestmentPlansCollection investmentPlansCollection, int i) {
        this((i & 1) != 0 ? null : l2, nVar, uuid, (i & 8) != 0 ? InvestmentProjectionsContract$Context.Default.f91733a : investmentPlansCollection);
    }
}
