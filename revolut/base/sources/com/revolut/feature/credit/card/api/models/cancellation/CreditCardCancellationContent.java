package com.revolut.feature.credit.card.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/cancellation/CreditCardCancellationContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCancellationContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardCancellationContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardCancellationPrompt f68704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardDialogModel f68705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardCancellationSuccessSheet f68706c;
    public final CreditCardCancellationDetails d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardCancellationContent(CreditCardCancellationPrompt.CREATOR.createFromParcel(parcel), CreditCardDialogModel.CREATOR.createFromParcel(parcel), CreditCardCancellationSuccessSheet.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditCardCancellationDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCancellationContent[i];
        }
    }

    public CreditCardCancellationContent(CreditCardCancellationPrompt prompt, CreditCardDialogModel withdrawalNotice, CreditCardCancellationSuccessSheet successSheet, CreditCardCancellationDetails creditCardCancellationDetails) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(withdrawalNotice, "withdrawalNotice");
        Intrinsics.checkNotNullParameter(successSheet, "successSheet");
        this.f68704a = prompt;
        this.f68705b = withdrawalNotice;
        this.f68706c = successSheet;
        this.d = creditCardCancellationDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCancellationContent)) {
            return false;
        }
        CreditCardCancellationContent creditCardCancellationContent = (CreditCardCancellationContent) obj2;
        return Intrinsics.f(this.f68704a, creditCardCancellationContent.f68704a) && Intrinsics.f(this.f68705b, creditCardCancellationContent.f68705b) && Intrinsics.f(this.f68706c, creditCardCancellationContent.f68706c) && Intrinsics.f(this.d, creditCardCancellationContent.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f68706c.hashCode() + ((this.f68705b.hashCode() + (this.f68704a.hashCode() * 31)) * 31)) * 31;
        CreditCardCancellationDetails creditCardCancellationDetails = this.d;
        return iHashCode + (creditCardCancellationDetails == null ? 0 : creditCardCancellationDetails.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f68704a.writeToParcel(dest, i);
        this.f68705b.writeToParcel(dest, i);
        this.f68706c.writeToParcel(dest, i);
        CreditCardCancellationDetails creditCardCancellationDetails = this.d;
        if (creditCardCancellationDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardCancellationDetails.writeToParcel(dest, i);
        }
    }
}
