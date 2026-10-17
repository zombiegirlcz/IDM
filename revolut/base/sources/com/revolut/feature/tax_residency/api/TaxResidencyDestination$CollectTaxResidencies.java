package com.revolut.feature.tax_residency.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/api/TaxResidencyDestination$CollectTaxResidencies", "", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyDestination$CollectTaxResidencies implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyDestination$CollectTaxResidencies> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f89954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89956c;
    public final AnalyticsProduct d;
    public final NaviCommand e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89957g;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            AnalyticsProduct analyticsProduct;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z12 = z;
            }
            AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(TaxResidencyDestination$CollectTaxResidencies.class.getClassLoader());
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(TaxResidencyDestination$CollectTaxResidencies.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = z3;
                analyticsProduct = analyticsProduct2;
                z6 = z4;
            } else {
                z4 = z3;
                analyticsProduct = analyticsProduct2;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new TaxResidencyDestination$CollectTaxResidencies(bVar, z11, z12, analyticsProduct, naviCommand, z6, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyDestination$CollectTaxResidencies[i];
        }
    }

    public TaxResidencyDestination$CollectTaxResidencies(b bVar, boolean z, boolean z3, AnalyticsProduct analyticsProduct, NaviCommand naviCommand, boolean z4, boolean z6) {
        this.f89954a = bVar;
        this.f89955b = z;
        this.f89956c = z3;
        this.d = analyticsProduct;
        this.e = naviCommand;
        this.f = z4;
        this.f89957g = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyDestination$CollectTaxResidencies)) {
            return false;
        }
        TaxResidencyDestination$CollectTaxResidencies taxResidencyDestination$CollectTaxResidencies = (TaxResidencyDestination$CollectTaxResidencies) obj2;
        return Intrinsics.f(this.f89954a, taxResidencyDestination$CollectTaxResidencies.f89954a) && this.f89955b == taxResidencyDestination$CollectTaxResidencies.f89955b && this.f89956c == taxResidencyDestination$CollectTaxResidencies.f89956c && Intrinsics.f(this.d, taxResidencyDestination$CollectTaxResidencies.d) && Intrinsics.f(this.e, taxResidencyDestination$CollectTaxResidencies.e) && this.f == taxResidencyDestination$CollectTaxResidencies.f && this.f89957g == taxResidencyDestination$CollectTaxResidencies.f89957g;
    }

    public final int hashCode() {
        b bVar = this.f89954a;
        int iC = j6.a.c(j6.a.c((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31, 31, this.f89955b), 31, this.f89956c);
        AnalyticsProduct analyticsProduct = this.d;
        int iHashCode = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        NaviCommand naviCommand = this.e;
        return Boolean.hashCode(this.f89957g) + j6.a.c((iHashCode + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f89954a);
        dest.writeInt(this.f89955b ? 1 : 0);
        dest.writeInt(this.f89956c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f89957g ? 1 : 0);
    }
}
