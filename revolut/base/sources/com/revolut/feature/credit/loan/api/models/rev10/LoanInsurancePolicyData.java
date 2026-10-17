package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInsurancePolicyData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanInsurancePolicyData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanInsurancePolicyData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q35.k f70160b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanInsurancePolicyData(parcel.readString(), q35.k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanInsurancePolicyData[i];
        }
    }

    public LoanInsurancePolicyData(String id10, q35.k state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f70159a = id10;
        this.f70160b = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanInsurancePolicyData)) {
            return false;
        }
        LoanInsurancePolicyData loanInsurancePolicyData = (LoanInsurancePolicyData) obj2;
        return Intrinsics.f(this.f70159a, loanInsurancePolicyData.f70159a) && this.f70160b == loanInsurancePolicyData.f70160b;
    }

    public final int hashCode() {
        return this.f70160b.hashCode() + (this.f70159a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70159a);
        dest.writeString(this.f70160b.name());
    }
}
