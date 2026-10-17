package com.revolut.feature.retail.trading.advanced.charts.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import c1b.b;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/trading/advanced/charts/api/models/StockAdvancedChartSymbol;", "Lcom/revolut/feature/retail/advanced_charts/models/AdvancedChartSymbol;", "", "toString", "()Ljava/lang/String;", "feature_retail_trading_advanced_charts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockAdvancedChartSymbol implements AdvancedChartSymbol {

    @NotNull
    public static final Parcelable.Creator<StockAdvancedChartSymbol> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f83400a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockAdvancedChartSymbol((n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockAdvancedChartSymbol[i];
        }
    }

    public StockAdvancedChartSymbol(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f83400a = instrument;
    }

    @Override // com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol
    public final int S9() {
        n nVar = this.f83400a;
        switch (jrb.a.f177984a[nVar.f214597c.ordinal()]) {
            case 15:
                Integer num = nVar.f214603n;
                if (num != null) {
                    return num.intValue();
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return 2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof StockAdvancedChartSymbol) && Intrinsics.f(this.f83400a, ((StockAdvancedChartSymbol) obj2).f83400a);
    }

    @Override // com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol
    public final String getId() {
        return this.f83400a.f214596b;
    }

    public final int hashCode() {
        return this.f83400a.hashCode();
    }

    @Override // com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol
    public final b m5() {
        return b.STOCK;
    }

    @Override // com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol
    public final String s6() {
        return this.f83400a.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f83400a);
    }
}
