package com.revolut.feature.wealth.analytics.ui.widgetised.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/wealth/analytics/ui/widgetised/performance/WidgetisedAnalyticsPerformanceContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LearnMore", "BenchmarkSelection", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/performance/WidgetisedAnalyticsPerformanceContract$ModalStep$BenchmarkSelection;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/performance/WidgetisedAnalyticsPerformanceContract$ModalStep$LearnMore;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WidgetisedAnalyticsPerformanceContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/performance/WidgetisedAnalyticsPerformanceContract$ModalStep$BenchmarkSelection;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/performance/WidgetisedAnalyticsPerformanceContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BenchmarkSelection extends WidgetisedAnalyticsPerformanceContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BenchmarkSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95103b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BenchmarkSelection(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BenchmarkSelection[i];
            }
        }

        public BenchmarkSelection(String benchmarkRef, boolean z) {
            Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
            this.f95102a = benchmarkRef;
            this.f95103b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BenchmarkSelection)) {
                return false;
            }
            BenchmarkSelection benchmarkSelection = (BenchmarkSelection) obj2;
            return Intrinsics.f(this.f95102a, benchmarkSelection.f95102a) && this.f95103b == benchmarkSelection.f95103b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f95103b) + (this.f95102a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95102a);
            dest.writeInt(this.f95103b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/performance/WidgetisedAnalyticsPerformanceContract$ModalStep$LearnMore;", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/performance/WidgetisedAnalyticsPerformanceContract$ModalStep;", "<init>", "()V", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LearnMore extends WidgetisedAnalyticsPerformanceContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LearnMore f95104a = new LearnMore();

        @NotNull
        public static final Parcelable.Creator<LearnMore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LearnMore.f95104a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnMore[i];
            }
        }

        private LearnMore() {
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

    private WidgetisedAnalyticsPerformanceContract$ModalStep() {
    }
}
