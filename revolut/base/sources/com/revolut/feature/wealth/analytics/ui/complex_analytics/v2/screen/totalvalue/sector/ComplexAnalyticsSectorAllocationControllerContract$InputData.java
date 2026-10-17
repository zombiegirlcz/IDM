package com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.common.IOData$Input;
import jel.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/analytics/ui/complex_analytics/v2/screen/totalvalue/sector/ComplexAnalyticsSectorAllocationControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComplexAnalyticsSectorAllocationControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ComplexAnalyticsSectorAllocationControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f95037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsType f95038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gwg.a f95039c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComplexAnalyticsSectorAllocationControllerContract$InputData(a3.valueOf(parcel.readString()), (WidgetisedAnalyticsType) parcel.readParcelable(ComplexAnalyticsSectorAllocationControllerContract$InputData.class.getClassLoader()), gwg.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ComplexAnalyticsSectorAllocationControllerContract$InputData[i];
        }
    }

    public ComplexAnalyticsSectorAllocationControllerContract$InputData(a3 sector, WidgetisedAnalyticsType analyticsType, gwg.a displayCurrencyMode) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(displayCurrencyMode, "displayCurrencyMode");
        this.f95037a = sector;
        this.f95038b = analyticsType;
        this.f95039c = displayCurrencyMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ComplexAnalyticsSectorAllocationControllerContract$InputData)) {
            return false;
        }
        ComplexAnalyticsSectorAllocationControllerContract$InputData complexAnalyticsSectorAllocationControllerContract$InputData = (ComplexAnalyticsSectorAllocationControllerContract$InputData) obj2;
        return this.f95037a == complexAnalyticsSectorAllocationControllerContract$InputData.f95037a && Intrinsics.f(this.f95038b, complexAnalyticsSectorAllocationControllerContract$InputData.f95038b) && this.f95039c == complexAnalyticsSectorAllocationControllerContract$InputData.f95039c;
    }

    public final int hashCode() {
        return this.f95039c.hashCode() + ((this.f95038b.hashCode() + (this.f95037a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95037a.name());
        dest.writeParcelable(this.f95038b, i);
        dest.writeString(this.f95039c.name());
    }
}
