package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoCardBenefitItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoCardBenefitItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoCardBenefitItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82372c;
    public final Boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CobrandedCardsPlanHubInfoCardBenefitItem(string, string2, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoCardBenefitItem[i];
        }
    }

    public CobrandedCardsPlanHubInfoCardBenefitItem(String icon, String title, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82370a = icon;
        this.f82371b = title;
        this.f82372c = str;
        this.d = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoCardBenefitItem)) {
            return false;
        }
        CobrandedCardsPlanHubInfoCardBenefitItem cobrandedCardsPlanHubInfoCardBenefitItem = (CobrandedCardsPlanHubInfoCardBenefitItem) obj2;
        return Intrinsics.f(this.f82370a, cobrandedCardsPlanHubInfoCardBenefitItem.f82370a) && Intrinsics.f(this.f82371b, cobrandedCardsPlanHubInfoCardBenefitItem.f82371b) && Intrinsics.f(this.f82372c, cobrandedCardsPlanHubInfoCardBenefitItem.f82372c) && Intrinsics.f(this.d, cobrandedCardsPlanHubInfoCardBenefitItem.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f82370a.hashCode() * 31, 31, this.f82371b);
        String str = this.f82372c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82370a);
        dest.writeString(this.f82371b);
        dest.writeString(this.f82372c);
        Boolean bool = this.d;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
