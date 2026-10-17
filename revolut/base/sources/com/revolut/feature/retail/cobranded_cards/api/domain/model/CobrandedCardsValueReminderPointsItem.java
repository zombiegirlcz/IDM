package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderPointsItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderPointsItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderPointsItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82485c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsValueReminderPointsItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderPointsItem[i];
        }
    }

    public CobrandedCardsValueReminderPointsItem(String icon, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f82483a = icon;
        this.f82484b = title;
        this.f82485c = subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminderPointsItem)) {
            return false;
        }
        CobrandedCardsValueReminderPointsItem cobrandedCardsValueReminderPointsItem = (CobrandedCardsValueReminderPointsItem) obj2;
        return Intrinsics.f(this.f82483a, cobrandedCardsValueReminderPointsItem.f82483a) && Intrinsics.f(this.f82484b, cobrandedCardsValueReminderPointsItem.f82484b) && Intrinsics.f(this.f82485c, cobrandedCardsValueReminderPointsItem.f82485c);
    }

    public final int hashCode() {
        return this.f82485c.hashCode() + p.a.c(this.f82483a.hashCode() * 31, 31, this.f82484b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82483a);
        dest.writeString(this.f82484b);
        dest.writeString(this.f82485c);
    }
}
