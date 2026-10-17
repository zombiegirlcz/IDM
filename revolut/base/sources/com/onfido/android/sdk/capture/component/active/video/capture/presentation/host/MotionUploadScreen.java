package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.AvcScreen;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadFragment;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\b\u0010\u0007\u001a\u00020\bH\u0016J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionUploadScreen;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/AvcScreen;", "filePath", "", "(Ljava/lang/String;)V", "component1", "copy", "createFragment", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadFragment;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MotionUploadScreen implements AvcScreen {

    @NotNull
    public static final Parcelable.Creator<MotionUploadScreen> CREATOR = new Creator();

    @NotNull
    private final String filePath;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MotionUploadScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MotionUploadScreen createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MotionUploadScreen(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MotionUploadScreen[] newArray(int i) {
            return new MotionUploadScreen[i];
        }
    }

    public MotionUploadScreen(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getFilePath() {
        return this.filePath;
    }

    public static /* synthetic */ MotionUploadScreen copy$default(MotionUploadScreen motionUploadScreen, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = motionUploadScreen.filePath;
        }
        return motionUploadScreen.copy(str);
    }

    @NotNull
    public final MotionUploadScreen copy(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new MotionUploadScreen(filePath);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MotionUploadScreen) && Intrinsics.f(this.filePath, ((MotionUploadScreen) other).filePath);
    }

    public int hashCode() {
        return this.filePath.hashCode();
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public String screenKey() {
        return AvcScreen.DefaultImpls.screenKey(this);
    }

    @NotNull
    public String toString() {
        return a.u(new StringBuilder("MotionUploadScreen(filePath="), this.filePath, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.filePath);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public MotionUploadFragment createFragment() {
        return MotionUploadFragment.INSTANCE.createInstance$onfido_capture_sdk_core_release(this.filePath);
    }
}
