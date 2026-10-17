package com.revolut.feature.card_screen.impl.kompot.cards_carousel;

import android.os.Parcel;
import android.os.Parcelable;
import b93.d;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n63.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_carousel/CardsCarouselFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsCarouselFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardsCarouselFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f65376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f65377c;
    public final AccountId d;
    public final CardScreenAction e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsCarouselFlowContract$InputData(parcel.readString(), b.valueOf(parcel.readString()), d.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CardsCarouselFlowContract$InputData.class.getClassLoader()), (CardScreenAction) parcel.readParcelable(CardsCarouselFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsCarouselFlowContract$InputData[i];
        }
    }

    public CardsCarouselFlowContract$InputData(String str, b flowName, d cardScope, AccountId accountId, CardScreenAction action) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f65375a = str;
        this.f65376b = flowName;
        this.f65377c = cardScope;
        this.d = accountId;
        this.e = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsCarouselFlowContract$InputData)) {
            return false;
        }
        CardsCarouselFlowContract$InputData cardsCarouselFlowContract$InputData = (CardsCarouselFlowContract$InputData) obj2;
        return Intrinsics.f(this.f65375a, cardsCarouselFlowContract$InputData.f65375a) && this.f65376b == cardsCarouselFlowContract$InputData.f65376b && this.f65377c == cardsCarouselFlowContract$InputData.f65377c && Intrinsics.f(this.d, cardsCarouselFlowContract$InputData.d) && Intrinsics.f(this.e, cardsCarouselFlowContract$InputData.e);
    }

    public final int hashCode() {
        String str = this.f65375a;
        return this.e.hashCode() + l.b(this.d, (this.f65377c.hashCode() + ((this.f65376b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65375a);
        dest.writeString(this.f65376b.name());
        dest.writeString(this.f65377c.name());
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
