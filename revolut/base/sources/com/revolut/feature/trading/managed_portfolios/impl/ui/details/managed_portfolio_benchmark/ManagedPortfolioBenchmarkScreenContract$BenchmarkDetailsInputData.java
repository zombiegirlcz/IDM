package com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/managed_portfolio_benchmark/ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91326b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData[i];
        }
    }

    public ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f91325a = title;
        this.f91326b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData)) {
            return false;
        }
        ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData managedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData = (ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData) obj2;
        return Intrinsics.f(this.f91325a, managedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData.f91325a) && Intrinsics.f(this.f91326b, managedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData.f91326b);
    }

    public final int hashCode() {
        return this.f91326b.hashCode() + (this.f91325a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91325a);
        dest.writeString(this.f91326b);
    }
}
