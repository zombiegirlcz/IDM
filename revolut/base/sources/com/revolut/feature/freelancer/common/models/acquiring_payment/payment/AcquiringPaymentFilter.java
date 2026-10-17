package com.revolut.feature.freelancer.common.models.acquiring_payment.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pr6.k;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_payment/payment/AcquiringPaymentFilter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AcquiringPaymentFilter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AcquiringPaymentFilter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f73367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FilteringDateRange f73368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f73369c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iD = 0;
            while (iD != i) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
            }
            FilteringDateRange filteringDateRange = (FilteringDateRange) parcel.readParcelable(AcquiringPaymentFilter.class.getClassLoader());
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashSet2.add(lr6.a.valueOf(parcel.readString()));
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                linkedHashSet3.add(k.valueOf(parcel.readString()));
            }
            return new AcquiringPaymentFilter(linkedHashSet, filteringDateRange, linkedHashSet2, linkedHashSet3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcquiringPaymentFilter[i];
        }
    }

    public AcquiringPaymentFilter() {
        this(0);
    }

    public static AcquiringPaymentFilter a(AcquiringPaymentFilter acquiringPaymentFilter, Set currencies, FilteringDateRange filteringDateRange, Set states, Set paymentMethods, int i) {
        if ((i & 1) != 0) {
            currencies = acquiringPaymentFilter.f73367a;
        }
        if ((i & 2) != 0) {
            filteringDateRange = acquiringPaymentFilter.f73368b;
        }
        if ((i & 4) != 0) {
            states = acquiringPaymentFilter.f73369c;
        }
        if ((i & 8) != 0) {
            paymentMethods = acquiringPaymentFilter.d;
        }
        acquiringPaymentFilter.getClass();
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        return new AcquiringPaymentFilter(currencies, filteringDateRange, states, paymentMethods);
    }

    public final boolean b() {
        return this.f73367a.isEmpty() && this.f73368b == null && this.f73369c.isEmpty() && this.d.isEmpty();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AcquiringPaymentFilter)) {
            return false;
        }
        AcquiringPaymentFilter acquiringPaymentFilter = (AcquiringPaymentFilter) obj2;
        return Intrinsics.f(this.f73367a, acquiringPaymentFilter.f73367a) && Intrinsics.f(this.f73368b, acquiringPaymentFilter.f73368b) && Intrinsics.f(this.f73369c, acquiringPaymentFilter.f73369c) && Intrinsics.f(this.d, acquiringPaymentFilter.d);
    }

    public final int hashCode() {
        int iHashCode = this.f73367a.hashCode() * 31;
        FilteringDateRange filteringDateRange = this.f73368b;
        return this.d.hashCode() + p.a.f((iHashCode + (filteringDateRange == null ? 0 : filteringDateRange.hashCode())) * 31, 31, this.f73369c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f73367a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeParcelable(this.f73368b, i);
        Iterator itV2 = n.v(this.f73369c, dest);
        while (itV2.hasNext()) {
            dest.writeString(((lr6.a) itV2.next()).name());
        }
        Iterator itV3 = n.v(this.d, dest);
        while (itV3.hasNext()) {
            dest.writeString(((k) itV3.next()).name());
        }
    }

    public AcquiringPaymentFilter(Set currencies, FilteringDateRange filteringDateRange, Set states, Set paymentMethods) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.f73367a = currencies;
        this.f73368b = filteringDateRange;
        this.f73369c = states;
        this.d = paymentMethods;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcquiringPaymentFilter(int i) {
        h0 h0Var = h0.f322473a;
        this(h0Var, null, h0Var, h0Var);
    }
}
