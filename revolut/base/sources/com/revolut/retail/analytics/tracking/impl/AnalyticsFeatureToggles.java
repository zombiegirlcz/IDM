package com.revolut.retail.analytics.tracking.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.DevelopmentOnlyFeatureDefinition;
import com.revolut.feature.toggles.models.LocalFeatureState;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import com.revolut.utils.tracking.ab_testing.experiments.DefaultFirebaseFlagExperiment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class AnalyticsFeatureToggles {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/analytics/tracking/impl/AnalyticsFeatureToggles$AnalyticsDebugLogging;", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "retail_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsDebugLogging extends DevelopmentOnlyFeatureDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnalyticsDebugLogging f98540a = new AnalyticsDebugLogging();

        @NotNull
        public static final Parcelable.Creator<AnalyticsDebugLogging> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsDebugLogging.f98540a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsDebugLogging[i];
            }
        }

        private AnalyticsDebugLogging() {
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        /* JADX INFO: renamed from: T3 */
        public final boolean getF71625b() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final LocalFeatureState s5() {
            return new LocalFeatureState.Binary(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/analytics/tracking/impl/AnalyticsFeatureToggles$AnalyticsFailFast;", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "retail_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsFailFast extends DevelopmentOnlyFeatureDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnalyticsFailFast f98541a = new AnalyticsFailFast();

        @NotNull
        public static final Parcelable.Creator<AnalyticsFailFast> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsFailFast.f98541a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsFailFast[i];
            }
        }

        private AnalyticsFailFast() {
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        /* JADX INFO: renamed from: T3 */
        public final boolean getF71625b() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final LocalFeatureState s5() {
            return new LocalFeatureState.Binary(true);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/analytics/tracking/impl/AnalyticsFeatureToggles$AppStartupPerformanceTracking;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AppStartupPerformanceTracking extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AppStartupPerformanceTracking f98542c = new AppStartupPerformanceTracking();

        @NotNull
        public static final Parcelable.Creator<AppStartupPerformanceTracking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppStartupPerformanceTracking.f98542c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppStartupPerformanceTracking[i];
            }
        }

        private AppStartupPerformanceTracking() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new DefaultFirebaseFlagExperiment("EID_APP_STARTUP_PERFORMANCE_TRACKING", "Enables tracking & reporting app startup performance metrics in Retail Android app");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/analytics/tracking/impl/AnalyticsFeatureToggles$DisableDynamicDeliveryLifecycleTracking;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisableDynamicDeliveryLifecycleTracking extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DisableDynamicDeliveryLifecycleTracking f98543c = new DisableDynamicDeliveryLifecycleTracking();

        @NotNull
        public static final Parcelable.Creator<DisableDynamicDeliveryLifecycleTracking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DisableDynamicDeliveryLifecycleTracking.f98543c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableDynamicDeliveryLifecycleTracking[i];
            }
        }

        private DisableDynamicDeliveryLifecycleTracking() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("disableDynamicDeliveryLifecycleTracking");
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/analytics/tracking/impl/AnalyticsFeatureToggles$ShowAutomaticAnalyticsEventsToasts;", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "retail_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowAutomaticAnalyticsEventsToasts extends DevelopmentOnlyFeatureDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowAutomaticAnalyticsEventsToasts f98544a = new ShowAutomaticAnalyticsEventsToasts();

        @NotNull
        public static final Parcelable.Creator<ShowAutomaticAnalyticsEventsToasts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowAutomaticAnalyticsEventsToasts.f98544a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAutomaticAnalyticsEventsToasts[i];
            }
        }

        private ShowAutomaticAnalyticsEventsToasts() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final LocalFeatureState s5() {
            return new LocalFeatureState.Binary(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private AnalyticsFeatureToggles() {
    }

    public static List a() {
        return v.k(AnalyticsDebugLogging.f98540a, AnalyticsFailFast.f98541a, AppStartupPerformanceTracking.f98542c, DisableDynamicDeliveryLifecycleTracking.f98543c, ShowAutomaticAnalyticsEventsToasts.f98544a);
    }
}
