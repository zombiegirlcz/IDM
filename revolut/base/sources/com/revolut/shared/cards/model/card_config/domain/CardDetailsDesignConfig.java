package com.revolut.shared.cards.model.card_config.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/cards/model/card_config/domain/CardDetailsDesignConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDetailsDesignConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardDetailsDesignConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardDetailsConfigBackground f104701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardDetailsConfigBackground f104702c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f104703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f104704h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f104705j;
    public final VideoBackground k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CardThumbnail f104706l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Parcelable.Creator<CardDetailsConfigBackground> creator = CardDetailsConfigBackground.CREATOR;
            return new CardDetailsDesignConfig(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : VideoBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CardThumbnail.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDetailsDesignConfig[i];
        }
    }

    public CardDetailsDesignConfig(String cardCode, CardDetailsConfigBackground frontBackground, CardDetailsConfigBackground backBackground, int i, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, VideoBackground videoBackground, CardThumbnail cardThumbnail) {
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(frontBackground, "frontBackground");
        Intrinsics.checkNotNullParameter(backBackground, "backBackground");
        this.f104700a = cardCode;
        this.f104701b = frontBackground;
        this.f104702c = backBackground;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f104703g = num;
        this.f104704h = num2;
        this.i = num3;
        this.f104705j = num4;
        this.k = videoBackground;
        this.f104706l = cardThumbnail;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF104700a() {
        return this.f104700a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CardThumbnail getF104706l() {
        return this.f104706l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDetailsDesignConfig)) {
            return false;
        }
        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) obj2;
        return Intrinsics.f(this.f104700a, cardDetailsDesignConfig.f104700a) && Intrinsics.f(this.f104701b, cardDetailsDesignConfig.f104701b) && Intrinsics.f(this.f104702c, cardDetailsDesignConfig.f104702c) && this.d == cardDetailsDesignConfig.d && this.e == cardDetailsDesignConfig.e && this.f == cardDetailsDesignConfig.f && Intrinsics.f(this.f104703g, cardDetailsDesignConfig.f104703g) && Intrinsics.f(this.f104704h, cardDetailsDesignConfig.f104704h) && Intrinsics.f(this.i, cardDetailsDesignConfig.i) && Intrinsics.f(this.f104705j, cardDetailsDesignConfig.f104705j) && Intrinsics.f(this.k, cardDetailsDesignConfig.k) && Intrinsics.f(this.f104706l, cardDetailsDesignConfig.f104706l);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, (this.f104702c.hashCode() + ((this.f104701b.hashCode() + (this.f104700a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
        Integer num = this.f104703g;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f104704h;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f104705j;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        VideoBackground videoBackground = this.k;
        int iHashCode5 = (iHashCode4 + (videoBackground == null ? 0 : videoBackground.hashCode())) * 31;
        CardThumbnail cardThumbnail = this.f104706l;
        return iHashCode5 + (cardThumbnail != null ? cardThumbnail.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104700a);
        this.f104701b.writeToParcel(dest, i);
        this.f104702c.writeToParcel(dest, i);
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        Integer num = this.f104703g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f104704h;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Integer num3 = this.i;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        Integer num4 = this.f104705j;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num4);
        }
        VideoBackground videoBackground = this.k;
        if (videoBackground == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            videoBackground.writeToParcel(dest, i);
        }
        CardThumbnail cardThumbnail = this.f104706l;
        if (cardThumbnail == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardThumbnail.writeToParcel(dest, i);
        }
    }
}
