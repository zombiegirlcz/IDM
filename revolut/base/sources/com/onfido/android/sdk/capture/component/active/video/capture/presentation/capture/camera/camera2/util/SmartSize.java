package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util;

import android.util.Size;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/SmartSize;", "", "width", "", "height", "(II)V", "landscape", "Landroid/util/Size;", "getLandscape", "()Landroid/util/Size;", "long", "getLong", "()I", "portrait", "getPortrait", "short", "getShort", "size", "getSize", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SmartSize {

    @NotNull
    private final Size landscape;
    private final int long;

    @NotNull
    private final Size portrait;
    private final int short;

    @NotNull
    private final Size size;

    public SmartSize(int i, int i2) {
        Size size = new Size(i, i2);
        this.size = size;
        int iMax = Math.max(size.getWidth(), size.getHeight());
        this.long = iMax;
        int iMin = Math.min(size.getWidth(), size.getHeight());
        this.short = iMin;
        this.landscape = new Size(iMax, iMin);
        this.portrait = new Size(iMin, iMax);
    }

    @NotNull
    public final Size getLandscape() {
        return this.landscape;
    }

    public final int getLong() {
        return this.long;
    }

    @NotNull
    public final Size getPortrait() {
        return this.portrait;
    }

    public final int getShort() {
        return this.short;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("SmartSize(");
        sb6.append(this.long);
        sb6.append('x');
        return a.t(sb6, this.short, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
