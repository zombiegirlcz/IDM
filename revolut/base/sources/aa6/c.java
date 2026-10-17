package aa6;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import sa6.t;
import ya6.u;
import ya6.z;

/* JADX INFO: loaded from: classes13.dex */
public interface c {
    static r a(c cVar, boolean z) {
        m70.a.c(t0.f186434a);
        b searchStrategy = b.NAME_BRIEF_DESCRIPTION;
        t tVar = (t) cVar;
        tVar.getClass();
        Intrinsics.checkNotNullParameter("", "searchQuery");
        Intrinsics.checkNotNullParameter(searchStrategy, "searchStrategy");
        return nim.a.w(((z) tVar.f261345a).i.f(u.a.f311983a, z), new s31.a(tVar, 17, "", searchStrategy));
    }
}
