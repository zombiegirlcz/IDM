package com.feature.navigation.hub.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "NavigationHubMain", "InnerWorkflow", "InnerForm", "Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step$InnerForm;", "Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step$InnerWorkflow;", "Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step$NavigationHubMain;", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class NavigationHubFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step$InnerForm;", "Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step;", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InnerForm extends NavigationHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InnerForm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f26219b;

        public InnerForm(String formId, Map params) {
            Intrinsics.checkNotNullParameter(formId, "formId");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f26218a = formId;
            this.f26219b = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InnerForm)) {
                return false;
            }
            InnerForm innerForm = (InnerForm) obj2;
            return Intrinsics.f(this.f26218a, innerForm.f26218a) && Intrinsics.f(this.f26219b, innerForm.f26219b);
        }

        public final int hashCode() {
            return this.f26219b.hashCode() + (this.f26218a.hashCode() * 31);
        }

        public final String toString() {
            return "InnerForm(formId=" + this.f26218a + ", params=" + this.f26219b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f26218a);
            Iterator itZ = j6.a.z(this.f26219b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step$InnerWorkflow;", "Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step;", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InnerWorkflow extends NavigationHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InnerWorkflow> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26220a;

        public InnerWorkflow(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f26220a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InnerWorkflow) && Intrinsics.f(this.f26220a, ((InnerWorkflow) obj2).f26220a);
        }

        public final int hashCode() {
            return this.f26220a.hashCode();
        }

        public final String toString() {
            return p.a.p("InnerWorkflow(workflowId=", this.f26220a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f26220a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step$NavigationHubMain;", "Lcom/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$Step;", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NavigationHubMain extends NavigationHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigationHubMain f26221a = new NavigationHubMain();

        @NotNull
        public static final Parcelable.Creator<NavigationHubMain> CREATOR = new c();

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
}
