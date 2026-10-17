package com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement_financing/down_payment/CreditCardDownPaymentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardDownPaymentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardDownPaymentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f69761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f69763c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardDownPaymentScreenContract$InputData((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardDownPaymentScreenContract$InputData[i];
        }
    }

    public CreditCardDownPaymentScreenContract$InputData(d downPayment, d minDownPayment, d maxDownPayment) {
        Intrinsics.checkNotNullParameter(downPayment, "downPayment");
        Intrinsics.checkNotNullParameter(minDownPayment, "minDownPayment");
        Intrinsics.checkNotNullParameter(maxDownPayment, "maxDownPayment");
        this.f69761a = downPayment;
        this.f69762b = minDownPayment;
        this.f69763c = maxDownPayment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardDownPaymentScreenContract$InputData)) {
            return false;
        }
        CreditCardDownPaymentScreenContract$InputData creditCardDownPaymentScreenContract$InputData = (CreditCardDownPaymentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69761a, creditCardDownPaymentScreenContract$InputData.f69761a) && Intrinsics.f(this.f69762b, creditCardDownPaymentScreenContract$InputData.f69762b) && Intrinsics.f(this.f69763c, creditCardDownPaymentScreenContract$InputData.f69763c);
    }

    public final int hashCode() {
        return this.f69763c.hashCode() + v7.c(this.f69761a.hashCode() * 31, 31, this.f69762b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f69761a);
        dest.writeSerializable(this.f69762b);
        dest.writeSerializable(this.f69763c);
    }
}
