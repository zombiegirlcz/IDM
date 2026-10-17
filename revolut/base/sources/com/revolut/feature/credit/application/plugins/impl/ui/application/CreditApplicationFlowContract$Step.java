package com.revolut.feature.credit.application.plugins.impl.ui.application;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductIntro", "ResumeIntro", "CreditHealthPrompt", "WaitingList", "ProductArticles", "PlanSelection", "PreApplicationChecks", "Plugin", "Workflow", "ModalStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$CreditHealthPrompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$PlanSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$Plugin;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$PreApplicationChecks;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ResumeIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$WaitingList;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$Workflow;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditApplicationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$CreditHealthPrompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditHealthPrompt extends CreditApplicationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditHealthPrompt f67064a = new CreditHealthPrompt();

        @NotNull
        public static final Parcelable.Creator<CreditHealthPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditHealthPrompt.f67064a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditHealthPrompt[i];
            }
        }

        private CreditHealthPrompt() {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "<init>", "()V", "NotEligible", "EligibilityCriteria", "UpdateRequired", "ResumeApplication", "OtherApplicationInProgress", "Maintenance", "Cancellation", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$Cancellation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$EligibilityCriteria;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$Maintenance;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$NotEligible;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$OtherApplicationInProgress;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$ResumeApplication;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$UpdateRequired;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep extends CreditApplicationFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$Cancellation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cancellation extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<Cancellation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationCancellationModelExtension$CancellationVariant f67065a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PluginPayload f67066b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final w0 f67067c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cancellation((CreditApplicationCancellationModelExtension$CancellationVariant) parcel.readParcelable(Cancellation.class.getClassLoader()), (PluginPayload) parcel.readParcelable(Cancellation.class.getClassLoader()), ((AnalyticsContext) parcel.readParcelable(Cancellation.class.getClassLoader())).f50296a);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cancellation[i];
                }
            }

            public Cancellation(CreditApplicationCancellationModelExtension$CancellationVariant variant, PluginPayload pluginPayload, w0 w0Var) {
                Intrinsics.checkNotNullParameter(variant, "variant");
                Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
                this.f67065a = variant;
                this.f67066b = pluginPayload;
                this.f67067c = w0Var;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Cancellation)) {
                    return false;
                }
                Cancellation cancellation = (Cancellation) obj2;
                return Intrinsics.f(this.f67065a, cancellation.f67065a) && Intrinsics.f(this.f67066b, cancellation.f67066b) && Intrinsics.f(this.f67067c, cancellation.f67067c);
            }

            public final int hashCode() {
                return AnalyticsContext.a(this.f67067c) + ((this.f67066b.hashCode() + (this.f67065a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f67065a, i);
                dest.writeParcelable(this.f67066b, i);
                m.x(this.f67067c, dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$EligibilityCriteria;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EligibilityCriteria extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<EligibilityCriteria> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f67068a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(EligibilityCriteria.class, parcel, arrayList, iE, 1);
                    }
                    return new EligibilityCriteria(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EligibilityCriteria[i];
                }
            }

            public EligibilityCriteria(List criteria) {
                Intrinsics.checkNotNullParameter(criteria, "criteria");
                this.f67068a = criteria;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof EligibilityCriteria) && Intrinsics.f(this.f67068a, ((EligibilityCriteria) obj2).f67068a);
            }

            public final int hashCode() {
                return this.f67068a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f67068a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$Maintenance;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Maintenance extends ModalStep {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Maintenance f67069a = new Maintenance();

            @NotNull
            public static final Parcelable.Creator<Maintenance> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Maintenance.f67069a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Maintenance[i];
                }
            }

            private Maintenance() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$NotEligible;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NotEligible extends ModalStep {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NotEligible f67070a = new NotEligible();

            @NotNull
            public static final Parcelable.Creator<NotEligible> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NotEligible.f67070a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NotEligible[i];
                }
            }

            private NotEligible() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$OtherApplicationInProgress;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OtherApplicationInProgress extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<OtherApplicationInProgress> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final it3.d f67071a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final w0 f67072b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OtherApplicationInProgress((it3.d) parcel.readSerializable(), ((AnalyticsContext) parcel.readParcelable(OtherApplicationInProgress.class.getClassLoader())).f50296a);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OtherApplicationInProgress[i];
                }
            }

            public OtherApplicationInProgress(it3.d status, w0 w0Var) {
                Intrinsics.checkNotNullParameter(status, "status");
                this.f67071a = status;
                this.f67072b = w0Var;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OtherApplicationInProgress)) {
                    return false;
                }
                OtherApplicationInProgress otherApplicationInProgress = (OtherApplicationInProgress) obj2;
                return Intrinsics.f(this.f67071a, otherApplicationInProgress.f67071a) && Intrinsics.f(this.f67072b, otherApplicationInProgress.f67072b);
            }

            public final int hashCode() {
                return AnalyticsContext.a(this.f67072b) + (this.f67071a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67071a);
                m.x(this.f67072b, dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$ResumeApplication;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ResumeApplication extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<ResumeApplication> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final it3.d f67073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final w0 f67074b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ResumeApplication((it3.d) parcel.readSerializable(), ((AnalyticsContext) parcel.readParcelable(ResumeApplication.class.getClassLoader())).f50296a);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ResumeApplication[i];
                }
            }

            public ResumeApplication(it3.d status, w0 w0Var) {
                Intrinsics.checkNotNullParameter(status, "status");
                this.f67073a = status;
                this.f67074b = w0Var;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ResumeApplication)) {
                    return false;
                }
                ResumeApplication resumeApplication = (ResumeApplication) obj2;
                return Intrinsics.f(this.f67073a, resumeApplication.f67073a) && Intrinsics.f(this.f67074b, resumeApplication.f67074b);
            }

            public final int hashCode() {
                return AnalyticsContext.a(this.f67074b) + (this.f67073a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67073a);
                m.x(this.f67074b, dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep$UpdateRequired;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ModalStep;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class UpdateRequired extends ModalStep {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UpdateRequired f67075a = new UpdateRequired();

            @NotNull
            public static final Parcelable.Creator<UpdateRequired> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UpdateRequired.f67075a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UpdateRequired[i];
                }
            }

            private UpdateRequired() {
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

        private ModalStep() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$PlanSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSelection extends CreditApplicationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f67076a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSelection((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSelection[i];
            }
        }

        public PlanSelection(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f67076a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanSelection) && Intrinsics.f(this.f67076a, ((PlanSelection) obj2).f67076a);
        }

        public final int hashCode() {
            return this.f67076a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67076a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$Plugin;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Plugin extends CreditApplicationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Plugin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PluginPayload f67077a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Plugin((PluginPayload) parcel.readParcelable(Plugin.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Plugin[i];
            }
        }

        public Plugin(PluginPayload pluginPayload) {
            Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
            this.f67077a = pluginPayload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Plugin) && Intrinsics.f(this.f67077a, ((Plugin) obj2).f67077a);
        }

        public final int hashCode() {
            return this.f67077a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67077a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$PreApplicationChecks;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreApplicationChecks extends CreditApplicationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PreApplicationChecks> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreApplicationChecksScenario f67078a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreApplicationChecks((PreApplicationChecksScenario) parcel.readParcelable(PreApplicationChecks.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreApplicationChecks[i];
            }
        }

        public PreApplicationChecks(PreApplicationChecksScenario scenario) {
            Intrinsics.checkNotNullParameter(scenario, "scenario");
            this.f67078a = scenario;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PreApplicationChecks) && Intrinsics.f(this.f67078a, ((PreApplicationChecks) obj2).f67078a);
        }

        public final int hashCode() {
            return this.f67078a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67078a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "NextAction", "com/revolut/feature/credit/application/plugins/impl/ui/application/a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticles extends CreditApplicationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticles> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f67079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NextAction f67080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.feature.credit.application.plugins.impl.ui.application.a f67081c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles$NextAction;", "Landroid/os/Parcelable;", "CustomStep", "NextApplicationStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles$NextAction$CustomStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles$NextAction$NextApplicationStep;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface NextAction extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles$NextAction$CustomStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles$NextAction;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class CustomStep implements NextAction {

                @NotNull
                public static final Parcelable.Creator<CustomStep> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CreditApplicationFlowContract$Step f67082a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new CustomStep((CreditApplicationFlowContract$Step) parcel.readParcelable(CustomStep.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new CustomStep[i];
                    }
                }

                public CustomStep(CreditApplicationFlowContract$Step step) {
                    Intrinsics.checkNotNullParameter(step, "step");
                    this.f67082a = step;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof CustomStep) && Intrinsics.f(this.f67082a, ((CustomStep) obj2).f67082a);
                }

                public final int hashCode() {
                    return this.f67082a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f67082a, i);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles$NextAction$NextApplicationStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductArticles$NextAction;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class NextApplicationStep implements NextAction {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final NextApplicationStep f67083a = new NextApplicationStep();

                @NotNull
                public static final Parcelable.Creator<NextApplicationStep> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return NextApplicationStep.f67083a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new NextApplicationStep[i];
                    }
                }

                private NextApplicationStep() {
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
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticles((wi0.b) parcel.readSerializable(), (NextAction) parcel.readParcelable(ProductArticles.class.getClassLoader()), com.revolut.feature.credit.application.plugins.impl.ui.application.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticles[i];
            }
        }

        public ProductArticles(wi0.b countryCode, NextAction nextAction, com.revolut.feature.credit.application.plugins.impl.ui.application.a variant) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(nextAction, "nextAction");
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.f67079a = countryCode;
            this.f67080b = nextAction;
            this.f67081c = variant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticles)) {
                return false;
            }
            ProductArticles productArticles = (ProductArticles) obj2;
            return Intrinsics.f(this.f67079a, productArticles.f67079a) && Intrinsics.f(this.f67080b, productArticles.f67080b) && this.f67081c == productArticles.f67081c;
        }

        public final int hashCode() {
            return this.f67081c.hashCode() + ((this.f67080b.hashCode() + (this.f67079a.f297794a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67079a);
            dest.writeParcelable(this.f67080b, i);
            dest.writeString(this.f67081c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "<init>", "()V", "ForbearanceSelfService", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductIntro$ForbearanceSelfService;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ProductIntro extends CreditApplicationFlowContract$Step {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductIntro$ForbearanceSelfService;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ProductIntro;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ForbearanceSelfService extends ProductIntro {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ForbearanceSelfService f67084a = new ForbearanceSelfService();

            @NotNull
            public static final Parcelable.Creator<ForbearanceSelfService> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ForbearanceSelfService.f67084a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ForbearanceSelfService[i];
                }
            }

            private ForbearanceSelfService() {
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

        private ProductIntro() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ResumeIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "<init>", "()V", "ForbearanceSelfService", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ResumeIntro$ForbearanceSelfService;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ResumeIntro extends CreditApplicationFlowContract$Step {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ResumeIntro$ForbearanceSelfService;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$ResumeIntro;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ForbearanceSelfService extends ResumeIntro {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ForbearanceSelfService f67085a = new ForbearanceSelfService();

            @NotNull
            public static final Parcelable.Creator<ForbearanceSelfService> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ForbearanceSelfService.f67085a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ForbearanceSelfService[i];
                }
            }

            private ForbearanceSelfService() {
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

        private ResumeIntro() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$WaitingList;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WaitingList extends CreditApplicationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WaitingList f67086a = new WaitingList();

        @NotNull
        public static final Parcelable.Creator<WaitingList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WaitingList.f67086a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitingList[i];
            }
        }

        private WaitingList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step$Workflow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends CreditApplicationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f67088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wi0.b f67089c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString(), parcel.readString(), (wi0.b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String applicationId, String workflowId, wi0.b countryCode, boolean z) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f67087a = applicationId;
            this.f67088b = workflowId;
            this.f67089c = countryCode;
            this.d = z;
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
            return Intrinsics.f(this.f67087a, workflow.f67087a) && Intrinsics.f(this.f67088b, workflow.f67088b) && Intrinsics.f(this.f67089c, workflow.f67089c) && this.d == workflow.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f67087a.hashCode() * 31, 31, this.f67088b), 31, this.f67089c.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67087a);
            dest.writeString(this.f67088b);
            dest.writeSerializable(this.f67089c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private CreditApplicationFlowContract$Step() {
    }
}
