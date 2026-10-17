package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsWidgetNextReward;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsWidgetNextReward implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsWidgetNextReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82491c;
    public final Double d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsWidgetNextReward(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsWidgetNextReward[i];
        }
    }

    public CobrandedCardsWidgetNextReward(String title, String subtitle, String icon, Double d) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f82489a = title;
        this.f82490b = subtitle;
        this.f82491c = icon;
        this.d = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsWidgetNextReward)) {
            return false;
        }
        CobrandedCardsWidgetNextReward cobrandedCardsWidgetNextReward = (CobrandedCardsWidgetNextReward) obj2;
        return Intrinsics.f(this.f82489a, cobrandedCardsWidgetNextReward.f82489a) && Intrinsics.f(this.f82490b, cobrandedCardsWidgetNextReward.f82490b) && Intrinsics.f(this.f82491c, cobrandedCardsWidgetNextReward.f82491c) && Intrinsics.f(this.d, cobrandedCardsWidgetNextReward.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f82489a.hashCode() * 31, 31, this.f82490b), 31, this.f82491c);
        Double d = this.d;
        return iC + (d == null ? 0 : d.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82489a);
        dest.writeString(this.f82490b);
        dest.writeString(this.f82491c);
        Double d = this.d;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
    }
}
