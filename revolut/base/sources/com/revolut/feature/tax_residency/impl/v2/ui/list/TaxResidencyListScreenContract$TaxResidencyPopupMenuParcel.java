package com.revolut.feature.tax_residency.impl.v2.ui.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import upe.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/list/TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeclaredTaxResidency f90267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f90268b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel(DeclaredTaxResidency.CREATOR.createFromParcel(parcel), n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel[i];
        }
    }

    public TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel(DeclaredTaxResidency taxResidency, n action) {
        Intrinsics.checkNotNullParameter(taxResidency, "taxResidency");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f90267a = taxResidency;
        this.f90268b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel)) {
            return false;
        }
        TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel taxResidencyListScreenContract$TaxResidencyPopupMenuParcel = (TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel) obj2;
        return Intrinsics.f(this.f90267a, taxResidencyListScreenContract$TaxResidencyPopupMenuParcel.f90267a) && this.f90268b == taxResidencyListScreenContract$TaxResidencyPopupMenuParcel.f90268b;
    }

    public final int hashCode() {
        return this.f90268b.hashCode() + (this.f90267a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f90267a.writeToParcel(dest, i);
        dest.writeString(this.f90268b.name());
    }
}
