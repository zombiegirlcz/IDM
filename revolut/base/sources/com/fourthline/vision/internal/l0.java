package com.fourthline.vision.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36466c;
    private final Integer d;

    public l0(@NotNull String cameraId, int i, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        this.f36464a = cameraId;
        this.f36465b = i;
        this.f36466c = i2;
        this.d = num;
    }

    public static /* synthetic */ l0 copy$default(l0 l0Var, String str, int i, int i2, Integer num, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            str = l0Var.f36464a;
        }
        if ((i3 & 2) != 0) {
            i = l0Var.f36465b;
        }
        if ((i3 & 4) != 0) {
            i2 = l0Var.f36466c;
        }
        if ((i3 & 8) != 0) {
            num = l0Var.d;
        }
        return l0Var.copy(str, i, i2, num);
    }

    @NotNull
    public final String component1() {
        return this.f36464a;
    }

    public final int component2() {
        return this.f36465b;
    }

    public final int component3() {
        return this.f36466c;
    }

    public final Integer component4() {
        return this.d;
    }

    @NotNull
    public final l0 copy(@NotNull String cameraId, int i, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        return new l0(cameraId, i, i2, num);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f36464a, l0Var.f36464a) && this.f36465b == l0Var.f36465b && this.f36466c == l0Var.f36466c && Intrinsics.f(this.d, l0Var.d);
    }

    @NotNull
    public final String getCameraId() {
        return this.f36464a;
    }

    public final int getCaptureHeight() {
        return this.f36466c;
    }

    public final int getCaptureWidth() {
        return this.f36465b;
    }

    public final Integer getFrameRate() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = ((((this.f36464a.hashCode() * 31) + Integer.hashCode(this.f36465b)) * 31) + Integer.hashCode(this.f36466c)) * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "CameraSpecsInput(cameraId=" + this.f36464a + ", captureWidth=" + this.f36465b + ", captureHeight=" + this.f36466c + ", frameRate=" + this.d + ")";
    }

    public /* synthetic */ l0(String str, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : num);
    }
}
