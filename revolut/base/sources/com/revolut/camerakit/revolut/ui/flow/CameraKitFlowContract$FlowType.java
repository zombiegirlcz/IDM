package com.revolut.camerakit.revolut.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType", "Landroid/os/Parcelable;", "Selfie", "Document", "ActiveLiveness", "QrCode", "Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType$ActiveLiveness;", "Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType$Document;", "Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType$QrCode;", "Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType$Selfie;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CameraKitFlowContract$FlowType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType$ActiveLiveness;", "Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType;", "<init>", "()V", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActiveLiveness implements CameraKitFlowContract$FlowType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActiveLiveness f50792a = new ActiveLiveness();

        @NotNull
        public static final Parcelable.Creator<ActiveLiveness> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActiveLiveness.f50792a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveLiveness[i];
            }
        }

        private ActiveLiveness() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType$Document;", "Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType;", "<init>", "()V", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Document implements CameraKitFlowContract$FlowType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Document f50793a = new Document();

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Document.f50793a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        private Document() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType$QrCode;", "Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType;", "", "toString", "()Ljava/lang/String;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrCode implements CameraKitFlowContract$FlowType {

        @NotNull
        public static final Parcelable.Creator<QrCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MsBarcodeDetectorSettings f50794a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrCode((MsBarcodeDetectorSettings) parcel.readParcelable(QrCode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCode[i];
            }
        }

        public QrCode(MsBarcodeDetectorSettings detectorSettings) {
            Intrinsics.checkNotNullParameter(detectorSettings, "detectorSettings");
            this.f50794a = detectorSettings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof QrCode) && Intrinsics.f(this.f50794a, ((QrCode) obj2).f50794a);
        }

        public final int hashCode() {
            return this.f50794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50794a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType$Selfie;", "Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$FlowType;", "", "toString", "()Ljava/lang/String;", "com/revolut/camerakit/revolut/ui/flow/a", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selfie implements CameraKitFlowContract$FlowType {

        @NotNull
        public static final Parcelable.Creator<Selfie> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.camerakit.revolut.ui.flow.a f50795a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Selfie(com.revolut.camerakit.revolut.ui.flow.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selfie[i];
            }
        }

        public Selfie() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Selfie) && this.f50795a == ((Selfie) obj2).f50795a;
        }

        public final int hashCode() {
            return this.f50795a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50795a.name());
        }

        public Selfie(com.revolut.camerakit.revolut.ui.flow.a selfieUi) {
            Intrinsics.checkNotNullParameter(selfieUi, "selfieUi");
            this.f50795a = selfieUi;
        }

        public /* synthetic */ Selfie(int i) {
            this(com.revolut.camerakit.revolut.ui.flow.a.DEFAULT);
        }
    }
}
