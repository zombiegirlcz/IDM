package com.revolut.feature.push_to_card.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/data/Card;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Card implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Card> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81487c;
    public final String d;
    public final String e;
    public final Address f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f81488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f81489h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Card(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(Card.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Card[i];
        }
    }

    public Card(String lastFour, String billingCurrency, String scheme, String issuerName, String issuerCountry, Address address, String str, String str2) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(billingCurrency, "billingCurrency");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(issuerName, "issuerName");
        Intrinsics.checkNotNullParameter(issuerCountry, "issuerCountry");
        this.f81485a = lastFour;
        this.f81486b = billingCurrency;
        this.f81487c = scheme;
        this.d = issuerName;
        this.e = issuerCountry;
        this.f = address;
        this.f81488g = str;
        this.f81489h = str2;
    }

    public final boolean a() {
        b.Companion.getClass();
        wi0.a aVar = b.Companion;
        if (!Intrinsics.f(this.e, "HR")) {
            return false;
        }
        xi0.b.Companion.getClass();
        return Intrinsics.f(this.f81486b, xi0.b.f306279q.f306286a);
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
        return Intrinsics.f(this.f81485a, card.f81485a) && Intrinsics.f(this.f81486b, card.f81486b) && Intrinsics.f(this.f81487c, card.f81487c) && Intrinsics.f(this.d, card.d) && Intrinsics.f(this.e, card.e) && Intrinsics.f(this.f, card.f) && Intrinsics.f(this.f81488g, card.f81488g) && Intrinsics.f(this.f81489h, card.f81489h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f81485a.hashCode() * 31, 31, this.f81486b), 31, this.f81487c), 31, this.d), 31, this.e);
        Address address = this.f;
        int iHashCode = (iC + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.f81488g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81489h;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81485a);
        dest.writeString(this.f81486b);
        dest.writeString(this.f81487c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f81488g);
        dest.writeString(this.f81489h);
    }
}
