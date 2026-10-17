package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMDecodeResult;", "", "sdkActionPayload", "", "<init>", "(Ljava/lang/String;)V", "getSdkActionPayload", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMDecodeResult {
    private final String sdkActionPayload;

    /* JADX WARN: Multi-variable type inference failed */
    public APMPMDecodeResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ APMPMDecodeResult copy$default(APMPMDecodeResult aPMPMDecodeResult, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMDecodeResult.sdkActionPayload;
        }
        return aPMPMDecodeResult.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSdkActionPayload() {
        return this.sdkActionPayload;
    }

    @NotNull
    public final APMPMDecodeResult copy(String sdkActionPayload) {
        return new APMPMDecodeResult(sdkActionPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof APMPMDecodeResult) && Intrinsics.f(this.sdkActionPayload, ((APMPMDecodeResult) other).sdkActionPayload);
    }

    public final String getSdkActionPayload() {
        return this.sdkActionPayload;
    }

    public int hashCode() {
        String str = this.sdkActionPayload;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public APMPMDecodeResult(String str) {
        this.sdkActionPayload = str;
    }

    public /* synthetic */ APMPMDecodeResult(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
