package com.revolut.feature.card_management.impl.cardlimit.domain;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/cardlimit/domain/CardLimitSetData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardLimitSetData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardLimitSetData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f64823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f64824c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardLimitSetData(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardLimitSetData[i];
        }
    }

    public CardLimitSetData(String cardId, d amount, d spent, d maxLimit) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
        this.f64822a = cardId;
        this.f64823b = amount;
        this.f64824c = spent;
        this.d = maxLimit;
    }

    public static CardLimitSetData a(CardLimitSetData cardLimitSetData, d amount) {
        String cardId = cardLimitSetData.f64822a;
        d spent = cardLimitSetData.f64824c;
        d maxLimit = cardLimitSetData.d;
        cardLimitSetData.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
        return new CardLimitSetData(cardId, amount, spent, maxLimit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardLimitSetData)) {
            return false;
        }
        CardLimitSetData cardLimitSetData = (CardLimitSetData) obj2;
        return Intrinsics.f(this.f64822a, cardLimitSetData.f64822a) && Intrinsics.f(this.f64823b, cardLimitSetData.f64823b) && Intrinsics.f(this.f64824c, cardLimitSetData.f64824c) && Intrinsics.f(this.d, cardLimitSetData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f64822a.hashCode() * 31, 31, this.f64823b), 31, this.f64824c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64822a);
        dest.writeSerializable(this.f64823b);
        dest.writeSerializable(this.f64824c);
        dest.writeSerializable(this.d);
    }
}
