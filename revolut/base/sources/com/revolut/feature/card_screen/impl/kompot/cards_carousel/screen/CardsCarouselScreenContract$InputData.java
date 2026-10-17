package com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsCarouselScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardsCarouselScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b93.d f65407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f65408c;
    public final CardScreenAction d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b93.d dVarValueOf = b93.d.valueOf(parcel.readString());
            AccountId accountId = (AccountId) parcel.readParcelable(CardsCarouselScreenContract$InputData.class.getClassLoader());
            CardScreenAction cardScreenAction = (CardScreenAction) parcel.readParcelable(CardsCarouselScreenContract$InputData.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new CardsCarouselScreenContract$InputData(string, dVarValueOf, accountId, cardScreenAction, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsCarouselScreenContract$InputData[i];
        }
    }

    public CardsCarouselScreenContract$InputData(String str, b93.d cardScope, AccountId accountId, CardScreenAction action, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f65406a = str;
        this.f65407b = cardScope;
        this.f65408c = accountId;
        this.d = action;
        this.e = z;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsCarouselScreenContract$InputData)) {
            return false;
        }
        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = (CardsCarouselScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65406a, cardsCarouselScreenContract$InputData.f65406a) && this.f65407b == cardsCarouselScreenContract$InputData.f65407b && Intrinsics.f(this.f65408c, cardsCarouselScreenContract$InputData.f65408c) && Intrinsics.f(this.d, cardsCarouselScreenContract$InputData.d) && this.e == cardsCarouselScreenContract$InputData.e && this.f == cardsCarouselScreenContract$InputData.f;
    }

    public final int hashCode() {
        String str = this.f65406a;
        return Boolean.hashCode(this.f) + j6.a.c((this.d.hashCode() + l.b(this.f65408c, (this.f65407b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65406a);
        dest.writeString(this.f65407b.name());
        dest.writeParcelable(this.f65408c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
