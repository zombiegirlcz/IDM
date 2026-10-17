package com.revolut.feature.wealth.analytics.widgetised.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import ixg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/widgetised/navigation/WidgetisedAnalyticsInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetisedAnalyticsInputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<WidgetisedAnalyticsInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f95139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f95140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gwg.a f95141c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetisedAnalyticsInputData(b.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(WidgetisedAnalyticsInputData.class.getClassLoader()), gwg.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetisedAnalyticsInputData[i];
        }
    }

    public WidgetisedAnalyticsInputData(b analyticsType, AnalyticsProduct analyticsProduct, gwg.a displayCurrencyMode, String str) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(displayCurrencyMode, "displayCurrencyMode");
        this.f95139a = analyticsType;
        this.f95140b = analyticsProduct;
        this.f95141c = displayCurrencyMode;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetisedAnalyticsInputData)) {
            return false;
        }
        WidgetisedAnalyticsInputData widgetisedAnalyticsInputData = (WidgetisedAnalyticsInputData) obj2;
        return this.f95139a == widgetisedAnalyticsInputData.f95139a && Intrinsics.f(this.f95140b, widgetisedAnalyticsInputData.f95140b) && this.f95141c == widgetisedAnalyticsInputData.f95141c && Intrinsics.f(this.d, widgetisedAnalyticsInputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f95141c.hashCode() + l.a(this.f95139a.hashCode() * 31, 31, this.f95140b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95139a.name());
        dest.writeParcelable(this.f95140b, i);
        dest.writeString(this.f95141c.name());
        dest.writeString(this.d);
    }
}
