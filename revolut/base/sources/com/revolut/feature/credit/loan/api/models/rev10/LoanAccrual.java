package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanAccrual;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanAccrual implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanAccrual> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f70124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f70125b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanAccrual((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanAccrual[i];
        }
    }

    public LoanAccrual(dj0.d amount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f70124a = amount;
        this.f70125b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanAccrual)) {
            return false;
        }
        LoanAccrual loanAccrual = (LoanAccrual) obj2;
        return Intrinsics.f(this.f70124a, loanAccrual.f70124a) && Intrinsics.f(this.f70125b, loanAccrual.f70125b);
    }

    public final int hashCode() {
        int iHashCode = this.f70124a.hashCode() * 31;
        dj0.d dVar = this.f70125b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70124a);
        dest.writeSerializable(this.f70125b);
    }
}
