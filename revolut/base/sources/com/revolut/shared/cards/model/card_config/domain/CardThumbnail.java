package com.revolut.shared.cards.model.card_config.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/cards/model/card_config/domain/CardThumbnail;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardThumbnail implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardThumbnail> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104709c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardThumbnail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardThumbnail[i];
        }
    }

    public CardThumbnail(String str, String str2, String str3, String str4) {
        this.f104707a = str;
        this.f104708b = str2;
        this.f104709c = str3;
        this.d = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF104707a() {
        return this.f104707a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF104708b() {
        return this.f104708b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF104709c() {
        return this.f104709c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardThumbnail)) {
            return false;
        }
        CardThumbnail cardThumbnail = (CardThumbnail) obj2;
        return Intrinsics.f(this.f104707a, cardThumbnail.f104707a) && Intrinsics.f(this.f104708b, cardThumbnail.f104708b) && Intrinsics.f(this.f104709c, cardThumbnail.f104709c) && Intrinsics.f(this.d, cardThumbnail.d);
    }

    public final int hashCode() {
        String str = this.f104707a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104708b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104709c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104707a);
        dest.writeString(this.f104708b);
        dest.writeString(this.f104709c);
        dest.writeString(this.d);
    }
}
