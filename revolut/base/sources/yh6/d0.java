package yh6;

import com.revolut.data.network.models.openbanking.AccountLinkingExpirationRequestDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lyh6/d0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getInstitutionId", "institutionId", "", "b", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "permissions", "Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;", "c", "Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;", "getExpiration", "()Lcom/revolut/data/network/models/openbanking/AccountLinkingExpirationRequestDto;", "expiration", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("institutionId")
    @NotNull
    private final String institutionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("permissions")
    private final List<String> permissions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiration")
    private final AccountLinkingExpirationRequestDto expiration;

    public d0(String institutionId, List list, AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.institutionId = institutionId;
        this.permissions = list;
        this.expiration = accountLinkingExpirationRequestDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.institutionId, d0Var.institutionId) && Intrinsics.f(this.permissions, d0Var.permissions) && Intrinsics.f(this.expiration, d0Var.expiration);
    }

    public final int hashCode() {
        int iHashCode = this.institutionId.hashCode() * 31;
        List<String> list = this.permissions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto = this.expiration;
        return iHashCode2 + (accountLinkingExpirationRequestDto != null ? accountLinkingExpirationRequestDto.hashCode() : 0);
    }
}
