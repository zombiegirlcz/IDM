package com.revolut.feature.semi_independent_activation.impl.ui.activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Details", "DeclineConfirmation", "Workflow", "Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step$DeclineConfirmation;", "Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step$Details;", "Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step$Workflow;", "feature_semi_independent_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SemiIndependentActivationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step$DeclineConfirmation;", "Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclineConfirmation extends SemiIndependentActivationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeclineConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85971a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclineConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclineConfirmation[i];
            }
        }

        public DeclineConfirmation(String invitationId) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            this.f85971a = invitationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeclineConfirmation) && Intrinsics.f(this.f85971a, ((DeclineConfirmation) obj2).f85971a);
        }

        public final int hashCode() {
            return this.f85971a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85971a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step$Details;", "Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends SemiIndependentActivationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85972a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String teenUserId) {
            Intrinsics.checkNotNullParameter(teenUserId, "teenUserId");
            this.f85972a = teenUserId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f85972a, ((Details) obj2).f85972a);
        }

        public final int hashCode() {
            return this.f85972a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85972a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step$Workflow;", "Lcom/revolut/feature/semi_independent_activation/impl/ui/activation/SemiIndependentActivationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends SemiIndependentActivationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85973a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f85973a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Workflow) && Intrinsics.f(this.f85973a, ((Workflow) obj2).f85973a);
        }

        public final int hashCode() {
            return this.f85973a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85973a);
        }
    }

    private SemiIndependentActivationFlowContract$Step() {
    }
}
