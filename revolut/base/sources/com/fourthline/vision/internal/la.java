package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.internal.b0;
import com.fourthline.vision.internal.o8;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class la {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f36486g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o8.a f36488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0.c f36489c;
    private final float d;
    private final boolean e;
    private final boolean f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final la initFrom(@NotNull SelfieScannerConfig selfieConfig) {
            Intrinsics.checkNotNullParameter(selfieConfig, "selfieConfig");
            return new la(selfieConfig.getDebugModeEnabled(), ma.toInternalType(selfieConfig.getRecordingType()), b0.c.f35984a, 0.4f, true, selfieConfig.getIncludeMotionData());
        }

        private a() {
        }

        @NotNull
        public final la initFrom(@NotNull DocumentScannerConfig documentConfig, boolean z) {
            Intrinsics.checkNotNullParameter(documentConfig, "documentConfig");
            return new la(documentConfig.getDebugModeEnabled(), ma.toInternalType(documentConfig.getRecordingType()), b0.c.f35985b, 0.2f, z, documentConfig.getIncludeMotionData());
        }
    }

    public la(boolean z, @NotNull o8.a recordingType, @NotNull b0.c cameraDirection, float f, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(recordingType, "recordingType");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        this.f36487a = z;
        this.f36488b = recordingType;
        this.f36489c = cameraDirection;
        this.d = f;
        this.e = z3;
        this.f = z4;
    }

    public static /* synthetic */ la copy$default(la laVar, boolean z, o8.a aVar, b0.c cVar, float f, boolean z3, boolean z4, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = laVar.f36487a;
        }
        if ((i & 2) != 0) {
            aVar = laVar.f36488b;
        }
        if ((i & 4) != 0) {
            cVar = laVar.f36489c;
        }
        if ((i & 8) != 0) {
            f = laVar.d;
        }
        if ((i & 16) != 0) {
            z3 = laVar.e;
        }
        if ((i & 32) != 0) {
            z4 = laVar.f;
        }
        boolean z6 = z3;
        boolean z11 = z4;
        return laVar.copy(z, aVar, cVar, f, z6, z11);
    }

    public final boolean component1() {
        return this.f36487a;
    }

    @NotNull
    public final o8.a component2() {
        return this.f36488b;
    }

    @NotNull
    public final b0.c component3() {
        return this.f36489c;
    }

    public final float component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    @NotNull
    public final la copy(boolean z, @NotNull o8.a recordingType, @NotNull b0.c cameraDirection, float f, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(recordingType, "recordingType");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        return new la(z, recordingType, cameraDirection, f, z3, z4);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof la)) {
            return false;
        }
        la laVar = (la) obj2;
        return this.f36487a == laVar.f36487a && this.f36488b == laVar.f36488b && this.f36489c == laVar.f36489c && Float.compare(this.d, laVar.d) == 0 && this.e == laVar.e && this.f == laVar.f;
    }

    @NotNull
    public final b0.c getCameraDirection() {
        return this.f36489c;
    }

    public final boolean getDebugModeEnabled() {
        return this.f36487a;
    }

    public final float getFastFaceDetectorMinFaceSize() {
        return this.d;
    }

    @NotNull
    public final o8.a getRecordingType() {
        return this.f36488b;
    }

    public final boolean getShouldCollectMotionData() {
        return this.f;
    }

    public final boolean getShouldStartAutomatically() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f36487a) * 31) + this.f36488b.hashCode()) * 31) + this.f36489c.hashCode()) * 31) + Float.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    @NotNull
    public String toString() {
        return "ScannerConfig(debugModeEnabled=" + this.f36487a + ", recordingType=" + this.f36488b + ", cameraDirection=" + this.f36489c + ", fastFaceDetectorMinFaceSize=" + this.d + ", shouldStartAutomatically=" + this.e + ", shouldCollectMotionData=" + this.f + ")";
    }
}
