package com.revolut.feature.wealth.analytics.ui.navigation.complex_analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector.ComplexAnalyticsSectorAllocationControllerContract$InputData;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.common.InternalDestination;
import jel.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/navigation/complex_analytics/ComplexAnalyticsSectorAllocationDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/wealth/analytics/ui/complex_analytics/v2/screen/totalvalue/sector/ComplexAnalyticsSectorAllocationControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComplexAnalyticsSectorAllocationDestination extends InternalDestination<ComplexAnalyticsSectorAllocationControllerContract$InputData> {

    @NotNull
    public static final Parcelable.Creator<ComplexAnalyticsSectorAllocationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f95040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WidgetisedAnalyticsType f95041c;
    public final gwg.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComplexAnalyticsSectorAllocationDestination(a3.valueOf(parcel.readString()), (WidgetisedAnalyticsType) parcel.readParcelable(ComplexAnalyticsSectorAllocationDestination.class.getClassLoader()), gwg.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ComplexAnalyticsSectorAllocationDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplexAnalyticsSectorAllocationDestination(a3 sector, WidgetisedAnalyticsType analyticsType, gwg.a displayCurrencyMode) {
        super(new ComplexAnalyticsSectorAllocationControllerContract$InputData(sector, analyticsType, displayCurrencyMode));
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(displayCurrencyMode, "displayCurrencyMode");
        this.f95040b = sector;
        this.f95041c = analyticsType;
        this.d = displayCurrencyMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ComplexAnalyticsSectorAllocationDestination)) {
            return false;
        }
        ComplexAnalyticsSectorAllocationDestination complexAnalyticsSectorAllocationDestination = (ComplexAnalyticsSectorAllocationDestination) obj2;
        return this.f95040b == complexAnalyticsSectorAllocationDestination.f95040b && Intrinsics.f(this.f95041c, complexAnalyticsSectorAllocationDestination.f95041c) && this.d == complexAnalyticsSectorAllocationDestination.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f95041c.hashCode() + (this.f95040b.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95040b.name());
        dest.writeParcelable(this.f95041c, i);
        dest.writeString(this.d.name());
    }
}
