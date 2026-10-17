package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoTabs;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoTabs implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoTabs> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoOverview f82409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoRewards f82410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoTransactions f82411c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubInfoTabs(CobrandedCardsPlanHubInfoOverview.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoRewards.CREATOR.createFromParcel(parcel), CobrandedCardsPlanHubInfoTransactions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoTabs[i];
        }
    }

    public CobrandedCardsPlanHubInfoTabs(CobrandedCardsPlanHubInfoOverview overview, CobrandedCardsPlanHubInfoRewards cobrandedCardsPlanHubInfoRewards, CobrandedCardsPlanHubInfoTransactions transactions) {
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f82409a = overview;
        this.f82410b = cobrandedCardsPlanHubInfoRewards;
        this.f82411c = transactions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoTabs)) {
            return false;
        }
        CobrandedCardsPlanHubInfoTabs cobrandedCardsPlanHubInfoTabs = (CobrandedCardsPlanHubInfoTabs) obj2;
        return Intrinsics.f(this.f82409a, cobrandedCardsPlanHubInfoTabs.f82409a) && Intrinsics.f(this.f82410b, cobrandedCardsPlanHubInfoTabs.f82410b) && Intrinsics.f(this.f82411c, cobrandedCardsPlanHubInfoTabs.f82411c);
    }

    public final int hashCode() {
        int iHashCode = this.f82409a.hashCode() * 31;
        CobrandedCardsPlanHubInfoRewards cobrandedCardsPlanHubInfoRewards = this.f82410b;
        return this.f82411c.f82414a.hashCode() + ((iHashCode + (cobrandedCardsPlanHubInfoRewards == null ? 0 : cobrandedCardsPlanHubInfoRewards.f82405a.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f82409a.writeToParcel(dest, i);
        CobrandedCardsPlanHubInfoRewards cobrandedCardsPlanHubInfoRewards = this.f82410b;
        if (cobrandedCardsPlanHubInfoRewards == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoRewards.writeToParcel(dest, i);
        }
        this.f82411c.writeToParcel(dest, i);
    }
}
