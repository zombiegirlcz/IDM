package com.revolut.feature.tax_residency.impl.flows.tin;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
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
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/tin/TaxNumberInputFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxNumberInputFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxNumberInputFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f90071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f90072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90073c;
    public final List d;
    public final f e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f90075h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f90076j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            b bVar = (b) parcel.readSerializable();
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iC2 = 0;
            while (iC2 != i2) {
                iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC2, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iC3 = 0;
            while (iC3 != i3) {
                iC3 = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC3, 1);
            }
            return new TaxNumberInputFlowContract$InputData(arrayList, bVar, arrayList2, arrayList3, (f) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(TaxNumberInputFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxNumberInputFlowContract$InputData[i];
        }
    }

    public TaxNumberInputFlowContract$InputData(List existedTaxResidencies, b userCountry, List taxResidencyRules, List skippableTinCountries, f fVar, boolean z, boolean z3, boolean z4, AnalyticsProduct analyticsProduct, boolean z6) {
        Intrinsics.checkNotNullParameter(existedTaxResidencies, "existedTaxResidencies");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(skippableTinCountries, "skippableTinCountries");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f90071a = existedTaxResidencies;
        this.f90072b = userCountry;
        this.f90073c = taxResidencyRules;
        this.d = skippableTinCountries;
        this.e = fVar;
        this.f = z;
        this.f90074g = z3;
        this.f90075h = z4;
        this.i = analyticsProduct;
        this.f90076j = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxNumberInputFlowContract$InputData)) {
            return false;
        }
        TaxNumberInputFlowContract$InputData taxNumberInputFlowContract$InputData = (TaxNumberInputFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90071a, taxNumberInputFlowContract$InputData.f90071a) && Intrinsics.f(this.f90072b, taxNumberInputFlowContract$InputData.f90072b) && Intrinsics.f(this.f90073c, taxNumberInputFlowContract$InputData.f90073c) && Intrinsics.f(this.d, taxNumberInputFlowContract$InputData.d) && Intrinsics.f(this.e, taxNumberInputFlowContract$InputData.e) && this.f == taxNumberInputFlowContract$InputData.f && this.f90074g == taxNumberInputFlowContract$InputData.f90074g && this.f90075h == taxNumberInputFlowContract$InputData.f90075h && Intrinsics.f(this.i, taxNumberInputFlowContract$InputData.i) && this.f90076j == taxNumberInputFlowContract$InputData.f90076j;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.c(this.f90071a.hashCode() * 31, 31, this.f90072b.f297794a), 31, this.f90073c), 31, this.d);
        f fVar = this.e;
        return Boolean.hashCode(this.f90076j) + l.a(j6.a.c(j6.a.c(j6.a.c((iD + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f), 31, this.f90074g), 31, this.f90075h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f90071a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeSerializable(this.f90072b);
        Iterator itV2 = p.a.v(this.f90073c, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        Iterator itV3 = p.a.v(this.d, dest);
        while (itV3.hasNext()) {
            dest.writeSerializable((Serializable) itV3.next());
        }
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f90074g ? 1 : 0);
        dest.writeInt(this.f90075h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeInt(this.f90076j ? 1 : 0);
    }
}
