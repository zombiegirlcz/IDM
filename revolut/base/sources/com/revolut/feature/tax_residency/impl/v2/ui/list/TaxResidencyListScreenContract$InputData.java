package com.revolut.feature.tax_residency.impl.v2.ui.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/list/TaxResidencyListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxResidencyFlowContext f90264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f90265c;
    public final BackNavigationType d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyListScreenContract$InputData((b) parcel.readSerializable(), TaxResidencyFlowContext.CREATOR.createFromParcel(parcel), (AnalyticsProduct) parcel.readParcelable(TaxResidencyListScreenContract$InputData.class.getClassLoader()), (BackNavigationType) parcel.readParcelable(TaxResidencyListScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyListScreenContract$InputData[i];
        }
    }

    public TaxResidencyListScreenContract$InputData(b userCountry, TaxResidencyFlowContext flowContext, AnalyticsProduct analyticsProduct, BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90263a = userCountry;
        this.f90264b = flowContext;
        this.f90265c = analyticsProduct;
        this.d = backNavigationType;
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
        return Intrinsics.f(this.f90263a, taxResidencyListScreenContract$InputData.f90263a) && Intrinsics.f(this.f90264b, taxResidencyListScreenContract$InputData.f90264b) && Intrinsics.f(this.f90265c, taxResidencyListScreenContract$InputData.f90265c) && this.d == taxResidencyListScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + l.a((this.f90264b.hashCode() + (this.f90263a.f297794a.hashCode() * 31)) * 31, 31, this.f90265c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90263a);
        this.f90264b.writeToParcel(dest, i);
        dest.writeParcelable(this.f90265c, i);
        dest.writeParcelable(this.d, i);
    }
}
