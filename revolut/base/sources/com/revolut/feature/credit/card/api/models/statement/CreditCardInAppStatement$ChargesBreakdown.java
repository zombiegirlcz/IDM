package com.revolut.feature.credit.card.api.models.statement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/models/statement/CreditCardInAppStatement$ChargesBreakdown", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInAppStatement$ChargesBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInAppStatement$ChargesBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInAppStatement$Charge f68872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardInAppStatement$Charge f68873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardInAppStatement$Charge f68874c;
    public final CreditCardInAppStatement$Charge d;
    public final CreditCardInAppStatement$Charge e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInAppStatement$ChargesBreakdown(parcel.readInt() == 0 ? null : CreditCardInAppStatement$Charge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditCardInAppStatement$Charge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditCardInAppStatement$Charge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditCardInAppStatement$Charge.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreditCardInAppStatement$Charge.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInAppStatement$ChargesBreakdown[i];
        }
    }

    public CreditCardInAppStatement$ChargesBreakdown(CreditCardInAppStatement$Charge creditCardInAppStatement$Charge, CreditCardInAppStatement$Charge creditCardInAppStatement$Charge2, CreditCardInAppStatement$Charge creditCardInAppStatement$Charge3, CreditCardInAppStatement$Charge creditCardInAppStatement$Charge4, CreditCardInAppStatement$Charge creditCardInAppStatement$Charge5) {
        this.f68872a = creditCardInAppStatement$Charge;
        this.f68873b = creditCardInAppStatement$Charge2;
        this.f68874c = creditCardInAppStatement$Charge3;
        this.d = creditCardInAppStatement$Charge4;
        this.e = creditCardInAppStatement$Charge5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInAppStatement$ChargesBreakdown)) {
            return false;
        }
        CreditCardInAppStatement$ChargesBreakdown creditCardInAppStatement$ChargesBreakdown = (CreditCardInAppStatement$ChargesBreakdown) obj2;
        return Intrinsics.f(this.f68872a, creditCardInAppStatement$ChargesBreakdown.f68872a) && Intrinsics.f(this.f68873b, creditCardInAppStatement$ChargesBreakdown.f68873b) && Intrinsics.f(this.f68874c, creditCardInAppStatement$ChargesBreakdown.f68874c) && Intrinsics.f(this.d, creditCardInAppStatement$ChargesBreakdown.d) && Intrinsics.f(this.e, creditCardInAppStatement$ChargesBreakdown.e);
    }

    public final int hashCode() {
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge = this.f68872a;
        int iHashCode = (creditCardInAppStatement$Charge == null ? 0 : creditCardInAppStatement$Charge.hashCode()) * 31;
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge2 = this.f68873b;
        int iHashCode2 = (iHashCode + (creditCardInAppStatement$Charge2 == null ? 0 : creditCardInAppStatement$Charge2.hashCode())) * 31;
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge3 = this.f68874c;
        int iHashCode3 = (iHashCode2 + (creditCardInAppStatement$Charge3 == null ? 0 : creditCardInAppStatement$Charge3.hashCode())) * 31;
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge4 = this.d;
        int iHashCode4 = (iHashCode3 + (creditCardInAppStatement$Charge4 == null ? 0 : creditCardInAppStatement$Charge4.hashCode())) * 31;
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge5 = this.e;
        return iHashCode4 + (creditCardInAppStatement$Charge5 != null ? creditCardInAppStatement$Charge5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge = this.f68872a;
        if (creditCardInAppStatement$Charge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardInAppStatement$Charge.writeToParcel(dest, i);
        }
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge2 = this.f68873b;
        if (creditCardInAppStatement$Charge2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardInAppStatement$Charge2.writeToParcel(dest, i);
        }
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge3 = this.f68874c;
        if (creditCardInAppStatement$Charge3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardInAppStatement$Charge3.writeToParcel(dest, i);
        }
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge4 = this.d;
        if (creditCardInAppStatement$Charge4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardInAppStatement$Charge4.writeToParcel(dest, i);
        }
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge5 = this.e;
        if (creditCardInAppStatement$Charge5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardInAppStatement$Charge5.writeToParcel(dest, i);
        }
    }
}
