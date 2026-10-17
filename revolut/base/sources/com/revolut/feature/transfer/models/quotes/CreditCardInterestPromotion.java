package com.revolut.feature.transfer.models.quotes;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/quotes/CreditCardInterestPromotion;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInterestPromotion implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInterestPromotion> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92275b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInterestPromotion(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInterestPromotion[i];
        }
    }

    public CreditCardInterestPromotion(long j2, String str) {
        this.f92274a = j2;
        this.f92275b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInterestPromotion)) {
            return false;
        }
        CreditCardInterestPromotion creditCardInterestPromotion = (CreditCardInterestPromotion) obj2;
        return this.f92274a == creditCardInterestPromotion.f92274a && Intrinsics.f(this.f92275b, creditCardInterestPromotion.f92275b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f92274a) * 31;
        String str = this.f92275b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f92274a);
        dest.writeString(this.f92275b);
    }
}
