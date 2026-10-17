package com.revolut.feature.retail.advanced_charts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import c1b.c;
import c1b.h;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/advanced_charts/api/navigation/ChartIntervalSelectorBottomSheetControllerProvider$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_advanced_charts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChartIntervalSelectorBottomSheetControllerProvider$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChartIntervalSelectorBottomSheetControllerProvider$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f82066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f82067b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChartIntervalSelectorBottomSheetControllerProvider$InputData(h.valueOf(parcel.readString()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChartIntervalSelectorBottomSheetControllerProvider$InputData[i];
        }
    }

    public ChartIntervalSelectorBottomSheetControllerProvider$InputData(h selectedInterval, c advancedChartsProductIdentifier) {
        Intrinsics.checkNotNullParameter(selectedInterval, "selectedInterval");
        Intrinsics.checkNotNullParameter(advancedChartsProductIdentifier, "advancedChartsProductIdentifier");
        this.f82066a = selectedInterval;
        this.f82067b = advancedChartsProductIdentifier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChartIntervalSelectorBottomSheetControllerProvider$InputData)) {
            return false;
        }
        ChartIntervalSelectorBottomSheetControllerProvider$InputData chartIntervalSelectorBottomSheetControllerProvider$InputData = (ChartIntervalSelectorBottomSheetControllerProvider$InputData) obj2;
        return this.f82066a == chartIntervalSelectorBottomSheetControllerProvider$InputData.f82066a && this.f82067b == chartIntervalSelectorBottomSheetControllerProvider$InputData.f82067b;
    }

    public final int hashCode() {
        return this.f82067b.hashCode() + (this.f82066a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82066a.name());
        dest.writeString(this.f82067b.name());
    }
}
