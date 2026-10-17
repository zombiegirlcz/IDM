package com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ResidencyQuestion", "WhatIsTaxResidency", "TaxResidencyDeclaration", "Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step$ResidencyQuestion;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step$TaxResidencyDeclaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step$WhatIsTaxResidency;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DirectTinFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step$ResidencyQuestion;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ResidencyQuestion extends DirectTinFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResidencyQuestion f90242a = new ResidencyQuestion();

        @NotNull
        public static final Parcelable.Creator<ResidencyQuestion> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ResidencyQuestion.f90242a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResidencyQuestion[i];
            }
        }

        private ResidencyQuestion() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step$TaxResidencyDeclaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidencyDeclaration extends DirectTinFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxResidencyDeclaration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackNavigationType f90243a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxResidencyDeclaration((BackNavigationType) parcel.readParcelable(TaxResidencyDeclaration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencyDeclaration[i];
            }
        }

        public TaxResidencyDeclaration(BackNavigationType backNavigationType) {
            Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
            this.f90243a = backNavigationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxResidencyDeclaration) && this.f90243a == ((TaxResidencyDeclaration) obj2).f90243a;
        }

        public final int hashCode() {
            return this.f90243a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90243a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step$WhatIsTaxResidency;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WhatIsTaxResidency extends DirectTinFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WhatIsTaxResidency f90244a = new WhatIsTaxResidency();

        @NotNull
        public static final Parcelable.Creator<WhatIsTaxResidency> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WhatIsTaxResidency.f90244a;
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

    private DirectTinFlowContract$Step() {
    }
}
