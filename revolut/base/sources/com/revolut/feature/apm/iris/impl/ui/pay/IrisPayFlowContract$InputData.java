package com.revolut.feature.apm.iris.impl.ui.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IrisPayFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IrisPayFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IrisNavigation$StartType.Pay f62512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmPaymentProfile f62513b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IrisPayFlowContract$InputData((IrisNavigation$StartType.Pay) parcel.readParcelable(IrisPayFlowContract$InputData.class.getClassLoader()), (ApmPaymentProfile) parcel.readParcelable(IrisPayFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IrisPayFlowContract$InputData[i];
        }
    }

    public IrisPayFlowContract$InputData(IrisNavigation$StartType.Pay startType, ApmPaymentProfile profile) {
        Intrinsics.checkNotNullParameter(startType, "startType");
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f62512a = startType;
        this.f62513b = profile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IrisPayFlowContract$InputData)) {
            return false;
        }
        IrisPayFlowContract$InputData irisPayFlowContract$InputData = (IrisPayFlowContract$InputData) obj2;
        return Intrinsics.f(this.f62512a, irisPayFlowContract$InputData.f62512a) && this.f62513b == irisPayFlowContract$InputData.f62513b;
    }

    public final int hashCode() {
        return this.f62513b.hashCode() + (this.f62512a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62512a, i);
        dest.writeParcelable(this.f62513b, i);
    }
}
