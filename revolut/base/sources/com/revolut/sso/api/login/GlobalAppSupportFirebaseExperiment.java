package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import b0m.b;
import com.revolut.utils.tracking.ab_testing.experiments.FirebaseExperiment;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r81.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/login/GlobalAppSupportFirebaseExperiment;", "Lcom/revolut/utils/tracking/ab_testing/experiments/FirebaseExperiment;", "<init>", "()V", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class GlobalAppSupportFirebaseExperiment extends FirebaseExperiment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GlobalAppSupportFirebaseExperiment f105840c = new GlobalAppSupportFirebaseExperiment();

    @NotNull
    public static final Parcelable.Creator<GlobalAppSupportFirebaseExperiment> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return GlobalAppSupportFirebaseExperiment.f105840c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GlobalAppSupportFirebaseExperiment[i];
        }
    }

    private GlobalAppSupportFirebaseExperiment() {
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    /* JADX INFO: renamed from: Q8 */
    public final Set getE() {
        d[] elements = {new d(b.EXPERIMENT_VALUE_A, "SSO global app support disabled"), new d(b.EXPERIMENT_VALUE_B, "SSO global app support enabled")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    /* JADX INFO: renamed from: w7 */
    public final String getF60553a() {
        return "EID_SSO_GLOBAL_APP_SUPPORT";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
