package com.revolut.camerakit.revolut.ui.barcode;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "Success", "ActionButtonClicked", "Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData$ActionButtonClicked;", "Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData$Success;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BarcodeReaderFlowContract$OutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData$ActionButtonClicked;", "Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData;", "<init>", "()V", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActionButtonClicked implements BarcodeReaderFlowContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActionButtonClicked f50755a = new ActionButtonClicked();

        @NotNull
        public static final Parcelable.Creator<ActionButtonClicked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActionButtonClicked.f50755a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionButtonClicked[i];
            }
        }

        private ActionButtonClicked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData$Success;", "Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData;", "", "toString", "()Ljava/lang/String;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements BarcodeReaderFlowContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MsBarcode f50756a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((MsBarcode) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(MsBarcode barcode) {
            Intrinsics.checkNotNullParameter(barcode, "barcode");
            this.f50756a = barcode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Success) && Intrinsics.f(this.f50756a, ((Success) obj2).f50756a);
        }

        public final int hashCode() {
            return this.f50756a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50756a, i);
        }
    }
}
