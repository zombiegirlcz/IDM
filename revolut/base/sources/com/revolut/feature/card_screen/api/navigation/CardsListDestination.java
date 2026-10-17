package com.revolut.feature.card_screen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b93.d;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardsListDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsListDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardsListDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardListPreSelectedVariant f65361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f65362c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsListDestination(parcel.readString(), (CardListPreSelectedVariant) parcel.readParcelable(CardsListDestination.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsListDestination[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardsListDestination() {
        this((CardListPreSelectedVariant.Tab) null, (d) (0 == true ? 1 : 0), 7);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getF65362c() {
        return this.f65362c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CardListPreSelectedVariant getF65361b() {
        return this.f65361b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF65360a() {
        return this.f65360a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsListDestination)) {
            return false;
        }
        CardsListDestination cardsListDestination = (CardsListDestination) obj2;
        return Intrinsics.f(this.f65360a, cardsListDestination.f65360a) && Intrinsics.f(this.f65361b, cardsListDestination.f65361b) && this.f65362c == cardsListDestination.f65362c;
    }

    public final int hashCode() {
        String str = this.f65360a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CardListPreSelectedVariant cardListPreSelectedVariant = this.f65361b;
        return this.f65362c.hashCode() + ((iHashCode + (cardListPreSelectedVariant != null ? cardListPreSelectedVariant.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65360a);
        dest.writeParcelable(this.f65361b, i);
        dest.writeString(this.f65362c.name());
    }

    public CardsListDestination(String str, CardListPreSelectedVariant cardListPreSelectedVariant, d cardScope) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        this.f65360a = str;
        this.f65361b = cardListPreSelectedVariant;
        this.f65362c = cardScope;
    }

    public /* synthetic */ CardsListDestination(CardListPreSelectedVariant.Tab tab2, d dVar, int i) {
        this((String) null, (i & 2) != 0 ? null : tab2, (i & 4) != 0 ? d.ALL : dVar);
    }
}
