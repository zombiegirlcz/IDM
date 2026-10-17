package com.revolut.feature.rev_points.impl.ui.transactions.related;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/impl/ui/transactions/related/RevPointsRelatedTransactionsBottomSheetControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsRelatedTransactionsBottomSheetControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsRelatedTransactionsBottomSheetControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f83899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f83900b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsRelatedTransactionsBottomSheetControllerContract$InputData(parcel.createStringArrayList(), (RevPoints) parcel.readParcelable(RevPointsRelatedTransactionsBottomSheetControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsRelatedTransactionsBottomSheetControllerContract$InputData[i];
        }
    }

    public RevPointsRelatedTransactionsBottomSheetControllerContract$InputData(List relatedLoyaltyTransactionIds, RevPoints totalEarnedPoints) {
        Intrinsics.checkNotNullParameter(relatedLoyaltyTransactionIds, "relatedLoyaltyTransactionIds");
        Intrinsics.checkNotNullParameter(totalEarnedPoints, "totalEarnedPoints");
        this.f83899a = relatedLoyaltyTransactionIds;
        this.f83900b = totalEarnedPoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsRelatedTransactionsBottomSheetControllerContract$InputData)) {
            return false;
        }
        RevPointsRelatedTransactionsBottomSheetControllerContract$InputData revPointsRelatedTransactionsBottomSheetControllerContract$InputData = (RevPointsRelatedTransactionsBottomSheetControllerContract$InputData) obj2;
        return Intrinsics.f(this.f83899a, revPointsRelatedTransactionsBottomSheetControllerContract$InputData.f83899a) && Intrinsics.f(this.f83900b, revPointsRelatedTransactionsBottomSheetControllerContract$InputData.f83900b);
    }

    public final int hashCode() {
        return this.f83900b.f83960a.hashCode() + (this.f83899a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f83899a);
        dest.writeParcelable(this.f83900b, i);
    }
}
