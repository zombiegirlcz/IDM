package com.revolut.data.network.models.threedstransactions;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/revolut/data/network/models/threedstransactions/ThreeDSUpdateDto;", "", "id", "", "proceed", "", "cardholderId", "authorizationMethod", "integrityHash", "declineReasons", "", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getProceed", "()Z", "getCardholderId", "getAuthorizationMethod", "getIntegrityHash", "getDeclineReasons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThreeDSUpdateDto {

    @b("authenticationMethod")
    private final String authorizationMethod;

    @b("cardholder_id")
    @NotNull
    private final String cardholderId;

    @b("declineReasons")
    private final List<String> declineReasons;

    @b("id")
    @NotNull
    private final String id;

    @b("integrityHash")
    private final String integrityHash;

    @b("proceed")
    private final boolean proceed;

    public ThreeDSUpdateDto(@NotNull String id10, boolean z, @NotNull String cardholderId, String str, String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        this.id = id10;
        this.proceed = z;
        this.cardholderId = cardholderId;
        this.authorizationMethod = str;
        this.integrityHash = str2;
        this.declineReasons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreeDSUpdateDto copy$default(ThreeDSUpdateDto threeDSUpdateDto, String str, boolean z, String str2, String str3, String str4, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = threeDSUpdateDto.id;
        }
        if ((i & 2) != 0) {
            z = threeDSUpdateDto.proceed;
        }
        if ((i & 4) != 0) {
            str2 = threeDSUpdateDto.cardholderId;
        }
        if ((i & 8) != 0) {
            str3 = threeDSUpdateDto.authorizationMethod;
        }
        if ((i & 16) != 0) {
            str4 = threeDSUpdateDto.integrityHash;
        }
        if ((i & 32) != 0) {
            list = threeDSUpdateDto.declineReasons;
        }
        String str5 = str4;
        List list2 = list;
        return threeDSUpdateDto.copy(str, z, str2, str3, str5, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getProceed() {
        return this.proceed;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardholderId() {
        return this.cardholderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthorizationMethod() {
        return this.authorizationMethod;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIntegrityHash() {
        return this.integrityHash;
    }

    public final List<String> component6() {
        return this.declineReasons;
    }

    @NotNull
    public final ThreeDSUpdateDto copy(@NotNull String id10, boolean proceed, @NotNull String cardholderId, String authorizationMethod, String integrityHash, List<String> declineReasons) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        return new ThreeDSUpdateDto(id10, proceed, cardholderId, authorizationMethod, integrityHash, declineReasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreeDSUpdateDto)) {
            return false;
        }
        ThreeDSUpdateDto threeDSUpdateDto = (ThreeDSUpdateDto) other;
        return Intrinsics.f(this.id, threeDSUpdateDto.id) && this.proceed == threeDSUpdateDto.proceed && Intrinsics.f(this.cardholderId, threeDSUpdateDto.cardholderId) && Intrinsics.f(this.authorizationMethod, threeDSUpdateDto.authorizationMethod) && Intrinsics.f(this.integrityHash, threeDSUpdateDto.integrityHash) && Intrinsics.f(this.declineReasons, threeDSUpdateDto.declineReasons);
    }

    public final String getAuthorizationMethod() {
        return this.authorizationMethod;
    }

    @NotNull
    public final String getCardholderId() {
        return this.cardholderId;
    }

    public final List<String> getDeclineReasons() {
        return this.declineReasons;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getIntegrityHash() {
        return this.integrityHash;
    }

    public final boolean getProceed() {
        return this.proceed;
    }

    public int hashCode() {
        int iC = a.c(j6.a.c(this.id.hashCode() * 31, 31, this.proceed), 31, this.cardholderId);
        String str = this.authorizationMethod;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.integrityHash;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.declineReasons;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
