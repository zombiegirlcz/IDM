package com.revolut.data.network.models.openbanking;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/openbanking/TopUpResponseDto;", "", "authUrl", "", "paymentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthUrl", "()Ljava/lang/String;", "getPaymentId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUpResponseDto {

    @b("authUrl")
    @NotNull
    private final String authUrl;

    @b("paymentId")
    private final String paymentId;

    public TopUpResponseDto(@NotNull String authUrl, String str) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.authUrl = authUrl;
        this.paymentId = str;
    }

    public static /* synthetic */ TopUpResponseDto copy$default(TopUpResponseDto topUpResponseDto, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = topUpResponseDto.authUrl;
        }
        if ((i & 2) != 0) {
            str2 = topUpResponseDto.paymentId;
        }
        return topUpResponseDto.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthUrl() {
        return this.authUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    @NotNull
    public final TopUpResponseDto copy(@NotNull String authUrl, String paymentId) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        return new TopUpResponseDto(authUrl, paymentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopUpResponseDto)) {
            return false;
        }
        TopUpResponseDto topUpResponseDto = (TopUpResponseDto) other;
        return Intrinsics.f(this.authUrl, topUpResponseDto.authUrl) && Intrinsics.f(this.paymentId, topUpResponseDto.paymentId);
    }

    @NotNull
    public final String getAuthUrl() {
        return this.authUrl;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public int hashCode() {
        int iHashCode = this.authUrl.hashCode() * 31;
        String str = this.paymentId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
