package djl;

import aii.e;
import cjl.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f115401c;
    public final s d;
    public final c e;

    public b(String url2, String state, List securityProfiles, s routingContext, c finishConfig) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
        Intrinsics.checkNotNullParameter(routingContext, "routingContext");
        Intrinsics.checkNotNullParameter(finishConfig, "finishConfig");
        this.f115399a = url2;
        this.f115400b = state;
        this.f115401c = securityProfiles;
        this.d = routingContext;
        this.e = finishConfig;
    }

    public final c b() {
        return this.e;
    }

    public final s c() {
        return this.d;
    }

    public final List d() {
        return this.f115401c;
    }

    public final String e() {
        return this.f115400b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f115399a, bVar.f115399a) && Intrinsics.f(this.f115400b, bVar.f115400b) && Intrinsics.f(this.f115401c, bVar.f115401c) && this.d == bVar.d && this.e == bVar.e;
    }

    public final String f() {
        return this.f115399a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.d(p.a.c(this.f115399a.hashCode() * 31, 31, this.f115400b), 31, this.f115401c)) * 31);
    }
}
