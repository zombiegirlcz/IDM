package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderCardInfoItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderCardInfoItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderCardInfoItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82471c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsValueReminderCardInfoItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderCardInfoItem[i];
        }
    }

    public CobrandedCardsValueReminderCardInfoItem(String str, String str2, String title, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82469a = str;
        this.f82470b = str2;
        this.f82471c = title;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminderCardInfoItem)) {
            return false;
        }
        CobrandedCardsValueReminderCardInfoItem cobrandedCardsValueReminderCardInfoItem = (CobrandedCardsValueReminderCardInfoItem) obj2;
        return Intrinsics.f(this.f82469a, cobrandedCardsValueReminderCardInfoItem.f82469a) && Intrinsics.f(this.f82470b, cobrandedCardsValueReminderCardInfoItem.f82470b) && Intrinsics.f(this.f82471c, cobrandedCardsValueReminderCardInfoItem.f82471c) && Intrinsics.f(this.d, cobrandedCardsValueReminderCardInfoItem.d);
    }

    public final int hashCode() {
        String str = this.f82469a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82470b;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f82471c);
        String str3 = this.d;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82469a);
        dest.writeString(this.f82470b);
        dest.writeString(this.f82471c);
        dest.writeString(this.d);
    }
}
