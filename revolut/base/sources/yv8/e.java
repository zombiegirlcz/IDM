package yv8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f317143c;
    public final boolean d;

    public e(String portalUrl, List redirectionUrls, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(redirectionUrls, "redirectionUrls");
        this.f317141a = portalUrl;
        this.f317142b = redirectionUrls;
        this.f317143c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f317141a, eVar.f317141a) && Intrinsics.f(this.f317142b, eVar.f317142b) && this.f317143c == eVar.f317143c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.d(this.f317141a.hashCode() * 31, 31, this.f317142b), 31, this.f317143c);
    }
}
