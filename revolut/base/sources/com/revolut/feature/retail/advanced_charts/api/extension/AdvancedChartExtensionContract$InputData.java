package com.revolut.feature.retail.advanced_charts.api.extension;

import android.os.Parcel;
import android.os.Parcelable;
import c1b.c;
import c1b.d;
import c1b.h;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.ChartTimeFrameDisplayType;
import com.revolut.feature.retail.advanced_charts.models.LockPolicy;
import com.revolut.feature.retail.advanced_charts.models.OverlayPolicy;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/advanced_charts/api/extension/AdvancedChartExtensionContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_advanced_charts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdvancedChartExtensionContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AdvancedChartExtensionContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f82058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f82059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdvancedChartSymbol f82060c;
    public final d d;
    public final ChartTimeFrameDisplayType e;
    public final OverlayPolicy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LockPolicy f82061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f82062h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvancedChartExtensionContract$InputData(h.valueOf(parcel.readString()), c.valueOf(parcel.readString()), (AdvancedChartSymbol) parcel.readParcelable(AdvancedChartExtensionContract$InputData.class.getClassLoader()), d.valueOf(parcel.readString()), (ChartTimeFrameDisplayType) parcel.readParcelable(AdvancedChartExtensionContract$InputData.class.getClassLoader()), (OverlayPolicy) parcel.readParcelable(AdvancedChartExtensionContract$InputData.class.getClassLoader()), (LockPolicy) parcel.readParcelable(AdvancedChartExtensionContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdvancedChartExtensionContract$InputData[i];
        }
    }

    public AdvancedChartExtensionContract$InputData(h chartInterval, c advancedChartsProductIdentifier, AdvancedChartSymbol chartSymbol, d settingsPersistenceMode, ChartTimeFrameDisplayType chartTimeFrameDisplayType, OverlayPolicy overlayPolicy, LockPolicy lockPolicy, boolean z) {
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        Intrinsics.checkNotNullParameter(advancedChartsProductIdentifier, "advancedChartsProductIdentifier");
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        Intrinsics.checkNotNullParameter(settingsPersistenceMode, "settingsPersistenceMode");
        Intrinsics.checkNotNullParameter(chartTimeFrameDisplayType, "chartTimeFrameDisplayType");
        Intrinsics.checkNotNullParameter(overlayPolicy, "overlayPolicy");
        Intrinsics.checkNotNullParameter(lockPolicy, "lockPolicy");
        this.f82058a = chartInterval;
        this.f82059b = advancedChartsProductIdentifier;
        this.f82060c = chartSymbol;
        this.d = settingsPersistenceMode;
        this.e = chartTimeFrameDisplayType;
        this.f = overlayPolicy;
        this.f82061g = lockPolicy;
        this.f82062h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdvancedChartExtensionContract$InputData)) {
            return false;
        }
        AdvancedChartExtensionContract$InputData advancedChartExtensionContract$InputData = (AdvancedChartExtensionContract$InputData) obj2;
        return this.f82058a == advancedChartExtensionContract$InputData.f82058a && this.f82059b == advancedChartExtensionContract$InputData.f82059b && Intrinsics.f(this.f82060c, advancedChartExtensionContract$InputData.f82060c) && this.d == advancedChartExtensionContract$InputData.d && Intrinsics.f(this.e, advancedChartExtensionContract$InputData.e) && Intrinsics.f(this.f, advancedChartExtensionContract$InputData.f) && Intrinsics.f(this.f82061g, advancedChartExtensionContract$InputData.f82061g) && this.f82062h == advancedChartExtensionContract$InputData.f82062h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f82062h) + ((this.f82061g.hashCode() + p.a.f((this.e.hashCode() + ((this.d.hashCode() + ((this.f82060c.hashCode() + ((this.f82059b.hashCode() + (this.f82058a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f.f82091a)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82058a.name());
        dest.writeString(this.f82059b.name());
        dest.writeParcelable(this.f82060c, i);
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f82061g, i);
        dest.writeInt(this.f82062h ? 1 : 0);
    }
}
