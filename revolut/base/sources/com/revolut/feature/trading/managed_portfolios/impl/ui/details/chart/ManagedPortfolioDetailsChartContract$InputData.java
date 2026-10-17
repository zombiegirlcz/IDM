package com.revolut.feature.trading.managed_portfolios.impl.ui.details.chart;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/chart/ManagedPortfolioDetailsChartContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManagedPortfolioDetailsChartContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ManagedPortfolioDetailsChartContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91309c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManagedPortfolioDetailsChartContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManagedPortfolioDetailsChartContract$InputData[i];
        }
    }

    public ManagedPortfolioDetailsChartContract$InputData(String templateId, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f91307a = templateId;
        this.f91308b = z;
        this.f91309c = z3;
        this.d = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManagedPortfolioDetailsChartContract$InputData)) {
            return false;
        }
        ManagedPortfolioDetailsChartContract$InputData managedPortfolioDetailsChartContract$InputData = (ManagedPortfolioDetailsChartContract$InputData) obj2;
        return Intrinsics.f(this.f91307a, managedPortfolioDetailsChartContract$InputData.f91307a) && this.f91308b == managedPortfolioDetailsChartContract$InputData.f91308b && this.f91309c == managedPortfolioDetailsChartContract$InputData.f91309c && this.d == managedPortfolioDetailsChartContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f91307a.hashCode() * 31, 31, this.f91308b), 31, this.f91309c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91307a);
        dest.writeInt(this.f91308b ? 1 : 0);
        dest.writeInt(this.f91309c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}
