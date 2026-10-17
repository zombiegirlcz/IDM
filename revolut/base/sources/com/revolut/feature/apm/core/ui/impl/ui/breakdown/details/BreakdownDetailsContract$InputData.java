package com.revolut.feature.apm.core.ui.impl.ui.breakdown.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteBreakdownItem;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeFee;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeTax;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ChargesFee", "ChargesTax", "ChargesBreakdown", "Tax", "TaxBreakdown", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$ChargesBreakdown;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$ChargesFee;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$ChargesTax;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$Tax;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$TaxBreakdown;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BreakdownDetailsContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$ChargesBreakdown;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChargesBreakdown implements BreakdownDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChargesBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmQuoteBreakdownItem f62343a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChargesBreakdown((ApmQuoteBreakdownItem) parcel.readParcelable(ChargesBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChargesBreakdown[i];
            }
        }

        public ChargesBreakdown(ApmQuoteBreakdownItem breakdown) {
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            this.f62343a = breakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChargesBreakdown) && Intrinsics.f(this.f62343a, ((ChargesBreakdown) obj2).f62343a);
        }

        public final int hashCode() {
            return this.f62343a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62343a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$ChargesFee;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChargesFee implements BreakdownDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChargesFee> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmQuoteChargeFee f62344a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChargesFee((ApmQuoteChargeFee) parcel.readParcelable(ChargesFee.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChargesFee[i];
            }
        }

        public ChargesFee(ApmQuoteChargeFee charges) {
            Intrinsics.checkNotNullParameter(charges, "charges");
            this.f62344a = charges;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChargesFee) && Intrinsics.f(this.f62344a, ((ChargesFee) obj2).f62344a);
        }

        public final int hashCode() {
            return this.f62344a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62344a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$ChargesTax;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChargesTax implements BreakdownDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChargesTax> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmQuoteChargeTax f62345a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChargesTax((ApmQuoteChargeTax) parcel.readParcelable(ChargesTax.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChargesTax[i];
            }
        }

        public ChargesTax(ApmQuoteChargeTax charges) {
            Intrinsics.checkNotNullParameter(charges, "charges");
            this.f62345a = charges;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChargesTax) && Intrinsics.f(this.f62345a, ((ChargesTax) obj2).f62345a);
        }

        public final int hashCode() {
            return this.f62345a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62345a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$Tax;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tax implements BreakdownDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Tax> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z3l.a f62346a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tax((z3l.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tax[i];
            }
        }

        public Tax(z3l.a taxes) {
            Intrinsics.checkNotNullParameter(taxes, "taxes");
            this.f62346a = taxes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Tax) && Intrinsics.f(this.f62346a, ((Tax) obj2).f62346a);
        }

        public final int hashCode() {
            return this.f62346a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f62346a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData$TaxBreakdown;", "Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/details/BreakdownDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxBreakdown implements BreakdownDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TaxBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z3l.b f62347a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxBreakdown((z3l.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxBreakdown[i];
            }
        }

        public TaxBreakdown(z3l.b breakdown) {
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            this.f62347a = breakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxBreakdown) && Intrinsics.f(this.f62347a, ((TaxBreakdown) obj2).f62347a);
        }

        public final int hashCode() {
            return this.f62347a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f62347a);
        }
    }
}
