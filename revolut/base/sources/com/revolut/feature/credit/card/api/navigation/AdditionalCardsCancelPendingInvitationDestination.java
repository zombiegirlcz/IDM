package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/AdditionalCardsCancelPendingInvitationDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalCardsCancelPendingInvitationDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<AdditionalCardsCancelPendingInvitationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68890c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalCardsCancelPendingInvitationDestination(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalCardsCancelPendingInvitationDestination[i];
        }
    }

    public AdditionalCardsCancelPendingInvitationDestination(String facilityId, String cardholderId, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f68888a = facilityId;
        this.f68889b = cardholderId;
        this.f68890c = firstName;
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
        if (!(obj2 instanceof AdditionalCardsCancelPendingInvitationDestination)) {
            return false;
        }
        AdditionalCardsCancelPendingInvitationDestination additionalCardsCancelPendingInvitationDestination = (AdditionalCardsCancelPendingInvitationDestination) obj2;
        return Intrinsics.f(this.f68888a, additionalCardsCancelPendingInvitationDestination.f68888a) && Intrinsics.f(this.f68889b, additionalCardsCancelPendingInvitationDestination.f68889b) && Intrinsics.f(this.f68890c, additionalCardsCancelPendingInvitationDestination.f68890c) && Intrinsics.f(this.d, additionalCardsCancelPendingInvitationDestination.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f68888a.hashCode() * 31, 31, this.f68889b), 31, this.f68890c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68888a);
        dest.writeString(this.f68889b);
        dest.writeString(this.f68890c);
        dest.writeString(this.d);
    }
}
