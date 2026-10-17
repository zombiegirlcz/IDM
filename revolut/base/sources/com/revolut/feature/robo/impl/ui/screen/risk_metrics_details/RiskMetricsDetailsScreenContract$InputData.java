package com.revolut.feature.robo.impl.ui.screen.risk_metrics_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yoc.f;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Performance", "Risk", "Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreenContract$InputData$Performance;", "Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreenContract$InputData$Risk;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RiskMetricsDetailsScreenContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f85195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f85196b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreenContract$InputData$Performance;", "Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreenContract$InputData;", "<init>", "()V", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Performance extends RiskMetricsDetailsScreenContract$InputData {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Performance f85197c = new Performance();

        @NotNull
        public static final Parcelable.Creator<Performance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Performance.f85197c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Performance[i];
            }
        }

        private Performance() {
            super(new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_performance, null, null, 14), v.k(f.AVERAGE_ANNUAL_RETURN, f.DIVIDEND_YIELD, f.CAGR, f.MEDIAN_RETURN, f.BEST_YEAR_RETURN));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreenContract$InputData$Risk;", "Lcom/revolut/feature/robo/impl/ui/screen/risk_metrics_details/RiskMetricsDetailsScreenContract$InputData;", "<init>", "()V", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Risk extends RiskMetricsDetailsScreenContract$InputData {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Risk f85198c = new Risk();

        @NotNull
        public static final Parcelable.Creator<Risk> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Risk.f85198c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Risk[i];
            }
        }

        private Risk() {
            super(new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_risk, null, null, 14), v.k(f.MAX_DRAWDOWN, f.AVERAGE_DRAWDOWN, f.BETA, f.STANDARD_DEVIATION, f.SHARPE_RATIO, f.VA_R));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public RiskMetricsDetailsScreenContract$InputData(TextLocalisedClause textLocalisedClause, List list) {
        this.f85195a = textLocalisedClause;
        this.f85196b = list;
    }
}
