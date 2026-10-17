package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r5b.p;
import r5b.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderActionConfirmationItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderActionConfirmationItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderActionConfirmationItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82456c;
    public final String d;
    public final String e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f82457g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsValueReminderActionConfirmationItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : p.valueOf(parcel.readString()), q.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderActionConfirmationItem[i];
        }
    }

    public CobrandedCardsValueReminderActionConfirmationItem(String title, String str, String str2, String str3, String str4, p pVar, q style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f82454a = title;
        this.f82455b = str;
        this.f82456c = str2;
        this.d = str3;
        this.e = str4;
        this.f = pVar;
        this.f82457g = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminderActionConfirmationItem)) {
            return false;
        }
        CobrandedCardsValueReminderActionConfirmationItem cobrandedCardsValueReminderActionConfirmationItem = (CobrandedCardsValueReminderActionConfirmationItem) obj2;
        return Intrinsics.f(this.f82454a, cobrandedCardsValueReminderActionConfirmationItem.f82454a) && Intrinsics.f(this.f82455b, cobrandedCardsValueReminderActionConfirmationItem.f82455b) && Intrinsics.f(this.f82456c, cobrandedCardsValueReminderActionConfirmationItem.f82456c) && Intrinsics.f(this.d, cobrandedCardsValueReminderActionConfirmationItem.d) && Intrinsics.f(this.e, cobrandedCardsValueReminderActionConfirmationItem.e) && this.f == cobrandedCardsValueReminderActionConfirmationItem.f && this.f82457g == cobrandedCardsValueReminderActionConfirmationItem.f82457g;
    }

    public final int hashCode() {
        int iHashCode = this.f82454a.hashCode() * 31;
        String str = this.f82455b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82456c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        p pVar = this.f;
        return this.f82457g.hashCode() + ((iHashCode5 + (pVar != null ? pVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82454a);
        dest.writeString(this.f82455b);
        dest.writeString(this.f82456c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        p pVar = this.f;
        if (pVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(pVar.name());
        }
        dest.writeString(this.f82457g.name());
    }
}
