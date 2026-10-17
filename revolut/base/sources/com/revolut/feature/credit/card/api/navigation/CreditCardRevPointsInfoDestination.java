package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardRevPointsInfoDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardRevPointsInfoDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreditCardRevPointsInfoDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68969b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardRevPointsInfoDestination(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardRevPointsInfoDestination[i];
        }
    }

    public CreditCardRevPointsInfoDestination(String formattedDate, boolean z) {
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        this.f68968a = formattedDate;
        this.f68969b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardRevPointsInfoDestination)) {
            return false;
        }
        CreditCardRevPointsInfoDestination creditCardRevPointsInfoDestination = (CreditCardRevPointsInfoDestination) obj2;
        return Intrinsics.f(this.f68968a, creditCardRevPointsInfoDestination.f68968a) && this.f68969b == creditCardRevPointsInfoDestination.f68969b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68969b) + (this.f68968a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68968a);
        dest.writeInt(this.f68969b ? 1 : 0);
    }
}
