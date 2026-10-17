package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBenefitsSectionItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoBenefitsSectionItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoBenefitsSectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82366c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubInfoBenefitsSectionItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoBenefitsSectionItem[i];
        }
    }

    public CobrandedCardsPlanHubInfoBenefitsSectionItem(String str, String title, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82364a = str;
        this.f82365b = title;
        this.f82366c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoBenefitsSectionItem)) {
            return false;
        }
        CobrandedCardsPlanHubInfoBenefitsSectionItem cobrandedCardsPlanHubInfoBenefitsSectionItem = (CobrandedCardsPlanHubInfoBenefitsSectionItem) obj2;
        return Intrinsics.f(this.f82364a, cobrandedCardsPlanHubInfoBenefitsSectionItem.f82364a) && Intrinsics.f(this.f82365b, cobrandedCardsPlanHubInfoBenefitsSectionItem.f82365b) && Intrinsics.f(this.f82366c, cobrandedCardsPlanHubInfoBenefitsSectionItem.f82366c);
    }

    public final int hashCode() {
        String str = this.f82364a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f82365b);
        String str2 = this.f82366c;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82364a);
        dest.writeString(this.f82365b);
        dest.writeString(this.f82366c);
    }
}
