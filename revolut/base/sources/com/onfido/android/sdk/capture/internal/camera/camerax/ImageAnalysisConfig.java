package com.onfido.android.sdk.capture.internal.camera.camerax;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import pkm.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalysisConfig;", "", "Lkotlin/time/b;", "imageAnalysisFrequency", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-UwyO8pc", "()J", "component1", "copy-LRDsOJo", "(J)Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalysisConfig;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getImageAnalysisFrequency-UwyO8pc", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ImageAnalysisConfig {
    private final long imageAnalysisFrequency;

    private ImageAnalysisConfig(long j2) {
        this.imageAnalysisFrequency = j2;
    }

    /* JADX INFO: renamed from: copy-LRDsOJo$default, reason: not valid java name */
    public static /* synthetic */ ImageAnalysisConfig m3692copyLRDsOJo$default(ImageAnalysisConfig imageAnalysisConfig, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = imageAnalysisConfig.imageAnalysisFrequency;
        }
        return imageAnalysisConfig.m3694copyLRDsOJo(j2);
    }

    /* JADX INFO: renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
    public final long getImageAnalysisFrequency() {
        return this.imageAnalysisFrequency;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-LRDsOJo, reason: not valid java name */
    public final ImageAnalysisConfig m3694copyLRDsOJo(long imageAnalysisFrequency) {
        return new ImageAnalysisConfig(imageAnalysisFrequency, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageAnalysisConfig) && kotlin.time.b.d(this.imageAnalysisFrequency, ((ImageAnalysisConfig) other).imageAnalysisFrequency);
    }

    /* JADX INFO: renamed from: getImageAnalysisFrequency-UwyO8pc, reason: not valid java name */
    public final long m3695getImageAnalysisFrequencyUwyO8pc() {
        return this.imageAnalysisFrequency;
    }

    public int hashCode() {
        long j2 = this.imageAnalysisFrequency;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(j2);
    }

    @NotNull
    public String toString() {
        return "ImageAnalysisConfig(imageAnalysisFrequency=" + ((Object) kotlin.time.b.o(this.imageAnalysisFrequency)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageAnalysisConfig(long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            j2 = c.g(100, e.MILLISECONDS);
        }
        this(j2, null);
    }

    public /* synthetic */ ImageAnalysisConfig(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }
}
