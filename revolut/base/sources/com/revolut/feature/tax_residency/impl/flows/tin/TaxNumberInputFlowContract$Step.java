package com.revolut.feature.tax_residency.impl.flows.tin;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zme.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/tin/TaxNumberInputFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TaxResidencyCountryPicker", "TaxNumberInput", "Lcom/revolut/feature/tax_residency/impl/flows/tin/TaxNumberInputFlowContract$Step$TaxNumberInput;", "Lcom/revolut/feature/tax_residency/impl/flows/tin/TaxNumberInputFlowContract$Step$TaxResidencyCountryPicker;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TaxNumberInputFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/tin/TaxNumberInputFlowContract$Step$TaxNumberInput;", "Lcom/revolut/feature/tax_residency/impl/flows/tin/TaxNumberInputFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxNumberInput extends TaxNumberInputFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxNumberInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f90078a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxNumberInput((l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxNumberInput[i];
            }
        }

        public TaxNumberInput(l taxResidencyRule) {
            Intrinsics.checkNotNullParameter(taxResidencyRule, "taxResidencyRule");
            this.f90078a = taxResidencyRule;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxNumberInput) && Intrinsics.f(this.f90078a, ((TaxNumberInput) obj2).f90078a);
        }

        public final int hashCode() {
            return this.f90078a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90078a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/tin/TaxNumberInputFlowContract$Step$TaxResidencyCountryPicker;", "Lcom/revolut/feature/tax_residency/impl/flows/tin/TaxNumberInputFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxResidencyCountryPicker extends TaxNumberInputFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxResidencyCountryPicker f90079a = new TaxResidencyCountryPicker();

        @NotNull
        public static final Parcelable.Creator<TaxResidencyCountryPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxResidencyCountryPicker.f90079a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencyCountryPicker[i];
            }
        }

        private TaxResidencyCountryPicker() {
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

    private TaxNumberInputFlowContract$Step() {
    }
}
