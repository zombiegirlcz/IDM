package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/selectday_v2/LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f70411a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel((Clause) parcel.readParcelable(LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel[i];
        }
    }

    public LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel(Clause explainerSubtitle) {
        Intrinsics.checkNotNullParameter(explainerSubtitle, "explainerSubtitle");
        this.f70411a = explainerSubtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel) && Intrinsics.f(this.f70411a, ((LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel) obj2).f70411a);
    }

    public final int hashCode() {
        return this.f70411a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70411a, i);
    }
}
