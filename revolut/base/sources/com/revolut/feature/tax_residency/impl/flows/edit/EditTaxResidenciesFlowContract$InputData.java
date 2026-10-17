package com.revolut.feature.tax_residency.impl.flows.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.WhatIsTaxDialogConfig;
import com.revolut.kompot.common.IOData$Input;
import grl.k9;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/edit/EditTaxResidenciesFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditTaxResidenciesFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EditTaxResidenciesFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WhatIsTaxDialogConfig f90012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f90013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f90014c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditTaxResidenciesFlowContract$InputData((WhatIsTaxDialogConfig) parcel.readParcelable(EditTaxResidenciesFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(EditTaxResidenciesFlowContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditTaxResidenciesFlowContract$InputData[i];
        }
    }

    public EditTaxResidenciesFlowContract$InputData() {
        this((WhatIsTaxDialogConfig) null, (Integer) null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EditTaxResidenciesFlowContract$InputData)) {
            return false;
        }
        EditTaxResidenciesFlowContract$InputData editTaxResidenciesFlowContract$InputData = (EditTaxResidenciesFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90012a, editTaxResidenciesFlowContract$InputData.f90012a) && Intrinsics.f(this.f90013b, editTaxResidenciesFlowContract$InputData.f90013b) && Intrinsics.f(this.f90014c, editTaxResidenciesFlowContract$InputData.f90014c);
    }

    public final int hashCode() {
        WhatIsTaxDialogConfig whatIsTaxDialogConfig = this.f90012a;
        int iA = l.a((whatIsTaxDialogConfig == null ? 0 : whatIsTaxDialogConfig.hashCode()) * 31, 31, this.f90013b);
        Integer num = this.f90014c;
        return iA + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90012a, i);
        dest.writeParcelable(this.f90013b, i);
        Integer num = this.f90014c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public EditTaxResidenciesFlowContract$InputData(WhatIsTaxDialogConfig whatIsTaxDialogConfig, AnalyticsProduct analyticsProduct, Integer num) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f90012a = whatIsTaxDialogConfig;
        this.f90013b = analyticsProduct;
        this.f90014c = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTaxResidenciesFlowContract$InputData(WhatIsTaxDialogConfig whatIsTaxDialogConfig, Integer num, int i) {
        whatIsTaxDialogConfig = (i & 1) != 0 ? null : whatIsTaxDialogConfig;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137506s;
        this(whatIsTaxDialogConfig, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var), (i & 4) != 0 ? null : num);
    }
}
