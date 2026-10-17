package qe0;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function3 f245023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f245024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f245025c;
    public final ArrayList d;
    public volatile long e;
    public final efm.r f;

    public f(Function1 fromNetwork, Function3 persistCache, Function1 paramsKey, Function1 mergeParams) {
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        Intrinsics.checkNotNullParameter(persistCache, "persistCache");
        Intrinsics.checkNotNullParameter(paramsKey, "paramsKey");
        Intrinsics.checkNotNullParameter(mergeParams, "mergeParams");
        this.f245023a = persistCache;
        this.f245024b = paramsKey;
        this.f245025c = mergeParams;
        this.d = new ArrayList();
        efm.i flowable = efm.r.interval(0L, 1L, TimeUnit.SECONDS, hhm.f.f152431c).doOnNext(new pv9.b(new a(this, 0), 5)).doOnDispose(new lm.a(this, 3)).toFlowable(efm.a.DROP);
        pv9.b bVar = new pv9.b(new bsi.b(this, fromNetwork, 4), 6);
        int i = efm.i.f125385a;
        this.f = new j01.b(flowable.f(bVar, 1, i).f(new pv9.b(new a(this, 1), 7), i, i), 7).share();
    }

    public final sfm.b a(final Object obj2, final long j2, final boolean z) {
        final d dVar = new d();
        sfm.b bVarG = new pfm.h(new kfm.a() { // from class: qe0.b
            @Override // kfm.a
            public final void run() {
                f fVar = this.f245014a;
                Object obj3 = obj2;
                long j3 = j2;
                boolean z3 = z;
                d dVar2 = dVar;
                long j5 = fVar.e;
                synchronized (fVar) {
                    fVar.d.add(new c(dVar2, obj3, j3, z3, j5));
                }
            }
        }, 2).g(this.f.filter(new qc7.d(27, new qa9.r(dVar, 23))).map(new qc7.d(28, new qc7.c(15))).doFinally(new phc.d(this, dVar, 18)));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        return bVarG;
    }
}
