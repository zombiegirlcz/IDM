package com.revolut.feature.wealth.analytics.ui.widgetised.pnl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.ui.widgetised.models.PnLValues;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.config.Links;
import hel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vyg.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/analytics/ui/widgetised/pnl/WidgetisedAnalyticsPnLScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetisedAnalyticsPnLScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WidgetisedAnalyticsPnLScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f95113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PnLValues f95114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f95115c;
    public final b d;
    public final Links e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetisedAnalyticsPnLScreenContract$InputData((WidgetisedAnalyticsType) parcel.readParcelable(WidgetisedAnalyticsPnLScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : PnLValues.CREATOR.createFromParcel(parcel), c.valueOf(parcel.readString()), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null, (Links) parcel.readParcelable(WidgetisedAnalyticsPnLScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetisedAnalyticsPnLScreenContract$InputData[i];
        }
    }

    public WidgetisedAnalyticsPnLScreenContract$InputData(WidgetisedAnalyticsType analyticsType, PnLValues pnLValues, c selectedTimeframe, b bVar, Links links) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        this.f95113a = analyticsType;
        this.f95114b = pnLValues;
        this.f95115c = selectedTimeframe;
        this.d = bVar;
        this.e = links;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetisedAnalyticsPnLScreenContract$InputData)) {
            return false;
        }
        WidgetisedAnalyticsPnLScreenContract$InputData widgetisedAnalyticsPnLScreenContract$InputData = (WidgetisedAnalyticsPnLScreenContract$InputData) obj2;
        return Intrinsics.f(this.f95113a, widgetisedAnalyticsPnLScreenContract$InputData.f95113a) && Intrinsics.f(this.f95114b, widgetisedAnalyticsPnLScreenContract$InputData.f95114b) && this.f95115c == widgetisedAnalyticsPnLScreenContract$InputData.f95115c && this.d == widgetisedAnalyticsPnLScreenContract$InputData.d && Intrinsics.f(this.e, widgetisedAnalyticsPnLScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f95113a.hashCode() * 31;
        PnLValues pnLValues = this.f95114b;
        int iHashCode2 = (this.f95115c.hashCode() + ((iHashCode + (pnLValues == null ? 0 : pnLValues.hashCode())) * 31)) * 31;
        b bVar = this.d;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Links links = this.e;
        return iHashCode3 + (links != null ? links.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95113a, i);
        PnLValues pnLValues = this.f95114b;
        if (pnLValues == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pnLValues.writeToParcel(dest, i);
        }
        dest.writeString(this.f95115c.name());
        b bVar = this.d;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
        }
        dest.writeParcelable(this.e, i);
    }
}
