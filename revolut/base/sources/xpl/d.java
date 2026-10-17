package xpl;

import com.revolut.sso.impl.domain.models.UserInfoAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserInfoAccount f308013a;

    public d(UserInfoAccount userInfoAccount) {
        Intrinsics.checkNotNullParameter(userInfoAccount, "userInfoAccount");
        this.f308013a = userInfoAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f308013a, ((d) obj2).f308013a);
    }

    public final int hashCode() {
        return this.f308013a.hashCode();
    }
}
