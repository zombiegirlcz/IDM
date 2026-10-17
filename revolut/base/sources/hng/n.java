package hng;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f154113a;

    public n(wi0.b bVar) {
        this.f154113a = bVar;
    }

    public final String a() {
        String str;
        wi0.b bVar = this.f154113a;
        if (bVar == null || (str = bVar.f297794a) == null) {
            str = "";
        }
        return "CACHE_KEY_EMAIL_DOMAIN_SUGGESTIONS".concat(str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f154113a, ((n) obj2).f154113a);
    }

    public final int hashCode() {
        wi0.b bVar = this.f154113a;
        if (bVar == null) {
            return 0;
        }
        return bVar.f297794a.hashCode();
    }
}
