package com.revolut.feature.card.verification.impl.flow.card_penny_topup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardPennyTopUpFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardPennyTopUpFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpTarget f64400c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardPennyTopUpFlowContract$InputData(parcel.readString(), parcel.readString(), (TopUpTarget) parcel.readParcelable(CardPennyTopUpFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardPennyTopUpFlowContract$InputData[i];
        }
    }

    public CardPennyTopUpFlowContract$InputData(String cardId, String currency, TopUpTarget topUpTarget) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        this.f64398a = cardId;
        this.f64399b = currency;
        this.f64400c = topUpTarget;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardPennyTopUpFlowContract$InputData)) {
            return false;
        }
        CardPennyTopUpFlowContract$InputData cardPennyTopUpFlowContract$InputData = (CardPennyTopUpFlowContract$InputData) obj2;
        return Intrinsics.f(this.f64398a, cardPennyTopUpFlowContract$InputData.f64398a) && Intrinsics.f(this.f64399b, cardPennyTopUpFlowContract$InputData.f64399b) && Intrinsics.f(this.f64400c, cardPennyTopUpFlowContract$InputData.f64400c);
    }

    public final int hashCode() {
        return this.f64400c.hashCode() + p.a.c(this.f64398a.hashCode() * 31, 31, this.f64399b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64398a);
        dest.writeString(this.f64399b);
        dest.writeParcelable(this.f64400c, i);
    }
}
