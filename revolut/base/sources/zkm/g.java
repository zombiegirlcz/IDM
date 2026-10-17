package zkm;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cfm.c f323104a = new cfm.c("UNDEFINED", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cfm.c f323105b = new cfm.c("REUSABLE_CLAIMED", 3);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(a0.d.n("Expected positive parallelism level, but got ", i).toString());
        }
    }

    public static final Object b(Object obj2, Object obj3) {
        if (obj2 == null) {
            return obj3;
        }
        if (obj2 instanceof ArrayList) {
            ((ArrayList) obj2).add(obj3);
            return obj2;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj2);
        arrayList.add(obj3);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #1 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008f, B:23:0x006b, B:25:0x0079, B:30:0x0086, B:32:0x008c, B:38:0x009c, B:41:0x00a5, B:40:0x00a2, B:28:0x007f), top: B:52:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof zkm.f
            if (r0 == 0) goto Lb0
            zkm.f r10 = (zkm.f) r10
            kotlinx.coroutines.CoroutineDispatcher r0 = r10.d
            kotlin.coroutines.Continuation r1 = r10.e
            java.lang.Throwable r2 = yhm.m.a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            skm.u r3 = new skm.u
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()
            boolean r2 = e(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f = r3
            r10.f263995c = r4
            kotlin.coroutines.CoroutineContext r9 = r1.getContext()
            d(r0, r9, r10)
            return
        L2f:
            skm.z0 r0 = skm.e2.a()
            long r5 = r0.f264022b
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f = r3
            r10.f263995c = r4
            r0.q(r10)
            goto Laa
        L46:
            r0.v(r4)
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            skm.g1 r3 = skm.g1.f263979a     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L69
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.d()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.p()     // Catch: java.lang.Throwable -> L69
            yhm.n r9 = yhm.o.a(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8f
        L69:
            r9 = move-exception
            goto La6
        L6b:
            java.lang.Object r2 = r10.f323103g     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = zkm.w.c(r3, r2)     // Catch: java.lang.Throwable -> L69
            cfm.c r5 = zkm.w.f323126a     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            skm.i2 r5 = skm.x.c(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L99
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L99
            if (r5 == 0) goto L8c
            boolean r9 = r5.l0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8f
        L8c:
            zkm.w.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8f:
            boolean r9 = r0.x()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8f
        L95:
            r0.m(r4)
            goto Laa
        L99:
            r9 = move-exception
            if (r5 == 0) goto La2
            boolean r1 = r5.l0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La5
        La2:
            zkm.w.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        La5:
            throw r9     // Catch: java.lang.Throwable -> L69
        La6:
            r10.i(r9)     // Catch: java.lang.Throwable -> Lab
            goto L95
        Laa:
            return
        Lab:
            r9 = move-exception
            r0.m(r4)
            throw r9
        Lb0:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zkm.g.c(java.lang.Object, kotlin.coroutines.Continuation):void");
    }

    public static final void d(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            coroutineDispatcher.dispatch(coroutineContext, runnable);
        } catch (Throwable th10) {
            throw new DispatchException(th10, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean e(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) throws DispatchException {
        try {
            return coroutineDispatcher.isDispatchNeeded(coroutineContext);
        } catch (Throwable th10) {
            throw new DispatchException(th10, coroutineDispatcher, coroutineContext);
        }
    }

    public static final long f(String str, long j2, long j3, long j5) {
        String property;
        int i = v.f323125a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lN = kotlin.text.z.n(property);
        if (lN == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        long jLongValue = lN.longValue();
        if (j3 <= jLongValue && jLongValue <= j5) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j5 + ", but is '" + jLongValue + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    public static int g(int i, int i2, String str) {
        return (int) f(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
