package com.revolut.feature.three_ds_verification.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class ThreeDsVerificationApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/three_ds_verification/api/ThreeDsVerificationApi$Toggles$ThreeDsVerificationRedesign;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_three_ds_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ThreeDsVerificationRedesign extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ThreeDsVerificationRedesign f90392c = new ThreeDsVerificationRedesign();

        @NotNull
        public static final Parcelable.Creator<ThreeDsVerificationRedesign> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ThreeDsVerificationRedesign.f90392c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThreeDsVerificationRedesign[i];
            }
        }

        private ThreeDsVerificationRedesign() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("threeDSVerificationRedesign");
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

    private ThreeDsVerificationApi$Toggles() {
    }

    public static List a() {
        return u.c(ThreeDsVerificationRedesign.f90392c);
    }
}
