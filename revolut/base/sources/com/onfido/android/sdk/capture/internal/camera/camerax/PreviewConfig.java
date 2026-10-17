package com.onfido.android.sdk.capture.internal.camera.camerax;

import androidx.camera.view.PreviewView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import pkm.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "", "Landroidx/camera/view/PreviewView$ScaleType;", "scaleType", "", "viewPortEnabled", "Lkotlin/time/b;", "frameSamplingPeriod", "<init>", "(Landroidx/camera/view/PreviewView$ScaleType;ZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/camera/view/PreviewView$ScaleType;", "component2", "()Z", "component3-UwyO8pc", "()J", "component3", "copy-SxA4cEA", "(Landroidx/camera/view/PreviewView$ScaleType;ZJ)Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/view/PreviewView$ScaleType;", "getScaleType", "Z", "getViewPortEnabled", "J", "getFrameSamplingPeriod-UwyO8pc", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PreviewConfig {
    private final long frameSamplingPeriod;

    @NotNull
    private final PreviewView.ScaleType scaleType;
    private final boolean viewPortEnabled;

    private PreviewConfig(PreviewView.ScaleType scaleType, boolean z, long j2) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.scaleType = scaleType;
        this.viewPortEnabled = z;
        this.frameSamplingPeriod = j2;
    }

    /* JADX INFO: renamed from: copy-SxA4cEA$default, reason: not valid java name */
    public static /* synthetic */ PreviewConfig m3696copySxA4cEA$default(PreviewConfig previewConfig, PreviewView.ScaleType scaleType, boolean z, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            scaleType = previewConfig.scaleType;
        }
        if ((i & 2) != 0) {
            z = previewConfig.viewPortEnabled;
        }
        if ((i & 4) != 0) {
            j2 = previewConfig.frameSamplingPeriod;
        }
        return previewConfig.m3698copySxA4cEA(scaleType, z, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreviewView.ScaleType getScaleType() {
        return this.scaleType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getViewPortEnabled() {
        return this.viewPortEnabled;
    }

    /* JADX INFO: renamed from: component3-UwyO8pc, reason: not valid java name and from getter */
    public final long getFrameSamplingPeriod() {
        return this.frameSamplingPeriod;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-SxA4cEA, reason: not valid java name */
    public final PreviewConfig m3698copySxA4cEA(@NotNull PreviewView.ScaleType scaleType, boolean viewPortEnabled, long frameSamplingPeriod) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        return new PreviewConfig(scaleType, viewPortEnabled, frameSamplingPeriod, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewConfig)) {
            return false;
        }
        PreviewConfig previewConfig = (PreviewConfig) other;
        return this.scaleType == previewConfig.scaleType && this.viewPortEnabled == previewConfig.viewPortEnabled && kotlin.time.b.d(this.frameSamplingPeriod, previewConfig.frameSamplingPeriod);
    }

    /* JADX INFO: renamed from: getFrameSamplingPeriod-UwyO8pc, reason: not valid java name */
    public final long m3699getFrameSamplingPeriodUwyO8pc() {
        return this.frameSamplingPeriod;
    }

    @NotNull
    public final PreviewView.ScaleType getScaleType() {
        return this.scaleType;
    }

    public final boolean getViewPortEnabled() {
        return this.viewPortEnabled;
    }

    public int hashCode() {
        int iC = j6.a.c(this.scaleType.hashCode() * 31, 31, this.viewPortEnabled);
        long j2 = this.frameSamplingPeriod;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(j2) + iC;
    }

    @NotNull
    public String toString() {
        return "PreviewConfig(scaleType=" + this.scaleType + ", viewPortEnabled=" + this.viewPortEnabled + ", frameSamplingPeriod=" + ((Object) kotlin.time.b.o(this.frameSamplingPeriod)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreviewConfig(PreviewView.ScaleType scaleType, boolean z, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PreviewView.ScaleType scaleType2 = (i & 1) != 0 ? PreviewView.ScaleType.FILL_CENTER : scaleType;
        boolean z3 = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            j2 = c.g(100, e.MILLISECONDS);
        }
        this(scaleType2, z3, j2, null);
    }

    public /* synthetic */ PreviewConfig(PreviewView.ScaleType scaleType, boolean z, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(scaleType, z, j2);
    }
}
