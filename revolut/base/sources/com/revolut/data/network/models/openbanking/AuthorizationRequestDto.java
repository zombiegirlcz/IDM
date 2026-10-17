package com.revolut.data.network.models.openbanking;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003Jr\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;", "", "institutionId", "", "branchId", "correlationId", "code", "linkAccounts", "", "csrfToken", "permissions", "", "expiration", "Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;)V", "getInstitutionId", "()Ljava/lang/String;", "getBranchId", "getCorrelationId", "getCode", "getLinkAccounts", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCsrfToken", "getPermissions", "()Ljava/util/List;", "getExpiration", "()Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;)Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthorizationRequestDto {

    @b("branchId")
    private final String branchId;

    @b("code")
    private final String code;

    @b("correlationId")
    private final String correlationId;

    @b("csrfToken")
    private final String csrfToken;

    @b("expiration")
    private final AccountLinkingExpirationRequestDto expiration;

    @b("institutionId")
    @NotNull
    private final String institutionId;

    @b("linkAccounts")
    private final Boolean linkAccounts;

    @b("permissions")
    private final List<String> permissions;

    public AuthorizationRequestDto(@NotNull String institutionId, String str, String str2, String str3, Boolean bool, String str4, List<String> list, AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.institutionId = institutionId;
        this.branchId = str;
        this.correlationId = str2;
        this.code = str3;
        this.linkAccounts = bool;
        this.csrfToken = str4;
        this.permissions = list;
        this.expiration = accountLinkingExpirationRequestDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorizationRequestDto copy$default(AuthorizationRequestDto authorizationRequestDto, String str, String str2, String str3, String str4, Boolean bool, String str5, List list, AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = authorizationRequestDto.institutionId;
        }
        if ((i & 2) != 0) {
            str2 = authorizationRequestDto.branchId;
        }
        if ((i & 4) != 0) {
            str3 = authorizationRequestDto.correlationId;
        }
        if ((i & 8) != 0) {
            str4 = authorizationRequestDto.code;
        }
        if ((i & 16) != 0) {
            bool = authorizationRequestDto.linkAccounts;
        }
        if ((i & 32) != 0) {
            str5 = authorizationRequestDto.csrfToken;
        }
        if ((i & 64) != 0) {
            list = authorizationRequestDto.permissions;
        }
        if ((i & 128) != 0) {
            accountLinkingExpirationRequestDto = authorizationRequestDto.expiration;
        }
        List list2 = list;
        AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto2 = accountLinkingExpirationRequestDto;
        Boolean bool2 = bool;
        String str6 = str5;
        return authorizationRequestDto.copy(str, str2, str3, str4, bool2, str6, list2, accountLinkingExpirationRequestDto2);
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
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getLinkAccounts() {
        return this.linkAccounts;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCsrfToken() {
        return this.csrfToken;
    }

    public final List<String> component7() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AccountLinkingExpirationRequestDto getExpiration() {
        return this.expiration;
    }

    @NotNull
    public final AuthorizationRequestDto copy(@NotNull String institutionId, String branchId, String correlationId, String code, Boolean linkAccounts, String csrfToken, List<String> permissions, AccountLinkingExpirationRequestDto expiration) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        return new AuthorizationRequestDto(institutionId, branchId, correlationId, code, linkAccounts, csrfToken, permissions, expiration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizationRequestDto)) {
            return false;
        }
        AuthorizationRequestDto authorizationRequestDto = (AuthorizationRequestDto) other;
        return Intrinsics.f(this.institutionId, authorizationRequestDto.institutionId) && Intrinsics.f(this.branchId, authorizationRequestDto.branchId) && Intrinsics.f(this.correlationId, authorizationRequestDto.correlationId) && Intrinsics.f(this.code, authorizationRequestDto.code) && Intrinsics.f(this.linkAccounts, authorizationRequestDto.linkAccounts) && Intrinsics.f(this.csrfToken, authorizationRequestDto.csrfToken) && Intrinsics.f(this.permissions, authorizationRequestDto.permissions) && Intrinsics.f(this.expiration, authorizationRequestDto.expiration);
    }

    public final String getBranchId() {
        return this.branchId;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final String getCsrfToken() {
        return this.csrfToken;
    }

    public final AccountLinkingExpirationRequestDto getExpiration() {
        return this.expiration;
    }

    @NotNull
    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final Boolean getLinkAccounts() {
        return this.linkAccounts;
    }

    public final List<String> getPermissions() {
        return this.permissions;
    }

    public int hashCode() {
        int iHashCode = this.institutionId.hashCode() * 31;
        String str = this.branchId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.correlationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.linkAccounts;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.csrfToken;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.permissions;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto = this.expiration;
        return iHashCode7 + (accountLinkingExpirationRequestDto != null ? accountLinkingExpirationRequestDto.hashCode() : 0);
    }

    public /* synthetic */ AuthorizationRequestDto(String str, String str2, String str3, String str4, Boolean bool, String str5, List list, AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : accountLinkingExpirationRequestDto);
    }
}
