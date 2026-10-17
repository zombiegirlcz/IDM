package com.revolut.feature.tax_residency.impl.screens.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tax_residency.api.WhatIsTaxDialogConfig;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f90081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f90082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f90083c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f90085h;
    public final WhatIsTaxDialogConfig i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f90086j;
    public final AnalyticsProduct k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f90087l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            ArrayList arrayList2;
            boolean z3;
            Clause clause = (Clause) j6.a.f(parcel, "parcel", TaxResidencyListScreenContract$InputData.class);
            Clause clause2 = (Clause) parcel.readParcelable(TaxResidencyListScreenContract$InputData.class.getClassLoader());
            b bVar = (b) parcel.readSerializable();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList3 = new ArrayList(i2);
                int iC2 = 0;
                while (iC2 != i2) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC2, 1);
                }
            }
            int i3 = parcel.readInt();
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = new ArrayList(i3);
            int iC3 = 0;
            while (iC3 != i3) {
                iC3 = ch.qos.logback.core.util.a.c(parcel, arrayList5, iC3, 1);
            }
            if (parcel.readInt() != 0) {
                z = true;
                arrayList2 = arrayList4;
                z3 = true;
            } else {
                z = true;
                arrayList2 = arrayList4;
                z3 = false;
            }
            return new TaxResidencyListScreenContract$InputData(clause, clause2, bVar, arrayList2, arrayList3, arrayList5, z3, parcel.readInt() != 0 ? z : false, (WhatIsTaxDialogConfig) parcel.readParcelable(TaxResidencyListScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0 ? z : false, (AnalyticsProduct) parcel.readParcelable(TaxResidencyListScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyListScreenContract$InputData[i];
        }
    }

    public TaxResidencyListScreenContract$InputData(Clause title, Clause nextButtonText, b bVar, List list, List list2, List skippableCountries, boolean z, boolean z3, WhatIsTaxDialogConfig whatIsTaxDialogConfig, boolean z4, AnalyticsProduct analyticsProduct, boolean z6) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        Intrinsics.checkNotNullParameter(skippableCountries, "skippableCountries");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f90081a = title;
        this.f90082b = nextButtonText;
        this.f90083c = bVar;
        this.d = list;
        this.e = list2;
        this.f = skippableCountries;
        this.f90084g = z;
        this.f90085h = z3;
        this.i = whatIsTaxDialogConfig;
        this.f90086j = z4;
        this.k = analyticsProduct;
        this.f90087l = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyListScreenContract$InputData)) {
            return false;
        }
        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = (TaxResidencyListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90081a, taxResidencyListScreenContract$InputData.f90081a) && Intrinsics.f(this.f90082b, taxResidencyListScreenContract$InputData.f90082b) && Intrinsics.f(this.f90083c, taxResidencyListScreenContract$InputData.f90083c) && Intrinsics.f(this.d, taxResidencyListScreenContract$InputData.d) && Intrinsics.f(this.e, taxResidencyListScreenContract$InputData.e) && Intrinsics.f(this.f, taxResidencyListScreenContract$InputData.f) && this.f90084g == taxResidencyListScreenContract$InputData.f90084g && this.f90085h == taxResidencyListScreenContract$InputData.f90085h && Intrinsics.f(this.i, taxResidencyListScreenContract$InputData.i) && this.f90086j == taxResidencyListScreenContract$InputData.f90086j && Intrinsics.f(this.k, taxResidencyListScreenContract$InputData.k) && this.f90087l == taxResidencyListScreenContract$InputData.f90087l;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f90081a.hashCode() * 31, 31, this.f90082b);
        b bVar = this.f90083c;
        int iHashCode = (iA + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iC = j6.a.c(j6.a.c(p.a.d((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f), 31, this.f90084g), 31, this.f90085h);
        WhatIsTaxDialogConfig whatIsTaxDialogConfig = this.i;
        return Boolean.hashCode(this.f90087l) + l.a(j6.a.c((iC + (whatIsTaxDialogConfig != null ? whatIsTaxDialogConfig.hashCode() : 0)) * 31, 31, this.f90086j), 31, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90081a, i);
        dest.writeParcelable(this.f90082b, i);
        dest.writeSerializable(this.f90083c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        List list2 = this.e;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeSerializable((Serializable) itQ2.next());
            }
        }
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeInt(this.f90084g ? 1 : 0);
        dest.writeInt(this.f90085h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeInt(this.f90086j ? 1 : 0);
        dest.writeParcelable(this.k, i);
        dest.writeInt(this.f90087l ? 1 : 0);
    }
}
