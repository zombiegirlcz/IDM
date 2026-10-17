package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMDecodeRequest;", "", "codeValue", "", "passThroughInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCodeValue", "()Ljava/lang/String;", "getPassThroughInfo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMDecodeRequest {

    @NotNull
    private final String codeValue;
    private final String passThroughInfo;

    public APMPMDecodeRequest(@NotNull String codeValue, String str) {
        Intrinsics.checkNotNullParameter(codeValue, "codeValue");
        this.codeValue = codeValue;
        this.passThroughInfo = str;
    }

    public static /* synthetic */ APMPMDecodeRequest copy$default(APMPMDecodeRequest aPMPMDecodeRequest, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMDecodeRequest.codeValue;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMDecodeRequest.passThroughInfo;
        }
        return aPMPMDecodeRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCodeValue() {
        return this.codeValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassThroughInfo() {
        return this.passThroughInfo;
    }

    @NotNull
    public final APMPMDecodeRequest copy(@NotNull String codeValue, String passThroughInfo) {
        Intrinsics.checkNotNullParameter(codeValue, "codeValue");
        return new APMPMDecodeRequest(codeValue, passThroughInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMDecodeRequest)) {
            return false;
        }
        APMPMDecodeRequest aPMPMDecodeRequest = (APMPMDecodeRequest) other;
        return Intrinsics.f(this.codeValue, aPMPMDecodeRequest.codeValue) && Intrinsics.f(this.passThroughInfo, aPMPMDecodeRequest.passThroughInfo);
    }

    @NotNull
    public final String getCodeValue() {
        return this.codeValue;
    }

    public final String getPassThroughInfo() {
        return this.passThroughInfo;
    }

    public int hashCode() {
        int iHashCode = this.codeValue.hashCode() * 31;
        String str = this.passThroughInfo;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ APMPMDecodeRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
