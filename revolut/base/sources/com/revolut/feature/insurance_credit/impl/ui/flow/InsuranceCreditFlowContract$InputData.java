package com.revolut.feature.insurance_credit.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_credit.api.navigation.Facility;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_credit/impl/ui/flow/InsuranceCreditFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceCreditFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsuranceCreditFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Facility f75803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InsuranceCreditFlowContract$Step f75805c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceCreditFlowContract$InputData((Facility) parcel.readParcelable(InsuranceCreditFlowContract$InputData.class.getClassLoader()), parcel.readString(), (InsuranceCreditFlowContract$Step) parcel.readParcelable(InsuranceCreditFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceCreditFlowContract$InputData[i];
        }
    }

    public InsuranceCreditFlowContract$InputData(Facility facility, String policyId, InsuranceCreditFlowContract$Step initialStep) {
        Intrinsics.checkNotNullParameter(facility, "facility");
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f75803a = facility;
        this.f75804b = policyId;
        this.f75805c = initialStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceCreditFlowContract$InputData)) {
            return false;
        }
        InsuranceCreditFlowContract$InputData insuranceCreditFlowContract$InputData = (InsuranceCreditFlowContract$InputData) obj2;
        return Intrinsics.f(this.f75803a, insuranceCreditFlowContract$InputData.f75803a) && Intrinsics.f(this.f75804b, insuranceCreditFlowContract$InputData.f75804b) && Intrinsics.f(this.f75805c, insuranceCreditFlowContract$InputData.f75805c);
    }

    public final int hashCode() {
        return this.f75805c.hashCode() + p.a.c(this.f75803a.hashCode() * 31, 31, this.f75804b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f75803a, i);
        dest.writeString(this.f75804b);
        dest.writeParcelable(this.f75805c, i);
    }
}
