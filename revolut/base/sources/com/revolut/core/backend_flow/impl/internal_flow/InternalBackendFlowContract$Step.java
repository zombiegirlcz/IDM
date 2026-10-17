package com.revolut.core.backend_flow.impl.internal_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/core/backend_flow/impl/internal_flow/InternalBackendFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Init", "Screen", "Lcom/revolut/core/backend_flow/impl/internal_flow/InternalBackendFlowContract$Step$Init;", "Lcom/revolut/core/backend_flow/impl/internal_flow/InternalBackendFlowContract$Step$Screen;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InternalBackendFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/backend_flow/impl/internal_flow/InternalBackendFlowContract$Step$Init;", "Lcom/revolut/core/backend_flow/impl/internal_flow/InternalBackendFlowContract$Step;", "<init>", "()V", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Init extends InternalBackendFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Init f51243a = new Init();

        @NotNull
        public static final Parcelable.Creator<Init> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Init.f51243a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Init[i];
            }
        }

        private Init() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/impl/internal_flow/InternalBackendFlowContract$Step$Screen;", "Lcom/revolut/core/backend_flow/impl/internal_flow/InternalBackendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen extends InternalBackendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Screen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51244a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Screen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Screen[i];
            }
        }

        public Screen(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f51244a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Screen) && Intrinsics.f(this.f51244a, ((Screen) obj2).f51244a);
        }

        public final int hashCode() {
            return this.f51244a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51244a);
        }
    }

    private InternalBackendFlowContract$Step() {
    }
}
