package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/AdditionalCardsDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalCardsDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<AdditionalCardsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitionAnimation f68895b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalCardsDestination(parcel.readString(), (TransitionAnimation) parcel.readParcelable(AdditionalCardsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalCardsDestination[i];
        }
    }

    public AdditionalCardsDestination(String facilityId, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f68894a = facilityId;
        this.f68895b = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF68895b() {
        return this.f68895b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalCardsDestination)) {
            return false;
        }
        AdditionalCardsDestination additionalCardsDestination = (AdditionalCardsDestination) obj2;
        return Intrinsics.f(this.f68894a, additionalCardsDestination.f68894a) && Intrinsics.f(this.f68895b, additionalCardsDestination.f68895b);
    }

    public final int hashCode() {
        int iHashCode = this.f68894a.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f68895b;
        return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68894a);
        dest.writeParcelable(this.f68895b, i);
    }
}
