package com.revolut.feature.retail.advanced_charts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import c1b.c;
import c1b.d;
import c1b.h;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.ChartTimeFrameDisplayType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/retail/advanced_charts/api/navigation/AdvancedChartsConfig$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "AdvancedCharts", "Lcom/revolut/feature/retail/advanced_charts/api/navigation/AdvancedChartsConfig$Destination$AdvancedCharts;", "feature_retail_advanced_charts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdvancedChartsConfig$Destination implements KompotDestination, Parcelable {
    private AdvancedChartsConfig$Destination() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/api/navigation/AdvancedChartsConfig$Destination$AdvancedCharts;", "Lcom/revolut/feature/retail/advanced_charts/api/navigation/AdvancedChartsConfig$Destination;", "", "toString", "()Ljava/lang/String;", "feature_retail_advanced_charts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdvancedCharts extends AdvancedChartsConfig$Destination {

        @NotNull
        public static final Parcelable.Creator<AdvancedCharts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f82063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f82064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AdvancedChartSymbol f82065c;
        public final d d;
        public final ChartTimeFrameDisplayType e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdvancedCharts(c.valueOf(parcel.readString()), h.valueOf(parcel.readString()), (AdvancedChartSymbol) parcel.readParcelable(AdvancedCharts.class.getClassLoader()), d.valueOf(parcel.readString()), (ChartTimeFrameDisplayType) parcel.readParcelable(AdvancedCharts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdvancedCharts[i];
            }
        }

        public AdvancedCharts(c advancedChartsProductIdentifier, h chartInterval, AdvancedChartSymbol chartSymbol, d persistenceMode, ChartTimeFrameDisplayType chartTimeFrameDisplayType) {
            Intrinsics.checkNotNullParameter(advancedChartsProductIdentifier, "advancedChartsProductIdentifier");
            Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
            Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
            Intrinsics.checkNotNullParameter(persistenceMode, "persistenceMode");
            Intrinsics.checkNotNullParameter(chartTimeFrameDisplayType, "chartTimeFrameDisplayType");
            this.f82063a = advancedChartsProductIdentifier;
            this.f82064b = chartInterval;
            this.f82065c = chartSymbol;
            this.d = persistenceMode;
            this.e = chartTimeFrameDisplayType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getF82063a() {
            return this.f82063a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getF82064b() {
            return this.f82064b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AdvancedChartSymbol getF82065c() {
            return this.f82065c;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ChartTimeFrameDisplayType getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final d getD() {
            return this.d;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdvancedCharts)) {
                return false;
            }
            AdvancedCharts advancedCharts = (AdvancedCharts) obj2;
            return this.f82063a == advancedCharts.f82063a && this.f82064b == advancedCharts.f82064b && Intrinsics.f(this.f82065c, advancedCharts.f82065c) && this.d == advancedCharts.d && Intrinsics.f(this.e, advancedCharts.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f82065c.hashCode() + ((this.f82064b.hashCode() + (this.f82063a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82063a.name());
            dest.writeString(this.f82064b.name());
            dest.writeParcelable(this.f82065c, i);
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
        }

        public /* synthetic */ AdvancedCharts(c cVar, h hVar, AdvancedChartSymbol advancedChartSymbol, d dVar) {
            this(cVar, hVar, advancedChartSymbol, dVar, ChartTimeFrameDisplayType.BasedOnTradingViewLogic.f82086a);
        }
    }
}
