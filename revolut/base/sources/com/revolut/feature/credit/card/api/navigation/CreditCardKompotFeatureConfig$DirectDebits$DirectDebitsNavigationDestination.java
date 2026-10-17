package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.autopay.CreditCardAutopayRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardAutopayRequest f68952b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination(parcel.readString(), (CreditCardAutopayRequest) parcel.readParcelable(CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination[i];
        }
    }

    public CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination(String facilityId, CreditCardAutopayRequest autoPayRequest) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(autoPayRequest, "autoPayRequest");
        this.f68951a = facilityId;
        this.f68952b = autoPayRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination)) {
            return false;
        }
        CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination creditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination = (CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination) obj2;
        return Intrinsics.f(this.f68951a, creditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination.f68951a) && Intrinsics.f(this.f68952b, creditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination.f68952b);
    }

    public final int hashCode() {
        return this.f68952b.hashCode() + (this.f68951a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68951a);
        dest.writeParcelable(this.f68952b, i);
    }
}
