package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsValueReminderActionConfirmation f82448b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsValueReminderAction(parcel.readString(), parcel.readInt() == 0 ? null : CobrandedCardsValueReminderActionConfirmation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderAction[i];
        }
    }

    public CobrandedCardsValueReminderAction(String title, CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82447a = title;
        this.f82448b = cobrandedCardsValueReminderActionConfirmation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminderAction)) {
            return false;
        }
        CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction = (CobrandedCardsValueReminderAction) obj2;
        return Intrinsics.f(this.f82447a, cobrandedCardsValueReminderAction.f82447a) && Intrinsics.f(this.f82448b, cobrandedCardsValueReminderAction.f82448b);
    }

    public final int hashCode() {
        int iHashCode = this.f82447a.hashCode() * 31;
        CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = this.f82448b;
        return iHashCode + (cobrandedCardsValueReminderActionConfirmation == null ? 0 : cobrandedCardsValueReminderActionConfirmation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82447a);
        CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = this.f82448b;
        if (cobrandedCardsValueReminderActionConfirmation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderActionConfirmation.writeToParcel(dest, i);
        }
    }
}
