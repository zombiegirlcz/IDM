package com.revolut.feature.spending_analytics.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetContext f87440b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination((WidgetContext) parcel.readParcelable(AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination[i];
        }
    }

    public AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination(WidgetContext widgetContext, String widgetListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        this.f87439a = widgetListId;
        this.f87440b = widgetContext;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final WidgetContext getF87440b() {
        return this.f87440b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF87439a() {
        return this.f87439a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination)) {
            return false;
        }
        AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination analyticsFeatureConfig$TravelModeRemoveWidget$Destination = (AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination) obj2;
        return Intrinsics.f(this.f87439a, analyticsFeatureConfig$TravelModeRemoveWidget$Destination.f87439a) && Intrinsics.f(this.f87440b, analyticsFeatureConfig$TravelModeRemoveWidget$Destination.f87440b);
    }

    public final int hashCode() {
        return this.f87440b.hashCode() + (this.f87439a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87439a);
        dest.writeParcelable(this.f87440b, i);
    }
}
