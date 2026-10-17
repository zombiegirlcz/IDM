package lml;

import cli.j;
import com.revolut.sso.api.models.UserInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserInfo f197095a;

    public d(UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.f197095a = userInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f197095a, ((d) obj2).f197095a);
    }

    public final int hashCode() {
        return this.f197095a.hashCode();
    }
}
