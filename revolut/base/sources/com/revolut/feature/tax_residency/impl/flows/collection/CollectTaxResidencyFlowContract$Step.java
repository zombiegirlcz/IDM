package com.revolut.feature.tax_residency.impl.flows.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PrefetchData", "SolePrompt", "List", "LocalTinInput", "SoleTinInput", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$List;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$LocalTinInput;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$PrefetchData;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$SolePrompt;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$SoleTinInput;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CollectTaxResidencyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$List;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class List extends CollectTaxResidencyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List f90006a = new List();

        @NotNull
        public static final Parcelable.Creator<List> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return List.f90006a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new List[i];
            }
        }

        private List() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$LocalTinInput;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LocalTinInput extends CollectTaxResidencyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalTinInput f90007a = new LocalTinInput();

        @NotNull
        public static final Parcelable.Creator<LocalTinInput> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LocalTinInput.f90007a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocalTinInput[i];
            }
        }

        private LocalTinInput() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$PrefetchData;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrefetchData extends CollectTaxResidencyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrefetchData f90008a = new PrefetchData();

        @NotNull
        public static final Parcelable.Creator<PrefetchData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrefetchData.f90008a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrefetchData[i];
            }
        }

        private PrefetchData() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$SolePrompt;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SolePrompt extends CollectTaxResidencyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SolePrompt f90009a = new SolePrompt();

        @NotNull
        public static final Parcelable.Creator<SolePrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SolePrompt.f90009a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SolePrompt[i];
            }
        }

        private SolePrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step$SoleTinInput;", "Lcom/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SoleTinInput extends CollectTaxResidencyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SoleTinInput f90010a = new SoleTinInput();

        @NotNull
        public static final Parcelable.Creator<SoleTinInput> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SoleTinInput.f90010a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SoleTinInput[i];
            }
        }

        private SoleTinInput() {
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

    private CollectTaxResidencyFlowContract$Step() {
    }
}
