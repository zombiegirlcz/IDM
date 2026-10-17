package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_price_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_price_breakdown/EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f101392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f101393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f101394c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Instant instant = (Instant) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData(instant, dVar, arrayList, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData(Instant updatedInvoiceDueDate, d planFee, List phoneNumbers, d totalDueAmount) {
        Intrinsics.checkNotNullParameter(updatedInvoiceDueDate, "updatedInvoiceDueDate");
        Intrinsics.checkNotNullParameter(planFee, "planFee");
        Intrinsics.checkNotNullParameter(phoneNumbers, "phoneNumbers");
        Intrinsics.checkNotNullParameter(totalDueAmount, "totalDueAmount");
        this.f101392a = updatedInvoiceDueDate;
        this.f101393b = planFee;
        this.f101394c = phoneNumbers;
        this.d = totalDueAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData = (EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101392a, esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.f101392a) && Intrinsics.f(this.f101393b, esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.f101393b) && Intrinsics.f(this.f101394c, esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.f101394c) && Intrinsics.f(this.d, esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(v7.c(this.f101392a.hashCode() * 31, 31, this.f101393b), 31, this.f101394c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101392a);
        dest.writeSerializable(this.f101393b);
        Iterator itV = p.a.v(this.f101394c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeSerializable(this.d);
    }
}
