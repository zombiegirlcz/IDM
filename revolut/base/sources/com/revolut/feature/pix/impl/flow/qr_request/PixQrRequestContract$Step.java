package com.revolut.feature.pix.impl.flow.qr_request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RegisterNewAlias", "RequestViaQR", "AddAmount", "AddDescription", "ChangeKey", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$AddAmount;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$AddDescription;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$ChangeKey;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$RegisterNewAlias;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$RequestViaQR;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixQrRequestContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$AddAmount;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddAmount implements PixQrRequestContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddAmount f80716a = new AddAmount();

        @NotNull
        public static final Parcelable.Creator<AddAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddAmount.f80716a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddAmount[i];
            }
        }

        private AddAmount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$AddDescription;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddDescription implements PixQrRequestContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddDescription f80717a = new AddDescription();

        @NotNull
        public static final Parcelable.Creator<AddDescription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddDescription.f80717a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddDescription[i];
            }
        }

        private AddDescription() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$ChangeKey;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeKey implements PixQrRequestContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeKey f80718a = new ChangeKey();

        @NotNull
        public static final Parcelable.Creator<ChangeKey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeKey.f80718a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeKey[i];
            }
        }

        private ChangeKey() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$RegisterNewAlias;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RegisterNewAlias implements PixQrRequestContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RegisterNewAlias f80719a = new RegisterNewAlias();

        @NotNull
        public static final Parcelable.Creator<RegisterNewAlias> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RegisterNewAlias.f80719a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegisterNewAlias[i];
            }
        }

        private RegisterNewAlias() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step$RequestViaQR;", "Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestViaQR implements PixQrRequestContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestViaQR f80720a = new RequestViaQR();

        @NotNull
        public static final Parcelable.Creator<RequestViaQR> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestViaQR.f80720a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestViaQR[i];
            }
        }

        private RequestViaQR() {
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
