package skm;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final fim.a a(gim.c r4) {
        /*
            boolean r0 = r4 instanceof skm.j0
            if (r0 == 0) goto L13
            r0 = r4
            skm.j0 r0 = (skm.j0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            skm.j0 r0 = new skm.j0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            yhm.o.b(r4)
            goto L4e
        L2f:
            yhm.o.b(r4)
            r0.v = r3
            skm.l r4 = new skm.l
            kotlin.coroutines.Continuation r2 = fim.h.b(r0)
            r4.<init>(r3, r2)
            r4.u()
            java.lang.Object r4 = r4.t()
            if (r4 != r1) goto L4b
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
        L4b:
            if (r4 != r1) goto L4e
            return r1
        L4e:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: skm.k0.a(gim.c):fim.a");
    }

    public static final Object b(long j2, Continuation frame) {
        if (j2 <= 0) {
            return Unit.f186387a;
        }
        l lVar = new l(1, fim.h.b(frame));
        lVar.u();
        if (j2 < Long.MAX_VALUE) {
            d(lVar.e).g(j2, lVar);
        }
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }

    public static final Object c(long j2, Continuation continuation) {
        Object objB = b(e(j2), continuation);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    public static final i0 d(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.q1);
        i0 i0Var = element instanceof i0 ? (i0) element : null;
        return i0Var == null ? f0.f263977a : i0Var;
    }

    public static final long e(long j2) {
        b.Companion companion = kotlin.time.b.INSTANCE;
        boolean z = j2 > 0;
        if (z) {
            return kotlin.time.b.f(kotlin.time.b.l(j2, kotlin.time.c.h(999999L, pkm.e.NANOSECONDS)));
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
