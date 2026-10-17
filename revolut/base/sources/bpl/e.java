package bpl;

import com.revolut.sso.impl.domain.models.UserInfoAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserInfoAccount f17635c;
    public final boolean d;

    public e(UserInfoAccount userInfoAccount, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(userInfoAccount, "userInfoAccount");
        this.f17633a = z;
        this.f17634b = z3;
        this.f17635c = userInfoAccount;
        this.d = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f17633a == eVar.f17633a && this.f17634b == eVar.f17634b && Intrinsics.f(this.f17635c, eVar.f17635c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f17635c.hashCode() + j6.a.c(Boolean.hashCode(this.f17633a) * 31, 31, this.f17634b)) * 31);
    }
}
