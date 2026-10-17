package com.revolut.feature.tax_residency.impl.flows.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/list/TaxResidenciesListFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidenciesListFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxResidenciesListFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f90020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f90021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90022c;
    public final List d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f90024h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f90025j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WhatIsTaxDialogConfig f90026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnalyticsProduct f90027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f90028n;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            ArrayList arrayList2;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            wi0.b bVar = (wi0.b) parcel.readSerializable();
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
            return new TaxResidenciesListFlowContract$InputData(bVar, arrayList2, arrayList3, arrayList5, z3, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, (Clause) parcel.readParcelable(TaxResidenciesListFlowContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TaxResidenciesListFlowContract$InputData.class.getClassLoader()), (WhatIsTaxDialogConfig) parcel.readParcelable(TaxResidenciesListFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(TaxResidenciesListFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidenciesListFlowContract$InputData[i];
        }
    }

    public TaxResidenciesListFlowContract$InputData(wi0.b bVar, List list, List list2, List skippableTinCountries, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, Clause taxResidenciesListTitle, Clause taxResidenciesListButtonText, WhatIsTaxDialogConfig whatIsTaxDialogConfig, AnalyticsProduct analyticsProduct, boolean z12) {
        Intrinsics.checkNotNullParameter(skippableTinCountries, "skippableTinCountries");
        Intrinsics.checkNotNullParameter(taxResidenciesListTitle, "taxResidenciesListTitle");
        Intrinsics.checkNotNullParameter(taxResidenciesListButtonText, "taxResidenciesListButtonText");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f90020a = bVar;
        this.f90021b = list;
        this.f90022c = list2;
        this.d = skippableTinCountries;
        this.e = z;
        this.f = z3;
        this.f90023g = z4;
        this.f90024h = z6;
        this.i = z11;
        this.f90025j = taxResidenciesListTitle;
        this.k = taxResidenciesListButtonText;
        this.f90026l = whatIsTaxDialogConfig;
        this.f90027m = analyticsProduct;
        this.f90028n = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidenciesListFlowContract$InputData)) {
            return false;
        }
        TaxResidenciesListFlowContract$InputData taxResidenciesListFlowContract$InputData = (TaxResidenciesListFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90020a, taxResidenciesListFlowContract$InputData.f90020a) && Intrinsics.f(this.f90021b, taxResidenciesListFlowContract$InputData.f90021b) && Intrinsics.f(this.f90022c, taxResidenciesListFlowContract$InputData.f90022c) && Intrinsics.f(this.d, taxResidenciesListFlowContract$InputData.d) && this.e == taxResidenciesListFlowContract$InputData.e && this.f == taxResidenciesListFlowContract$InputData.f && this.f90023g == taxResidenciesListFlowContract$InputData.f90023g && this.f90024h == taxResidenciesListFlowContract$InputData.f90024h && this.i == taxResidenciesListFlowContract$InputData.i && Intrinsics.f(this.f90025j, taxResidenciesListFlowContract$InputData.f90025j) && Intrinsics.f(this.k, taxResidenciesListFlowContract$InputData.k) && Intrinsics.f(this.f90026l, taxResidenciesListFlowContract$InputData.f90026l) && Intrinsics.f(this.f90027m, taxResidenciesListFlowContract$InputData.f90027m) && this.f90028n == taxResidenciesListFlowContract$InputData.f90028n;
    }

    public final int hashCode() {
        wi0.b bVar = this.f90020a;
        int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
        List list = this.f90021b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f90022c;
        int iA = p.a.a(p.a.a(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.d((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f90023g), 31, this.f90024h), 31, this.i), 31, this.f90025j), 31, this.k);
        WhatIsTaxDialogConfig whatIsTaxDialogConfig = this.f90026l;
        return Boolean.hashCode(this.f90028n) + l.a((iA + (whatIsTaxDialogConfig != null ? whatIsTaxDialogConfig.hashCode() : 0)) * 31, 31, this.f90027m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90020a);
        List list = this.f90021b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        List list2 = this.f90022c;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeSerializable((Serializable) itQ2.next());
            }
        }
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f90023g ? 1 : 0);
        dest.writeInt(this.f90024h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f90025j, i);
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f90026l, i);
        dest.writeParcelable(this.f90027m, i);
        dest.writeInt(this.f90028n ? 1 : 0);
    }

    public /* synthetic */ TaxResidenciesListFlowContract$InputData(wi0.b bVar, List list, List list2, List list3, boolean z, boolean z3, boolean z4, boolean z6, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, WhatIsTaxDialogConfig whatIsTaxDialogConfig, AnalyticsProduct analyticsProduct, boolean z11, int i) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, list3, z, z3, z4, z6, (i & 256) == 0, textLocalisedClause, textLocalisedClause2, (i & 2048) != 0 ? null : whatIsTaxDialogConfig, analyticsProduct, z11);
    }
}
