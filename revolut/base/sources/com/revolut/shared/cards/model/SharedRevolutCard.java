package com.revolut.shared.cards.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/cards/model/SharedRevolutCard;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedRevolutCard implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5l.b f104694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104695c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f104696g;

    @NotNull
    public static final Parcelable.Creator<SharedRevolutCard> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedRevolutCard(parcel.readString(), m5l.b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedRevolutCard[i];
        }
    }

    static {
        new SharedRevolutCard("id", m5l.b.VISA, "code", "name", null, null, false);
    }

    public SharedRevolutCard(String id10, m5l.b cardBrand, String cardCode, String cardName, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        this.f104693a = id10;
        this.f104694b = cardBrand;
        this.f104695c = cardCode;
        this.d = cardName;
        this.e = str;
        this.f = str2;
        this.f104696g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedRevolutCard)) {
            return false;
        }
        SharedRevolutCard sharedRevolutCard = (SharedRevolutCard) obj2;
        return Intrinsics.f(this.f104693a, sharedRevolutCard.f104693a) && this.f104694b == sharedRevolutCard.f104694b && Intrinsics.f(this.f104695c, sharedRevolutCard.f104695c) && Intrinsics.f(this.d, sharedRevolutCard.d) && Intrinsics.f(this.e, sharedRevolutCard.e) && Intrinsics.f(this.f, sharedRevolutCard.f) && this.f104696g == sharedRevolutCard.f104696g;
    }

    public final int hashCode() {
        int iC = a.c(a.c((this.f104694b.hashCode() + (this.f104693a.hashCode() * 31)) * 31, 31, this.f104695c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.f104696g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104693a);
        dest.writeString(this.f104694b.name());
        dest.writeString(this.f104695c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.f104696g ? 1 : 0);
    }
}
