package na7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.h0;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f213817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f213818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213819c;
    public final Set d;
    public final Set e;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f213817a, aVar.f213817a) && Intrinsics.f(this.f213818b, aVar.f213818b) && Intrinsics.f(this.f213819c, aVar.f213819c);
    }

    public final int hashCode() {
        int iF = p.a.f(this.f213817a.hashCode() * 31, 31, this.f213818b);
        String str = this.f213819c;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public a(String str, Set hiddenAndSecretAccountsIds, Set secretAccountIds) {
        Intrinsics.checkNotNullParameter(hiddenAndSecretAccountsIds, "hiddenAndSecretAccountsIds");
        Intrinsics.checkNotNullParameter(secretAccountIds, "secretAccountIds");
        this.f213817a = hiddenAndSecretAccountsIds;
        this.f213818b = secretAccountIds;
        this.f213819c = str;
        this.d = a1.k(hiddenAndSecretAccountsIds, z0.h(str));
        this.e = a1.k(secretAccountIds, z0.h(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i) {
        h0 h0Var = h0.f322473a;
        this(null, h0Var, h0Var);
    }
}
