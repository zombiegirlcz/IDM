package com.revolut.feature.push_to_card.impl.ui.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/push_to_card/impl/ui/review/PushToCardTransferReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushToCardTransferReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PushToCardTransferReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f81620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PushToCardTransferData f81621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81622c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PushToCardTransferReviewScreenContract$InputData((CardOwner) parcel.readParcelable(PushToCardTransferReviewScreenContract$InputData.class.getClassLoader()), (PushToCardTransferData) parcel.readParcelable(PushToCardTransferReviewScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushToCardTransferReviewScreenContract$InputData[i];
        }
    }

    public PushToCardTransferReviewScreenContract$InputData(CardOwner recipient, PushToCardTransferData transferData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f81620a = recipient;
        this.f81621b = transferData;
        this.f81622c = z;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PushToCardTransferReviewScreenContract$InputData)) {
            return false;
        }
        PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData = (PushToCardTransferReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f81620a, pushToCardTransferReviewScreenContract$InputData.f81620a) && Intrinsics.f(this.f81621b, pushToCardTransferReviewScreenContract$InputData.f81621b) && this.f81622c == pushToCardTransferReviewScreenContract$InputData.f81622c && this.d == pushToCardTransferReviewScreenContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f81621b.hashCode() + (this.f81620a.hashCode() * 31)) * 31, 31, this.f81622c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81620a, i);
        dest.writeParcelable(this.f81621b, i);
        dest.writeInt(this.f81622c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ PushToCardTransferReviewScreenContract$InputData(CardOwner cardOwner, PushToCardTransferData pushToCardTransferData, int i) {
        this(cardOwner, pushToCardTransferData, false, (i & 8) != 0);
    }
}
