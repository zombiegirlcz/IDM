package com.revolut.retail.feature.pod_nominees.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodNomineesFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PodNomineesFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineesFlowUseCase f102606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f102607b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PodNomineesFlowContract$InputData((PodNomineesFlowUseCase) parcel.readParcelable(PodNomineesFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodNomineesFlowContract$InputData[i];
        }
    }

    public PodNomineesFlowContract$InputData(PodNomineesFlowUseCase podNomineesFlowUseCase, boolean z) {
        Intrinsics.checkNotNullParameter(podNomineesFlowUseCase, "podNomineesFlowUseCase");
        this.f102606a = podNomineesFlowUseCase;
        this.f102607b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PodNomineesFlowContract$InputData)) {
            return false;
        }
        PodNomineesFlowContract$InputData podNomineesFlowContract$InputData = (PodNomineesFlowContract$InputData) obj2;
        return Intrinsics.f(this.f102606a, podNomineesFlowContract$InputData.f102606a) && this.f102607b == podNomineesFlowContract$InputData.f102607b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102607b) + (this.f102606a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102606a, i);
        dest.writeInt(this.f102607b ? 1 : 0);
    }

    public /* synthetic */ PodNomineesFlowContract$InputData() {
        this(PodNomineesFlowUseCase.Profile.LegacyProfile.f102582a, true);
    }
}
