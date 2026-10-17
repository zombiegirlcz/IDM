package ll4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f196533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196534b;

    public t(s action, String deeplink) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f196533a = action;
        this.f196534b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f196533a == tVar.f196533a && Intrinsics.f(this.f196534b, tVar.f196534b);
    }

    public final int hashCode() {
        return this.f196534b.hashCode() + (this.f196533a.hashCode() * 31);
    }
}
