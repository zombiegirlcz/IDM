package x4l;

import akl.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ob0.k;
import rd0.e;
import skm.e0;
import w4l.f;
import w4l.h;
import w4l.i;
import wo2.l;
import wuh.q;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f302896a;

    public c(Function3 fromNetwork, Function1 fromMemory, Function2 toMemory, final Function2 fromStorage, Function3 toStorage, final Function2 onRemove) {
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        Intrinsics.checkNotNullParameter(fromMemory, "fromMemory");
        Intrinsics.checkNotNullParameter(toMemory, "toMemory");
        Intrinsics.checkNotNullParameter(fromStorage, "fromStorage");
        Intrinsics.checkNotNullParameter(toStorage, "toStorage");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        final int i = 0;
        final int i2 = 1;
        this.f302896a = new f(new uj0.b(fromNetwork, this), new tm.a(7, fromMemory), new t(toMemory, 10), new Function1() { // from class: x4l.a
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object params) throws Throwable {
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return e0.E(g.f186406a, new k(fromStorage, params, null, 3));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        e0.E(g.f186406a, new k(fromStorage, params, null, 4));
                        return Unit.f186387a;
                }
            }
        }, new t(toStorage, 11), new Function1() { // from class: x4l.a
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object params) throws Throwable {
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return e0.E(g.f186406a, new k(onRemove, params, null, 3));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        e0.E(g.f186406a, new k(onRemove, params, null, 4));
                        return Unit.f186387a;
                }
            }
        }, null, null, 192);
    }

    public static void a(c cVar, Function1 where) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(where, "where");
        cVar.f302896a.c(null, false, where);
    }

    public final vkm.d b(Object params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return e.b(this.f302896a.e(params, loadingStrategy));
    }

    public final vkm.d c(Object params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        return b(params, z ? i.f294643c : h.f294642c);
    }

    public final Object d(Object obj2, boolean z, Continuation continuation) {
        Object objA = nim.a.a(this.f302896a.g(obj2, z), continuation);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final Object e(Object obj2, Continuation continuation) throws Throwable {
        elm.f fVar = d.f302897a;
        if (fVar != null) {
            Object objJ = e0.J(fVar, new q(this, obj2, (Continuation) null), continuation);
            return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
        }
        Intrinsics.r("IO");
        throw null;
    }

    public final Object f(Object obj2, Object obj3, Continuation continuation) {
        elm.f fVar = d.f302897a;
        if (fVar != null) {
            Object objJ = e0.J(fVar, new l(this, obj2, obj3, (Continuation) null), continuation);
            return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
        }
        Intrinsics.r("IO");
        throw null;
    }

    public final void g(Object params, Object domain) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f302896a.k(params, domain);
    }

    public c(Function3 function3, Function1 function1, Function2 function2, Function2 function22, Function3 function32) {
        this(function3, function1, function2, function22, function32, new b(2, null));
    }
}
