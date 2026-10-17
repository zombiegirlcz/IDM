package com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.CrsFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.DirectTinFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.FatcaFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Fatca", "Crs", "DirectTin", "Declaration", "Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step$Crs;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step$Declaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step$DirectTin;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step$Fatca;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TaxResidencyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step$Crs;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crs extends TaxResidencyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Crs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CrsFlowContract$InputData f90295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90296b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crs(CrsFlowContract$InputData.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crs[i];
            }
        }

        public Crs(CrsFlowContract$InputData inputData, int i) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90295a = inputData;
            this.f90296b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Crs)) {
                return false;
            }
            Crs crs = (Crs) obj2;
            return Intrinsics.f(this.f90295a, crs.f90295a) && this.f90296b == crs.f90296b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f90296b) + (this.f90295a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90295a.writeToParcel(dest, i);
            dest.writeInt(this.f90296b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step$Declaration;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Declaration extends TaxResidencyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Declaration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TaxResidencyDeclarationFlowContract$InputData f90297a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Declaration(TaxResidencyDeclarationFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Declaration[i];
            }
        }

        public Declaration(TaxResidencyDeclarationFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90297a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Declaration) && Intrinsics.f(this.f90297a, ((Declaration) obj2).f90297a);
        }

        public final int hashCode() {
            return this.f90297a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90297a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step$DirectTin;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectTin extends TaxResidencyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DirectTin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DirectTinFlowContract$InputData f90298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90299b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectTin(DirectTinFlowContract$InputData.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectTin[i];
            }
        }

        public DirectTin(DirectTinFlowContract$InputData inputData, int i) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90298a = inputData;
            this.f90299b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirectTin)) {
                return false;
            }
            DirectTin directTin = (DirectTin) obj2;
            return Intrinsics.f(this.f90298a, directTin.f90298a) && this.f90299b == directTin.f90299b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f90299b) + (this.f90298a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90298a.writeToParcel(dest, i);
            dest.writeInt(this.f90299b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step$Fatca;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fatca extends TaxResidencyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Fatca> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FatcaFlowContract$InputData f90300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90301b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fatca(FatcaFlowContract$InputData.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fatca[i];
            }
        }

        public Fatca(FatcaFlowContract$InputData inputData, int i) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90300a = inputData;
            this.f90301b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Fatca)) {
                return false;
            }
            Fatca fatca = (Fatca) obj2;
            return Intrinsics.f(this.f90300a, fatca.f90300a) && this.f90301b == fatca.f90301b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f90301b) + (this.f90300a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90300a.writeToParcel(dest, i);
            dest.writeInt(this.f90301b);
        }
    }

    private TaxResidencyFlowContract$Step() {
    }
}
