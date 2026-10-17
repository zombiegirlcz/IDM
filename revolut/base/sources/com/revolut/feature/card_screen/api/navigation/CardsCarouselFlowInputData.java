package com.revolut.feature.card_screen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b93.d;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardsCarouselFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsCarouselFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardsCarouselFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f65358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f65359c;
    public final CardScreenAction d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsCarouselFlowInputData(parcel.readString(), d.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CardsCarouselFlowInputData.class.getClassLoader()), (CardScreenAction) parcel.readParcelable(CardsCarouselFlowInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsCarouselFlowInputData[i];
        }
    }

    public CardsCarouselFlowInputData(String str, d cardScope, AccountId accountId, CardScreenAction action) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f65357a = str;
        this.f65358b = cardScope;
        this.f65359c = accountId;
        this.d = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsCarouselFlowInputData)) {
            return false;
        }
        CardsCarouselFlowInputData cardsCarouselFlowInputData = (CardsCarouselFlowInputData) obj2;
        return Intrinsics.f(this.f65357a, cardsCarouselFlowInputData.f65357a) && this.f65358b == cardsCarouselFlowInputData.f65358b && Intrinsics.f(this.f65359c, cardsCarouselFlowInputData.f65359c) && Intrinsics.f(this.d, cardsCarouselFlowInputData.d);
    }

    public final int hashCode() {
        String str = this.f65357a;
        return this.d.hashCode() + l.b(this.f65359c, (this.f65358b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65357a);
        dest.writeString(this.f65358b.name());
        dest.writeParcelable(this.f65359c, i);
        dest.writeParcelable(this.d, i);
    }

    public CardsCarouselFlowInputData() {
        this(null, d.RETAIL, AccountId.Personal.f51414a, CardScreenAction.Idle.f65329a);
    }
}
