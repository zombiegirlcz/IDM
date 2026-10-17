package be6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001d"}, d2 = {"Lbe6/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "code", "g", "tokenId", "", "c", "J", "e", "()J", "expiresIn", "d", "createdDate", "Lbe6/c;", "Lbe6/c;", "()Lbe6/c;", "device", "f", "applicationType", "", "Ljava/util/List;", "()Ljava/util/List;", "scopes", "feature_extension_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tokenId")
    @NotNull
    private final String tokenId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiresIn")
    private final long expiresIn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("device")
    private final c device;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("applicationType")
    @NotNull
    private final String applicationType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("scopes")
    private final List<String> scopes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApplicationType() {
        return this.applicationType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.code, kVar.code) && Intrinsics.f(this.tokenId, kVar.tokenId) && this.expiresIn == kVar.expiresIn && this.createdDate == kVar.createdDate && Intrinsics.f(this.device, kVar.device) && Intrinsics.f(this.applicationType, kVar.applicationType) && Intrinsics.f(this.scopes, kVar.scopes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getScopes() {
        return this.scopes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(p.a.c(this.code.hashCode() * 31, 31, this.tokenId), 31, this.expiresIn), 31, this.createdDate);
        c cVar = this.device;
        int iC2 = p.a.c((iC + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.applicationType);
        List<String> list = this.scopes;
        return iC2 + (list != null ? list.hashCode() : 0);
    }
}
