package com.revolut.feature.abexperiments.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r81.c;
import r81.d;
import r81.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/abexperiments/models/ReleaseFlagExperiment;", "Lcom/revolut/feature/abexperiments/models/Experiment;", "", "toString", "()Ljava/lang/String;", "r81/e", "feature_ab_experiments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReleaseFlagExperiment implements Experiment {

    @NotNull
    public static final Parcelable.Creator<ReleaseFlagExperiment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60553a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReleaseFlagExperiment(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReleaseFlagExperiment[i];
        }
    }

    public ReleaseFlagExperiment(String experimentId) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        this.f60553a = experimentId;
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    /* JADX INFO: renamed from: Q8 */
    public final Set getE() {
        e eVar = e.ENABLED;
        String str = this.f60553a;
        d[] elements = {new d(eVar, a0.d.r(str, " enabled")), new d(e.DISABLED, a0.d.r(str, " disabled"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    public final c X1() {
        return e.ENABLED;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ReleaseFlagExperiment) && Intrinsics.f(this.f60553a, ((ReleaseFlagExperiment) obj2).f60553a);
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    public final c getDefaultValue() {
        return e.DISABLED;
    }

    public final int hashCode() {
        return this.f60553a.hashCode();
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    /* JADX INFO: renamed from: w7, reason: from getter */
    public final String getF107369c() {
        return this.f60553a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60553a);
    }
}
