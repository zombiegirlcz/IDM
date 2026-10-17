package com.revolut.feature.tax_residency.impl.flows.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectTaxResidencyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CollectTaxResidencyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f89998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90000c;
    public final boolean d;
    public final AnalyticsProduct e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NaviCommand f90002h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            Class cls;
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
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(CollectTaxResidencyFlowContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = CollectTaxResidencyFlowContract$InputData.class;
                z6 = z4;
            } else {
                cls = CollectTaxResidencyFlowContract$InputData.class;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z = z4;
            }
            return new CollectTaxResidencyFlowContract$InputData(bVar, z11, z12, z3, analyticsProduct, z6, z, (NaviCommand) parcel.readParcelable(cls.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectTaxResidencyFlowContract$InputData[i];
        }
    }

    public CollectTaxResidencyFlowContract$InputData(b bVar, boolean z, boolean z3, boolean z4, AnalyticsProduct analyticsProduct, boolean z6, boolean z11, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f89998a = bVar;
        this.f89999b = z;
        this.f90000c = z3;
        this.d = z4;
        this.e = analyticsProduct;
        this.f = z6;
        this.f90001g = z11;
        this.f90002h = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollectTaxResidencyFlowContract$InputData)) {
            return false;
        }
        CollectTaxResidencyFlowContract$InputData collectTaxResidencyFlowContract$InputData = (CollectTaxResidencyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f89998a, collectTaxResidencyFlowContract$InputData.f89998a) && this.f89999b == collectTaxResidencyFlowContract$InputData.f89999b && this.f90000c == collectTaxResidencyFlowContract$InputData.f90000c && this.d == collectTaxResidencyFlowContract$InputData.d && Intrinsics.f(this.e, collectTaxResidencyFlowContract$InputData.e) && this.f == collectTaxResidencyFlowContract$InputData.f && this.f90001g == collectTaxResidencyFlowContract$InputData.f90001g && Intrinsics.f(this.f90002h, collectTaxResidencyFlowContract$InputData.f90002h);
    }

    public final int hashCode() {
        b bVar = this.f89998a;
        int iC = j6.a.c(j6.a.c(l.a(j6.a.c(j6.a.c(j6.a.c((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31, 31, this.f89999b), 31, this.f90000c), 31, this.d), 31, this.e), 31, this.f), 31, this.f90001g);
        NaviCommand naviCommand = this.f90002h;
        return iC + (naviCommand != null ? naviCommand.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f89998a);
        dest.writeInt(this.f89999b ? 1 : 0);
        dest.writeInt(this.f90000c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f90001g ? 1 : 0);
        dest.writeParcelable(this.f90002h, i);
    }
}
