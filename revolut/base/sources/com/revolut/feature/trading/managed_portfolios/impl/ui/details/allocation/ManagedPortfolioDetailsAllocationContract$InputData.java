package com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/ManagedPortfolioDetailsAllocationContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManagedPortfolioDetailsAllocationContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ManagedPortfolioDetailsAllocationContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6f.a f91285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91286c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManagedPortfolioDetailsAllocationContract$InputData(parcel.readString(), a6f.a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManagedPortfolioDetailsAllocationContract$InputData[i];
        }
    }

    public ManagedPortfolioDetailsAllocationContract$InputData(String templateId, a6f.a allocationSourceStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(allocationSourceStrategy, "allocationSourceStrategy");
        this.f91284a = templateId;
        this.f91285b = allocationSourceStrategy;
        this.f91286c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManagedPortfolioDetailsAllocationContract$InputData)) {
            return false;
        }
        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = (ManagedPortfolioDetailsAllocationContract$InputData) obj2;
        return Intrinsics.f(this.f91284a, managedPortfolioDetailsAllocationContract$InputData.f91284a) && this.f91285b == managedPortfolioDetailsAllocationContract$InputData.f91285b && this.f91286c == managedPortfolioDetailsAllocationContract$InputData.f91286c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91286c) + ((this.f91285b.hashCode() + (this.f91284a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91284a);
        dest.writeString(this.f91285b.name());
        dest.writeInt(this.f91286c ? 1 : 0);
    }
}
