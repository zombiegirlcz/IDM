package com.revolut.data.network.models.wallet.account;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/wallet/account/PixDto;", "", "key", "", "transferTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getTransferTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixDto {

    @b("key")
    @NotNull
    private final String key;

    @b("transferTime")
    @NotNull
    private final String transferTime;

    public PixDto(@NotNull String key, @NotNull String transferTime) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(transferTime, "transferTime");
        this.key = key;
        this.transferTime = transferTime;
    }

    public static /* synthetic */ PixDto copy$default(PixDto pixDto, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = pixDto.key;
        }
        if ((i & 2) != 0) {
            str2 = pixDto.transferTime;
        }
        return pixDto.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransferTime() {
        return this.transferTime;
    }

    @NotNull
    public final PixDto copy(@NotNull String key, @NotNull String transferTime) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(transferTime, "transferTime");
        return new PixDto(key, transferTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixDto)) {
            return false;
        }
        PixDto pixDto = (PixDto) other;
        return Intrinsics.f(this.key, pixDto.key) && Intrinsics.f(this.transferTime, pixDto.transferTime);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getTransferTime() {
        return this.transferTime;
    }

    public int hashCode() {
        return this.transferTime.hashCode() + (this.key.hashCode() * 31);
    }
}
