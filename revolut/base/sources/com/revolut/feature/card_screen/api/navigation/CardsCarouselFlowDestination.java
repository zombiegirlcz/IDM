package com.revolut.feature.card_screen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b93.d;
import com.revolut.cards.shared.ui.screen.transition.CardsCarouselTransition;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import h30.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n63.b;
import n63.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardsCarouselFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/card_screen/api/navigation/CardsCarouselFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsCarouselFlowDestination extends InternalDestination<CardsCarouselFlowInputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardsCarouselFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f65355c;
    public final d d;
    public final AccountId e;
    public final CardScreenAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n63.a f65356g;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsCarouselFlowDestination(parcel.readString(), b.valueOf(parcel.readString()), d.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CardsCarouselFlowDestination.class.getClassLoader()), (CardScreenAction) parcel.readParcelable(CardsCarouselFlowDestination.class.getClassLoader()), n63.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsCarouselFlowDestination[i];
        }
    }

    public CardsCarouselFlowDestination() {
        this(null, null, null, null, null, null, 63);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0 */
    public final TransitionAnimation getF63151a() {
        int i = e.f212707a[this.f65356g.ordinal()];
        if (i == 1) {
            return new CardsCarouselTransition((Object) null);
        }
        if (i == 2) {
            return com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsCarouselFlowDestination)) {
            return false;
        }
        CardsCarouselFlowDestination cardsCarouselFlowDestination = (CardsCarouselFlowDestination) obj2;
        return Intrinsics.f(this.f65354b, cardsCarouselFlowDestination.f65354b) && this.f65355c == cardsCarouselFlowDestination.f65355c && this.d == cardsCarouselFlowDestination.d && Intrinsics.f(this.e, cardsCarouselFlowDestination.e) && Intrinsics.f(this.f, cardsCarouselFlowDestination.f) && this.f65356g == cardsCarouselFlowDestination.f65356g;
    }

    public final int hashCode() {
        String str = this.f65354b;
        return this.f65356g.hashCode() + ((this.f.hashCode() + l.b(this.e, (this.d.hashCode() + ((this.f65355c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65354b);
        dest.writeString(this.f65355c.name());
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f65356g.name());
    }

    public /* synthetic */ CardsCarouselFlowDestination(String str, b bVar, d dVar, AccountId accountId, CardScreenAction cardScreenAction, n63.a aVar, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? b.RETAIL : bVar, (i & 4) != 0 ? d.RETAIL : dVar, (i & 8) != 0 ? AccountId.Personal.f51414a : accountId, (i & 16) != 0 ? CardScreenAction.Idle.f65329a : cardScreenAction, (i & 32) != 0 ? n63.a.Default : aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsCarouselFlowDestination(String str, b flow, d cardScope, AccountId accountId, CardScreenAction action, n63.a transitionAnimation) {
        super(new CardsCarouselFlowInputData(str, cardScope, accountId, action));
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(transitionAnimation, "transitionAnimation");
        this.f65354b = str;
        this.f65355c = flow;
        this.d = cardScope;
        this.e = accountId;
        this.f = action;
        this.f65356g = transitionAnimation;
    }
}
