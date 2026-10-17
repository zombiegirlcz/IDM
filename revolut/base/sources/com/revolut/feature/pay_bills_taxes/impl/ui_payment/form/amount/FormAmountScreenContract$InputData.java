package com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui_payment/form/amount/FormAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormAmountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FormAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f78784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f78786c;
    public final String d;
    public final LocalDate e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(FormAmountScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new FormAmountScreenContract$InputData(gVarValueOf, arrayList, (d) parcel.readSerializable(), parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormAmountScreenContract$InputData[i];
        }
    }

    public FormAmountScreenContract$InputData(g paymentMethod, List inputs, d amount, String str, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f78784a = paymentMethod;
        this.f78785b = inputs;
        this.f78786c = amount;
        this.d = str;
        this.e = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormAmountScreenContract$InputData)) {
            return false;
        }
        FormAmountScreenContract$InputData formAmountScreenContract$InputData = (FormAmountScreenContract$InputData) obj2;
        return this.f78784a == formAmountScreenContract$InputData.f78784a && Intrinsics.f(this.f78785b, formAmountScreenContract$InputData.f78785b) && Intrinsics.f(this.f78786c, formAmountScreenContract$InputData.f78786c) && Intrinsics.f(this.d, formAmountScreenContract$InputData.d) && Intrinsics.f(this.e, formAmountScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.d(this.f78784a.hashCode() * 31, 31, this.f78785b), 31, this.f78786c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.e;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78784a.name());
        Iterator itV = p.a.v(this.f78785b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeSerializable(this.f78786c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
    }
}
