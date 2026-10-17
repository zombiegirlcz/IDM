package bma;

import ang.f;
import beg.k;
import blh.g0;
import efm.d0;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f16779b;

    public a(f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f16778a = userInteractor;
        wi0.b.Companion.getClass();
        wi0.b[] elements = {wi0.b.A, wi0.b.O0, wi0.b.X0, wi0.b.l2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f16779b = d.y0(elements);
    }

    public final i a(Set set) {
        d0 d0VarFirstOrError = m70.a.g(this.f16778a.k(true), null, null, 3).firstOrError();
        g0 g0Var = new g0(new k(this, set, 26), 2);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, g0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
