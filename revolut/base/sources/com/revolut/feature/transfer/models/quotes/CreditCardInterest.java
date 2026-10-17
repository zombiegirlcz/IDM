package com.revolut.feature.transfer.models.quotes;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/quotes/CreditCardInterest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInterest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInterest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92273c;
    public final CreditCardInterestPromotion d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInterest((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CreditCardInterestPromotion.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInterest[i];
        }
    }

    public CreditCardInterest(d dailyAmount, String str, String str2, CreditCardInterestPromotion creditCardInterestPromotion) {
        Intrinsics.checkNotNullParameter(dailyAmount, "dailyAmount");
        this.f92271a = dailyAmount;
        this.f92272b = str;
        this.f92273c = str2;
        this.d = creditCardInterestPromotion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInterest)) {
            return false;
        }
        CreditCardInterest creditCardInterest = (CreditCardInterest) obj2;
        return Intrinsics.f(this.f92271a, creditCardInterest.f92271a) && Intrinsics.f(this.f92272b, creditCardInterest.f92272b) && Intrinsics.f(this.f92273c, creditCardInterest.f92273c) && Intrinsics.f(this.d, creditCardInterest.d);
    }

    public final int hashCode() {
        int iHashCode = this.f92271a.hashCode() * 31;
        String str = this.f92272b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92273c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CreditCardInterestPromotion creditCardInterestPromotion = this.d;
        return iHashCode3 + (creditCardInterestPromotion != null ? creditCardInterestPromotion.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92271a);
        dest.writeString(this.f92272b);
        dest.writeString(this.f92273c);
        CreditCardInterestPromotion creditCardInterestPromotion = this.d;
        if (creditCardInterestPromotion == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardInterestPromotion.writeToParcel(dest, i);
        }
    }
}
