package com.revolut.data.network.models.openbanking.penny_verification;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lcom/revolut/data/network/models/openbanking/penny_verification/PennyVerificationTopUpRequestDto;", "", "idempotencyKey", "", "institutionId", "amount", "", "currency", "attributes", "Lcom/revolut/data/network/models/openbanking/penny_verification/Attributes;", "branchId", "remitterIban", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/revolut/data/network/models/openbanking/penny_verification/Attributes;Ljava/lang/String;Ljava/lang/String;)V", "getIdempotencyKey", "()Ljava/lang/String;", "getInstitutionId", "getAmount", "()J", "getCurrency", "getAttributes", "()Lcom/revolut/data/network/models/openbanking/penny_verification/Attributes;", "getBranchId", "getRemitterIban", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PennyVerificationTopUpRequestDto {

    @b("amount")
    private final long amount;

    @b("attributes")
    @NotNull
    private final Attributes attributes;

    @b("branchId")
    private final String branchId;

    @b("currency")
    @NotNull
    private final String currency;

    @b("idempotencyKey")
    @NotNull
    private final String idempotencyKey;

    @b("institutionId")
    @NotNull
    private final String institutionId;

    @b("remitterIban")
    private final String remitterIban;

    public PennyVerificationTopUpRequestDto(@NotNull String idempotencyKey, @NotNull String institutionId, long j2, @NotNull String currency, @NotNull Attributes attributes, String str, String str2) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.idempotencyKey = idempotencyKey;
        this.institutionId = institutionId;
        this.amount = j2;
        this.currency = currency;
        this.attributes = attributes;
        this.branchId = str;
        this.remitterIban = str2;
    }

    public static /* synthetic */ PennyVerificationTopUpRequestDto copy$default(PennyVerificationTopUpRequestDto pennyVerificationTopUpRequestDto, String str, String str2, long j2, String str3, Attributes attributes, String str4, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = pennyVerificationTopUpRequestDto.idempotencyKey;
        }
        if ((i & 2) != 0) {
            str2 = pennyVerificationTopUpRequestDto.institutionId;
        }
        if ((i & 4) != 0) {
            j2 = pennyVerificationTopUpRequestDto.amount;
        }
        if ((i & 8) != 0) {
            str3 = pennyVerificationTopUpRequestDto.currency;
        }
        if ((i & 16) != 0) {
            attributes = pennyVerificationTopUpRequestDto.attributes;
        }
        if ((i & 32) != 0) {
            str4 = pennyVerificationTopUpRequestDto.branchId;
        }
        if ((i & 64) != 0) {
            str5 = pennyVerificationTopUpRequestDto.remitterIban;
        }
        long j3 = j2;
        return pennyVerificationTopUpRequestDto.copy(str, str2, j3, str3, attributes, str4, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBranchId() {
        return this.branchId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRemitterIban() {
        return this.remitterIban;
    }

    @NotNull
    public final PennyVerificationTopUpRequestDto copy(@NotNull String idempotencyKey, @NotNull String institutionId, long amount, @NotNull String currency, @NotNull Attributes attributes, String branchId, String remitterIban) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new PennyVerificationTopUpRequestDto(idempotencyKey, institutionId, amount, currency, attributes, branchId, remitterIban);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PennyVerificationTopUpRequestDto)) {
            return false;
        }
        PennyVerificationTopUpRequestDto pennyVerificationTopUpRequestDto = (PennyVerificationTopUpRequestDto) other;
        return Intrinsics.f(this.idempotencyKey, pennyVerificationTopUpRequestDto.idempotencyKey) && Intrinsics.f(this.institutionId, pennyVerificationTopUpRequestDto.institutionId) && this.amount == pennyVerificationTopUpRequestDto.amount && Intrinsics.f(this.currency, pennyVerificationTopUpRequestDto.currency) && Intrinsics.f(this.attributes, pennyVerificationTopUpRequestDto.attributes) && Intrinsics.f(this.branchId, pennyVerificationTopUpRequestDto.branchId) && Intrinsics.f(this.remitterIban, pennyVerificationTopUpRequestDto.remitterIban);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final String getBranchId() {
        return this.branchId;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    @NotNull
    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final String getRemitterIban() {
        return this.remitterIban;
    }

    public int hashCode() {
        int iHashCode = (this.attributes.hashCode() + a.c(d.c(a.c(this.idempotencyKey.hashCode() * 31, 31, this.institutionId), 31, this.amount), 31, this.currency)) * 31;
        String str = this.branchId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remitterIban;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ PennyVerificationTopUpRequestDto(String str, String str2, long j2, String str3, Attributes attributes, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, str3, attributes, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
