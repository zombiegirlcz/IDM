package jkl;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0006\u0010\u001c¨\u0006\u001f"}, d2 = {"Ljkl/o4;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "d", "()Ljava/util/UUID;", "identityId", "b", "Ljava/lang/String;", "e", "legalName", "c", "g", "phone", "email", "googleId", "", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "passcodeHint", "", "Ljkl/n4;", "Ljava/util/List;", "()Ljava/util/List;", "accounts", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sub")
    @NotNull
    private final UUID identityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String legalName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("phone")
    private final String phone;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("googleId")
    private final String googleId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("passcodeHint")
    private final Integer passcodeHint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("accounts")
    private final List<n4> accounts;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccounts() {
        return this.accounts;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGoogleId() {
        return this.googleId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getIdentityId() {
        return this.identityId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj2;
        return Intrinsics.f(this.identityId, o4Var.identityId) && Intrinsics.f(this.legalName, o4Var.legalName) && Intrinsics.f(this.phone, o4Var.phone) && Intrinsics.f(this.email, o4Var.email) && Intrinsics.f(this.googleId, o4Var.googleId) && Intrinsics.f(this.passcodeHint, o4Var.passcodeHint) && Intrinsics.f(this.accounts, o4Var.accounts);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getPasscodeHint() {
        return this.passcodeHint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final int hashCode() {
        int iHashCode = this.identityId.hashCode() * 31;
        String str = this.legalName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.googleId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.passcodeHint;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<n4> list = this.accounts;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }
}
