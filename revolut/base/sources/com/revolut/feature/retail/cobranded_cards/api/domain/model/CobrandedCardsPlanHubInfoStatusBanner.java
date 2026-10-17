package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoStatusBanner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoStatusBanner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoStatusBanner> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82408c;
    public final boolean d;
    public final CobrandedCardsPlanHubInfoBannerAction e;
    public final CobrandedCardsPlanHubInfoBannerInfo f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubInfoStatusBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoBannerAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CobrandedCardsPlanHubInfoBannerInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoStatusBanner[i];
        }
    }

    public CobrandedCardsPlanHubInfoStatusBanner(String title, String str, String str2, boolean z, CobrandedCardsPlanHubInfoBannerAction cobrandedCardsPlanHubInfoBannerAction, CobrandedCardsPlanHubInfoBannerInfo cobrandedCardsPlanHubInfoBannerInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82406a = title;
        this.f82407b = str;
        this.f82408c = str2;
        this.d = z;
        this.e = cobrandedCardsPlanHubInfoBannerAction;
        this.f = cobrandedCardsPlanHubInfoBannerInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoStatusBanner)) {
            return false;
        }
        CobrandedCardsPlanHubInfoStatusBanner cobrandedCardsPlanHubInfoStatusBanner = (CobrandedCardsPlanHubInfoStatusBanner) obj2;
        return Intrinsics.f(this.f82406a, cobrandedCardsPlanHubInfoStatusBanner.f82406a) && Intrinsics.f(this.f82407b, cobrandedCardsPlanHubInfoStatusBanner.f82407b) && Intrinsics.f(this.f82408c, cobrandedCardsPlanHubInfoStatusBanner.f82408c) && this.d == cobrandedCardsPlanHubInfoStatusBanner.d && Intrinsics.f(this.e, cobrandedCardsPlanHubInfoStatusBanner.e) && Intrinsics.f(this.f, cobrandedCardsPlanHubInfoStatusBanner.f);
    }

    public final int hashCode() {
        int iHashCode = this.f82406a.hashCode() * 31;
        String str = this.f82407b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82408c;
        int iC = j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        CobrandedCardsPlanHubInfoBannerAction cobrandedCardsPlanHubInfoBannerAction = this.e;
        int iHashCode3 = (iC + (cobrandedCardsPlanHubInfoBannerAction == null ? 0 : cobrandedCardsPlanHubInfoBannerAction.hashCode())) * 31;
        CobrandedCardsPlanHubInfoBannerInfo cobrandedCardsPlanHubInfoBannerInfo = this.f;
        return iHashCode3 + (cobrandedCardsPlanHubInfoBannerInfo != null ? cobrandedCardsPlanHubInfoBannerInfo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82406a);
        dest.writeString(this.f82407b);
        dest.writeString(this.f82408c);
        dest.writeInt(this.d ? 1 : 0);
        CobrandedCardsPlanHubInfoBannerAction cobrandedCardsPlanHubInfoBannerAction = this.e;
        if (cobrandedCardsPlanHubInfoBannerAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoBannerAction.writeToParcel(dest, i);
        }
        CobrandedCardsPlanHubInfoBannerInfo cobrandedCardsPlanHubInfoBannerInfo = this.f;
        if (cobrandedCardsPlanHubInfoBannerInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoBannerInfo.writeToParcel(dest, i);
        }
    }
}
