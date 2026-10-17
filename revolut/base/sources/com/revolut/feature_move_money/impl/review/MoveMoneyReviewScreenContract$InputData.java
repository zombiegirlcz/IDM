package com.revolut.feature_move_money.impl.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/review/MoveMoneyReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyOrderInfo f97410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuote f97411b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoveMoneyReviewScreenContract$InputData(MoveMoneyOrderInfo.CREATOR.createFromParcel(parcel), (OrderQuote) parcel.readParcelable(MoveMoneyReviewScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyReviewScreenContract$InputData[i];
        }
    }

    public MoveMoneyReviewScreenContract$InputData(MoveMoneyOrderInfo moveMoneyOrderInfo, OrderQuote lastQuote) {
        Intrinsics.checkNotNullParameter(moveMoneyOrderInfo, "moveMoneyOrderInfo");
        Intrinsics.checkNotNullParameter(lastQuote, "lastQuote");
        this.f97410a = moveMoneyOrderInfo;
        this.f97411b = lastQuote;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyReviewScreenContract$InputData)) {
            return false;
        }
        MoveMoneyReviewScreenContract$InputData moveMoneyReviewScreenContract$InputData = (MoveMoneyReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97410a, moveMoneyReviewScreenContract$InputData.f97410a) && Intrinsics.f(this.f97411b, moveMoneyReviewScreenContract$InputData.f97411b);
    }

    public final int hashCode() {
        return this.f97411b.hashCode() + (this.f97410a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97410a.writeToParcel(dest, i);
        dest.writeParcelable(this.f97411b, i);
    }
}
