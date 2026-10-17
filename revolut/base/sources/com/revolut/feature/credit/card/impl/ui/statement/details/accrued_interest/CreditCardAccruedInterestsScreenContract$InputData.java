package com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement/details/accrued_interest/CreditCardAccruedInterestsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAccruedInterestsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardAccruedInterestsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f69667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f69668c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CreditCardAccruedInterestsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CreditCardAccruedInterestsScreenContract$InputData(string, arrayList, (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAccruedInterestsScreenContract$InputData[i];
        }
    }

    public CreditCardAccruedInterestsScreenContract$InputData(String facilityId, List interests, b countryCode) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(interests, "interests");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f69666a = facilityId;
        this.f69667b = interests;
        this.f69668c = countryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAccruedInterestsScreenContract$InputData)) {
            return false;
        }
        CreditCardAccruedInterestsScreenContract$InputData creditCardAccruedInterestsScreenContract$InputData = (CreditCardAccruedInterestsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69666a, creditCardAccruedInterestsScreenContract$InputData.f69666a) && Intrinsics.f(this.f69667b, creditCardAccruedInterestsScreenContract$InputData.f69667b) && Intrinsics.f(this.f69668c, creditCardAccruedInterestsScreenContract$InputData.f69668c);
    }

    public final int hashCode() {
        return this.f69668c.f297794a.hashCode() + p.a.d(this.f69666a.hashCode() * 31, 31, this.f69667b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69666a);
        Iterator itV = p.a.v(this.f69667b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeSerializable(this.f69668c);
    }
}
