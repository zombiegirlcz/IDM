package com.revolut.feature.product.lifecycle.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/product/lifecycle/flow/ProductLifecycleFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Workflow", "Lcom/revolut/feature/product/lifecycle/flow/ProductLifecycleFlowContract$Step$Workflow;", "feature_product_lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductLifecycleFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/lifecycle/flow/ProductLifecycleFlowContract$Step$Workflow;", "Lcom/revolut/feature/product/lifecycle/flow/ProductLifecycleFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_product_lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow implements ProductLifecycleFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81208b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String interactionId, String workflowId) {
            Intrinsics.checkNotNullParameter(interactionId, "interactionId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f81207a = interactionId;
            this.f81208b = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Workflow)) {
                return false;
            }
            Workflow workflow = (Workflow) obj2;
            return Intrinsics.f(this.f81207a, workflow.f81207a) && Intrinsics.f(this.f81208b, workflow.f81208b);
        }

        public final int hashCode() {
            return this.f81208b.hashCode() + (this.f81207a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81207a);
            dest.writeString(this.f81208b);
        }
    }
}
