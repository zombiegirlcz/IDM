package zd0;

import be0.e;
import dfm.c;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import rfm.y;
import sd0.f;
import zab.s;
import zc0.b0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f321291a;

    public b(e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f321291a = repository;
    }

    public final efm.b a(f strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        f[] elements = {f.FORCE_RELOAD, f.LAZY_RELOAD};
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean zContains = d.y0(elements).contains(strategy);
        rfm.d dVarA = this.f321291a.a(strategy);
        b0 b0Var = new b0(new s(), 20);
        c cVar = mfm.f.d;
        efm.b sVar = new rfm.s(new y(dVarA, cVar, b0Var, cVar, mfm.f.f205043c));
        if (!zContains) {
            sVar = ue0.e.v(sVar);
        }
        Intrinsics.checkNotNullExpressionValue(sVar, "runIf(...)");
        return sVar;
    }
}
