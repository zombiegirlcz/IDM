package com.revolut.feature.retail.savings.impl.common.sole_tax_residency;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel", "Landroid/os/Parcelable;", "SetTin", "SetTaxResidency", "Cancel", "Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel$Cancel;", "Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel$SetTaxResidency;", "Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel$SetTin;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SoleTaxResidencyConfirmationContract$TaxResidencyParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel$Cancel;", "Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancel implements SoleTaxResidencyConfirmationContract$TaxResidencyParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancel f83205a = new Cancel();

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.f83205a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancel[i];
            }
        }

        private Cancel() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel$SetTaxResidency;", "Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SetTaxResidency implements SoleTaxResidencyConfirmationContract$TaxResidencyParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetTaxResidency f83206a = new SetTaxResidency();

        @NotNull
        public static final Parcelable.Creator<SetTaxResidency> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SetTaxResidency.f83206a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetTaxResidency[i];
            }
        }

        private SetTaxResidency() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel$SetTin;", "Lcom/revolut/feature/retail/savings/impl/common/sole_tax_residency/SoleTaxResidencyConfirmationContract$TaxResidencyParcel;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetTin implements SoleTaxResidencyConfirmationContract$TaxResidencyParcel {

        @NotNull
        public static final Parcelable.Creator<SetTin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f83207a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetTin((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetTin[i];
            }
        }

        public SetTin(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f83207a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetTin) && Intrinsics.f(this.f83207a, ((SetTin) obj2).f83207a);
        }

        public final int hashCode() {
            return this.f83207a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f83207a);
        }
    }
}
