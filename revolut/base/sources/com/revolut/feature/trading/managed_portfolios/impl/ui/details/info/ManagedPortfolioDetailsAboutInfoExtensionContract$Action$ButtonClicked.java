package com.revolut.feature.trading.managed_portfolios.impl.ui.details.info;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/info/ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked", "", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91318a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked[i];
        }
    }

    public ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked(String investorUpdateId) {
        Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
        this.f91318a = investorUpdateId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked) && Intrinsics.f(this.f91318a, ((ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked) obj2).f91318a);
    }

    public final int hashCode() {
        return this.f91318a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91318a);
    }
}
