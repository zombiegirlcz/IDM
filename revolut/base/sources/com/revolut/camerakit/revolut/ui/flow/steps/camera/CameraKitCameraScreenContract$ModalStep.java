package com.revolut.camerakit.revolut.ui.flow.steps.camera;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FrequentlyAskedQuestions", "SignLanguageHintBottomSheet", "SpokenDigitsHintBottomSheet", "LanguageSelector", "Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep$FrequentlyAskedQuestions;", "Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep$LanguageSelector;", "Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep$SignLanguageHintBottomSheet;", "Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep$SpokenDigitsHintBottomSheet;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CameraKitCameraScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep$FrequentlyAskedQuestions;", "Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep;", "<init>", "()V", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FrequentlyAskedQuestions implements CameraKitCameraScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FrequentlyAskedQuestions f50799a = new FrequentlyAskedQuestions();

        @NotNull
        public static final Parcelable.Creator<FrequentlyAskedQuestions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FrequentlyAskedQuestions.f50799a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FrequentlyAskedQuestions[i];
            }
        }

        private FrequentlyAskedQuestions() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep$LanguageSelector;", "Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep;", "<init>", "()V", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LanguageSelector implements CameraKitCameraScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LanguageSelector f50800a = new LanguageSelector();

        @NotNull
        public static final Parcelable.Creator<LanguageSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LanguageSelector.f50800a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LanguageSelector[i];
            }
        }

        private LanguageSelector() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep$SignLanguageHintBottomSheet;", "Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep;", "<init>", "()V", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SignLanguageHintBottomSheet implements CameraKitCameraScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SignLanguageHintBottomSheet f50801a = new SignLanguageHintBottomSheet();

        @NotNull
        public static final Parcelable.Creator<SignLanguageHintBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SignLanguageHintBottomSheet.f50801a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignLanguageHintBottomSheet[i];
            }
        }

        private SignLanguageHintBottomSheet() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep$SpokenDigitsHintBottomSheet;", "Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/CameraKitCameraScreenContract$ModalStep;", "<init>", "()V", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpokenDigitsHintBottomSheet implements CameraKitCameraScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpokenDigitsHintBottomSheet f50802a = new SpokenDigitsHintBottomSheet();

        @NotNull
        public static final Parcelable.Creator<SpokenDigitsHintBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpokenDigitsHintBottomSheet.f50802a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpokenDigitsHintBottomSheet[i];
            }
        }

        private SpokenDigitsHintBottomSheet() {
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
