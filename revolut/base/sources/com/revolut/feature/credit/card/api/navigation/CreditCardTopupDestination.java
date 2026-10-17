package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardTopupDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardTopupDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreditCardTopupDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KompotDestination f68982c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardTopupDestination(parcel.readString(), (d) parcel.readSerializable(), (KompotDestination) parcel.readParcelable(CreditCardTopupDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardTopupDestination[i];
        }
    }

    public CreditCardTopupDestination(String facilityId, d dVar, KompotDestination kompotDestination) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f68980a = facilityId;
        this.f68981b = dVar;
        this.f68982c = kompotDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardTopupDestination)) {
            return false;
        }
        CreditCardTopupDestination creditCardTopupDestination = (CreditCardTopupDestination) obj2;
        return Intrinsics.f(this.f68980a, creditCardTopupDestination.f68980a) && Intrinsics.f(this.f68981b, creditCardTopupDestination.f68981b) && Intrinsics.f(this.f68982c, creditCardTopupDestination.f68982c);
    }

    public final int hashCode() {
        int iHashCode = this.f68980a.hashCode() * 31;
        d dVar = this.f68981b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        KompotDestination kompotDestination = this.f68982c;
        return iHashCode2 + (kompotDestination != null ? kompotDestination.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68980a);
        dest.writeSerializable(this.f68981b);
        dest.writeParcelable(this.f68982c, i);
    }

    public /* synthetic */ CreditCardTopupDestination(String str, KompotDestination kompotDestination, int i) {
        this(str, (d) null, (i & 4) != 0 ? null : kompotDestination);
    }
}
