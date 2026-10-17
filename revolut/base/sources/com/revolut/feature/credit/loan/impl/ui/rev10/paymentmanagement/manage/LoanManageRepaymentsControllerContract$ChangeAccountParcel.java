package com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x35.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/paymentmanagement/manage/LoanManageRepaymentsControllerContract$ChangeAccountParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanManageRepaymentsControllerContract$ChangeAccountParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanManageRepaymentsControllerContract$ChangeAccountParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f70471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f70472b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanManageRepaymentsControllerContract$ChangeAccountParcel((LoanDetails) parcel.readParcelable(LoanManageRepaymentsControllerContract$ChangeAccountParcel.class.getClassLoader()), (e) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanManageRepaymentsControllerContract$ChangeAccountParcel[i];
        }
    }

    public LoanManageRepaymentsControllerContract$ChangeAccountParcel(LoanDetails loanDetails, e eVar) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f70471a = loanDetails;
        this.f70472b = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanManageRepaymentsControllerContract$ChangeAccountParcel)) {
            return false;
        }
        LoanManageRepaymentsControllerContract$ChangeAccountParcel loanManageRepaymentsControllerContract$ChangeAccountParcel = (LoanManageRepaymentsControllerContract$ChangeAccountParcel) obj2;
        return Intrinsics.f(this.f70471a, loanManageRepaymentsControllerContract$ChangeAccountParcel.f70471a) && Intrinsics.f(this.f70472b, loanManageRepaymentsControllerContract$ChangeAccountParcel.f70472b);
    }

    public final int hashCode() {
        int iHashCode = this.f70471a.hashCode() * 31;
        e eVar = this.f70472b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70471a, i);
        dest.writeSerializable(this.f70472b);
    }
}
