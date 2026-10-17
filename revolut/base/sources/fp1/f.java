package fp1;

import a31.l;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo1.c f137042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f137043b;

    public f(vo1.c featureChecker, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f137042a = featureChecker;
        this.f137043b = userInteractor;
    }

    public final d0 a() {
        d dVar = (d) this.f137042a;
        d0 d0VarB = dVar.b();
        ufm.c cVar = new ufm.c(new l(this, 26), 2);
        dVar.getClass();
        ufm.c cVar2 = new ufm.c(new a(dVar, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
        dVar.getClass();
        ufm.c cVar3 = new ufm.c(new a(dVar, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
        d0 d0VarA = d0.A(d0VarB, cVar, cVar2, cVar3, dVar.d(), new fjj.b(new e(0), 12));
        Intrinsics.checkNotNullExpressionValue(d0VarA, "zip(...)");
        return d0VarA;
    }
}
