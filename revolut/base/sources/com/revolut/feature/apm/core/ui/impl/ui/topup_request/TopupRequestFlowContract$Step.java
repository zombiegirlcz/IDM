package com.revolut.feature.apm.core.ui.impl.ui.topup_request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/topup_request/TopupRequestFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Details", "Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/TopupRequestFlowContract$Step$Details;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopupRequestFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/TopupRequestFlowContract$Step$Details;", "Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/TopupRequestFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements TopupRequestFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTopupRequestNavigation$InputData f62409a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details((ApmTopupRequestNavigation$InputData) parcel.readParcelable(Details.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(ApmTopupRequestNavigation$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f62409a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f62409a, ((Details) obj2).f62409a);
        }

        public final int hashCode() {
            return this.f62409a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62409a, i);
        }
    }
}
