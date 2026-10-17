package com.revolut.data.network.models.openbanking;

import a0.d;
import com.revolut.data.network.models.topup.ContextDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/revolut/data/network/models/openbanking/OneOffTopupRequestDto;", "", "institutionId", "", "branchId", "remitterIban", "amount", "", "currency", "idempotencyKey", "walletId", "context", "Lcom/revolut/data/network/models/topup/ContextDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/topup/ContextDto;)V", "getInstitutionId", "()Ljava/lang/String;", "getBranchId", "getRemitterIban", "getAmount", "()J", "getCurrency", "getIdempotencyKey", "getWalletId", "getContext", "()Lcom/revolut/data/network/models/topup/ContextDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OneOffTopupRequestDto {

    @b("amount")
    private final long amount;

    @b("branchId")
    private final String branchId;

    @b("context")
    private final ContextDto context;

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

    @b("walletId")
    private final String walletId;

    public OneOffTopupRequestDto(@NotNull String institutionId, String str, String str2, long j2, @NotNull String currency, @NotNull String idempotencyKey, String str3, ContextDto contextDto) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.institutionId = institutionId;
        this.branchId = str;
        this.remitterIban = str2;
        this.amount = j2;
        this.currency = currency;
        this.idempotencyKey = idempotencyKey;
        this.walletId = str3;
        this.context = contextDto;
    }

    public static /* synthetic */ OneOffTopupRequestDto copy$default(OneOffTopupRequestDto oneOffTopupRequestDto, String str, String str2, String str3, long j2, String str4, String str5, String str6, ContextDto contextDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = oneOffTopupRequestDto.institutionId;
        }
        if ((i & 2) != 0) {
            str2 = oneOffTopupRequestDto.branchId;
        }
        if ((i & 4) != 0) {
            str3 = oneOffTopupRequestDto.remitterIban;
        }
        if ((i & 8) != 0) {
            j2 = oneOffTopupRequestDto.amount;
        }
        if ((i & 16) != 0) {
            str4 = oneOffTopupRequestDto.currency;
        }
        if ((i & 32) != 0) {
            str5 = oneOffTopupRequestDto.idempotencyKey;
        }
        if ((i & 64) != 0) {
            str6 = oneOffTopupRequestDto.walletId;
        }
        if ((i & 128) != 0) {
            contextDto = oneOffTopupRequestDto.context;
        }
        long j3 = j2;
        String str7 = str3;
        return oneOffTopupRequestDto.copy(str, str2, str7, j3, str4, str5, str6, contextDto);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBranchId() {
        return this.branchId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemitterIban() {
        return this.remitterIban;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ContextDto getContext() {
        return this.context;
    }

    @NotNull
    public final OneOffTopupRequestDto copy(@NotNull String institutionId, String branchId, String remitterIban, long amount, @NotNull String currency, @NotNull String idempotencyKey, String walletId, ContextDto context) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        return new OneOffTopupRequestDto(institutionId, branchId, remitterIban, amount, currency, idempotencyKey, walletId, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneOffTopupRequestDto)) {
            return false;
        }
        OneOffTopupRequestDto oneOffTopupRequestDto = (OneOffTopupRequestDto) other;
        return Intrinsics.f(this.institutionId, oneOffTopupRequestDto.institutionId) && Intrinsics.f(this.branchId, oneOffTopupRequestDto.branchId) && Intrinsics.f(this.remitterIban, oneOffTopupRequestDto.remitterIban) && this.amount == oneOffTopupRequestDto.amount && Intrinsics.f(this.currency, oneOffTopupRequestDto.currency) && Intrinsics.f(this.idempotencyKey, oneOffTopupRequestDto.idempotencyKey) && Intrinsics.f(this.walletId, oneOffTopupRequestDto.walletId) && Intrinsics.f(this.context, oneOffTopupRequestDto.context);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getBranchId() {
        return this.branchId;
    }

    public final ContextDto getContext() {
        return this.context;
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

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        int iHashCode = this.institutionId.hashCode() * 31;
        String str = this.branchId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remitterIban;
        int iC = a.c(a.c(d.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.amount), 31, this.currency), 31, this.idempotencyKey);
        String str3 = this.walletId;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContextDto contextDto = this.context;
        return iHashCode3 + (contextDto != null ? contextDto.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OneOffTopupRequestDto(String str, String str2, String str3, long j2, String str4, String str5, String str6, ContextDto contextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ContextDto contextDto2;
        String str7;
        String str8;
        String str9;
        long j3;
        String str10;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            contextDto2 = contextDto;
            str7 = str6;
            str8 = str5;
            str9 = str4;
            j3 = j2;
            str10 = null;
        } else {
            contextDto2 = contextDto;
            str7 = str6;
            str8 = str5;
            str9 = str4;
            j3 = j2;
            str10 = str3;
        }
        this(str, str2, str10, j3, str9, str8, str7, contextDto2);
    }
}
