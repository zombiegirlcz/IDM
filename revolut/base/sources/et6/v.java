package et6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements m {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f129347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f129348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au6.m f129349c;
    public final au6.v d;
    public final Set e;
    public final hlm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public skm.h0 f129350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f129351h;

    public v(CoroutineScope coroutineScope, l80.e dateProvider, au6.m loadingMetadataRepository, au6.v orderRepository) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(loadingMetadataRepository, "loadingMetadataRepository");
        Intrinsics.checkNotNullParameter(orderRepository, "orderRepository");
        this.f129347a = coroutineScope;
        this.f129348b = dateProvider;
        this.f129349c = loadingMetadataRepository;
        this.d = orderRepository;
        nr6.c0[] elements = {nr6.c0.AUTHORISED, nr6.c0.PARTIALLY_PAID, nr6.c0.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.e = kotlin.collections.d.y0(elements);
        this.f = hlm.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
    
        if (r15 == r2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        if (r15 != r2) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x005b, PHI: r3
      0x007f: PHI (r3v3 kotlin.jvm.internal.Ref$ObjectRef) = (r3v1 kotlin.jvm.internal.Ref$ObjectRef), (r3v4 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:32:0x0079, B:65:0x00e8] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x005b, blocks: (B:20:0x0054, B:64:0x00e5, B:33:0x007f, B:43:0x009d, B:47:0x00b7, B:77:0x010a, B:78:0x010d, B:75:0x0106, B:76:0x0109, B:26:0x0065, B:29:0x0072, B:32:0x0079, B:37:0x0091, B:39:0x0095, B:42:0x009b, B:51:0x00c6, B:53:0x00ca, B:55:0x00d2, B:59:0x00d9, B:63:0x00e1), top: B:94:0x0026, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[Catch: all -> 0x0098, TryCatch #2 {all -> 0x0098, blocks: (B:37:0x0091, B:39:0x0095, B:42:0x009b), top: B:92:0x0091, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca A[Catch: all -> 0x00de, TryCatch #4 {all -> 0x00de, blocks: (B:51:0x00c6, B:53:0x00ca, B:55:0x00d2, B:59:0x00d9, B:63:0x00e1), top: B:95:0x00c6, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00c4 -> B:22:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(et6.v r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.v.a(et6.v, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r7.y(r0) == r1) goto L34;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(et6.l r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof et6.o
            if (r0 == 0) goto L13
            r0 = r8
            et6.o r0 = (et6.o) r0
            int r1 = r0.f129285y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129285y = r1
            goto L18
        L13:
            et6.o r0 = new et6.o
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f129283w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129285y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.c r7 = r0.v
            skm.g0 r7 = (skm.g0) r7
            yhm.o.b(r8)
            goto L8d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            hlm.c r7 = r0.v
            et6.l r2 = r0.u
            yhm.o.b(r8)
            r8 = r7
            r7 = r2
            goto L53
        L41:
            yhm.o.b(r8)
            r0.u = r7
            hlm.c r8 = r6.f
            r0.v = r8
            r0.f129285y = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 != r1) goto L53
            goto L8c
        L53:
            et6.l r2 = r6.f129351h     // Catch: java.lang.Throwable -> L6b
            et6.l r4 = et6.l.HISTORICAL     // Catch: java.lang.Throwable -> L6b
            if (r2 == r4) goto L5e
            if (r7 != r4) goto L5c
            goto L5e
        L5c:
            et6.l r4 = et6.l.INCREMENTAL     // Catch: java.lang.Throwable -> L6b
        L5e:
            r6.f129351h = r4     // Catch: java.lang.Throwable -> L6b
            skm.h0 r7 = r6.f129350g     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L6d
            boolean r2 = r7.d()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L6d
            goto L7d
        L6b:
            r7 = move-exception
            goto L90
        L6d:
            kotlinx.coroutines.CoroutineScope r7 = r6.f129347a     // Catch: java.lang.Throwable -> L6b
            ebg.o r2 = new ebg.o     // Catch: java.lang.Throwable -> L6b
            r4 = 26
            r2.<init>(r6, r5, r4)     // Catch: java.lang.Throwable -> L6b
            r4 = 3
            skm.h0 r7 = skm.e0.g(r7, r5, r5, r2, r4)     // Catch: java.lang.Throwable -> L6b
            r6.f129350g = r7     // Catch: java.lang.Throwable -> L6b
        L7d:
            r8.unlock(r5)
            r0.u = r5
            r0.v = r5
            r0.f129285y = r3
            java.lang.Object r7 = r7.y(r0)
            if (r7 != r1) goto L8d
        L8c:
            return r1
        L8d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L90:
            r8.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.v.b(et6.l, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (g(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.time.LocalDateTime r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof et6.q
            if (r0 == 0) goto L13
            r0 = r8
            et6.q r0 = (et6.q) r0
            int r1 = r0.f129305x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129305x = r1
            goto L18
        L13:
            et6.q r0 = new et6.q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129305x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L57
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.time.LocalDateTime r7 = r0.u
            yhm.o.b(r8)
            goto L4c
        L39:
            yhm.o.b(r8)
            nr6.l0 r8 = new nr6.l0
            r8.<init>(r5, r5)
            r0.u = r7
            r0.f129305x = r4
            java.lang.Object r8 = r6.f(r8, r0)
            if (r8 != r1) goto L4c
            goto L56
        L4c:
            r0.u = r5
            r0.f129305x = r3
            java.lang.Object r7 = r6.g(r7, r0)
            if (r7 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.v.c(java.time.LocalDateTime, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (c(r11, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (g(r11, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.time.LocalDateTime r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof et6.r
            if (r0 == 0) goto L13
            r0 = r12
            et6.r r0 = (et6.r) r0
            int r1 = r0.f129316x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129316x = r1
            goto L18
        L13:
            et6.r r0 = new et6.r
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129316x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r12)
            goto La8
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            java.time.LocalDateTime r11 = r0.u
            yhm.o.b(r12)
            goto L9d
        L3d:
            yhm.o.b(r12)
            goto L84
        L41:
            yhm.o.b(r12)
            au6.m r12 = r10.f129349c
            ue0.c r2 = r12.f9567a
            java.lang.Class r7 = java.lang.Long.TYPE
            java.lang.String r8 = "FreelancerAcquiringOrderLoadingMetadataRepository:Storage:OldestNonFinalCreatedAt"
            java.lang.Object r2 = j6.a.k(r7, r2, r8)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L5d
            long r8 = r2.longValue()
            java.time.LocalDateTime r2 = oi0.d.Y(r8)
            goto L5e
        L5d:
            r2 = r6
        L5e:
            if (r2 != 0) goto L77
            ue0.c r12 = r12.f9567a
            java.lang.String r2 = "FreelancerAcquiringOrderLoadingMetadataRepository:Storage:LastSuccessfulSyncTo"
            java.lang.Object r12 = j6.a.k(r7, r12, r2)
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 == 0) goto L76
            long r7 = r12.longValue()
            java.time.LocalDateTime r12 = oi0.d.Y(r7)
            r2 = r12
            goto L77
        L76:
            r2 = r6
        L77:
            if (r2 != 0) goto L87
            r0.u = r6
            r0.f129316x = r5
            java.lang.Object r11 = r10.c(r11, r0)
            if (r11 != r1) goto L84
            goto La7
        L84:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L87:
            nr6.l0 r12 = new nr6.l0
            r7 = 8
            java.time.LocalDateTime r2 = r2.minusDays(r7)
            r12.<init>(r2, r11)
            r0.u = r11
            r0.f129316x = r4
            java.lang.Object r12 = r10.f(r12, r0)
            if (r12 != r1) goto L9d
            goto La7
        L9d:
            r0.u = r6
            r0.f129316x = r3
            java.lang.Object r11 = r10.g(r11, r0)
            if (r11 != r1) goto La8
        La7:
            return r1
        La8:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.v.d(java.time.LocalDateTime, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (c(r9, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(et6.l r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof et6.s
            if (r0 == 0) goto L13
            r0 = r9
            et6.s r0 = (et6.s) r0
            int r1 = r0.f129321w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129321w = r1
            goto L18
        L13:
            et6.s r0 = new et6.s
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129321w
            r3 = 0
            r4 = 2
            r5 = 1
            au6.m r6 = r7.f129349c
            if (r2 == 0) goto L37
            if (r2 == r5) goto L29
            if (r2 != r4) goto L2f
        L29:
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L62
        L2d:
            r8 = move-exception
            goto L68
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            r6.b(r5)
            l80.e r9 = r7.f129348b     // Catch: java.lang.Throwable -> L2d
            l80.f r9 = (l80.f) r9     // Catch: java.lang.Throwable -> L2d
            java.time.LocalDateTime r9 = r9.f()     // Catch: java.lang.Throwable -> L2d
            et6.l r2 = et6.l.HISTORICAL     // Catch: java.lang.Throwable -> L2d
            if (r8 == r2) goto L59
            boolean r8 = r6.a()     // Catch: java.lang.Throwable -> L2d
            if (r8 != 0) goto L50
            goto L59
        L50:
            r0.f129321w = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r7.d(r9, r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L62
            goto L61
        L59:
            r0.f129321w = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r7.c(r9, r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            r6.b(r3)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L68:
            r6.b(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.v.e(et6.l, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:30:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(nr6.l0 r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof et6.t
            if (r0 == 0) goto L13
            r0 = r10
            et6.t r0 = (et6.t) r0
            int r1 = r0.f129327x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129327x = r1
            goto L18
        L13:
            et6.t r0 = new et6.t
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129327x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.Set r9 = r0.u
            java.util.Set r9 = (java.util.Set) r9
            yhm.o.b(r10)
            goto L86
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            yhm.o.b(r10)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
        L3c:
            if (r9 == 0) goto L9a
            java.time.LocalDateTime r2 = r9.f218573a
            java.time.LocalDateTime r5 = r9.f218574b
            if (r2 == 0) goto L5b
            if (r5 == 0) goto L5b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = "-"
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            goto L5c
        L5b:
            r2 = r4
        L5c:
            if (r2 == 0) goto L67
            boolean r2 = r10.add(r2)
            if (r2 != 0) goto L67
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L67:
            r2 = r10
            java.util.Set r2 = (java.util.Set) r2
            r0.u = r2
            r0.f129327x = r3
            au6.v r2 = r8.d
            r2.getClass()
            a1a.c r5 = new a1a.c
            r6 = 12
            r5.<init>(r2, r9, r4, r6)
            kotlinx.coroutines.CoroutineDispatcher r9 = r2.f9636c
            java.lang.Object r9 = skm.e0.J(r9, r5, r0)
            if (r9 != r1) goto L83
            return r1
        L83:
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            nr6.k0 r10 = (nr6.k0) r10
            nr6.j0 r10 = r10.f218572c
            if (r10 == 0) goto L96
            nr6.l0 r2 = new nr6.l0
            java.time.LocalDateTime r5 = r10.f218565a
            java.time.LocalDateTime r10 = r10.f218566b
            r2.<init>(r5, r10)
            goto L97
        L96:
            r2 = r4
        L97:
            r10 = r9
            r9 = r2
            goto L3c
        L9a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.v.f(nr6.l0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.time.LocalDateTime r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof et6.u
            if (r0 == 0) goto L13
            r0 = r13
            et6.u r0 = (et6.u) r0
            int r1 = r0.f129338x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129338x = r1
            goto L18
        L13:
            et6.u r0 = new et6.u
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129338x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.time.LocalDateTime r12 = r0.u
            yhm.o.b(r13)
            goto L72
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter$Status r7 = new com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter$Status
            java.util.Set r13 = r11.e
            r7.<init>(r13)
            nr6.b0 r8 = new nr6.b0
            r8.<init>(r4)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r4)
            au6.v r6 = r11.d
            r6.getClass()
            java.lang.String r13 = "sorting"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r13)
            vkm.u1 r13 = r6.k
            a5b.b r5 = new a5b.b
            r10 = 5
            r5.<init>(r6, r7, r8, r9, r10)
            akg.n r13 = nim.a.v(r13, r5)
            en6.a r2 = new en6.a
            r5 = 20
            r2.<init>(r5)
            jhi.b r13 = mo3.a.g(r13, r3, r2, r4)
            r0.u = r12
            r0.f129338x = r4
            java.lang.Object r13 = vkm.q.z(r13, r0)
            if (r13 != r1) goto L72
            return r1
        L72:
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L7d
            java.lang.Object r13 = zhm.d0.d0(r13)
            nr6.b r13 = (nr6.b) r13
            goto L7e
        L7d:
            r13 = r3
        L7e:
            au6.m r0 = r11.f129349c
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f9569c
            r1.set(r4)
            ue0.c r1 = r0.f9567a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.String r5 = "FreelancerAcquiringOrderLoadingMetadataRepository:Storage:HasLoaded"
            com.revolut.data.database.models.openbanking.d.D(r4, r1, r5, r2)
            if (r13 == 0) goto L94
            java.time.LocalDateTime r3 = r13.f218538b
        L94:
            ue0.c r13 = r0.f9567a
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.String r2 = "FreelancerAcquiringOrderLoadingMetadataRepository:Storage:OldestNonFinalCreatedAt"
            if (r3 == 0) goto La8
            long r3 = oi0.d.R(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.google.android.gms.internal.mlkit_vision_face.a.B(r1, r13, r2, r3)
            goto Lab
        La8:
            r13.I0(r2)
        Lab:
            r0.getClass()
            java.lang.String r13 = "date"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            ue0.c r13 = r0.f9567a
            long r2 = oi0.d.R(r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "FreelancerAcquiringOrderLoadingMetadataRepository:Storage:LastSuccessfulSyncTo"
            com.google.android.gms.internal.mlkit_vision_face.a.B(r1, r13, r0, r12)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.v.g(java.time.LocalDateTime, gim.c):java.lang.Object");
    }

    public final void h(l mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        skm.e0.C(this.f129347a, null, null, new esa.i(this, mode, null, 2), 3);
    }
}
