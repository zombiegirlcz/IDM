package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsValueReminderCardInfo f82443c;
    public final CobrandedCardsValueReminderNextReward d;
    public final CobrandedCardsValueReminderBenefits e;
    public final CobrandedCardsValueReminderAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CobrandedCardsValueReminderAction f82444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f82445h;
    public final CobrandedCardsValueReminderPlanSwitchBanner i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CobrandedCardsValueReminderPoints f82446j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsValueReminder(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CobrandedCardsValueReminderCardInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CobrandedCardsValueReminderNextReward.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CobrandedCardsValueReminderBenefits.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CobrandedCardsValueReminderAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CobrandedCardsValueReminderAction.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : CobrandedCardsValueReminderPlanSwitchBanner.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CobrandedCardsValueReminderPoints.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminder[i];
        }
    }

    public CobrandedCardsValueReminder(String title, String str, CobrandedCardsValueReminderCardInfo cobrandedCardsValueReminderCardInfo, CobrandedCardsValueReminderNextReward cobrandedCardsValueReminderNextReward, CobrandedCardsValueReminderBenefits cobrandedCardsValueReminderBenefits, CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction, CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction2, String str2, CobrandedCardsValueReminderPlanSwitchBanner cobrandedCardsValueReminderPlanSwitchBanner, CobrandedCardsValueReminderPoints cobrandedCardsValueReminderPoints) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82441a = title;
        this.f82442b = str;
        this.f82443c = cobrandedCardsValueReminderCardInfo;
        this.d = cobrandedCardsValueReminderNextReward;
        this.e = cobrandedCardsValueReminderBenefits;
        this.f = cobrandedCardsValueReminderAction;
        this.f82444g = cobrandedCardsValueReminderAction2;
        this.f82445h = str2;
        this.i = cobrandedCardsValueReminderPlanSwitchBanner;
        this.f82446j = cobrandedCardsValueReminderPoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminder)) {
            return false;
        }
        CobrandedCardsValueReminder cobrandedCardsValueReminder = (CobrandedCardsValueReminder) obj2;
        return Intrinsics.f(this.f82441a, cobrandedCardsValueReminder.f82441a) && Intrinsics.f(this.f82442b, cobrandedCardsValueReminder.f82442b) && Intrinsics.f(this.f82443c, cobrandedCardsValueReminder.f82443c) && Intrinsics.f(this.d, cobrandedCardsValueReminder.d) && Intrinsics.f(this.e, cobrandedCardsValueReminder.e) && Intrinsics.f(this.f, cobrandedCardsValueReminder.f) && Intrinsics.f(this.f82444g, cobrandedCardsValueReminder.f82444g) && Intrinsics.f(this.f82445h, cobrandedCardsValueReminder.f82445h) && Intrinsics.f(this.i, cobrandedCardsValueReminder.i) && Intrinsics.f(this.f82446j, cobrandedCardsValueReminder.f82446j);
    }

    public final int hashCode() {
        int iHashCode = this.f82441a.hashCode() * 31;
        String str = this.f82442b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CobrandedCardsValueReminderCardInfo cobrandedCardsValueReminderCardInfo = this.f82443c;
        int iHashCode3 = (iHashCode2 + (cobrandedCardsValueReminderCardInfo == null ? 0 : cobrandedCardsValueReminderCardInfo.hashCode())) * 31;
        CobrandedCardsValueReminderNextReward cobrandedCardsValueReminderNextReward = this.d;
        int iHashCode4 = (iHashCode3 + (cobrandedCardsValueReminderNextReward == null ? 0 : cobrandedCardsValueReminderNextReward.hashCode())) * 31;
        CobrandedCardsValueReminderBenefits cobrandedCardsValueReminderBenefits = this.e;
        int iHashCode5 = (iHashCode4 + (cobrandedCardsValueReminderBenefits == null ? 0 : cobrandedCardsValueReminderBenefits.hashCode())) * 31;
        CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction = this.f;
        int iHashCode6 = (iHashCode5 + (cobrandedCardsValueReminderAction == null ? 0 : cobrandedCardsValueReminderAction.hashCode())) * 31;
        CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction2 = this.f82444g;
        int iHashCode7 = (iHashCode6 + (cobrandedCardsValueReminderAction2 == null ? 0 : cobrandedCardsValueReminderAction2.hashCode())) * 31;
        String str2 = this.f82445h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CobrandedCardsValueReminderPlanSwitchBanner cobrandedCardsValueReminderPlanSwitchBanner = this.i;
        int iHashCode9 = (iHashCode8 + (cobrandedCardsValueReminderPlanSwitchBanner == null ? 0 : cobrandedCardsValueReminderPlanSwitchBanner.hashCode())) * 31;
        CobrandedCardsValueReminderPoints cobrandedCardsValueReminderPoints = this.f82446j;
        return iHashCode9 + (cobrandedCardsValueReminderPoints != null ? cobrandedCardsValueReminderPoints.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82441a);
        dest.writeString(this.f82442b);
        CobrandedCardsValueReminderCardInfo cobrandedCardsValueReminderCardInfo = this.f82443c;
        if (cobrandedCardsValueReminderCardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderCardInfo.writeToParcel(dest, i);
        }
        CobrandedCardsValueReminderNextReward cobrandedCardsValueReminderNextReward = this.d;
        if (cobrandedCardsValueReminderNextReward == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderNextReward.writeToParcel(dest, i);
        }
        CobrandedCardsValueReminderBenefits cobrandedCardsValueReminderBenefits = this.e;
        if (cobrandedCardsValueReminderBenefits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderBenefits.writeToParcel(dest, i);
        }
        CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction = this.f;
        if (cobrandedCardsValueReminderAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderAction.writeToParcel(dest, i);
        }
        CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction2 = this.f82444g;
        if (cobrandedCardsValueReminderAction2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderAction2.writeToParcel(dest, i);
        }
        dest.writeString(this.f82445h);
        CobrandedCardsValueReminderPlanSwitchBanner cobrandedCardsValueReminderPlanSwitchBanner = this.i;
        if (cobrandedCardsValueReminderPlanSwitchBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderPlanSwitchBanner.writeToParcel(dest, i);
        }
        CobrandedCardsValueReminderPoints cobrandedCardsValueReminderPoints = this.f82446j;
        if (cobrandedCardsValueReminderPoints == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderPoints.writeToParcel(dest, i);
        }
    }
}
