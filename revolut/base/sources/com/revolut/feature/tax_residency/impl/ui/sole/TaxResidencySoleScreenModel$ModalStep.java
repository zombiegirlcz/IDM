package com.revolut.feature.tax_residency.impl.ui.sole;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bs\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/tax_residency/impl/ui/sole/TaxResidencySoleScreenModel$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "WhatIsTaxResidency", "Lcom/revolut/feature/tax_residency/impl/ui/sole/TaxResidencySoleScreenModel$ModalStep$WhatIsTaxResidency;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxResidencySoleScreenModel$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/ui/sole/TaxResidencySoleScreenModel$ModalStep$WhatIsTaxResidency;", "Lcom/revolut/feature/tax_residency/impl/ui/sole/TaxResidencySoleScreenModel$ModalStep;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WhatIsTaxResidency implements TaxResidencySoleScreenModel$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WhatIsTaxResidency f90148a = new WhatIsTaxResidency();

        @NotNull
        public static final Parcelable.Creator<WhatIsTaxResidency> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WhatIsTaxResidency.f90148a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WhatIsTaxResidency[i];
            }
        }

        private WhatIsTaxResidency() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
