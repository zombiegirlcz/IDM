package com.revolut.feature.referrals.promo.api.invitation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/promo/api/invitation/models/ReferralsInvitationModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_referrals_promo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferralsInvitationModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReferralsInvitationModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmptyChatInvitationPromo f81813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatInvitationPromo f81814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvitationPromo f81815c;
    public final InvitationPromo d;
    public final InvitationPromo e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            EmptyChatInvitationPromo emptyChatInvitationPromoCreateFromParcel = EmptyChatInvitationPromo.CREATOR.createFromParcel(parcel);
            ChatInvitationPromo chatInvitationPromoCreateFromParcel = ChatInvitationPromo.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<InvitationPromo> creator = InvitationPromo.CREATOR;
            return new ReferralsInvitationModel(emptyChatInvitationPromoCreateFromParcel, chatInvitationPromoCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferralsInvitationModel[i];
        }
    }

    public ReferralsInvitationModel(EmptyChatInvitationPromo emptyChat, ChatInvitationPromo chat, InvitationPromo beneficiaryProfile, InvitationPromo transactionDetails, InvitationPromo transactionFee) {
        Intrinsics.checkNotNullParameter(emptyChat, "emptyChat");
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(beneficiaryProfile, "beneficiaryProfile");
        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
        Intrinsics.checkNotNullParameter(transactionFee, "transactionFee");
        this.f81813a = emptyChat;
        this.f81814b = chat;
        this.f81815c = beneficiaryProfile;
        this.d = transactionDetails;
        this.e = transactionFee;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferralsInvitationModel)) {
            return false;
        }
        ReferralsInvitationModel referralsInvitationModel = (ReferralsInvitationModel) obj2;
        return Intrinsics.f(this.f81813a, referralsInvitationModel.f81813a) && Intrinsics.f(this.f81814b, referralsInvitationModel.f81814b) && Intrinsics.f(this.f81815c, referralsInvitationModel.f81815c) && Intrinsics.f(this.d, referralsInvitationModel.d) && Intrinsics.f(this.e, referralsInvitationModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f81815c.hashCode() + ((this.f81814b.hashCode() + (this.f81813a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81813a.writeToParcel(dest, i);
        this.f81814b.writeToParcel(dest, i);
        this.f81815c.writeToParcel(dest, i);
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
    }
}
