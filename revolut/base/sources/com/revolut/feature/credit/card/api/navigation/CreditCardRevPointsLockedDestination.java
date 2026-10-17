package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardRevPointsLockedDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardRevPointsLockedDestination implements CreditCardKompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68971b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CreditCardRevPointsLockedDestination> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.credit.card.api.navigation.CreditCardRevPointsLockedDestination$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardRevPointsLockedDestination((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardRevPointsLockedDestination[i];
        }
    }

    public CreditCardRevPointsLockedDestination(d overdueMoney, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(overdueMoney, "overdueMoney");
        this.f68970a = facilityId;
        this.f68971b = overdueMoney;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardRevPointsLockedDestination)) {
            return false;
        }
        CreditCardRevPointsLockedDestination creditCardRevPointsLockedDestination = (CreditCardRevPointsLockedDestination) obj2;
        return Intrinsics.f(this.f68970a, creditCardRevPointsLockedDestination.f68970a) && Intrinsics.f(this.f68971b, creditCardRevPointsLockedDestination.f68971b);
    }

    public final int hashCode() {
        return this.f68971b.hashCode() + (this.f68970a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68970a);
        dest.writeSerializable(this.f68971b);
    }
}
