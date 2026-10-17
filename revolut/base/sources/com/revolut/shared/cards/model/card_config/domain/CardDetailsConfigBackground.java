package com.revolut.shared.cards.model.card_config.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/cards/model/card_config/domain/CardDetailsConfigBackground;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDetailsConfigBackground implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardDetailsConfigBackground> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104699c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDetailsConfigBackground(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDetailsConfigBackground[i];
        }
    }

    public CardDetailsConfigBackground(String str, String str2, String str3, String str4) {
        this.f104697a = str;
        this.f104698b = str2;
        this.f104699c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDetailsConfigBackground)) {
            return false;
        }
        CardDetailsConfigBackground cardDetailsConfigBackground = (CardDetailsConfigBackground) obj2;
        return Intrinsics.f(this.f104697a, cardDetailsConfigBackground.f104697a) && Intrinsics.f(this.f104698b, cardDetailsConfigBackground.f104698b) && Intrinsics.f(this.f104699c, cardDetailsConfigBackground.f104699c) && Intrinsics.f(this.d, cardDetailsConfigBackground.d);
    }

    public final int hashCode() {
        String str = this.f104697a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104698b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104699c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104697a);
        dest.writeString(this.f104698b);
        dest.writeString(this.f104699c);
        dest.writeString(this.d);
    }
}
