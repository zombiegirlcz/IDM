package com.revolut.shared.feature.wealth.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/statements/api/navigation/CostChargesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "kfl/a", "feature_shared_wealth_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CostChargesDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CostChargesDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfl.a f105353b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CostChargesDestination(parcel.readString(), kfl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CostChargesDestination[i];
        }
    }

    public CostChargesDestination(String portfolioId, kfl.a assetType) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f105352a = portfolioId;
        this.f105353b = assetType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CostChargesDestination)) {
            return false;
        }
        CostChargesDestination costChargesDestination = (CostChargesDestination) obj2;
        return Intrinsics.f(this.f105352a, costChargesDestination.f105352a) && this.f105353b == costChargesDestination.f105353b;
    }

    public final int hashCode() {
        return this.f105353b.hashCode() + (this.f105352a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105352a);
        dest.writeString(this.f105353b.name());
    }
}
