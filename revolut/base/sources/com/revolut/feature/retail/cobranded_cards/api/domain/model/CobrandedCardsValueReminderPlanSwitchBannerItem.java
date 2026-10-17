package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderPlanSwitchBannerItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderPlanSwitchBannerItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderPlanSwitchBannerItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82478c;
    public final CobrandedCardsValueReminderAction d;
    public final CobrandedCardsValueReminderPlanSwitchBannerPlan e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsValueReminderPlanSwitchBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), CobrandedCardsValueReminderAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CobrandedCardsValueReminderPlanSwitchBannerPlan.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderPlanSwitchBannerItem[i];
        }
    }

    public CobrandedCardsValueReminderPlanSwitchBannerItem(String icon, String title, String subtitle, CobrandedCardsValueReminderAction action, CobrandedCardsValueReminderPlanSwitchBannerPlan cobrandedCardsValueReminderPlanSwitchBannerPlan) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f82476a = icon;
        this.f82477b = title;
        this.f82478c = subtitle;
        this.d = action;
        this.e = cobrandedCardsValueReminderPlanSwitchBannerPlan;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminderPlanSwitchBannerItem)) {
            return false;
        }
        CobrandedCardsValueReminderPlanSwitchBannerItem cobrandedCardsValueReminderPlanSwitchBannerItem = (CobrandedCardsValueReminderPlanSwitchBannerItem) obj2;
        return Intrinsics.f(this.f82476a, cobrandedCardsValueReminderPlanSwitchBannerItem.f82476a) && Intrinsics.f(this.f82477b, cobrandedCardsValueReminderPlanSwitchBannerItem.f82477b) && Intrinsics.f(this.f82478c, cobrandedCardsValueReminderPlanSwitchBannerItem.f82478c) && Intrinsics.f(this.d, cobrandedCardsValueReminderPlanSwitchBannerItem.d) && Intrinsics.f(this.e, cobrandedCardsValueReminderPlanSwitchBannerItem.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f82476a.hashCode() * 31, 31, this.f82477b), 31, this.f82478c)) * 31;
        CobrandedCardsValueReminderPlanSwitchBannerPlan cobrandedCardsValueReminderPlanSwitchBannerPlan = this.e;
        return iHashCode + (cobrandedCardsValueReminderPlanSwitchBannerPlan == null ? 0 : cobrandedCardsValueReminderPlanSwitchBannerPlan.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82476a);
        dest.writeString(this.f82477b);
        dest.writeString(this.f82478c);
        this.d.writeToParcel(dest, i);
        CobrandedCardsValueReminderPlanSwitchBannerPlan cobrandedCardsValueReminderPlanSwitchBannerPlan = this.e;
        if (cobrandedCardsValueReminderPlanSwitchBannerPlan == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderPlanSwitchBannerPlan.writeToParcel(dest, i);
        }
    }
}
