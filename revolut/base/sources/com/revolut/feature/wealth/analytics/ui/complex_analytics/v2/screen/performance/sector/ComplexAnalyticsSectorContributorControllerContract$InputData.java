package com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.performance.sector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.common.IOData$Input;
import eel.c;
import jel.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/analytics/ui/complex_analytics/v2/screen/performance/sector/ComplexAnalyticsSectorContributorControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComplexAnalyticsSectorContributorControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ComplexAnalyticsSectorContributorControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f95034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f95035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iwg.c f95036c;
    public final WidgetisedAnalyticsType d;
    public final gwg.a e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComplexAnalyticsSectorContributorControllerContract$InputData(a3.valueOf(parcel.readString()), c.valueOf(parcel.readString()), iwg.c.valueOf(parcel.readString()), (WidgetisedAnalyticsType) parcel.readParcelable(ComplexAnalyticsSectorContributorControllerContract$InputData.class.getClassLoader()), gwg.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ComplexAnalyticsSectorContributorControllerContract$InputData[i];
        }
    }

    public ComplexAnalyticsSectorContributorControllerContract$InputData(a3 sector, c timeSpan, iwg.c method, WidgetisedAnalyticsType analyticsType, gwg.a displayCurrencyMode) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(displayCurrencyMode, "displayCurrencyMode");
        this.f95034a = sector;
        this.f95035b = timeSpan;
        this.f95036c = method;
        this.d = analyticsType;
        this.e = displayCurrencyMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ComplexAnalyticsSectorContributorControllerContract$InputData)) {
            return false;
        }
        ComplexAnalyticsSectorContributorControllerContract$InputData complexAnalyticsSectorContributorControllerContract$InputData = (ComplexAnalyticsSectorContributorControllerContract$InputData) obj2;
        return this.f95034a == complexAnalyticsSectorContributorControllerContract$InputData.f95034a && this.f95035b == complexAnalyticsSectorContributorControllerContract$InputData.f95035b && this.f95036c == complexAnalyticsSectorContributorControllerContract$InputData.f95036c && Intrinsics.f(this.d, complexAnalyticsSectorContributorControllerContract$InputData.d) && this.e == complexAnalyticsSectorContributorControllerContract$InputData.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + o.d(this.f95036c, o.c(this.f95035b, this.f95034a.hashCode() * 31, 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95034a.name());
        dest.writeString(this.f95035b.name());
        dest.writeString(this.f95036c.name());
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
    }
}
