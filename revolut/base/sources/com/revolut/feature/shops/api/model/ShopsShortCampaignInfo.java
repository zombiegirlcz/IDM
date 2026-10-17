package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsShortCampaignInfo;", "Lcom/revolut/feature/shops/api/model/ShopsCampaignDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsShortCampaignInfo implements ShopsCampaignDetails, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsShortCampaignInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87074c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsShortCampaignInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsShortCampaignInfo[i];
        }
    }

    public ShopsShortCampaignInfo(String campaignId, String source, String str) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f87072a = campaignId;
        this.f87073b = source;
        this.f87074c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsShortCampaignInfo)) {
            return false;
        }
        ShopsShortCampaignInfo shopsShortCampaignInfo = (ShopsShortCampaignInfo) obj2;
        return Intrinsics.f(this.f87072a, shopsShortCampaignInfo.f87072a) && Intrinsics.f(this.f87073b, shopsShortCampaignInfo.f87073b) && Intrinsics.f(this.f87074c, shopsShortCampaignInfo.f87074c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f87072a.hashCode() * 31, 31, this.f87073b);
        String str = this.f87074c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87072a);
        dest.writeString(this.f87073b);
        dest.writeString(this.f87074c);
    }
}
