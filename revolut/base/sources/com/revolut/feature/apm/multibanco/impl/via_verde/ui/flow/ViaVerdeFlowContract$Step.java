package com.revolut.feature.apm.multibanco.impl.via_verde.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/via_verde/ui/flow/ViaVerdeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Home", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/flow/ViaVerdeFlowContract$Step$Home;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ViaVerdeFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/flow/ViaVerdeFlowContract$Step$Home;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/flow/ViaVerdeFlowContract$Step;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home implements ViaVerdeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f62652a = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f62652a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
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
