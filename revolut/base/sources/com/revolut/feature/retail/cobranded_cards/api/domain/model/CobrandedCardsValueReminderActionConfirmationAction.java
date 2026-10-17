package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderActionConfirmationAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderActionConfirmationAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderActionConfirmationAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82453b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsValueReminderActionConfirmationAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderActionConfirmationAction[i];
        }
    }

    public CobrandedCardsValueReminderActionConfirmationAction(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82452a = title;
        this.f82453b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminderActionConfirmationAction)) {
            return false;
        }
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction = (CobrandedCardsValueReminderActionConfirmationAction) obj2;
        return Intrinsics.f(this.f82452a, cobrandedCardsValueReminderActionConfirmationAction.f82452a) && Intrinsics.f(this.f82453b, cobrandedCardsValueReminderActionConfirmationAction.f82453b);
    }

    public final int hashCode() {
        int iHashCode = this.f82452a.hashCode() * 31;
        String str = this.f82453b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82452a);
        dest.writeString(this.f82453b);
    }
}
