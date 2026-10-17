package com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TaxResidencyList", "AddTaxResidencyDeclaration", "EditTaxResidencyDeclaration", "Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step$AddTaxResidencyDeclaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step$EditTaxResidencyDeclaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step$TaxResidencyList;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MultiResidencyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step$AddTaxResidencyDeclaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddTaxResidencyDeclaration extends MultiResidencyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddTaxResidencyDeclaration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f90280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f90281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f90282c;
        public final BackNavigationType d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclaredTaxResidency.CREATOR, parcel, arrayList, iA, 1);
                }
                return new AddTaxResidencyDeclaration(z, bVar, arrayList, (BackNavigationType) parcel.readParcelable(AddTaxResidencyDeclaration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTaxResidencyDeclaration[i];
            }
        }

        public AddTaxResidencyDeclaration(boolean z, wi0.b bVar, List declaredTaxResidencies, BackNavigationType backNavigationType) {
            Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
            Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
            this.f90280a = z;
            this.f90281b = bVar;
            this.f90282c = declaredTaxResidencies;
            this.d = backNavigationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddTaxResidencyDeclaration)) {
                return false;
            }
            AddTaxResidencyDeclaration addTaxResidencyDeclaration = (AddTaxResidencyDeclaration) obj2;
            return this.f90280a == addTaxResidencyDeclaration.f90280a && Intrinsics.f(this.f90281b, addTaxResidencyDeclaration.f90281b) && Intrinsics.f(this.f90282c, addTaxResidencyDeclaration.f90282c) && this.d == addTaxResidencyDeclaration.d;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f90280a) * 31;
            wi0.b bVar = this.f90281b;
            return this.d.hashCode() + p.a.d((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.f90282c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f90280a ? 1 : 0);
            dest.writeSerializable(this.f90281b);
            Iterator itV = p.a.v(this.f90282c, dest);
            while (itV.hasNext()) {
                ((DeclaredTaxResidency) itV.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step$EditTaxResidencyDeclaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditTaxResidencyDeclaration extends MultiResidencyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditTaxResidencyDeclaration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f90283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountryRule f90284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TaxResidencyDeclarationFlowContract$UseCase f90285c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                CountryRule countryRuleCreateFromParcel = CountryRule.CREATOR.createFromParcel(parcel);
                TaxResidencyDeclarationFlowContract$UseCase taxResidencyDeclarationFlowContract$UseCase = (TaxResidencyDeclarationFlowContract$UseCase) parcel.readParcelable(EditTaxResidencyDeclaration.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclaredTaxResidency.CREATOR, parcel, arrayList, iA, 1);
                }
                return new EditTaxResidencyDeclaration(bVar, countryRuleCreateFromParcel, taxResidencyDeclarationFlowContract$UseCase, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditTaxResidencyDeclaration[i];
            }
        }

        public EditTaxResidencyDeclaration(wi0.b countryCode, CountryRule countryRule, TaxResidencyDeclarationFlowContract$UseCase useCase, List declaredTaxResidencies) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(countryRule, "countryRule");
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
            this.f90283a = countryCode;
            this.f90284b = countryRule;
            this.f90285c = useCase;
            this.d = declaredTaxResidencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditTaxResidencyDeclaration)) {
                return false;
            }
            EditTaxResidencyDeclaration editTaxResidencyDeclaration = (EditTaxResidencyDeclaration) obj2;
            return Intrinsics.f(this.f90283a, editTaxResidencyDeclaration.f90283a) && Intrinsics.f(this.f90284b, editTaxResidencyDeclaration.f90284b) && Intrinsics.f(this.f90285c, editTaxResidencyDeclaration.f90285c) && Intrinsics.f(this.d, editTaxResidencyDeclaration.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f90285c.hashCode() + ((this.f90284b.hashCode() + (this.f90283a.f297794a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90283a);
            this.f90284b.writeToParcel(dest, i);
            dest.writeParcelable(this.f90285c, i);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                ((DeclaredTaxResidency) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step$TaxResidencyList;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxResidencyList extends MultiResidencyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxResidencyList f90286a = new TaxResidencyList();

        @NotNull
        public static final Parcelable.Creator<TaxResidencyList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxResidencyList.f90286a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencyList[i];
            }
        }

        private TaxResidencyList() {
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

    private MultiResidencyFlowContract$Step() {
    }
}
