package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TaxRates", "AddTaxRate", "EditTaxRate", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step$AddTaxRate;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step$EditTaxRate;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step$TaxRates;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ManageTaxRatesFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step$AddTaxRate;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddTaxRate extends ManageTaxRatesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddTaxRate f60746a = new AddTaxRate();

        @NotNull
        public static final Parcelable.Creator<AddTaxRate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddTaxRate.f60746a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTaxRate[i];
            }
        }

        private AddTaxRate() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step$EditTaxRate;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditTaxRate extends ManageTaxRatesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditTaxRate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TaxRate f60747a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditTaxRate((TaxRate) parcel.readParcelable(EditTaxRate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditTaxRate[i];
            }
        }

        public EditTaxRate(TaxRate taxRate) {
            Intrinsics.checkNotNullParameter(taxRate, "taxRate");
            this.f60747a = taxRate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditTaxRate) && Intrinsics.f(this.f60747a, ((EditTaxRate) obj2).f60747a);
        }

        public final int hashCode() {
            return this.f60747a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60747a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step$TaxRates;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/manage_tax_rates/ManageTaxRatesFlowContract$Step;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxRates extends ManageTaxRatesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxRates f60748a = new TaxRates();

        @NotNull
        public static final Parcelable.Creator<TaxRates> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxRates.f60748a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxRates[i];
            }
        }

        private TaxRates() {
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

    private ManageTaxRatesFlowContract$Step() {
    }
}
