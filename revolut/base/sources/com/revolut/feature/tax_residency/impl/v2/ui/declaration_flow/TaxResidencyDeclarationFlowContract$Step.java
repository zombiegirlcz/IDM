package com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.TinInputFormat;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rpe.f;
import ype.i;
import ype.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TinInput", "Exemption", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$Step$Exemption;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$Step$TinInput;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TaxResidencyDeclarationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$Step$Exemption;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Exemption extends TaxResidencyDeclarationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Exemption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f90221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BackNavigationType f90222b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Exemption(f.valueOf(parcel.readString()), (BackNavigationType) parcel.readParcelable(Exemption.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exemption[i];
            }
        }

        public Exemption(f useCase, BackNavigationType backNavigationType) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
            this.f90221a = useCase;
            this.f90222b = backNavigationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Exemption)) {
                return false;
            }
            Exemption exemption = (Exemption) obj2;
            return this.f90221a == exemption.f90221a && this.f90222b == exemption.f90222b;
        }

        public final int hashCode() {
            return this.f90222b.hashCode() + (this.f90221a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90221a.name());
            dest.writeParcelable(this.f90222b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$Step$TinInput;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TinInput extends TaxResidencyDeclarationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TinInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f90223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f90224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90225c;
        public final TinInputFormat d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TinInput(k.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), parcel.readString(), TinInputFormat.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TinInput[i];
            }
        }

        public TinInput(k useCase, i iVar, String initialTinValue, TinInputFormat tinFormat) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(initialTinValue, "initialTinValue");
            Intrinsics.checkNotNullParameter(tinFormat, "tinFormat");
            this.f90223a = useCase;
            this.f90224b = iVar;
            this.f90225c = initialTinValue;
            this.d = tinFormat;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TinInput)) {
                return false;
            }
            TinInput tinInput = (TinInput) obj2;
            return this.f90223a == tinInput.f90223a && this.f90224b == tinInput.f90224b && Intrinsics.f(this.f90225c, tinInput.f90225c) && Intrinsics.f(this.d, tinInput.d);
        }

        public final int hashCode() {
            int iHashCode = this.f90223a.hashCode() * 31;
            i iVar = this.f90224b;
            return this.d.hashCode() + p.a.c((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f90225c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90223a.name());
            i iVar = this.f90224b;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeString(this.f90225c);
            this.d.writeToParcel(dest, i);
        }
    }

    private TaxResidencyDeclarationFlowContract$Step() {
    }
}
