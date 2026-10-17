package hp8;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import lp8.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lp8.a f154514a;

    public b(lp8.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f154514a = repository;
    }

    public final r a(String juniorId, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        e eVar = (e) this.f154514a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        return nim.a.w(eVar.e.f(juniorId, z), new l3d.a(juniorId, 26));
    }
}
