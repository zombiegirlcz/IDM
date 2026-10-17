package com.revolut.feature.workflow.engine.sdk_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.workflow.engine.api.models.SdkVendorInfo;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PredefinedVendor", "Workflow", "PennyTopUp", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$PennyTopUp;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$PredefinedVendor;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SdkFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$PennyTopUp;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PennyTopUp implements SdkFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PennyTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f96587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f96588c;
        public final boolean d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new PennyTopUp(string, dVar, arrayList, parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PennyTopUp[i];
            }
        }

        public PennyTopUp(String workflowId, dj0.d amount, List applicableCountries, boolean z, String str) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(applicableCountries, "applicableCountries");
            this.f96586a = workflowId;
            this.f96587b = amount;
            this.f96588c = applicableCountries;
            this.d = z;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PennyTopUp)) {
                return false;
            }
            PennyTopUp pennyTopUp = (PennyTopUp) obj2;
            return Intrinsics.f(this.f96586a, pennyTopUp.f96586a) && Intrinsics.f(this.f96587b, pennyTopUp.f96587b) && Intrinsics.f(this.f96588c, pennyTopUp.f96588c) && this.d == pennyTopUp.d && Intrinsics.f(this.e, pennyTopUp.e);
        }

        public final int hashCode() {
            int iC = j6.a.c(p.a.d(v7.c(this.f96586a.hashCode() * 31, 31, this.f96587b), 31, this.f96588c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96586a);
            dest.writeSerializable(this.f96587b);
            Iterator itV = p.a.v(this.f96588c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$PredefinedVendor;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PredefinedVendor implements SdkFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PredefinedVendor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SdkVendorInfo f96589a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PredefinedVendor((SdkVendorInfo) parcel.readParcelable(PredefinedVendor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PredefinedVendor[i];
            }
        }

        public PredefinedVendor(SdkVendorInfo sdkVendorInfo) {
            Intrinsics.checkNotNullParameter(sdkVendorInfo, "sdkVendorInfo");
            this.f96589a = sdkVendorInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PredefinedVendor) && Intrinsics.f(this.f96589a, ((PredefinedVendor) obj2).f96589a);
        }

        public final int hashCode() {
            return this.f96589a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96589a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step;", "Onfido", "Vision", "Incode", "OnfidoStudio", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow$Incode;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow$Onfido;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow$OnfidoStudio;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow$Vision;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Workflow implements SdkFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow$Incode;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Incode extends Workflow {

            @NotNull
            public static final Parcelable.Creator<Incode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WorkflowDocumentScanCofiguration.Incode f96591b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Incode(parcel.readString(), (WorkflowDocumentScanCofiguration.Incode) parcel.readParcelable(Incode.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Incode[i];
                }
            }

            public Incode(String checkId, WorkflowDocumentScanCofiguration.Incode configuration) {
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f96590a = checkId;
                this.f96591b = configuration;
            }

            @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step.Workflow
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF96596a() {
                return this.f96590a;
            }

            @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step.Workflow
            public final WorkflowDocumentScanCofiguration b() {
                return this.f96591b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Incode)) {
                    return false;
                }
                Incode incode = (Incode) obj2;
                return Intrinsics.f(this.f96590a, incode.f96590a) && Intrinsics.f(this.f96591b, incode.f96591b);
            }

            public final int hashCode() {
                return this.f96591b.hashCode() + (this.f96590a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96590a);
                dest.writeParcelable(this.f96591b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow$Onfido;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Onfido extends Workflow {

            @NotNull
            public static final Parcelable.Creator<Onfido> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96592a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WorkflowDocumentScanCofiguration.Onfido f96593b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Onfido(parcel.readString(), (WorkflowDocumentScanCofiguration.Onfido) parcel.readParcelable(Onfido.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Onfido[i];
                }
            }

            public Onfido(String checkId, WorkflowDocumentScanCofiguration.Onfido configuration) {
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f96592a = checkId;
                this.f96593b = configuration;
            }

            @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step.Workflow
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF96596a() {
                return this.f96592a;
            }

            @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step.Workflow
            public final WorkflowDocumentScanCofiguration b() {
                return this.f96593b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Onfido)) {
                    return false;
                }
                Onfido onfido = (Onfido) obj2;
                return Intrinsics.f(this.f96592a, onfido.f96592a) && Intrinsics.f(this.f96593b, onfido.f96593b);
            }

            public final int hashCode() {
                return this.f96593b.hashCode() + (this.f96592a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96592a);
                dest.writeParcelable(this.f96593b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow$OnfidoStudio;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OnfidoStudio extends Workflow {

            @NotNull
            public static final Parcelable.Creator<OnfidoStudio> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WorkflowDocumentScanCofiguration.OnfidoStudio f96595b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OnfidoStudio(parcel.readString(), (WorkflowDocumentScanCofiguration.OnfidoStudio) parcel.readParcelable(OnfidoStudio.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OnfidoStudio[i];
                }
            }

            public OnfidoStudio(String checkId, WorkflowDocumentScanCofiguration.OnfidoStudio configuration) {
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f96594a = checkId;
                this.f96595b = configuration;
            }

            @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step.Workflow
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF96596a() {
                return this.f96594a;
            }

            @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step.Workflow
            public final WorkflowDocumentScanCofiguration b() {
                return this.f96595b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OnfidoStudio)) {
                    return false;
                }
                OnfidoStudio onfidoStudio = (OnfidoStudio) obj2;
                return Intrinsics.f(this.f96594a, onfidoStudio.f96594a) && Intrinsics.f(this.f96595b, onfidoStudio.f96595b);
            }

            public final int hashCode() {
                return this.f96595b.hashCode() + (this.f96594a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96594a);
                dest.writeParcelable(this.f96595b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow$Vision;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$Step$Workflow;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Vision extends Workflow {

            @NotNull
            public static final Parcelable.Creator<Vision> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WorkflowDocumentScanCofiguration.Vision f96597b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Vision(parcel.readString(), (WorkflowDocumentScanCofiguration.Vision) parcel.readParcelable(Vision.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Vision[i];
                }
            }

            public Vision(String checkId, WorkflowDocumentScanCofiguration.Vision configuration) {
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f96596a = checkId;
                this.f96597b = configuration;
            }

            @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step.Workflow
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF96596a() {
                return this.f96596a;
            }

            @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step.Workflow
            public final WorkflowDocumentScanCofiguration b() {
                return this.f96597b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Vision)) {
                    return false;
                }
                Vision vision = (Vision) obj2;
                return Intrinsics.f(this.f96596a, vision.f96596a) && Intrinsics.f(this.f96597b, vision.f96597b);
            }

            public final int hashCode() {
                return this.f96597b.hashCode() + (this.f96596a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96596a);
                dest.writeParcelable(this.f96597b, i);
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract String getF96596a();

        public abstract WorkflowDocumentScanCofiguration b();
    }
}
