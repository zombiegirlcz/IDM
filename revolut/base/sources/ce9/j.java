package ce9;

import efm.c0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tfm.n4;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f23433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f23434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.j f23435c;
    public final ihm.j d;
    public final n4 e;
    public final cd0.c f;

    public j(Function2 pageJoiner, Function2 pageSource) {
        Intrinsics.checkNotNullParameter(pageJoiner, "pageJoiner");
        Intrinsics.checkNotNullParameter(pageSource, "pageSource");
        this.f23433a = pageJoiner;
        this.f23434b = pageSource;
        ihm.j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f23435c = jVarD;
        ihm.j jVarH = p.a.h("toSerialized(...)");
        this.d = jVarH;
        this.f = new cd0.c(this, 13);
        efm.r rVarSwitchMap = w.B0(jVarH, jVarD).map(new cd0.c(new ccg.c(13), 21)).filter(new cd0.c(new ccg.c(this, 14), 22)).switchMap(new cd0.c(new b(this, 1), 23));
        c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        n4 n4VarE = rVarSwitchMap.observeOn(c0Var).scan(new p(null, null, 63), new cd0.c(new c9f.c(this, 12), 14)).distinctUntilChanged((kfm.d) new cd0.c(new ccg.a(7), 18)).doOnNext(new cd0.c(new b(this, 0), 20)).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        this.e = n4VarE;
    }
}
