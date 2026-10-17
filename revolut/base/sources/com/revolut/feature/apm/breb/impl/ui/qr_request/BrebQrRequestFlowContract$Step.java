package com.revolut.feature.apm.breb.impl.ui.qr_request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Request", "Amount", "KeySelection", "Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step$Amount;", "Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step$KeySelection;", "Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step$Request;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrebQrRequestFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step$Amount;", "Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Amount implements BrebQrRequestFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Amount f61753a = new Amount();

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Amount.f61753a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        private Amount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step$KeySelection;", "Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KeySelection implements BrebQrRequestFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KeySelection f61754a = new KeySelection();

        @NotNull
        public static final Parcelable.Creator<KeySelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KeySelection.f61754a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KeySelection[i];
            }
        }

        private KeySelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step$Request;", "Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Request implements BrebQrRequestFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Request f61755a = new Request();

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Request.f61755a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        private Request() {
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
