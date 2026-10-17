package com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/colombia/pse/auth_request/PsePendingPaymentExtension$PaymentModel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PsePendingPaymentExtension$PaymentModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PsePendingPaymentExtension$PaymentModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationPendingAction f72725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PseAuthorisationRequestPaymentFrom f72726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmQuote f72727c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PsePendingPaymentExtension$PaymentModel((ApmPaymentAuthorisationPendingAction) parcel.readParcelable(PsePendingPaymentExtension$PaymentModel.class.getClassLoader()), parcel.readInt() == 0 ? null : PseAuthorisationRequestPaymentFrom.CREATOR.createFromParcel(parcel), (ApmQuote) parcel.readParcelable(PsePendingPaymentExtension$PaymentModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PsePendingPaymentExtension$PaymentModel[i];
        }
    }

    public PsePendingPaymentExtension$PaymentModel(ApmPaymentAuthorisationPendingAction pendingAction, PseAuthorisationRequestPaymentFrom pseAuthorisationRequestPaymentFrom, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        this.f72725a = pendingAction;
        this.f72726b = pseAuthorisationRequestPaymentFrom;
        this.f72727c = apmQuote;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PsePendingPaymentExtension$PaymentModel)) {
            return false;
        }
        PsePendingPaymentExtension$PaymentModel psePendingPaymentExtension$PaymentModel = (PsePendingPaymentExtension$PaymentModel) obj2;
        return Intrinsics.f(this.f72725a, psePendingPaymentExtension$PaymentModel.f72725a) && Intrinsics.f(this.f72726b, psePendingPaymentExtension$PaymentModel.f72726b) && Intrinsics.f(this.f72727c, psePendingPaymentExtension$PaymentModel.f72727c);
    }

    public final int hashCode() {
        int iHashCode = this.f72725a.hashCode() * 31;
        PseAuthorisationRequestPaymentFrom pseAuthorisationRequestPaymentFrom = this.f72726b;
        int iHashCode2 = (iHashCode + (pseAuthorisationRequestPaymentFrom == null ? 0 : pseAuthorisationRequestPaymentFrom.hashCode())) * 31;
        ApmQuote apmQuote = this.f72727c;
        return iHashCode2 + (apmQuote != null ? apmQuote.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72725a, i);
        PseAuthorisationRequestPaymentFrom pseAuthorisationRequestPaymentFrom = this.f72726b;
        if (pseAuthorisationRequestPaymentFrom == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pseAuthorisationRequestPaymentFrom.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f72727c, i);
    }
}
