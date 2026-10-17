package com.revolut.analytics.integrity;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityAnalyticsFeatureToggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/analytics/integrity/IntegrityAnalyticsFeatureToggles$IntegrityTokenRequestsRetryAnalyticsEnabled;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IntegrityTokenRequestsRetryAnalyticsEnabled extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final IntegrityTokenRequestsRetryAnalyticsEnabled f50290c = new IntegrityTokenRequestsRetryAnalyticsEnabled();

        @NotNull
        public static final Parcelable.Creator<IntegrityTokenRequestsRetryAnalyticsEnabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IntegrityTokenRequestsRetryAnalyticsEnabled.f50290c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IntegrityTokenRequestsRetryAnalyticsEnabled[i];
            }
        }

        private IntegrityTokenRequestsRetryAnalyticsEnabled() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return EnableIntegrityTokenRetryAnalyticsFirebaseExperiment.f50289c;
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

    private IntegrityAnalyticsFeatureToggles() {
    }

    public static List a() {
        return u.c(IntegrityTokenRequestsRetryAnalyticsEnabled.f50290c);
    }
}
