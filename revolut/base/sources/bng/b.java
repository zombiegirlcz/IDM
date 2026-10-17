package bng;

import ang.f;
import blh.g0;
import blh.y;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f17168a;

    public b(f userInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f17168a = userInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f17168a = userInteractor;
                break;
        }
    }

    public d0 a() {
        d0 d0VarFirstOrError = m70.a.g(this.f17168a.k(false), null, null, 3).map(new g0(new y(29), 4)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
