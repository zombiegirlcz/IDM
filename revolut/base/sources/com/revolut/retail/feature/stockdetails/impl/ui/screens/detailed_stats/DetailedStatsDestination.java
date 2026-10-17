package com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailedStatsDestination extends InternalDestination<DetailedStatsControllerContract$InputData> {

    @NotNull
    public static final Parcelable.Creator<DetailedStatsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DetailedStatsControllerContract$InputData f103920b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DetailedStatsDestination(DetailedStatsControllerContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DetailedStatsDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedStatsDestination(DetailedStatsControllerContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.f103920b = input;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DetailedStatsControllerContract$InputData getF103920b() {
        return this.f103920b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DetailedStatsDestination) && Intrinsics.f(this.f103920b, ((DetailedStatsDestination) obj2).f103920b);
    }

    public final int hashCode() {
        return this.f103920b.f103917a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f103920b.writeToParcel(dest, i);
    }
}
