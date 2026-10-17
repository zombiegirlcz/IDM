package com.revolut.feature.salary_switch.impl.ui.brazil.screen.dispute;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/salary_switch/impl/ui/brazil/screen/dispute/SalaryDisputeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SalaryDisputeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SalaryDisputeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85287b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SalaryDisputeScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SalaryDisputeScreenContract$InputData[i];
        }
    }

    public SalaryDisputeScreenContract$InputData(String disputeId, String payrollSwitchId) {
        Intrinsics.checkNotNullParameter(disputeId, "disputeId");
        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
        this.f85286a = disputeId;
        this.f85287b = payrollSwitchId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SalaryDisputeScreenContract$InputData)) {
            return false;
        }
        SalaryDisputeScreenContract$InputData salaryDisputeScreenContract$InputData = (SalaryDisputeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85286a, salaryDisputeScreenContract$InputData.f85286a) && Intrinsics.f(this.f85287b, salaryDisputeScreenContract$InputData.f85287b);
    }

    public final int hashCode() {
        return this.f85287b.hashCode() + (this.f85286a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85286a);
        dest.writeString(this.f85287b);
    }
}
