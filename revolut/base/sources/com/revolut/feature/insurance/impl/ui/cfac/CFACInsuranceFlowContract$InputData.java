package com.revolut.feature.insurance.impl.ui.cfac;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/CFACInsuranceFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceFlowContract$Step f75033a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACInsuranceFlowContract$InputData((CFACInsuranceFlowContract$Step) parcel.readParcelable(CFACInsuranceFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceFlowContract$InputData[i];
        }
    }

    public CFACInsuranceFlowContract$InputData(CFACInsuranceFlowContract$Step initialStep) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f75033a = initialStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CFACInsuranceFlowContract$InputData) && Intrinsics.f(this.f75033a, ((CFACInsuranceFlowContract$InputData) obj2).f75033a);
    }

    public final int hashCode() {
        return this.f75033a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f75033a, i);
    }
}
