package com.revolut.feature.credit.application.plugins.impl.ui.spinner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Spinner", "StatusDialog", "ModalStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$Spinner;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$StatusDialog;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SpinnerFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step;", "<init>", "()V", "TimeoutStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$ModalStep$TimeoutStep;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep extends SpinnerFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$ModalStep$TimeoutStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TimeoutStep extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<TimeoutStep> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WaitingPopupScreenConfig f68410a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final w0 f68411b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TimeoutStep((WaitingPopupScreenConfig) parcel.readParcelable(TimeoutStep.class.getClassLoader()), ((AnalyticsContext) parcel.readParcelable(TimeoutStep.class.getClassLoader())).f50296a);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TimeoutStep[i];
                }
            }

            public TimeoutStep(WaitingPopupScreenConfig config, w0 w0Var) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.f68410a = config;
                this.f68411b = w0Var;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TimeoutStep)) {
                    return false;
                }
                TimeoutStep timeoutStep = (TimeoutStep) obj2;
                return Intrinsics.f(this.f68410a, timeoutStep.f68410a) && Intrinsics.f(this.f68411b, timeoutStep.f68411b);
            }

            public final int hashCode() {
                return AnalyticsContext.a(this.f68411b) + (this.f68410a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68410a, i);
                m.x(this.f68411b, dest, i);
            }
        }

        private ModalStep() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$Spinner;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Spinner extends SpinnerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Spinner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpinnerConfiguration.FullScreen f68412a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Spinner((SpinnerConfiguration.FullScreen) parcel.readParcelable(Spinner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Spinner[i];
            }
        }

        public Spinner(SpinnerConfiguration.FullScreen configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f68412a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Spinner) && Intrinsics.f(this.f68412a, ((Spinner) obj2).f68412a);
        }

        public final int hashCode() {
            return this.f68412a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68412a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step$StatusDialog;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusDialog extends SpinnerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StatusDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpinnerConfiguration.Popup f68413a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatusDialog((SpinnerConfiguration.Popup) parcel.readParcelable(StatusDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatusDialog[i];
            }
        }

        public StatusDialog(SpinnerConfiguration.Popup configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f68413a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StatusDialog) && Intrinsics.f(this.f68413a, ((StatusDialog) obj2).f68413a);
        }

        public final int hashCode() {
            return this.f68413a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68413a, i);
        }
    }

    private SpinnerFlowContract$Step() {
    }
}
