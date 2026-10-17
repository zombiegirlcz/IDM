package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsUpsellBanner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsUpsellBanner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsUpsellBanner> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsUpsellBannerText f82433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsUpsellBannerIcon f82434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82435c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsUpsellBanner(CobrandedCardsUpsellBannerText.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CobrandedCardsUpsellBannerIcon.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsUpsellBanner[i];
        }
    }

    public CobrandedCardsUpsellBanner(CobrandedCardsUpsellBannerText title, CobrandedCardsUpsellBannerIcon cobrandedCardsUpsellBannerIcon, String deeplink, String planTier) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f82433a = title;
        this.f82434b = cobrandedCardsUpsellBannerIcon;
        this.f82435c = deeplink;
        this.d = planTier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsUpsellBanner)) {
            return false;
        }
        CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner = (CobrandedCardsUpsellBanner) obj2;
        return Intrinsics.f(this.f82433a, cobrandedCardsUpsellBanner.f82433a) && Intrinsics.f(this.f82434b, cobrandedCardsUpsellBanner.f82434b) && Intrinsics.f(this.f82435c, cobrandedCardsUpsellBanner.f82435c) && Intrinsics.f(this.d, cobrandedCardsUpsellBanner.d);
    }

    public final int hashCode() {
        int iHashCode = this.f82433a.hashCode() * 31;
        CobrandedCardsUpsellBannerIcon cobrandedCardsUpsellBannerIcon = this.f82434b;
        return this.d.hashCode() + p.a.c((iHashCode + (cobrandedCardsUpsellBannerIcon == null ? 0 : cobrandedCardsUpsellBannerIcon.hashCode())) * 31, 31, this.f82435c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f82433a.writeToParcel(dest, i);
        CobrandedCardsUpsellBannerIcon cobrandedCardsUpsellBannerIcon = this.f82434b;
        if (cobrandedCardsUpsellBannerIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsUpsellBannerIcon.writeToParcel(dest, i);
        }
        dest.writeString(this.f82435c);
        dest.writeString(this.d);
    }
}
