package com.revolut.feature.backend_driven_limits.impl.v2.ui.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backend_driven_limits.api.model.ActionDetailedInfo;
import com.revolut.feature.backend_driven_limits.api.model.RestrictedFundsDetailedInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/backend_driven_limits/impl/v2/ui/list/RestrictionsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RestrictedFundsStep", "RestrictedActionStep", "Lcom/revolut/feature/backend_driven_limits/impl/v2/ui/list/RestrictionsScreenContract$ModalStep$RestrictedActionStep;", "Lcom/revolut/feature/backend_driven_limits/impl/v2/ui/list/RestrictionsScreenContract$ModalStep$RestrictedFundsStep;", "feature_backend_driven_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RestrictionsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_driven_limits/impl/v2/ui/list/RestrictionsScreenContract$ModalStep$RestrictedActionStep;", "Lcom/revolut/feature/backend_driven_limits/impl/v2/ui/list/RestrictionsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_backend_driven_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestrictedActionStep extends RestrictionsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RestrictedActionStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionDetailedInfo f63208a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RestrictedActionStep((ActionDetailedInfo) parcel.readParcelable(RestrictedActionStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RestrictedActionStep[i];
            }
        }

        public RestrictedActionStep(ActionDetailedInfo detailedInfo) {
            Intrinsics.checkNotNullParameter(detailedInfo, "detailedInfo");
            this.f63208a = detailedInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RestrictedActionStep) && Intrinsics.f(this.f63208a, ((RestrictedActionStep) obj2).f63208a);
        }

        public final int hashCode() {
            return this.f63208a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63208a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_driven_limits/impl/v2/ui/list/RestrictionsScreenContract$ModalStep$RestrictedFundsStep;", "Lcom/revolut/feature/backend_driven_limits/impl/v2/ui/list/RestrictionsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_backend_driven_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestrictedFundsStep extends RestrictionsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RestrictedFundsStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RestrictedFundsDetailedInfo f63209a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RestrictedFundsStep((RestrictedFundsDetailedInfo) parcel.readParcelable(RestrictedFundsStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RestrictedFundsStep[i];
            }
        }

        public RestrictedFundsStep(RestrictedFundsDetailedInfo detailedInfo) {
            Intrinsics.checkNotNullParameter(detailedInfo, "detailedInfo");
            this.f63209a = detailedInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RestrictedFundsStep) && Intrinsics.f(this.f63209a, ((RestrictedFundsStep) obj2).f63209a);
        }

        public final int hashCode() {
            return this.f63209a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63209a, i);
        }
    }

    private RestrictionsScreenContract$ModalStep() {
    }
}
