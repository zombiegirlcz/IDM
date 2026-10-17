package com.revolut.feature.credit.autopay.ui.screen.amount.input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/amount/input/InputAmountScreenContract$RepaymentInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputAmountScreenContract$RepaymentInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InputAmountScreenContract$RepaymentInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RepaymentSource f68608b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputAmountScreenContract$RepaymentInfo((RepaymentSource) parcel.readParcelable(InputAmountScreenContract$RepaymentInfo.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InputAmountScreenContract$RepaymentInfo[i];
        }
    }

    public InputAmountScreenContract$RepaymentInfo(RepaymentSource repaymentSource, boolean z) {
        Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
        this.f68607a = z;
        this.f68608b = repaymentSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InputAmountScreenContract$RepaymentInfo)) {
            return false;
        }
        InputAmountScreenContract$RepaymentInfo inputAmountScreenContract$RepaymentInfo = (InputAmountScreenContract$RepaymentInfo) obj2;
        return this.f68607a == inputAmountScreenContract$RepaymentInfo.f68607a && Intrinsics.f(this.f68608b, inputAmountScreenContract$RepaymentInfo.f68608b);
    }

    public final int hashCode() {
        return this.f68608b.hashCode() + (Boolean.hashCode(this.f68607a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68607a ? 1 : 0);
        dest.writeParcelable(this.f68608b, i);
    }
}
