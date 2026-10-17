package com.revolut.feature.deeplink.impl.whitelist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.utils.tracking.ab_testing.experiments.FirebaseExperiment;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/deeplink/impl/whitelist/PincodeBlacklistCheckerImpl$PincodeRequiredDeeplinks", "Lcom/revolut/utils/tracking/ab_testing/experiments/FirebaseExperiment;", "<init>", "()V", "feature_retail_deeplink_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PincodeBlacklistCheckerImpl$PincodeRequiredDeeplinks extends FirebaseExperiment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PincodeBlacklistCheckerImpl$PincodeRequiredDeeplinks f71632c = new PincodeBlacklistCheckerImpl$PincodeRequiredDeeplinks();

    @NotNull
    public static final Parcelable.Creator<PincodeBlacklistCheckerImpl$PincodeRequiredDeeplinks> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PincodeBlacklistCheckerImpl$PincodeRequiredDeeplinks.f71632c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PincodeBlacklistCheckerImpl$PincodeRequiredDeeplinks[i];
        }
    }

    private PincodeBlacklistCheckerImpl$PincodeRequiredDeeplinks() {
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    public final Set Q8() {
        return h0.f322473a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    /* JADX INFO: renamed from: w7 */
    public final String getF60553a() {
        return "PUSHES_NO_PINCODE_MECHANISM_DISABLED_DEEPLINKS";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
