package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoOverview;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoOverview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoOverview> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoStatusBanner f82381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoRewardChallenge f82382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoCardBenefits f82383c;
    public final List d;
    public final CobrandedCardsPlanHubInfoBenefitsSection e;
    public final CobrandedCardsPlanHubInfoBenefitsSection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f82384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f82385h;
    public final CobrandedCardsUpsellBanner i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CobrandedCardsPlanHubInfoStatusBanner cobrandedCardsPlanHubInfoStatusBannerCreateFromParcel = parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoStatusBanner.CREATOR.createFromParcel(parcel);
            CobrandedCardsPlanHubInfoRewardChallenge cobrandedCardsPlanHubInfoRewardChallengeCreateFromParcel = parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoRewardChallenge.CREATOR.createFromParcel(parcel);
            CobrandedCardsPlanHubInfoCardBenefits cobrandedCardsPlanHubInfoCardBenefitsCreateFromParcel = parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoCardBenefits.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsPlanHubInfoManageCardOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CobrandedCardsPlanHubInfoOverview(cobrandedCardsPlanHubInfoStatusBannerCreateFromParcel, cobrandedCardsPlanHubInfoRewardChallengeCreateFromParcel, cobrandedCardsPlanHubInfoCardBenefitsCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoBenefitsSection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoBenefitsSection.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? CobrandedCardsUpsellBanner.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoOverview[i];
        }
    }

    public CobrandedCardsPlanHubInfoOverview(CobrandedCardsPlanHubInfoStatusBanner cobrandedCardsPlanHubInfoStatusBanner, CobrandedCardsPlanHubInfoRewardChallenge cobrandedCardsPlanHubInfoRewardChallenge, CobrandedCardsPlanHubInfoCardBenefits cobrandedCardsPlanHubInfoCardBenefits, List manageCardOptions, CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection, CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection2, String str, String str2, CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner) {
        Intrinsics.checkNotNullParameter(manageCardOptions, "manageCardOptions");
        this.f82381a = cobrandedCardsPlanHubInfoStatusBanner;
        this.f82382b = cobrandedCardsPlanHubInfoRewardChallenge;
        this.f82383c = cobrandedCardsPlanHubInfoCardBenefits;
        this.d = manageCardOptions;
        this.e = cobrandedCardsPlanHubInfoBenefitsSection;
        this.f = cobrandedCardsPlanHubInfoBenefitsSection2;
        this.f82384g = str;
        this.f82385h = str2;
        this.i = cobrandedCardsUpsellBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoOverview)) {
            return false;
        }
        CobrandedCardsPlanHubInfoOverview cobrandedCardsPlanHubInfoOverview = (CobrandedCardsPlanHubInfoOverview) obj2;
        return Intrinsics.f(this.f82381a, cobrandedCardsPlanHubInfoOverview.f82381a) && Intrinsics.f(this.f82382b, cobrandedCardsPlanHubInfoOverview.f82382b) && Intrinsics.f(this.f82383c, cobrandedCardsPlanHubInfoOverview.f82383c) && Intrinsics.f(this.d, cobrandedCardsPlanHubInfoOverview.d) && Intrinsics.f(this.e, cobrandedCardsPlanHubInfoOverview.e) && Intrinsics.f(this.f, cobrandedCardsPlanHubInfoOverview.f) && Intrinsics.f(this.f82384g, cobrandedCardsPlanHubInfoOverview.f82384g) && Intrinsics.f(this.f82385h, cobrandedCardsPlanHubInfoOverview.f82385h) && Intrinsics.f(this.i, cobrandedCardsPlanHubInfoOverview.i);
    }

    public final int hashCode() {
        CobrandedCardsPlanHubInfoStatusBanner cobrandedCardsPlanHubInfoStatusBanner = this.f82381a;
        int iHashCode = (cobrandedCardsPlanHubInfoStatusBanner == null ? 0 : cobrandedCardsPlanHubInfoStatusBanner.hashCode()) * 31;
        CobrandedCardsPlanHubInfoRewardChallenge cobrandedCardsPlanHubInfoRewardChallenge = this.f82382b;
        int iHashCode2 = (iHashCode + (cobrandedCardsPlanHubInfoRewardChallenge == null ? 0 : cobrandedCardsPlanHubInfoRewardChallenge.hashCode())) * 31;
        CobrandedCardsPlanHubInfoCardBenefits cobrandedCardsPlanHubInfoCardBenefits = this.f82383c;
        int iD = p.a.d((iHashCode2 + (cobrandedCardsPlanHubInfoCardBenefits == null ? 0 : cobrandedCardsPlanHubInfoCardBenefits.hashCode())) * 31, 31, this.d);
        CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection = this.e;
        int iHashCode3 = (iD + (cobrandedCardsPlanHubInfoBenefitsSection == null ? 0 : cobrandedCardsPlanHubInfoBenefitsSection.hashCode())) * 31;
        CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection2 = this.f;
        int iHashCode4 = (iHashCode3 + (cobrandedCardsPlanHubInfoBenefitsSection2 == null ? 0 : cobrandedCardsPlanHubInfoBenefitsSection2.hashCode())) * 31;
        String str = this.f82384g;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82385h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner = this.i;
        return iHashCode6 + (cobrandedCardsUpsellBanner != null ? cobrandedCardsUpsellBanner.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CobrandedCardsPlanHubInfoStatusBanner cobrandedCardsPlanHubInfoStatusBanner = this.f82381a;
        if (cobrandedCardsPlanHubInfoStatusBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoStatusBanner.writeToParcel(dest, i);
        }
        CobrandedCardsPlanHubInfoRewardChallenge cobrandedCardsPlanHubInfoRewardChallenge = this.f82382b;
        if (cobrandedCardsPlanHubInfoRewardChallenge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoRewardChallenge.writeToParcel(dest, i);
        }
        CobrandedCardsPlanHubInfoCardBenefits cobrandedCardsPlanHubInfoCardBenefits = this.f82383c;
        if (cobrandedCardsPlanHubInfoCardBenefits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoCardBenefits.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((CobrandedCardsPlanHubInfoManageCardOption) itV.next()).writeToParcel(dest, i);
        }
        CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection = this.e;
        if (cobrandedCardsPlanHubInfoBenefitsSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoBenefitsSection.writeToParcel(dest, i);
        }
        CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection2 = this.f;
        if (cobrandedCardsPlanHubInfoBenefitsSection2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoBenefitsSection2.writeToParcel(dest, i);
        }
        dest.writeString(this.f82384g);
        dest.writeString(this.f82385h);
        CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner = this.i;
        if (cobrandedCardsUpsellBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsUpsellBanner.writeToParcel(dest, i);
        }
    }
}
