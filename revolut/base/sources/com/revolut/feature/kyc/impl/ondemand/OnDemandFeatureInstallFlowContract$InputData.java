package com.revolut.feature.kyc.impl.ondemand;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/ondemand/OnDemandFeatureInstallFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnDemandFeatureInstallFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OnDemandFeatureInstallFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f77840b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnDemandFeatureInstallFlowContract$InputData((Clause) parcel.readParcelable(OnDemandFeatureInstallFlowContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnDemandFeatureInstallFlowContract$InputData[i];
        }
    }

    public OnDemandFeatureInstallFlowContract$InputData(Clause clause, String packageId) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f77839a = packageId;
        this.f77840b = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnDemandFeatureInstallFlowContract$InputData)) {
            return false;
        }
        OnDemandFeatureInstallFlowContract$InputData onDemandFeatureInstallFlowContract$InputData = (OnDemandFeatureInstallFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77839a, onDemandFeatureInstallFlowContract$InputData.f77839a) && Intrinsics.f(this.f77840b, onDemandFeatureInstallFlowContract$InputData.f77840b);
    }

    public final int hashCode() {
        int iHashCode = this.f77839a.hashCode() * 31;
        Clause clause = this.f77840b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77839a);
        dest.writeParcelable(this.f77840b, i);
    }
}
