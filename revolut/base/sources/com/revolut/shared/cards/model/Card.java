package com.revolut.shared.cards.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/cards/model/Card;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Card implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o5l.b f104690c;
    public final Clause d;
    public final String e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f104691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CardDetailsDesignConfig f104692h;
    public final String i;

    @NotNull
    public static final Parcelable.Creator<Card> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Card(parcel.readString(), parcel.readInt() != 0, o5l.b.valueOf(parcel.readString()), (Clause) parcel.readParcelable(Card.class.getClassLoader()), parcel.readString(), (Clause) parcel.readParcelable(Card.class.getClassLoader()), (Clause) parcel.readParcelable(Card.class.getClassLoader()), parcel.readInt() == 0 ? null : CardDetailsDesignConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Card[i];
        }
    }

    static {
        new Card("", true, o5l.b.NONE, null, null, null, null, null, null);
    }

    public Card(String id10, boolean z, o5l.b brand, Clause clause, String str, Clause clause2, Clause clause3, CardDetailsDesignConfig cardDetailsDesignConfig, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.f104688a = id10;
        this.f104689b = z;
        this.f104690c = brand;
        this.d = clause;
        this.e = str;
        this.f = clause2;
        this.f104691g = clause3;
        this.f104692h = cardDetailsDesignConfig;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Card)) {
            return false;
        }
        Card card = (Card) obj2;
        return Intrinsics.f(this.f104688a, card.f104688a) && this.f104689b == card.f104689b && this.f104690c == card.f104690c && Intrinsics.f(this.d, card.d) && Intrinsics.f(this.e, card.e) && Intrinsics.f(this.f, card.f) && Intrinsics.f(this.f104691g, card.f104691g) && Intrinsics.f(this.f104692h, card.f104692h) && Intrinsics.f(this.i, card.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f104690c.hashCode() + a.c(this.f104688a.hashCode() * 31, 31, this.f104689b)) * 31;
        Clause clause = this.d;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Clause clause2 = this.f;
        int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f104691g;
        int iHashCode5 = (iHashCode4 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        CardDetailsDesignConfig cardDetailsDesignConfig = this.f104692h;
        int iHashCode6 = (iHashCode5 + (cardDetailsDesignConfig == null ? 0 : cardDetailsDesignConfig.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104688a);
        dest.writeInt(this.f104689b ? 1 : 0);
        dest.writeString(this.f104690c.name());
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f104691g, i);
        CardDetailsDesignConfig cardDetailsDesignConfig = this.f104692h;
        if (cardDetailsDesignConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardDetailsDesignConfig.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
    }
}
