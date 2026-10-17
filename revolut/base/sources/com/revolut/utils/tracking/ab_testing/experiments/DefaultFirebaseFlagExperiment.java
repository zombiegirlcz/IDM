package com.revolut.utils.tracking.ab_testing.experiments;

import android.os.Parcel;
import android.os.Parcelable;
import b0m.b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r81.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/utils/tracking/ab_testing/experiments/DefaultFirebaseFlagExperiment;", "Lcom/revolut/utils/tracking/ab_testing/experiments/FirebaseExperiment;", "", "toString", "()Ljava/lang/String;", "feature_toggle_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefaultFirebaseFlagExperiment extends FirebaseExperiment {

    @NotNull
    public static final Parcelable.Creator<DefaultFirebaseFlagExperiment> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107369c;
    public final String d;
    public final Set e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DefaultFirebaseFlagExperiment(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DefaultFirebaseFlagExperiment[i];
        }
    }

    public DefaultFirebaseFlagExperiment(String experimentId, String experimentDescription) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(experimentDescription, "experimentDescription");
        this.f107369c = experimentId;
        this.d = experimentDescription;
        d[] elements = {new d(b.EXPERIMENT_VALUE_A, "Disabled"), new d(b.EXPERIMENT_VALUE_B, "Enabled")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.e = kotlin.collections.d.y0(elements);
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    /* JADX INFO: renamed from: Q8, reason: from getter */
    public final Set getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DefaultFirebaseFlagExperiment)) {
            return false;
        }
        DefaultFirebaseFlagExperiment defaultFirebaseFlagExperiment = (DefaultFirebaseFlagExperiment) obj2;
        return Intrinsics.f(this.f107369c, defaultFirebaseFlagExperiment.f107369c) && Intrinsics.f(this.d, defaultFirebaseFlagExperiment.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.f107369c.hashCode() * 31);
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    /* JADX INFO: renamed from: w7, reason: from getter */
    public final String getF107369c() {
        return this.f107369c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f107369c);
        dest.writeString(this.d);
    }
}
