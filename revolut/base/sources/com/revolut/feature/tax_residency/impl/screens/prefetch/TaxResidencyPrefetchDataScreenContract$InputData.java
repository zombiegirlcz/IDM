package com.revolut.feature.tax_residency.impl.screens.prefetch;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/screens/prefetch/TaxResidencyPrefetchDataScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyPrefetchDataScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyPrefetchDataScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90101c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyPrefetchDataScreenContract$InputData((b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyPrefetchDataScreenContract$InputData[i];
        }
    }

    public TaxResidencyPrefetchDataScreenContract$InputData(b bVar, boolean z, boolean z3) {
        this.f90099a = bVar;
        this.f90100b = z;
        this.f90101c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyPrefetchDataScreenContract$InputData)) {
            return false;
        }
        TaxResidencyPrefetchDataScreenContract$InputData taxResidencyPrefetchDataScreenContract$InputData = (TaxResidencyPrefetchDataScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90099a, taxResidencyPrefetchDataScreenContract$InputData.f90099a) && this.f90100b == taxResidencyPrefetchDataScreenContract$InputData.f90100b && this.f90101c == taxResidencyPrefetchDataScreenContract$InputData.f90101c;
    }

    public final int hashCode() {
        b bVar = this.f90099a;
        return Boolean.hashCode(this.f90101c) + j6.a.c((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31, 31, this.f90100b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90099a);
        dest.writeInt(this.f90100b ? 1 : 0);
        dest.writeInt(this.f90101c ? 1 : 0);
    }
}
