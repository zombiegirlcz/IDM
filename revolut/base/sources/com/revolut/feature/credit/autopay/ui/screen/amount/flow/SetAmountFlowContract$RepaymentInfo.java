package com.revolut.feature.credit.autopay.ui.screen.amount.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$RepaymentInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetAmountFlowContract$RepaymentInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SetAmountFlowContract$RepaymentInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RepaymentSource f68590b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetAmountFlowContract$RepaymentInfo((RepaymentSource) parcel.readParcelable(SetAmountFlowContract$RepaymentInfo.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SetAmountFlowContract$RepaymentInfo[i];
        }
    }

    public SetAmountFlowContract$RepaymentInfo(RepaymentSource repaymentSource, boolean z) {
        Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
        this.f68589a = z;
        this.f68590b = repaymentSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SetAmountFlowContract$RepaymentInfo)) {
            return false;
        }
        SetAmountFlowContract$RepaymentInfo setAmountFlowContract$RepaymentInfo = (SetAmountFlowContract$RepaymentInfo) obj2;
        return this.f68589a == setAmountFlowContract$RepaymentInfo.f68589a && Intrinsics.f(this.f68590b, setAmountFlowContract$RepaymentInfo.f68590b);
    }

    public final int hashCode() {
        return this.f68590b.hashCode() + (Boolean.hashCode(this.f68589a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68589a ? 1 : 0);
        dest.writeParcelable(this.f68590b, i);
    }
}
