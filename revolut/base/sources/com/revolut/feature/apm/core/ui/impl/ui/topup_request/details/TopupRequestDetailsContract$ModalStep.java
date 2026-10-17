package com.revolut.feature.apm.core.ui.impl.ui.topup_request.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/topup_request/details/TopupRequestDetailsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Approve", "Decline", "Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/details/TopupRequestDetailsContract$ModalStep$Approve;", "Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/details/TopupRequestDetailsContract$ModalStep$Decline;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopupRequestDetailsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/details/TopupRequestDetailsContract$ModalStep$Approve;", "Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/details/TopupRequestDetailsContract$ModalStep;", "<init>", "()V", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Approve implements TopupRequestDetailsContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Approve f62410a = new Approve();

        @NotNull
        public static final Parcelable.Creator<Approve> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Approve.f62410a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Approve[i];
            }
        }

        private Approve() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/details/TopupRequestDetailsContract$ModalStep$Decline;", "Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/details/TopupRequestDetailsContract$ModalStep;", "<init>", "()V", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Decline implements TopupRequestDetailsContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Decline f62411a = new Decline();

        @NotNull
        public static final Parcelable.Creator<Decline> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Decline.f62411a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Decline[i];
            }
        }

        private Decline() {
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
