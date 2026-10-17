package uj0;

import clm.k;
import efm.d0;
import gim.i;
import kotlin.Function;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;
import te0.w;
import toh.h;
import w4l.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280462a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f280463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f280464c;

    public /* synthetic */ b(b80.c cVar, Function1 function1) {
        this.f280463b = function1;
        this.f280464c = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object params) {
        switch (this.f280462a) {
            case 0:
                Function1 function1 = (Function1) this.f280463b;
                b80.c cVar = (b80.c) this.f280464c;
                f fVar = (f) obj2;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                Intrinsics.checkNotNullParameter(params, "params");
                d0 d0Var = (d0) function1.invoke(params);
                uhl.b bVar = new uhl.b(new h(cVar, 20, fVar, params), 14);
                d0Var.getClass();
                ufm.f fVar2 = new ufm.f(d0Var, bVar, 1);
                Intrinsics.checkNotNullExpressionValue(fVar2, "doOnError(...)");
                return w.n0(fVar2, cVar);
            default:
                ?? r06 = (i) this.f280463b;
                x4l.c cVar2 = (x4l.c) this.f280464c;
                f DataObservableDelegate = (f) obj2;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(params, "params");
                d dVar = x4l.d.f302898b;
                if (dVar != null) {
                    return w.o0(dVar, new k((Function3) r06, cVar2, params, (Continuation) null));
                }
                Intrinsics.r("Unconfined");
                throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(Function3 function3, x4l.c cVar) {
        this.f280463b = (i) function3;
        this.f280464c = cVar;
    }
}
