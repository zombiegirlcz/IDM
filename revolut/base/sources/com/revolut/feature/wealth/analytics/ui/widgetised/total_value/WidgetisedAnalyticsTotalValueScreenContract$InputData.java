package com.revolut.feature.wealth.analytics.ui.widgetised.total_value;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.config.Links;
import hel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vyg.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/analytics/ui/widgetised/total_value/WidgetisedAnalyticsTotalValueScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetisedAnalyticsTotalValueScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WidgetisedAnalyticsTotalValueScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f95126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f95127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f95128c;
    public final Links d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetisedAnalyticsTotalValueScreenContract$InputData((WidgetisedAnalyticsType) parcel.readParcelable(WidgetisedAnalyticsTotalValueScreenContract$InputData.class.getClassLoader()), (Links) parcel.readParcelable(WidgetisedAnalyticsTotalValueScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetisedAnalyticsTotalValueScreenContract$InputData[i];
        }
    }

    public WidgetisedAnalyticsTotalValueScreenContract$InputData(WidgetisedAnalyticsType analyticsType, Links links, b bVar, c selectedTimeframe) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        this.f95126a = analyticsType;
        this.f95127b = selectedTimeframe;
        this.f95128c = bVar;
        this.d = links;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetisedAnalyticsTotalValueScreenContract$InputData)) {
            return false;
        }
        WidgetisedAnalyticsTotalValueScreenContract$InputData widgetisedAnalyticsTotalValueScreenContract$InputData = (WidgetisedAnalyticsTotalValueScreenContract$InputData) obj2;
        return Intrinsics.f(this.f95126a, widgetisedAnalyticsTotalValueScreenContract$InputData.f95126a) && this.f95127b == widgetisedAnalyticsTotalValueScreenContract$InputData.f95127b && this.f95128c == widgetisedAnalyticsTotalValueScreenContract$InputData.f95128c && Intrinsics.f(this.d, widgetisedAnalyticsTotalValueScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f95127b.hashCode() + (this.f95126a.hashCode() * 31)) * 31;
        b bVar = this.f95128c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Links links = this.d;
        return iHashCode2 + (links != null ? links.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95126a, i);
        dest.writeString(this.f95127b.name());
        b bVar = this.f95128c;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
        }
        dest.writeParcelable(this.d, i);
    }
}
