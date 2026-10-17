package k09;

import jsl.t0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.q;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends yji.n implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g09.i f179993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f179994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r60.b f179995n;
    public final l09.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dz8.e f179996p;

    public g(g09.i lessonsInteractor, m defaultExtension, r60.b promptViewExtension, l09.a dialogMapper, dz8.e actionHandler) {
        Intrinsics.checkNotNullParameter(lessonsInteractor, "lessonsInteractor");
        Intrinsics.checkNotNullParameter(defaultExtension, "defaultExtension");
        Intrinsics.checkNotNullParameter(promptViewExtension, "promptViewExtension");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.f179993l = lessonsInteractor;
        this.f179994m = defaultExtension;
        this.f179995n = promptViewExtension;
        this.o = dialogMapper;
        this.f179996p = actionHandler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        if (r28.c3(r4, r2) == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(k09.g r28, u09.q r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k09.g.Z2(k09.g, u09.q, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, new jij.d(rd0.e.b(((r60.d) this.f179995n).d.d()), 22), null, new t0(this, (Continuation) null, 16), 3);
    }

    @Override // k09.n
    public final void K1(v domain, q lesson) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        V2(new t0(lesson, this, null, 17), new yi5.b(29));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(kotlin.jvm.functions.Function0 r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof k09.b
            if (r0 == 0) goto L13
            r0 = r8
            k09.b r0 = (k09.b) r0
            int r1 = r0.f179987x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179987x = r1
            goto L18
        L13:
            k09.b r0 = new k09.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179987x
            r60.b r3 = r6.f179995n
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.functions.Function0 r7 = r0.u
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2d
            goto L67
        L2d:
            r8 = move-exception
            goto L85
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r8)
            r8 = r3
            r60.d r8 = (r60.d) r8     // Catch: java.lang.Exception -> L2d
            rp0.p0 r8 = r8.d     // Catch: java.lang.Exception -> L2d
            efm.r r8 = r8.e()     // Catch: java.lang.Exception -> L2d
            k09.c r2 = k09.c.f     // Catch: java.lang.Exception -> L2d
            joe.e r2 = new joe.e     // Catch: java.lang.Exception -> L2d
            r5 = 9
            r2.<init>(r5)     // Catch: java.lang.Exception -> L2d
            efm.r r8 = r8.map(r2)     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)     // Catch: java.lang.Exception -> L2d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L2d
            r5 = r7
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5     // Catch: java.lang.Exception -> L2d
            r0.u = r5     // Catch: java.lang.Exception -> L2d
            r0.f179987x = r4     // Catch: java.lang.Exception -> L2d
            clm.a r4 = clm.a.FIRST_OR_DEFAULT     // Catch: java.lang.Exception -> L2d
            java.lang.Object r8 = nim.a.g(r8, r4, r2, r0)     // Catch: java.lang.Exception -> L2d
            if (r8 != r1) goto L67
            return r1
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L2d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Exception -> L2d
            if (r8 == 0) goto L81
            r60.d r3 = (r60.d) r3     // Catch: java.lang.Exception -> L2d
            r3.getClass()     // Catch: java.lang.Exception -> L2d
            java.lang.String r8 = "doOnHide"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)     // Catch: java.lang.Exception -> L2d
            r3.f251628g = r7     // Catch: java.lang.Exception -> L2d
            rp0.p0 r8 = r3.d     // Catch: java.lang.Exception -> L2d
            r8.a()     // Catch: java.lang.Exception -> L2d
            goto L92
        L81:
            r7.invoke()     // Catch: java.lang.Exception -> L2d
            goto L92
        L85:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r8, r0)
            r7.invoke()
        L92:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k09.g.b3(kotlin.jvm.functions.Function0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (b3(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (b3(r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(u09.q r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof k09.e
            if (r0 == 0) goto L13
            r0 = r11
            k09.e r0 = (k09.e) r0
            int r1 = r0.f179990x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179990x = r1
            goto L18
        L13:
            k09.e r0 = new k09.e
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179990x
            nki.a r3 = r9.e
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L4c
            if (r2 == r7) goto L46
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            yhm.o.b(r11)
            goto Lae
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            yhm.o.b(r11)
            goto L93
        L40:
            u09.q r10 = r0.u
            yhm.o.b(r11)
            goto L77
        L46:
            u09.q r10 = r0.u
            yhm.o.b(r11)
            goto L63
        L4c:
            yhm.o.b(r11)
            iyi.j r11 = new iyi.j
            r2 = 14
            r11.<init>(r9, r8, r2)
            r0.u = r10
            r0.f179990x = r7
            java.lang.String r2 = "setWelcomePromptShownForDomain"
            java.lang.Object r11 = pu7.a.B(r3, r2, r11, r0)
            if (r11 != r1) goto L63
            goto Lad
        L63:
            inh.g r11 = new inh.g
            r2 = 26
            r11.<init>(r9, r10, r8, r2)
            r0.u = r10
            r0.f179990x = r6
            java.lang.String r2 = "checkKyc"
            java.lang.Object r11 = pu7.a.B(r3, r2, r11, r0)
            if (r11 != r1) goto L77
            goto Lad
        L77:
            dz8.d r11 = (dz8.d) r11
            dz8.c r2 = dz8.c.f121292a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r11, r2)
            if (r2 == 0) goto L96
            jnf.a r11 = new jnf.a
            r2 = 19
            r11.<init>(r9, r10, r2)
            r0.u = r8
            r0.f179990x = r5
            java.lang.Object r10 = r9.b3(r11, r0)
            if (r10 != r1) goto L93
            goto Lad
        L93:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L96:
            boolean r10 = r11 instanceof dz8.b
            if (r10 == 0) goto Lb1
            jnf.a r10 = new jnf.a
            dz8.b r11 = (dz8.b) r11
            r2 = 20
            r10.<init>(r9, r11, r2)
            r0.u = r8
            r0.f179990x = r4
            java.lang.Object r10 = r9.b3(r10, r0)
            if (r10 != r1) goto Lae
        Lad:
            return r1
        Lae:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lb1:
            dz8.a r10 = dz8.a.f121290a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r11, r10)
            if (r10 != 0) goto Lc2
            if (r11 != 0) goto Lbc
            goto Lc2
        Lbc:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        Lc2:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k09.g.c3(u09.q, gim.c):java.lang.Object");
    }
}
