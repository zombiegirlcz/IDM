package k49;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.t;
import iyg.b0;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import skm.e0;
import skm.p0;
import vkm.c2;
import vkm.d2;
import vkm.q;
import vkm.y;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends i49.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i49.a f180859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f180860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f180861n;
    public final LargeActionButtonDelegate o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CoroutineScope f180862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f180863q;

    public l(i49.a pendingActionsItemsProvider, j60.a bottomDialogExtension, Set delegates) {
        Intrinsics.checkNotNullParameter(pendingActionsItemsProvider, "pendingActionsItemsProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f180859l = pendingActionsItemsProvider;
        this.f180860m = bottomDialogExtension;
        this.f180861n = delegates;
        this.o = new LargeActionButtonDelegate();
        this.f180862p = rd0.e.a(p0.f264003c);
        this.f180863q = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(k49.l r4, com.revolut.core.ui_kit.delegates.t r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof k49.d
            if (r0 == 0) goto L16
            r0 = r6
            k49.d r0 = (k49.d) r0
            int r1 = r0.f180850w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f180850w = r1
            goto L1b
        L16:
            k49.d r0 = new k49.d
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180850w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L5f
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            java.util.Set r4 = r4.f180861n
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r4.next()
            r2 = r6
            i49.c r2 = (i49.c) r2
            boolean r2 = r2.a(r5)
            if (r2 == 0) goto L3d
            goto L52
        L51:
            r6 = 0
        L52:
            i49.c r6 = (i49.c) r6
            if (r6 == 0) goto L64
            r0.f180850w = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            j49.h r6 = (j49.h) r6
            if (r6 == 0) goto L64
            return r6
        L64:
            j49.c r4 = j49.c.f171322a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k49.l.c3(k49.l, com.revolut.core.ui_kit.delegates.t, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        LargeActionButtonDelegate largeActionButtonDelegate = this.o;
        this.f180860m.d(u.c(largeActionButtonDelegate));
        n.j2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new h(this, null), 3);
    }

    @Override // yji.n
    public final void F2() {
        e0.n(this.f180862p.getCoroutineContext());
        this.f180863q.clear();
    }

    @Override // i49.b
    public final Flow Z2(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap linkedHashMap = this.f180863q;
        Object objM = linkedHashMap.get(params);
        if (objM == null) {
            y yVarE = rd0.e.e(new b0(((b) this.f180859l).b(params), 15), m72.b.w("error_id", params.f171329b), new i23.c(3, 16, null));
            d2.Companion.getClass();
            objM = q.M(yVarE, this.f180862p, c2.f290009c, 1);
            linkedHashMap.put(params, objM);
        }
        return (Flow) objM;
    }

    @Override // i49.b
    public final void b3(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        e3(new f(this, data, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:21:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(kotlin.jvm.functions.Function2 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof k49.c
            if (r0 == 0) goto L13
            r0 = r9
            k49.c r0 = (k49.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            k49.c r0 = new k49.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f180848x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r8 = r0.f180847w
            java.util.Iterator r2 = r0.v
            kotlin.jvm.functions.Function2 r4 = r0.u
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            yhm.o.b(r9)
            r6 = r4
            r4 = r8
            r8 = r6
            goto L68
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            yhm.o.b(r9)
            java.util.Set r9 = r7.f180861n
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
        L46:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r9.next()
            i49.c r4 = (i49.c) r4
            r5 = r8
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r0.u = r5
            r0.v = r9
            r0.f180847w = r2
            r0.z = r3
            java.lang.Object r4 = r8.invoke(r4, r0)
            if (r4 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r9
            r9 = r4
            r4 = r6
        L68:
            j49.h r9 = (j49.h) r9
            boolean r5 = r9 instanceof j49.b
            if (r5 != 0) goto L90
            boolean r5 = r9 instanceof j49.d
            if (r5 != 0) goto L90
            boolean r5 = r9 instanceof j49.g
            if (r5 != 0) goto L90
            boolean r5 = r9 instanceof j49.e
            if (r5 != 0) goto L90
            boolean r5 = r9 instanceof j49.f
            if (r5 != 0) goto L90
            boolean r5 = r9 instanceof j49.a
            if (r5 == 0) goto L83
            goto L90
        L83:
            boolean r9 = r9 instanceof j49.c
            if (r9 == 0) goto L8a
            r9 = r2
            r2 = r4
            goto L46
        L8a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L90:
            return r9
        L91:
            j49.c r8 = j49.c.f171322a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k49.l.d3(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e3(Function1 function1) {
        T2(new k(this, function1, null), new yi5.b(27));
    }
}
