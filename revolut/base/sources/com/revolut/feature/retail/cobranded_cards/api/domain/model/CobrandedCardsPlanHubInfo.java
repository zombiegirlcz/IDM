package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82341c;
    public final CobrandedCardsPlanHubPlan d;
    public final CobrandedCardsPlanHubInfoTabs e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CobrandedCardsPlanHubPlan.CREATOR.createFromParcel(parcel), CobrandedCardsPlanHubInfoTabs.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfo[i];
        }
    }

    public CobrandedCardsPlanHubInfo(String iconUrl, String title, String str, CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan, CobrandedCardsPlanHubInfoTabs tabs) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f82339a = iconUrl;
        this.f82340b = title;
        this.f82341c = str;
        this.d = cobrandedCardsPlanHubPlan;
        this.e = tabs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfo)) {
            return false;
        }
        CobrandedCardsPlanHubInfo cobrandedCardsPlanHubInfo = (CobrandedCardsPlanHubInfo) obj2;
        return Intrinsics.f(this.f82339a, cobrandedCardsPlanHubInfo.f82339a) && Intrinsics.f(this.f82340b, cobrandedCardsPlanHubInfo.f82340b) && Intrinsics.f(this.f82341c, cobrandedCardsPlanHubInfo.f82341c) && Intrinsics.f(this.d, cobrandedCardsPlanHubInfo.d) && Intrinsics.f(this.e, cobrandedCardsPlanHubInfo.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f82339a.hashCode() * 31, 31, this.f82340b);
        String str = this.f82341c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = this.d;
        return this.e.hashCode() + ((iHashCode + (cobrandedCardsPlanHubPlan != null ? cobrandedCardsPlanHubPlan.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82339a);
        dest.writeString(this.f82340b);
        dest.writeString(this.f82341c);
        CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = this.d;
        if (cobrandedCardsPlanHubPlan == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubPlan.writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
    }
}
