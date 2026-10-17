package g09;

import a08.n;
import a09.e0;
import a09.z;
import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import u09.y;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f139376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f139377b;

    public i(e0 lessonsRepository, ue0.c storage) {
        Intrinsics.checkNotNullParameter(lessonsRepository, "lessonsRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f139376a = lessonsRepository;
        this.f139377b = storage;
    }

    public final r a(String lessonId) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        e0 e0Var = this.f139376a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        return e0Var.f.f(lessonId, false);
    }

    public final d0 b(String lessonId, y progress) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        boolean z = progress == y.CONTENT_STARTED;
        e0 e0Var = this.f139376a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        d0 d0VarFirstOrError = m70.a.g(zi0.c.J(e0Var.f.f(lessonId, false)), null, new n(7), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        a05.a aVar = new a05.a(new z(progress, z, e0Var, 0), 9);
        d0VarFirstOrError.getClass();
        d0 d0VarG = new ufm.i(d0VarFirstOrError, aVar, 0).g(e0Var.d).g(e0Var.e);
        Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
        return d0VarG;
    }
}
