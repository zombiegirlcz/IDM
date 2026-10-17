package com.revolut.feature.wealth.analytics.ui.widgetised.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.config.Links;
import ixg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetisedAnalyticsDashboardContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WidgetisedAnalyticsDashboardContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f95055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f95057c;
    public final Links d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetisedAnalyticsDashboardContract$InputData(b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : hel.b.valueOf(parcel.readString()), (Links) parcel.readParcelable(WidgetisedAnalyticsDashboardContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetisedAnalyticsDashboardContract$InputData[i];
        }
    }

    public WidgetisedAnalyticsDashboardContract$InputData(b analyticsType, String str, hel.b bVar, Links links) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        this.f95055a = analyticsType;
        this.f95056b = str;
        this.f95057c = bVar;
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
        if (!(obj2 instanceof WidgetisedAnalyticsDashboardContract$InputData)) {
            return false;
        }
        WidgetisedAnalyticsDashboardContract$InputData widgetisedAnalyticsDashboardContract$InputData = (WidgetisedAnalyticsDashboardContract$InputData) obj2;
        return this.f95055a == widgetisedAnalyticsDashboardContract$InputData.f95055a && Intrinsics.f(this.f95056b, widgetisedAnalyticsDashboardContract$InputData.f95056b) && this.f95057c == widgetisedAnalyticsDashboardContract$InputData.f95057c && Intrinsics.f(this.d, widgetisedAnalyticsDashboardContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f95055a.hashCode() * 31;
        String str = this.f95056b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        hel.b bVar = this.f95057c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Links links = this.d;
        return iHashCode3 + (links != null ? links.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95055a.name());
        dest.writeString(this.f95056b);
        hel.b bVar = this.f95057c;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
        }
        dest.writeParcelable(this.d, i);
    }
}
