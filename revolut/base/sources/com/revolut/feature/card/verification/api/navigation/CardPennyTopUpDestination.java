package com.revolut.feature.card.verification.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/verification/api/navigation/CardPennyTopUpDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardPennyTopUpDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardPennyTopUpDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpTarget f64392c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardPennyTopUpDestination(parcel.readString(), parcel.readString(), (TopUpTarget) parcel.readParcelable(CardPennyTopUpDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardPennyTopUpDestination[i];
        }
    }

    public CardPennyTopUpDestination(String cardId, String currency, TopUpTarget topUpTarget) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        this.f64390a = cardId;
        this.f64391b = currency;
        this.f64392c = topUpTarget;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardPennyTopUpDestination)) {
            return false;
        }
        CardPennyTopUpDestination cardPennyTopUpDestination = (CardPennyTopUpDestination) obj2;
        return Intrinsics.f(this.f64390a, cardPennyTopUpDestination.f64390a) && Intrinsics.f(this.f64391b, cardPennyTopUpDestination.f64391b) && Intrinsics.f(this.f64392c, cardPennyTopUpDestination.f64392c);
    }

    public final int hashCode() {
        return this.f64392c.hashCode() + p.a.c(this.f64390a.hashCode() * 31, 31, this.f64391b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64390a);
        dest.writeString(this.f64391b);
        dest.writeParcelable(this.f64392c, i);
    }
}
