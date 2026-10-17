package com.revolut.feature.card.verification.impl.flow.card_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card/verification/impl/flow/card_verification/CardVerificationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardVerificationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardVerificationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64409b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardVerificationFlowContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardVerificationFlowContract$InputData[i];
        }
    }

    public CardVerificationFlowContract$InputData(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f64408a = cardId;
        this.f64409b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardVerificationFlowContract$InputData)) {
            return false;
        }
        CardVerificationFlowContract$InputData cardVerificationFlowContract$InputData = (CardVerificationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f64408a, cardVerificationFlowContract$InputData.f64408a) && this.f64409b == cardVerificationFlowContract$InputData.f64409b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64409b) + (this.f64408a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64408a);
        dest.writeInt(this.f64409b ? 1 : 0);
    }
}
