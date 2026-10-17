package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r5b.r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsWidget;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsWidget implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsWidget> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f82488c;
    public final String d;
    public final String e;
    public final CobrandedCardsWidgetNextReward f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsWidget(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : r.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? CobrandedCardsWidgetNextReward.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsWidget[i];
        }
    }

    public CobrandedCardsWidget(String headerTitle, String iconUrl, r rVar, String primaryTitle, String str, CobrandedCardsWidgetNextReward cobrandedCardsWidgetNextReward) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(primaryTitle, "primaryTitle");
        this.f82486a = headerTitle;
        this.f82487b = iconUrl;
        this.f82488c = rVar;
        this.d = primaryTitle;
        this.e = str;
        this.f = cobrandedCardsWidgetNextReward;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsWidget)) {
            return false;
        }
        CobrandedCardsWidget cobrandedCardsWidget = (CobrandedCardsWidget) obj2;
        return Intrinsics.f(this.f82486a, cobrandedCardsWidget.f82486a) && Intrinsics.f(this.f82487b, cobrandedCardsWidget.f82487b) && this.f82488c == cobrandedCardsWidget.f82488c && Intrinsics.f(this.d, cobrandedCardsWidget.d) && Intrinsics.f(this.e, cobrandedCardsWidget.e) && Intrinsics.f(this.f, cobrandedCardsWidget.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f82486a.hashCode() * 31, 31, this.f82487b);
        r rVar = this.f82488c;
        int iC2 = p.a.c((iC + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        CobrandedCardsWidgetNextReward cobrandedCardsWidgetNextReward = this.f;
        return iHashCode + (cobrandedCardsWidgetNextReward != null ? cobrandedCardsWidgetNextReward.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82486a);
        dest.writeString(this.f82487b);
        r rVar = this.f82488c;
        if (rVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(rVar.name());
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
        CobrandedCardsWidgetNextReward cobrandedCardsWidgetNextReward = this.f;
        if (cobrandedCardsWidgetNextReward == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsWidgetNextReward.writeToParcel(dest, i);
        }
    }
}
