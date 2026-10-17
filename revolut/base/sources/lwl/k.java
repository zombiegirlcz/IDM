package lwl;

import com.revolut.ui.login.pin.LoginScreenContract$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginScreenContract$Configuration f200496a;

    public k(LoginScreenContract$Configuration loginScreenContract$Configuration) {
        this.f200496a = loginScreenContract$Configuration;
    }

    public final LoginScreenContract$Configuration a() {
        return this.f200496a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f200496a, ((k) obj2).f200496a);
    }

    public final int hashCode() {
        LoginScreenContract$Configuration loginScreenContract$Configuration = this.f200496a;
        if (loginScreenContract$Configuration == null) {
            return 0;
        }
        return loginScreenContract$Configuration.hashCode();
    }
}
