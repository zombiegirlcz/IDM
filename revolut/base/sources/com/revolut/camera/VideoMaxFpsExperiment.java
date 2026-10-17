package com.revolut.camera;

import android.os.Parcel;
import android.os.Parcelable;
import b0m.b;
import com.revolut.utils.tracking.ab_testing.experiments.FirebaseExperiment;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r81.c;
import r81.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camera/VideoMaxFpsExperiment;", "Lcom/revolut/utils/tracking/ab_testing/experiments/FirebaseExperiment;", "<init>", "()V", "camera_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoMaxFpsExperiment extends FirebaseExperiment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final VideoMaxFpsExperiment f50682c = new VideoMaxFpsExperiment();

    @NotNull
    public static final Parcelable.Creator<VideoMaxFpsExperiment> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return VideoMaxFpsExperiment.f50682c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoMaxFpsExperiment[i];
        }
    }

    private VideoMaxFpsExperiment() {
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    /* JADX INFO: renamed from: Q8 */
    public final Set getE() {
        d[] elements = {new d(b.EXPERIMENT_VALUE_A, "Disabled"), new d(b.EXPERIMENT_VALUE_B, "Enabled")};
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
        return "EID_VIDEO_MAX_FPS";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
