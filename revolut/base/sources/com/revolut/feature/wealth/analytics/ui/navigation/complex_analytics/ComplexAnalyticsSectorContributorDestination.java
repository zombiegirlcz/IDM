package com.revolut.feature.wealth.analytics.ui.navigation.complex_analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.performance.sector.ComplexAnalyticsSectorContributorControllerContract$InputData;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.common.InternalDestination;
import eel.c;
import jel.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/navigation/complex_analytics/ComplexAnalyticsSectorContributorDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/wealth/analytics/ui/complex_analytics/v2/screen/performance/sector/ComplexAnalyticsSectorContributorControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComplexAnalyticsSectorContributorDestination extends InternalDestination<ComplexAnalyticsSectorContributorControllerContract$InputData> {

    @NotNull
    public static final Parcelable.Creator<ComplexAnalyticsSectorContributorDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f95042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f95043c;
    public final iwg.c d;
    public final WidgetisedAnalyticsType e;
    public final gwg.a f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComplexAnalyticsSectorContributorDestination(a3.valueOf(parcel.readString()), c.valueOf(parcel.readString()), iwg.c.valueOf(parcel.readString()), (WidgetisedAnalyticsType) parcel.readParcelable(ComplexAnalyticsSectorContributorDestination.class.getClassLoader()), gwg.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ComplexAnalyticsSectorContributorDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplexAnalyticsSectorContributorDestination(a3 sector, c timeSpan, iwg.c method, WidgetisedAnalyticsType analyticsType, gwg.a displayCurrencyMode) {
        super(new ComplexAnalyticsSectorContributorControllerContract$InputData(sector, timeSpan, method, analyticsType, displayCurrencyMode));
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(displayCurrencyMode, "displayCurrencyMode");
        this.f95042b = sector;
        this.f95043c = timeSpan;
        this.d = method;
        this.e = analyticsType;
        this.f = displayCurrencyMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ComplexAnalyticsSectorContributorDestination)) {
            return false;
        }
        ComplexAnalyticsSectorContributorDestination complexAnalyticsSectorContributorDestination = (ComplexAnalyticsSectorContributorDestination) obj2;
        return this.f95042b == complexAnalyticsSectorContributorDestination.f95042b && this.f95043c == complexAnalyticsSectorContributorDestination.f95043c && this.d == complexAnalyticsSectorContributorDestination.d && Intrinsics.f(this.e, complexAnalyticsSectorContributorDestination.e) && this.f == complexAnalyticsSectorContributorDestination.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + o.d(this.d, o.c(this.f95043c, this.f95042b.hashCode() * 31, 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95042b.name());
        dest.writeString(this.f95043c.name());
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
    }
}
