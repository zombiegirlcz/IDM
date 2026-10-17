package com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/credit_limit_decrease/amount/CreditCardLimitDecreaseAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardLimitDecreaseAmountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardLimitDecreaseAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f69194c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardLimitDecreaseAmountScreenContract$InputData(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardLimitDecreaseAmountScreenContract$InputData[i];
        }
    }

    public CreditCardLimitDecreaseAmountScreenContract$InputData(String facilityId, d minCreditLimit, d maxCreditLimit, d nonSelectableMinCreditLimit) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
        Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
        Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
        this.f69192a = facilityId;
        this.f69193b = minCreditLimit;
        this.f69194c = maxCreditLimit;
        this.d = nonSelectableMinCreditLimit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardLimitDecreaseAmountScreenContract$InputData)) {
            return false;
        }
        CreditCardLimitDecreaseAmountScreenContract$InputData creditCardLimitDecreaseAmountScreenContract$InputData = (CreditCardLimitDecreaseAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69192a, creditCardLimitDecreaseAmountScreenContract$InputData.f69192a) && Intrinsics.f(this.f69193b, creditCardLimitDecreaseAmountScreenContract$InputData.f69193b) && Intrinsics.f(this.f69194c, creditCardLimitDecreaseAmountScreenContract$InputData.f69194c) && Intrinsics.f(this.d, creditCardLimitDecreaseAmountScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f69192a.hashCode() * 31, 31, this.f69193b), 31, this.f69194c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69192a);
        dest.writeSerializable(this.f69193b);
        dest.writeSerializable(this.f69194c);
        dest.writeSerializable(this.d);
    }
}
