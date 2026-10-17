package com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/hub/LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable", "", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f70455a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable((LoanDetails) parcel.readParcelable(LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable[i];
        }
    }

    public LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable(LoanDetails loanDetails) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f70455a = loanDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable) && Intrinsics.f(this.f70455a, ((LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Enable) obj2).f70455a);
    }

    public final int hashCode() {
        return this.f70455a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70455a, i);
    }
}
