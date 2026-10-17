package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.AvcScreen;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\b\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionCaptureScreen;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/AvcScreen;", "shouldUseMlKit", "", "isCameraXEnabled", "(ZZ)V", "component1", "component2", "copy", "createFragment", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/MotionCaptureFragment;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MotionCaptureScreen implements AvcScreen {

    @NotNull
    public static final Parcelable.Creator<MotionCaptureScreen> CREATOR = new Creator();
    private final boolean isCameraXEnabled;
    private final boolean shouldUseMlKit;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MotionCaptureScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MotionCaptureScreen createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MotionCaptureScreen(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MotionCaptureScreen[] newArray(int i) {
            return new MotionCaptureScreen[i];
        }
    }

    public MotionCaptureScreen(boolean z, boolean z3) {
        this.shouldUseMlKit = z;
        this.isCameraXEnabled = z3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final boolean getShouldUseMlKit() {
        return this.shouldUseMlKit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final boolean getIsCameraXEnabled() {
        return this.isCameraXEnabled;
    }

    public static /* synthetic */ MotionCaptureScreen copy$default(MotionCaptureScreen motionCaptureScreen, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = motionCaptureScreen.shouldUseMlKit;
        }
        if ((i & 2) != 0) {
            z3 = motionCaptureScreen.isCameraXEnabled;
        }
        return motionCaptureScreen.copy(z, z3);
    }

    @NotNull
    public final MotionCaptureScreen copy(boolean shouldUseMlKit, boolean isCameraXEnabled) {
        return new MotionCaptureScreen(shouldUseMlKit, isCameraXEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionCaptureScreen)) {
            return false;
        }
        MotionCaptureScreen motionCaptureScreen = (MotionCaptureScreen) other;
        return this.shouldUseMlKit == motionCaptureScreen.shouldUseMlKit && this.isCameraXEnabled == motionCaptureScreen.isCameraXEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCameraXEnabled) + (Boolean.hashCode(this.shouldUseMlKit) * 31);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public String screenKey() {
        return AvcScreen.DefaultImpls.screenKey(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("MotionCaptureScreen(shouldUseMlKit=");
        sb6.append(this.shouldUseMlKit);
        sb6.append(", isCameraXEnabled=");
        return a.x(sb6, this.isCameraXEnabled, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.shouldUseMlKit ? 1 : 0);
        parcel.writeInt(this.isCameraXEnabled ? 1 : 0);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public MotionCaptureFragment createFragment() {
        return MotionCaptureFragment.INSTANCE.createInstance(this.shouldUseMlKit, this.isCameraXEnabled);
    }
}
