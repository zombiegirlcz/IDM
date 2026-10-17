package com.revolut.feature.freelancer.common.models.sale;

import android.os.Parcel;
import android.os.Parcelable;
import cs6.d;
import cs6.e;
import cs6.f;
import cs6.g;
import cs6.h;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/common/models/sale/FreelancerSalesFilters$CompoundFreelancerSalesFilter", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerSalesFilters$CompoundFreelancerSalesFilter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerSalesFilters$CompoundFreelancerSalesFilter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f73469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f73470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f73471c;
    public final List d;
    public final FilteringDateRange e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f73472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f73473h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iD = 0;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(f.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                arrayList2.add(e.valueOf(parcel.readString()));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            for (int i21 = 0; i21 != i6; i21++) {
                arrayList3.add(h.valueOf(parcel.readString()));
            }
            FilteringDateRange filteringDateRange = (FilteringDateRange) parcel.readParcelable(FreelancerSalesFilters$CompoundFreelancerSalesFilter.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i22 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i22);
            while (iD != i22) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
            }
            return new FreelancerSalesFilters$CompoundFreelancerSalesFilter(gVarValueOf, arrayList, arrayList2, arrayList3, filteringDateRange, string, string2, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerSalesFilters$CompoundFreelancerSalesFilter[i];
        }
    }

    public FreelancerSalesFilters$CompoundFreelancerSalesFilter() {
        this(null, 255);
    }

    public static FreelancerSalesFilters$CompoundFreelancerSalesFilter a(FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter, List list, List selectedPaymentMethods, List selectedTypes, FilteringDateRange filteringDateRange, String str, String str2, Set set, int i) {
        List selectedStatuses = list;
        g target = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73469a;
        if ((i & 2) != 0) {
            selectedStatuses = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73470b;
        }
        if ((i & 4) != 0) {
            selectedPaymentMethods = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73471c;
        }
        if ((i & 8) != 0) {
            selectedTypes = freelancerSalesFilters$CompoundFreelancerSalesFilter.d;
        }
        if ((i & 16) != 0) {
            filteringDateRange = freelancerSalesFilters$CompoundFreelancerSalesFilter.e;
        }
        if ((i & 32) != 0) {
            str = freelancerSalesFilters$CompoundFreelancerSalesFilter.f;
        }
        if ((i & 64) != 0) {
            str2 = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73472g;
        }
        if ((i & 128) != 0) {
            set = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73473h;
        }
        Set selectedCurrencies = set;
        freelancerSalesFilters$CompoundFreelancerSalesFilter.getClass();
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(selectedStatuses, "selectedStatuses");
        Intrinsics.checkNotNullParameter(selectedPaymentMethods, "selectedPaymentMethods");
        Intrinsics.checkNotNullParameter(selectedTypes, "selectedTypes");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        String str3 = str2;
        String str4 = str;
        FilteringDateRange filteringDateRange2 = filteringDateRange;
        List list2 = selectedTypes;
        return new FreelancerSalesFilters$CompoundFreelancerSalesFilter(target, selectedStatuses, selectedPaymentMethods, list2, filteringDateRange2, str4, str3, selectedCurrencies);
    }

    public final int b() {
        int i;
        int i2 = d.f108447a[this.f73469a.ordinal()];
        Set set = this.f73473h;
        String str = this.f73472g;
        String str2 = this.f;
        FilteringDateRange filteringDateRange = this.e;
        List list = this.f73470b;
        switch (i2) {
            case 1:
            case 2:
            case 3:
                if (list.isEmpty()) {
                    list = null;
                }
                i = list != null ? 1 : 0;
                List list2 = this.f73471c;
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    i++;
                }
                List list3 = this.d;
                if (list3.isEmpty()) {
                    list3 = null;
                }
                if (list3 != null) {
                    i++;
                }
                if (filteringDateRange != null) {
                    i++;
                }
                if (str2 != null || str != null) {
                    i++;
                }
                if (set.isEmpty()) {
                    set = null;
                }
                return set != null ? i + 1 : i;
            case 4:
                if (list.isEmpty()) {
                    list = null;
                }
                i = list != null ? 1 : 0;
                if (filteringDateRange != null) {
                    i++;
                }
                if (str2 != null || str != null) {
                    i++;
                }
                if (set.isEmpty()) {
                    set = null;
                }
                return set != null ? i + 1 : i;
            case 5:
            case 6:
                if (list.isEmpty()) {
                    list = null;
                }
                i = list != null ? 1 : 0;
                if (filteringDateRange != null) {
                    i++;
                }
                if (str2 != null || str != null) {
                    i++;
                }
                if (set.isEmpty()) {
                    set = null;
                }
                return set != null ? i + 1 : i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerSalesFilters$CompoundFreelancerSalesFilter)) {
            return false;
        }
        FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
        return this.f73469a == freelancerSalesFilters$CompoundFreelancerSalesFilter.f73469a && Intrinsics.f(this.f73470b, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73470b) && Intrinsics.f(this.f73471c, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73471c) && Intrinsics.f(this.d, freelancerSalesFilters$CompoundFreelancerSalesFilter.d) && Intrinsics.f(this.e, freelancerSalesFilters$CompoundFreelancerSalesFilter.e) && Intrinsics.f(this.f, freelancerSalesFilters$CompoundFreelancerSalesFilter.f) && Intrinsics.f(this.f73472g, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73472g) && Intrinsics.f(this.f73473h, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73473h);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.d(this.f73469a.hashCode() * 31, 31, this.f73470b), 31, this.f73471c), 31, this.d);
        FilteringDateRange filteringDateRange = this.e;
        int iHashCode = (iD + (filteringDateRange == null ? 0 : filteringDateRange.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73472g;
        return this.f73473h.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73469a.name());
        Iterator itV = p.a.v(this.f73470b, dest);
        while (itV.hasNext()) {
            dest.writeString(((f) itV.next()).name());
        }
        Iterator itV2 = p.a.v(this.f73471c, dest);
        while (itV2.hasNext()) {
            dest.writeString(((e) itV2.next()).name());
        }
        Iterator itV3 = p.a.v(this.d, dest);
        while (itV3.hasNext()) {
            dest.writeString(((h) itV3.next()).name());
        }
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f73472g);
        Iterator itV4 = n.v(this.f73473h, dest);
        while (itV4.hasNext()) {
            dest.writeSerializable((Serializable) itV4.next());
        }
    }

    public FreelancerSalesFilters$CompoundFreelancerSalesFilter(g target, List selectedStatuses, List selectedPaymentMethods, List selectedTypes, FilteringDateRange filteringDateRange, String str, String str2, Set selectedCurrencies) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(selectedStatuses, "selectedStatuses");
        Intrinsics.checkNotNullParameter(selectedPaymentMethods, "selectedPaymentMethods");
        Intrinsics.checkNotNullParameter(selectedTypes, "selectedTypes");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        this.f73469a = target;
        this.f73470b = selectedStatuses;
        this.f73471c = selectedPaymentMethods;
        this.d = selectedTypes;
        this.e = filteringDateRange;
        this.f = str;
        this.f73472g = str2;
        this.f73473h = selectedCurrencies;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FreelancerSalesFilters$CompoundFreelancerSalesFilter(g gVar, int i) {
        gVar = (i & 1) != 0 ? g.ALL_SALES : gVar;
        f0 f0Var = f0.f322471a;
        this(gVar, f0Var, f0Var, f0Var, null, null, null, h0.f322473a);
    }
}
