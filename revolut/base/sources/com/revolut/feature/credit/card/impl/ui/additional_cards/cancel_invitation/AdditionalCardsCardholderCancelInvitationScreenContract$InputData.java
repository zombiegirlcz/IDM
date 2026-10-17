package com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/additional_cards/cancel_invitation/AdditionalCardsCardholderCancelInvitationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalCardsCardholderCancelInvitationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AdditionalCardsCardholderCancelInvitationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69003c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalCardsCardholderCancelInvitationScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalCardsCardholderCancelInvitationScreenContract$InputData[i];
        }
    }

    public AdditionalCardsCardholderCancelInvitationScreenContract$InputData(String facilityId, String cardholderId, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f69001a = facilityId;
        this.f69002b = cardholderId;
        this.f69003c = firstName;
        this.d = lastName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalCardsCardholderCancelInvitationScreenContract$InputData)) {
            return false;
        }
        AdditionalCardsCardholderCancelInvitationScreenContract$InputData additionalCardsCardholderCancelInvitationScreenContract$InputData = (AdditionalCardsCardholderCancelInvitationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69001a, additionalCardsCardholderCancelInvitationScreenContract$InputData.f69001a) && Intrinsics.f(this.f69002b, additionalCardsCardholderCancelInvitationScreenContract$InputData.f69002b) && Intrinsics.f(this.f69003c, additionalCardsCardholderCancelInvitationScreenContract$InputData.f69003c) && Intrinsics.f(this.d, additionalCardsCardholderCancelInvitationScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f69001a.hashCode() * 31, 31, this.f69002b), 31, this.f69003c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69001a);
        dest.writeString(this.f69002b);
        dest.writeString(this.f69003c);
        dest.writeString(this.d);
    }
}
