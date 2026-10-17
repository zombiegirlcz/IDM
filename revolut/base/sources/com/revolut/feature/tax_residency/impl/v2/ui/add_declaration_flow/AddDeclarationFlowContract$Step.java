package com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/add_declaration_flow/AddDeclarationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CountrySelection", "TaxResidencyDeclaration", "Lcom/revolut/feature/tax_residency/impl/v2/ui/add_declaration_flow/AddDeclarationFlowContract$Step$CountrySelection;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/add_declaration_flow/AddDeclarationFlowContract$Step$TaxResidencyDeclaration;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddDeclarationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/add_declaration_flow/AddDeclarationFlowContract$Step$CountrySelection;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/add_declaration_flow/AddDeclarationFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountrySelection extends AddDeclarationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountrySelection f90197a = new CountrySelection();

        @NotNull
        public static final Parcelable.Creator<CountrySelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountrySelection.f90197a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountrySelection[i];
            }
        }

        private CountrySelection() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/add_declaration_flow/AddDeclarationFlowContract$Step$TaxResidencyDeclaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/add_declaration_flow/AddDeclarationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidencyDeclaration extends AddDeclarationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxResidencyDeclaration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f90198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountryRule f90199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TaxResidencyDeclarationFlowContract$UseCase f90200c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxResidencyDeclaration((b) parcel.readSerializable(), CountryRule.CREATOR.createFromParcel(parcel), (TaxResidencyDeclarationFlowContract$UseCase) parcel.readParcelable(TaxResidencyDeclaration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencyDeclaration[i];
            }
        }

        public TaxResidencyDeclaration(b countryCode, CountryRule countryRule, TaxResidencyDeclarationFlowContract$UseCase useCase) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(countryRule, "countryRule");
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            this.f90198a = countryCode;
            this.f90199b = countryRule;
            this.f90200c = useCase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxResidencyDeclaration)) {
                return false;
            }
            TaxResidencyDeclaration taxResidencyDeclaration = (TaxResidencyDeclaration) obj2;
            return Intrinsics.f(this.f90198a, taxResidencyDeclaration.f90198a) && Intrinsics.f(this.f90199b, taxResidencyDeclaration.f90199b) && Intrinsics.f(this.f90200c, taxResidencyDeclaration.f90200c);
        }

        public final int hashCode() {
            return this.f90200c.hashCode() + ((this.f90199b.hashCode() + (this.f90198a.f297794a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90198a);
            this.f90199b.writeToParcel(dest, i);
            dest.writeParcelable(this.f90200c, i);
        }
    }

    private AddDeclarationFlowContract$Step() {
    }
}
