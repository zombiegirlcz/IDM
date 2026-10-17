package com.revolut.data.network.models.openbanking;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;", "", "value", "", "type", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountLinkingExpirationRequestDto {

    @b("type")
    @NotNull
    private final String type;

    @b("value")
    private final Long value;

    public AccountLinkingExpirationRequestDto(Long l2, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.value = l2;
        this.type = type;
    }

    public static /* synthetic */ AccountLinkingExpirationRequestDto copy$default(AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto, Long l2, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            l2 = accountLinkingExpirationRequestDto.value;
        }
        if ((i & 2) != 0) {
            str = accountLinkingExpirationRequestDto.type;
        }
        return accountLinkingExpirationRequestDto.copy(l2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final AccountLinkingExpirationRequestDto copy(Long value, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new AccountLinkingExpirationRequestDto(value, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountLinkingExpirationRequestDto)) {
            return false;
        }
        AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto = (AccountLinkingExpirationRequestDto) other;
        return Intrinsics.f(this.value, accountLinkingExpirationRequestDto.value) && Intrinsics.f(this.type, accountLinkingExpirationRequestDto.type);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        Long l2 = this.value;
        return this.type.hashCode() + ((l2 == null ? 0 : l2.hashCode()) * 31);
    }

    public /* synthetic */ AccountLinkingExpirationRequestDto(Long l2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l2, str);
    }
}
