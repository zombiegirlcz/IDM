package com.revolut.feature.push_to_card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferReviewInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PushToCardTransferReviewInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PushToCardTransferReviewInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushToCardTransferData f81539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOwner f81540b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PushToCardTransferReviewInputData((CardOwner) parcel.readParcelable(PushToCardTransferReviewInputData.class.getClassLoader()), PushToCardTransferData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushToCardTransferReviewInputData[i];
        }
    }

    public PushToCardTransferReviewInputData(CardOwner recipient, PushToCardTransferData pushToCardData) {
        Intrinsics.checkNotNullParameter(pushToCardData, "pushToCardData");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f81539a = pushToCardData;
        this.f81540b = recipient;
    }

    /* JADX INFO: renamed from: R6, reason: from getter */
    public final CardOwner getF81540b() {
        return this.f81540b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PushToCardTransferData getF81539a() {
        return this.f81539a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81539a.writeToParcel(dest, i);
        dest.writeParcelable(this.f81540b, i);
    }
}
