package com.revolut.feature.credit.application.plugins.impl.ui.sso.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelfieIntro", "ModalStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step$SelfieIntro;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SelfieIntroFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step;", "<init>", "()V", "Cancellation", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step$ModalStep$Cancellation;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep extends SelfieIntroFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step$ModalStep$Cancellation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cancellation extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<Cancellation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationCancellationModelExtension$CancellationVariant f68478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PluginPayload f68479b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final w0 f68480c;

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
                this.f68478a = variant;
                this.f68479b = pluginPayload;
                this.f68480c = w0Var;
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
                return Intrinsics.f(this.f68478a, cancellation.f68478a) && Intrinsics.f(this.f68479b, cancellation.f68479b) && Intrinsics.f(this.f68480c, cancellation.f68480c);
            }

            public final int hashCode() {
                return AnalyticsContext.a(this.f68480c) + ((this.f68479b.hashCode() + (this.f68478a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68478a, i);
                dest.writeParcelable(this.f68479b, i);
                m.x(this.f68480c, dest, i);
            }
        }

        private ModalStep() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step$SelfieIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/flow/SelfieIntroFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelfieIntro extends SelfieIntroFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelfieIntro f68481a = new SelfieIntro();

        @NotNull
        public static final Parcelable.Creator<SelfieIntro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelfieIntro.f68481a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfieIntro[i];
            }
        }

        private SelfieIntro() {
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

    private SelfieIntroFlowContract$Step() {
    }
}
