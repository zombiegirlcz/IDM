package ang;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements l61.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hng.g f7765a;

    public b(hng.g repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f7765a = repository;
    }

    public final d0 a() {
        d0 d0VarFirstOrError = m70.a.g(hng.g.b(this.f7765a), null, new an4.g(11), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final l71.d b() {
        return (l71.d) this.f7765a.f154101b.get("USER_COMPANY_STORAGE_KEY");
    }
}
