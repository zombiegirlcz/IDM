package com.revolut.trading.orders.ui.screens.investment_plan.projection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zul.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/screens/investment_plan/projection/InvestmentProjectionsScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestmentProjectionsScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<InvestmentProjectionsScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f107035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f107036b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestmentProjectionsScreenContract$RetainedState((d) parcel.readSerializable(), s.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestmentProjectionsScreenContract$RetainedState[i];
        }
    }

    public InvestmentProjectionsScreenContract$RetainedState(d dVar, s selectedTab) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f107035a = dVar;
        this.f107036b = selectedTab;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestmentProjectionsScreenContract$RetainedState)) {
            return false;
        }
        InvestmentProjectionsScreenContract$RetainedState investmentProjectionsScreenContract$RetainedState = (InvestmentProjectionsScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f107035a, investmentProjectionsScreenContract$RetainedState.f107035a) && this.f107036b == investmentProjectionsScreenContract$RetainedState.f107036b;
    }

    public final int hashCode() {
        d dVar = this.f107035a;
        return this.f107036b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f107035a);
        dest.writeString(this.f107036b.name());
    }
}
