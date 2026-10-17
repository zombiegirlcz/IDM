package com.revolut.feature.push_to_card.api.navigation.creation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/navigation/creation/CardOwnerInfoState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOwnerInfoState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardOwnerInfoState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81551c;
    public final String d;
    public final fqa.a e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardOwnerInfoState(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), fqa.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOwnerInfoState[i];
        }
    }

    public CardOwnerInfoState(boolean z, String cardNumber, String firstName, String lastName, fqa.a cardInputMethod) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(cardInputMethod, "cardInputMethod");
        this.f81549a = z;
        this.f81550b = cardNumber;
        this.f81551c = firstName;
        this.d = lastName;
        this.e = cardInputMethod;
    }

    public static CardOwnerInfoState a(CardOwnerInfoState cardOwnerInfoState, boolean z, String str, String str2, String str3, fqa.a aVar, int i) {
        if ((i & 1) != 0) {
            z = cardOwnerInfoState.f81549a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            str = cardOwnerInfoState.f81550b;
        }
        String cardNumber = str;
        if ((i & 4) != 0) {
            str2 = cardOwnerInfoState.f81551c;
        }
        String firstName = str2;
        if ((i & 8) != 0) {
            str3 = cardOwnerInfoState.d;
        }
        String lastName = str3;
        if ((i & 16) != 0) {
            aVar = cardOwnerInfoState.e;
        }
        fqa.a cardInputMethod = aVar;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(cardInputMethod, "cardInputMethod");
        return new CardOwnerInfoState(z3, cardNumber, firstName, lastName, cardInputMethod);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardOwnerInfoState)) {
            return false;
        }
        CardOwnerInfoState cardOwnerInfoState = (CardOwnerInfoState) obj2;
        return this.f81549a == cardOwnerInfoState.f81549a && Intrinsics.f(this.f81550b, cardOwnerInfoState.f81550b) && Intrinsics.f(this.f81551c, cardOwnerInfoState.f81551c) && Intrinsics.f(this.d, cardOwnerInfoState.d) && this.e == cardOwnerInfoState.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(Boolean.hashCode(this.f81549a) * 31, 31, this.f81550b), 31, this.f81551c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f81549a ? 1 : 0);
        dest.writeString(this.f81550b);
        dest.writeString(this.f81551c);
        dest.writeString(this.d);
        dest.writeString(this.e.name());
    }
}
