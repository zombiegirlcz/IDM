package com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_list/screen/expiring_cards_bottom_sheet/ExpiringCardsBottomSheetContract$ExpiringCardItem", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpiringCardsBottomSheetContract$ExpiringCardItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExpiringCardsBottomSheetContract$ExpiringCardItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65482c;
    public final String d;
    public final boolean e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f65484h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpiringCardsBottomSheetContract$ExpiringCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpiringCardsBottomSheetContract$ExpiringCardItem[i];
        }
    }

    public ExpiringCardsBottomSheetContract$ExpiringCardItem(String cardId, String str, String str2, String str3, boolean z, Long l2, String cardBrand, String cardCodeValue, String cardName) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(cardCodeValue, "cardCodeValue");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        this.f65480a = cardId;
        this.f65481b = str;
        this.f65482c = str2;
        this.d = str3;
        this.e = z;
        this.f = l2;
        this.f65483g = cardBrand;
        this.f65484h = cardCodeValue;
        this.i = cardName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpiringCardsBottomSheetContract$ExpiringCardItem)) {
            return false;
        }
        ExpiringCardsBottomSheetContract$ExpiringCardItem expiringCardsBottomSheetContract$ExpiringCardItem = (ExpiringCardsBottomSheetContract$ExpiringCardItem) obj2;
        return Intrinsics.f(this.f65480a, expiringCardsBottomSheetContract$ExpiringCardItem.f65480a) && Intrinsics.f(this.f65481b, expiringCardsBottomSheetContract$ExpiringCardItem.f65481b) && Intrinsics.f(this.f65482c, expiringCardsBottomSheetContract$ExpiringCardItem.f65482c) && Intrinsics.f(this.d, expiringCardsBottomSheetContract$ExpiringCardItem.d) && this.e == expiringCardsBottomSheetContract$ExpiringCardItem.e && Intrinsics.f(this.f, expiringCardsBottomSheetContract$ExpiringCardItem.f) && Intrinsics.f(this.f65483g, expiringCardsBottomSheetContract$ExpiringCardItem.f65483g) && Intrinsics.f(this.f65484h, expiringCardsBottomSheetContract$ExpiringCardItem.f65484h) && Intrinsics.f(this.i, expiringCardsBottomSheetContract$ExpiringCardItem.i);
    }

    public final int hashCode() {
        int iHashCode = this.f65480a.hashCode() * 31;
        String str = this.f65481b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65482c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iC = j6.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        Long l2 = this.f;
        return this.i.hashCode() + p.a.c(p.a.c((iC + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f65483g), 31, this.f65484h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65480a);
        dest.writeString(this.f65481b);
        dest.writeString(this.f65482c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        Long l2 = this.f;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.f65483g);
        dest.writeString(this.f65484h);
        dest.writeString(this.i);
    }
}
