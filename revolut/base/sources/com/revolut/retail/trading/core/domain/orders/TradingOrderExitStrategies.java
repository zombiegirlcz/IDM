package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4l.m0;
import k4l.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategies;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradingOrderExitStrategies implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradingOrderExitStrategies> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingOrderExitStrategy f104659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingOrderExitStrategy f104660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104661c;
    public final m0 d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TradingOrderExitStrategy tradingOrderExitStrategy = (TradingOrderExitStrategy) j6.a.f(parcel, "parcel", TradingOrderExitStrategies.class);
            TradingOrderExitStrategy tradingOrderExitStrategy2 = (TradingOrderExitStrategy) parcel.readParcelable(TradingOrderExitStrategies.class.getClassLoader());
            String string = parcel.readString();
            ArrayList arrayList = null;
            m0 m0VarValueOf = parcel.readInt() == 0 ? null : m0.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(n0.valueOf(parcel.readString()));
                }
            }
            return new TradingOrderExitStrategies(tradingOrderExitStrategy, tradingOrderExitStrategy2, string, m0VarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingOrderExitStrategies[i];
        }
    }

    public TradingOrderExitStrategies(TradingOrderExitStrategy tradingOrderExitStrategy, TradingOrderExitStrategy tradingOrderExitStrategy2, String str, m0 m0Var, List list) {
        this.f104659a = tradingOrderExitStrategy;
        this.f104660b = tradingOrderExitStrategy2;
        this.f104661c = str;
        this.d = m0Var;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradingOrderExitStrategies)) {
            return false;
        }
        TradingOrderExitStrategies tradingOrderExitStrategies = (TradingOrderExitStrategies) obj2;
        return Intrinsics.f(this.f104659a, tradingOrderExitStrategies.f104659a) && Intrinsics.f(this.f104660b, tradingOrderExitStrategies.f104660b) && Intrinsics.f(this.f104661c, tradingOrderExitStrategies.f104661c) && this.d == tradingOrderExitStrategies.d && Intrinsics.f(this.e, tradingOrderExitStrategies.e);
    }

    public final int hashCode() {
        TradingOrderExitStrategy tradingOrderExitStrategy = this.f104659a;
        int iHashCode = (tradingOrderExitStrategy == null ? 0 : tradingOrderExitStrategy.hashCode()) * 31;
        TradingOrderExitStrategy tradingOrderExitStrategy2 = this.f104660b;
        int iHashCode2 = (iHashCode + (tradingOrderExitStrategy2 == null ? 0 : tradingOrderExitStrategy2.hashCode())) * 31;
        String str = this.f104661c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        m0 m0Var = this.d;
        int iHashCode4 = (iHashCode3 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104659a, i);
        dest.writeParcelable(this.f104660b, i);
        dest.writeString(this.f104661c);
        m0 m0Var = this.d;
        if (m0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(m0Var.name());
        }
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeString(((n0) itQ.next()).name());
        }
    }

    public /* synthetic */ TradingOrderExitStrategies(TradingOrderExitStrategy tradingOrderExitStrategy, TradingOrderExitStrategy tradingOrderExitStrategy2, m0 m0Var, List list, int i) {
        this(tradingOrderExitStrategy, tradingOrderExitStrategy2, (String) null, (i & 8) != 0 ? null : m0Var, (i & 16) != 0 ? null : list);
    }
}
