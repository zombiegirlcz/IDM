package com.revolut.retail.feature.pending_payments.impl.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/impl/common/PendingPaymentBottomSheetInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pending_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PendingPaymentBottomSheetInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PendingPaymentBottomSheetInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f102419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f102420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f102421c;
    public final ParcelableDestination d;
    public final ParcelableDestination e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PendingPaymentBottomSheetInputData((Clause) parcel.readParcelable(PendingPaymentBottomSheetInputData.class.getClassLoader()), (Clause) parcel.readParcelable(PendingPaymentBottomSheetInputData.class.getClassLoader()), (Clause) parcel.readParcelable(PendingPaymentBottomSheetInputData.class.getClassLoader()), (ParcelableDestination) parcel.readParcelable(PendingPaymentBottomSheetInputData.class.getClassLoader()), (ParcelableDestination) parcel.readParcelable(PendingPaymentBottomSheetInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPaymentBottomSheetInputData[i];
        }
    }

    public PendingPaymentBottomSheetInputData(Clause titleClause, Clause clause, Clause actionClause, ParcelableDestination parcelableDestination, ParcelableDestination parcelableDestination2) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(actionClause, "actionClause");
        this.f102419a = titleClause;
        this.f102420b = clause;
        this.f102421c = actionClause;
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
        if (!(obj2 instanceof PendingPaymentBottomSheetInputData)) {
            return false;
        }
        PendingPaymentBottomSheetInputData pendingPaymentBottomSheetInputData = (PendingPaymentBottomSheetInputData) obj2;
        return Intrinsics.f(this.f102419a, pendingPaymentBottomSheetInputData.f102419a) && Intrinsics.f(this.f102420b, pendingPaymentBottomSheetInputData.f102420b) && Intrinsics.f(this.f102421c, pendingPaymentBottomSheetInputData.f102421c) && Intrinsics.f(this.d, pendingPaymentBottomSheetInputData.d) && Intrinsics.f(this.e, pendingPaymentBottomSheetInputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f102419a.hashCode() * 31;
        Clause clause = this.f102420b;
        int iA = p.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f102421c);
        ParcelableDestination parcelableDestination = this.d;
        int iHashCode2 = (iA + (parcelableDestination == null ? 0 : parcelableDestination.hashCode())) * 31;
        ParcelableDestination parcelableDestination2 = this.e;
        return iHashCode2 + (parcelableDestination2 != null ? parcelableDestination2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102419a, i);
        dest.writeParcelable(this.f102420b, i);
        dest.writeParcelable(this.f102421c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
