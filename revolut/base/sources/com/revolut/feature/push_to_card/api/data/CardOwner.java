package com.revolut.feature.push_to_card.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/data/CardOwner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOwner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardOwner> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81492c;
    public final String d;
    public final String e;
    public final wpa.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Card f81493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f81494h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardOwner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), wpa.a.valueOf(parcel.readString()), Card.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOwner[i];
        }
    }

    public CardOwner(String id10, String firstName, String lastName, String str, String str2, wpa.a type, Card card, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(card, "card");
        this.f81490a = id10;
        this.f81491b = firstName;
        this.f81492c = lastName;
        this.d = str;
        this.e = str2;
        this.f = type;
        this.f81493g = card;
        this.f81494h = z;
    }

    public final String a() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f81491b, " ", this.f81492c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardOwner)) {
            return false;
        }
        CardOwner cardOwner = (CardOwner) obj2;
        return Intrinsics.f(this.f81490a, cardOwner.f81490a) && Intrinsics.f(this.f81491b, cardOwner.f81491b) && Intrinsics.f(this.f81492c, cardOwner.f81492c) && Intrinsics.f(this.d, cardOwner.d) && Intrinsics.f(this.e, cardOwner.e) && this.f == cardOwner.f && Intrinsics.f(this.f81493g, cardOwner.f81493g) && this.f81494h == cardOwner.f81494h;
    }

    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF81490a() {
        return this.f81490a;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f81490a.hashCode() * 31, 31, this.f81491b), 31, this.f81492c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f81494h) + ((this.f81493g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81490a);
        dest.writeString(this.f81491b);
        dest.writeString(this.f81492c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        this.f81493g.writeToParcel(dest, i);
        dest.writeInt(this.f81494h ? 1 : 0);
    }
}
