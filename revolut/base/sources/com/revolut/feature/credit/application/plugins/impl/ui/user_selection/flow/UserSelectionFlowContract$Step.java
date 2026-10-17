package com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import fz3.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/user_selection/flow/UserSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "Lcom/revolut/feature/credit/application/plugins/impl/ui/user_selection/flow/UserSelectionFlowContract$Step$Initial;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserSelectionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/user_selection/flow/UserSelectionFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/user_selection/flow/UserSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements UserSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f68495a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Initial((c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        public Initial(c configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f68495a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Initial) && Intrinsics.f(this.f68495a, ((Initial) obj2).f68495a);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f68495a.f139083a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68495a);
        }
    }
}
