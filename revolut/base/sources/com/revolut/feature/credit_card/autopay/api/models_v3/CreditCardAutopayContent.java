package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAutopayContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardAutopayContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AmountSelection f70702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackupCardContent f70703b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardAutopayContent(AmountSelection.CREATOR.createFromParcel(parcel), BackupCardContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAutopayContent[i];
        }
    }

    public CreditCardAutopayContent(AmountSelection amountSelection, BackupCardContent backupCard) {
        Intrinsics.checkNotNullParameter(amountSelection, "amountSelection");
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f70702a = amountSelection;
        this.f70703b = backupCard;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAutopayContent)) {
            return false;
        }
        CreditCardAutopayContent creditCardAutopayContent = (CreditCardAutopayContent) obj2;
        return Intrinsics.f(this.f70702a, creditCardAutopayContent.f70702a) && Intrinsics.f(this.f70703b, creditCardAutopayContent.f70703b);
    }

    public final int hashCode() {
        return this.f70703b.hashCode() + (this.f70702a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f70702a.writeToParcel(dest, i);
        this.f70703b.writeToParcel(dest, i);
    }
}
