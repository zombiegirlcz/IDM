package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.t;
import xl2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CardCellItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "Lxl2/t;", "", "Lxl2/u;", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardCellItem implements BackendItem, t, u {

    @NotNull
    public static final Parcelable.Creator<CardCellItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63341c;
    public final BackendCard d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardCellItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BackendCard.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardCellItem[i];
        }
    }

    public CardCellItem(String id10, String cardId, String cardType, BackendCard backendCard) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        this.f63339a = id10;
        this.f63340b = cardId;
        this.f63341c = cardType;
        this.d = backendCard;
    }

    public static CardCellItem d(CardCellItem cardCellItem, BackendCard backendCard) {
        String id10 = cardCellItem.f63339a;
        String cardId = cardCellItem.f63340b;
        String cardType = cardCellItem.f63341c;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        return new CardCellItem(id10, cardId, cardType, backendCard);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63339a() {
        return this.f63339a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardCellItem)) {
            return false;
        }
        CardCellItem cardCellItem = (CardCellItem) obj2;
        return Intrinsics.f(this.f63339a, cardCellItem.f63339a) && Intrinsics.f(this.f63340b, cardCellItem.f63340b) && Intrinsics.f(this.f63341c, cardCellItem.f63341c) && Intrinsics.f(this.d, cardCellItem.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f63339a.hashCode() * 31, 31, this.f63340b), 31, this.f63341c);
        BackendCard backendCard = this.d;
        return iC + (backendCard == null ? 0 : backendCard.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63339a);
        dest.writeString(this.f63340b);
        dest.writeString(this.f63341c);
        BackendCard backendCard = this.d;
        if (backendCard == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            backendCard.writeToParcel(dest, i);
        }
    }
}
