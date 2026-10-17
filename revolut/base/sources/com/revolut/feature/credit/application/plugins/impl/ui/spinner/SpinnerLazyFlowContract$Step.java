package com.revolut.feature.credit.application.plugins.impl.ui.spinner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerLazyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Timeout", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerLazyFlowContract$Step$Timeout;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SpinnerLazyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerLazyFlowContract$Step$Timeout;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerLazyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Timeout extends SpinnerLazyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Timeout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WaitingPopupScreenConfig f68416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w0 f68417b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Timeout((WaitingPopupScreenConfig) parcel.readParcelable(Timeout.class.getClassLoader()), ((AnalyticsContext) parcel.readParcelable(Timeout.class.getClassLoader())).f50296a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Timeout[i];
            }
        }

        public Timeout(WaitingPopupScreenConfig config, w0 w0Var) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f68416a = config;
            this.f68417b = w0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Timeout)) {
                return false;
            }
            Timeout timeout = (Timeout) obj2;
            return Intrinsics.f(this.f68416a, timeout.f68416a) && Intrinsics.f(this.f68417b, timeout.f68417b);
        }

        public final int hashCode() {
            return AnalyticsContext.a(this.f68417b) + (this.f68416a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68416a, i);
            m.x(this.f68417b, dest, i);
        }
    }

    private SpinnerLazyFlowContract$Step() {
    }
}
