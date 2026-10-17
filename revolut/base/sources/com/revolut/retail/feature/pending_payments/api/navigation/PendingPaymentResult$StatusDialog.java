package com.revolut.retail.feature.pending_payments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$StatusDialog", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Decline;", "", "toString", "()Ljava/lang/String;", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PendingPaymentResult$StatusDialog implements PendingPaymentResult$Decline {

    @NotNull
    public static final Parcelable.Creator<PendingPaymentResult$StatusDialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f102415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f102416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParcelableDestination f102417c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PendingPaymentResult$StatusDialog((Clause) parcel.readParcelable(PendingPaymentResult$StatusDialog.class.getClassLoader()), (Clause) parcel.readParcelable(PendingPaymentResult$StatusDialog.class.getClassLoader()), (ParcelableDestination) parcel.readParcelable(PendingPaymentResult$StatusDialog.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPaymentResult$StatusDialog[i];
        }
    }

    public PendingPaymentResult$StatusDialog(Clause titleClause, Clause clause, ParcelableDestination parcelableDestination) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f102415a = titleClause;
        this.f102416b = clause;
        this.f102417c = parcelableDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PendingPaymentResult$StatusDialog)) {
            return false;
        }
        PendingPaymentResult$StatusDialog pendingPaymentResult$StatusDialog = (PendingPaymentResult$StatusDialog) obj2;
        return Intrinsics.f(this.f102415a, pendingPaymentResult$StatusDialog.f102415a) && Intrinsics.f(this.f102416b, pendingPaymentResult$StatusDialog.f102416b) && Intrinsics.f(this.f102417c, pendingPaymentResult$StatusDialog.f102417c);
    }

    public final int hashCode() {
        int iHashCode = this.f102415a.hashCode() * 31;
        Clause clause = this.f102416b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        ParcelableDestination parcelableDestination = this.f102417c;
        return iHashCode2 + (parcelableDestination != null ? parcelableDestination.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102415a, i);
        dest.writeParcelable(this.f102416b, i);
        dest.writeParcelable(this.f102417c, i);
    }
}
