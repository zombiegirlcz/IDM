package com.revolut.screen_capturing.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.DevelopmentOnlyFeatureDefinition;
import com.revolut.feature.toggles.models.LocalFeatureState;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class ScreenCapturingApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/screen_capturing/api/ScreenCapturingApi$Toggles$DisableScreenAccessibilityProtectionToggle;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "screen_capturing_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisableScreenAccessibilityProtectionToggle extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DisableScreenAccessibilityProtectionToggle f104685c = new DisableScreenAccessibilityProtectionToggle();

        @NotNull
        public static final Parcelable.Creator<DisableScreenAccessibilityProtectionToggle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DisableScreenAccessibilityProtectionToggle.f104685c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableScreenAccessibilityProtectionToggle[i];
            }
        }

        private DisableScreenAccessibilityProtectionToggle() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("disableAccessibilityScreenProtection");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/screen_capturing/api/ScreenCapturingApi$Toggles$DisableScreenProtectionToggle;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "screen_capturing_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisableScreenProtectionToggle extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DisableScreenProtectionToggle f104686c = new DisableScreenProtectionToggle();

        @NotNull
        public static final Parcelable.Creator<DisableScreenProtectionToggle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DisableScreenProtectionToggle.f104686c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableScreenProtectionToggle[i];
            }
        }

        private DisableScreenProtectionToggle() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("disableScreenHiding");
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/screen_capturing/api/ScreenCapturingApi$Toggles$ShowScreenCapturingDebugOverlay;", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "screen_capturing_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowScreenCapturingDebugOverlay extends DevelopmentOnlyFeatureDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowScreenCapturingDebugOverlay f104687a = new ShowScreenCapturingDebugOverlay();

        @NotNull
        public static final Parcelable.Creator<ShowScreenCapturingDebugOverlay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowScreenCapturingDebugOverlay.f104687a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowScreenCapturingDebugOverlay[i];
            }
        }

        private ShowScreenCapturingDebugOverlay() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final LocalFeatureState s5() {
            od0.a aVar = od0.a.f224253a;
            return new LocalFeatureState.Binary(od0.a.e());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private ScreenCapturingApi$Toggles() {
    }

    public static List a() {
        return v.k(DisableScreenProtectionToggle.f104686c, ShowScreenCapturingDebugOverlay.f104687a, DisableScreenAccessibilityProtectionToggle.f104685c);
    }
}
