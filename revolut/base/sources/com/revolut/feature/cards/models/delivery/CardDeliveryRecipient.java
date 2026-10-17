package com.revolut.feature.cards.models.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/cards/models/delivery/CardDeliveryRecipient;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDeliveryRecipient implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<CardDeliveryRecipient> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65528c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDeliveryRecipient(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDeliveryRecipient[i];
        }
    }

    public CardDeliveryRecipient(String firstName, String lastName, String phone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f65526a = firstName;
        this.f65527b = lastName;
        this.f65528c = phone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDeliveryRecipient)) {
            return false;
        }
        CardDeliveryRecipient cardDeliveryRecipient = (CardDeliveryRecipient) obj2;
        return Intrinsics.f(this.f65526a, cardDeliveryRecipient.f65526a) && Intrinsics.f(this.f65527b, cardDeliveryRecipient.f65527b) && Intrinsics.f(this.f65528c, cardDeliveryRecipient.f65528c);
    }

    public final int hashCode() {
        return this.f65528c.hashCode() + p.a.c(this.f65526a.hashCode() * 31, 31, this.f65527b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65526a);
        dest.writeString(this.f65527b);
        dest.writeString(this.f65528c);
    }
}
