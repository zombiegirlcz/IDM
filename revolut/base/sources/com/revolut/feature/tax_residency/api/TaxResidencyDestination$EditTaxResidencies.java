package com.revolut.feature.tax_residency.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/api/TaxResidencyDestination$EditTaxResidencies", "", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyDestination$EditTaxResidencies implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyDestination$EditTaxResidencies> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WhatIsTaxDialogConfig f89958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f89959b;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyDestination$EditTaxResidencies(parcel.readInt() == 0 ? null : WhatIsTaxDialogConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyDestination$EditTaxResidencies[i];
        }
    }

    public TaxResidencyDestination$EditTaxResidencies(WhatIsTaxDialogConfig whatIsTaxDialogConfig, Integer num) {
        this.f89958a = whatIsTaxDialogConfig;
        this.f89959b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyDestination$EditTaxResidencies)) {
            return false;
        }
        TaxResidencyDestination$EditTaxResidencies taxResidencyDestination$EditTaxResidencies = (TaxResidencyDestination$EditTaxResidencies) obj2;
        return Intrinsics.f(this.f89958a, taxResidencyDestination$EditTaxResidencies.f89958a) && Intrinsics.f(this.f89959b, taxResidencyDestination$EditTaxResidencies.f89959b);
    }

    public final int hashCode() {
        WhatIsTaxDialogConfig whatIsTaxDialogConfig = this.f89958a;
        int iHashCode = (whatIsTaxDialogConfig == null ? 0 : whatIsTaxDialogConfig.hashCode()) * 31;
        Integer num = this.f89959b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        WhatIsTaxDialogConfig whatIsTaxDialogConfig = this.f89958a;
        if (whatIsTaxDialogConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            whatIsTaxDialogConfig.writeToParcel(dest, i);
        }
        Integer num = this.f89959b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public TaxResidencyDestination$EditTaxResidencies() {
        this(null, null);
    }
}
