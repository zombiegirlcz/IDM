package sre;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f265193b;

    public f(String str, List scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f265192a = str;
        this.f265193b = scopes;
    }

    public final String a() {
        String str = this.f265192a;
        return p.a.p("all_terms", str != null ? "_".concat(str) : "", d0.k0(this.f265193b, "_", "_", null, 0, null, 60));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f265192a, fVar.f265192a) && Intrinsics.f(this.f265193b, fVar.f265193b);
    }

    public final int hashCode() {
        String str = this.f265192a;
        return this.f265193b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
