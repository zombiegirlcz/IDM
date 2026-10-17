package com.revolut.sso.api.external_entry;

import android.os.Parcel;
import android.os.Parcelable;
import b0m.b;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import com.revolut.utils.tracking.ab_testing.experiments.FirebaseExperiment;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r81.c;
import r81.d;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class RevolutSsoExternalEntryApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/external_entry/RevolutSsoExternalEntryApi$Toggles$RevolutSsoSdkNativeFlowEnabled;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevolutSsoSdkNativeFlowEnabled extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RevolutSsoSdkNativeFlowEnabled f105838c = new RevolutSsoSdkNativeFlowEnabled();

        @NotNull
        public static final Parcelable.Creator<RevolutSsoSdkNativeFlowEnabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevolutSsoSdkNativeFlowEnabled.f105838c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutSsoSdkNativeFlowEnabled[i];
            }
        }

        private RevolutSsoSdkNativeFlowEnabled() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return RevolutSsoSdkNativeFlowEnabledFirebaseExperiment.f105839c;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/external_entry/RevolutSsoExternalEntryApi$Toggles$RevolutSsoSdkNativeFlowEnabledFirebaseExperiment;", "Lcom/revolut/utils/tracking/ab_testing/experiments/FirebaseExperiment;", "<init>", "()V", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevolutSsoSdkNativeFlowEnabledFirebaseExperiment extends FirebaseExperiment {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RevolutSsoSdkNativeFlowEnabledFirebaseExperiment f105839c = new RevolutSsoSdkNativeFlowEnabledFirebaseExperiment();

        @NotNull
        public static final Parcelable.Creator<RevolutSsoSdkNativeFlowEnabledFirebaseExperiment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevolutSsoSdkNativeFlowEnabledFirebaseExperiment.f105839c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutSsoSdkNativeFlowEnabledFirebaseExperiment[i];
            }
        }

        private RevolutSsoSdkNativeFlowEnabledFirebaseExperiment() {
        }

        @Override // com.revolut.feature.abexperiments.models.Experiment
        /* JADX INFO: renamed from: Q8 */
        public final Set getE() {
            d[] elements = {new d(b.EXPERIMENT_VALUE_A, "Launching native Revolut SSO Authentication flow from Revolut SSO SDK on Android is disabled"), new d(b.EXPERIMENT_VALUE_B, "Launching native Revolut SSO Authentication flow from Revolut SSO SDK on Android is enabled")};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.y0(elements);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.utils.tracking.ab_testing.experiments.FirebaseExperiment, com.revolut.feature.abexperiments.models.Experiment
        public final c getDefaultValue() {
            return b.EXPERIMENT_VALUE_A;
        }

        @Override // com.revolut.feature.abexperiments.models.Experiment
        /* JADX INFO: renamed from: w7 */
        public final String getF60553a() {
            return "EID_ANDROID_REVOLUT_AUTHENTICATION_FLOW_FOR_SSO_SDK_ENABLED";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private RevolutSsoExternalEntryApi$Toggles() {
    }

    public static List a() {
        return u.c(RevolutSsoSdkNativeFlowEnabled.f105838c);
    }
}
