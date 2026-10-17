package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f101168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f101169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f101170c;
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
                iE = j6.a.e(EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel.class, parcel, arrayList, iE, 1);
            }
            return new EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel(instant, dVar, arrayList, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel[i];
        }
    }

    public EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel(Instant updatedInvoiceDueDate, d planFee, List phoneNumbers, d totalDueAmount) {
        Intrinsics.checkNotNullParameter(updatedInvoiceDueDate, "updatedInvoiceDueDate");
        Intrinsics.checkNotNullParameter(planFee, "planFee");
        Intrinsics.checkNotNullParameter(phoneNumbers, "phoneNumbers");
        Intrinsics.checkNotNullParameter(totalDueAmount, "totalDueAmount");
        this.f101168a = updatedInvoiceDueDate;
        this.f101169b = planFee;
        this.f101170c = phoneNumbers;
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
        if (!(obj2 instanceof EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel)) {
            return false;
        }
        EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel esimMobilePlanCheckoutScreenContract$UpdatedBillParcel = (EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel) obj2;
        return Intrinsics.f(this.f101168a, esimMobilePlanCheckoutScreenContract$UpdatedBillParcel.f101168a) && Intrinsics.f(this.f101169b, esimMobilePlanCheckoutScreenContract$UpdatedBillParcel.f101169b) && Intrinsics.f(this.f101170c, esimMobilePlanCheckoutScreenContract$UpdatedBillParcel.f101170c) && Intrinsics.f(this.d, esimMobilePlanCheckoutScreenContract$UpdatedBillParcel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(v7.c(this.f101168a.hashCode() * 31, 31, this.f101169b), 31, this.f101170c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101168a);
        dest.writeSerializable(this.f101169b);
        Iterator itV = p.a.v(this.f101170c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeSerializable(this.d);
    }
}
