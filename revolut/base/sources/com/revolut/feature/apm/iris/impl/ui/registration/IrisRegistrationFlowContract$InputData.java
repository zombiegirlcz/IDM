package com.revolut.feature.apm.iris.impl.ui.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IrisRegistrationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IrisRegistrationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IrisRegistrationStatus.NotRegistered f62522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmPaymentProfile f62523b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IrisRegistrationFlowContract$InputData((IrisRegistrationStatus.NotRegistered) parcel.readParcelable(IrisRegistrationFlowContract$InputData.class.getClassLoader()), (ApmPaymentProfile) parcel.readParcelable(IrisRegistrationFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IrisRegistrationFlowContract$InputData[i];
        }
    }

    public IrisRegistrationFlowContract$InputData(IrisRegistrationStatus.NotRegistered status, ApmPaymentProfile profile) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f62522a = status;
        this.f62523b = profile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IrisRegistrationFlowContract$InputData)) {
            return false;
        }
        IrisRegistrationFlowContract$InputData irisRegistrationFlowContract$InputData = (IrisRegistrationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f62522a, irisRegistrationFlowContract$InputData.f62522a) && this.f62523b == irisRegistrationFlowContract$InputData.f62523b;
    }

    public final int hashCode() {
        return this.f62523b.hashCode() + (this.f62522a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62522a, i);
        dest.writeParcelable(this.f62523b, i);
    }
}
