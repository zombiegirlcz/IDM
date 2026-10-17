package com.revolut.retail.feature.pending_payments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$ActionsBottomSheet", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Accept;", "", "toString", "()Ljava/lang/String;", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PendingPaymentResult$ActionsBottomSheet implements PendingPaymentResult$Accept {

    @NotNull
    public static final Parcelable.Creator<PendingPaymentResult$ActionsBottomSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f102409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f102410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f102411c;
    public final ParcelableDestination d;
    public final ParcelableDestination e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PendingPaymentResult$ActionsBottomSheet((Clause) parcel.readParcelable(PendingPaymentResult$ActionsBottomSheet.class.getClassLoader()), (Clause) parcel.readParcelable(PendingPaymentResult$ActionsBottomSheet.class.getClassLoader()), (Clause) parcel.readParcelable(PendingPaymentResult$ActionsBottomSheet.class.getClassLoader()), (ParcelableDestination) parcel.readParcelable(PendingPaymentResult$ActionsBottomSheet.class.getClassLoader()), (ParcelableDestination) parcel.readParcelable(PendingPaymentResult$ActionsBottomSheet.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPaymentResult$ActionsBottomSheet[i];
        }
    }

    public PendingPaymentResult$ActionsBottomSheet(Clause titleClause, Clause clause, Clause actionClause, ParcelableDestination parcelableDestination, ParcelableDestination parcelableDestination2) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(actionClause, "actionClause");
        this.f102409a = titleClause;
        this.f102410b = clause;
        this.f102411c = actionClause;
        this.d = parcelableDestination;
        this.e = parcelableDestination2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PendingPaymentResult$ActionsBottomSheet)) {
            return false;
        }
        PendingPaymentResult$ActionsBottomSheet pendingPaymentResult$ActionsBottomSheet = (PendingPaymentResult$ActionsBottomSheet) obj2;
        return Intrinsics.f(this.f102409a, pendingPaymentResult$ActionsBottomSheet.f102409a) && Intrinsics.f(this.f102410b, pendingPaymentResult$ActionsBottomSheet.f102410b) && Intrinsics.f(this.f102411c, pendingPaymentResult$ActionsBottomSheet.f102411c) && Intrinsics.f(this.d, pendingPaymentResult$ActionsBottomSheet.d) && Intrinsics.f(this.e, pendingPaymentResult$ActionsBottomSheet.e);
    }

    public final int hashCode() {
        int iHashCode = this.f102409a.hashCode() * 31;
        Clause clause = this.f102410b;
        int iA = p.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f102411c);
        ParcelableDestination parcelableDestination = this.d;
        int iHashCode2 = (iA + (parcelableDestination == null ? 0 : parcelableDestination.hashCode())) * 31;
        ParcelableDestination parcelableDestination2 = this.e;
        return iHashCode2 + (parcelableDestination2 != null ? parcelableDestination2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102409a, i);
        dest.writeParcelable(this.f102410b, i);
        dest.writeParcelable(this.f102411c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
