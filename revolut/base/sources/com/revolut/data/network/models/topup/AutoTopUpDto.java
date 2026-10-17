package com.revolut.data.network.models.topup;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u0006'"}, d2 = {"Lcom/revolut/data/network/models/topup/AutoTopUpDto;", "", "enabled", "", "externalCardId", "", "topupId", "topupType", "currency", "threshold", "", "amount", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getEnabled", "()Z", "getExternalCardId", "()Ljava/lang/String;", "getTopupId", "getTopupType", "getCurrency", "getThreshold", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/revolut/data/network/models/topup/AutoTopUpDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoTopUpDto {

    @b("amount")
    private final Long amount;

    @b("currency")
    private final String currency;

    @b("enabled")
    private final boolean enabled;

    @b("externalCardId")
    private final String externalCardId;

    @b("threshold")
    private final Long threshold;

    @b("topupId")
    private final String topupId;

    @b("topupType")
    private final String topupType;

    public AutoTopUpDto(boolean z, String str, String str2, String str3, String str4, Long l2, Long l3) {
        this.enabled = z;
        this.externalCardId = str;
        this.topupId = str2;
        this.topupType = str3;
        this.currency = str4;
        this.threshold = l2;
        this.amount = l3;
    }

    public static /* synthetic */ AutoTopUpDto copy$default(AutoTopUpDto autoTopUpDto, boolean z, String str, String str2, String str3, String str4, Long l2, Long l3, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = autoTopUpDto.enabled;
        }
        if ((i & 2) != 0) {
            str = autoTopUpDto.externalCardId;
        }
        if ((i & 4) != 0) {
            str2 = autoTopUpDto.topupId;
        }
        if ((i & 8) != 0) {
            str3 = autoTopUpDto.topupType;
        }
        if ((i & 16) != 0) {
            str4 = autoTopUpDto.currency;
        }
        if ((i & 32) != 0) {
            l2 = autoTopUpDto.threshold;
        }
        if ((i & 64) != 0) {
            l3 = autoTopUpDto.amount;
        }
        Long l4 = l2;
        Long l5 = l3;
        String str5 = str4;
        String str6 = str2;
        return autoTopUpDto.copy(z, str, str6, str3, str5, l4, l5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalCardId() {
        return this.externalCardId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTopupId() {
        return this.topupId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTopupType() {
        return this.topupType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @NotNull
    public final AutoTopUpDto copy(boolean enabled, String externalCardId, String topupId, String topupType, String currency, Long threshold, Long amount) {
        return new AutoTopUpDto(enabled, externalCardId, topupId, topupType, currency, threshold, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopUpDto)) {
            return false;
        }
        AutoTopUpDto autoTopUpDto = (AutoTopUpDto) other;
        return this.enabled == autoTopUpDto.enabled && Intrinsics.f(this.externalCardId, autoTopUpDto.externalCardId) && Intrinsics.f(this.topupId, autoTopUpDto.topupId) && Intrinsics.f(this.topupType, autoTopUpDto.topupType) && Intrinsics.f(this.currency, autoTopUpDto.currency) && Intrinsics.f(this.threshold, autoTopUpDto.threshold) && Intrinsics.f(this.amount, autoTopUpDto.amount);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getExternalCardId() {
        return this.externalCardId;
    }

    public final Long getThreshold() {
        return this.threshold;
    }

    public final String getTopupId() {
        return this.topupId;
    }

    public final String getTopupType() {
        return this.topupType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        String str = this.externalCardId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.topupId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topupType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.threshold;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.amount;
        return iHashCode6 + (l3 != null ? l3.hashCode() : 0);
    }
}
