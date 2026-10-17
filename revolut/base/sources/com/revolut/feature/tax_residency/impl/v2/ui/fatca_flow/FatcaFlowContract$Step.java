package com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "FatcaQuestion", "TinInput", "Lcom/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlowContract$Step$FatcaQuestion;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlowContract$Step$TinInput;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FatcaFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlowContract$Step$FatcaQuestion;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FatcaQuestion extends FatcaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FatcaQuestion f90256a = new FatcaQuestion();

        @NotNull
        public static final Parcelable.Creator<FatcaQuestion> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FatcaQuestion.f90256a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FatcaQuestion[i];
            }
        }

        private FatcaQuestion() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof FatcaQuestion);
        }

        public final int hashCode() {
            return 1391473520;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlowContract$Step$TinInput;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TinInput extends FatcaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TinInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackNavigationType f90257a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TinInput((BackNavigationType) parcel.readParcelable(TinInput.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TinInput[i];
            }
        }

        public TinInput(BackNavigationType backNavigationType) {
            Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
            this.f90257a = backNavigationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TinInput) && this.f90257a == ((TinInput) obj2).f90257a;
        }

        public final int hashCode() {
            return this.f90257a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90257a, i);
        }
    }

    private FatcaFlowContract$Step() {
    }
}
