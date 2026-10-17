package tf3;

import cn0.g;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import mm0.n;
import mm0.o;
import mm0.p;
import rd0.e;
import tcg.a0;
import tcg.q;
import vkm.d;
import zm0.c;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f270223a;

    public b(c sessionProvider) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f270223a = sessionProvider;
    }

    public final d a() {
        r rVarDistinctUntilChanged = ((g) this.f270223a).g().map(new q(19, new a0(25))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return e.b(rVarDistinctUntilChanged);
    }

    public final boolean b() {
        o oVarD = ((g) this.f270223a).d();
        return (oVarD instanceof n) || (oVarD instanceof p);
    }
}
