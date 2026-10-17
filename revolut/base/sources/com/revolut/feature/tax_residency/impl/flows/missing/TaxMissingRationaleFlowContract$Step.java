package com.revolut.feature.tax_residency.impl.flows.missing;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CollectTin", "Rationales", "Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$Step$CollectTin;", "Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$Step$Rationales;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TaxMissingRationaleFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$Step$CollectTin;", "Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CollectTin extends TaxMissingRationaleFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CollectTin f90042a = new CollectTin();

        @NotNull
        public static final Parcelable.Creator<CollectTin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CollectTin.f90042a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollectTin[i];
            }
        }

        private CollectTin() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$Step$Rationales;", "Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Rationales extends TaxMissingRationaleFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Rationales f90043a = new Rationales();

        @NotNull
        public static final Parcelable.Creator<Rationales> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Rationales.f90043a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rationales[i];
            }
        }

        private Rationales() {
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

    private TaxMissingRationaleFlowContract$Step() {
    }
}
