package gsh;

import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import skm.a2;
import vkm.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements ish.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f146496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f146498c;
    public final ish.h d;
    public final CoroutineScope e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f146499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hlm.c f146500h;
    public final hlm.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ukm.a f146501j;
    public volatile int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f146502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f146503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile a2 f146504n;
    public volatile boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile List f146505p;

    public n(Class contextClass, String contextKey, a0 localRepository, ish.h widgetContentInteractor, CoroutineScope scope, hl6.b remoteRepositoryProvider, hq1.f widgetInitializerProvider) {
        Intrinsics.checkNotNullParameter(contextClass, "contextClass");
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(localRepository, "localRepository");
        Intrinsics.checkNotNullParameter(widgetContentInteractor, "widgetContentInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remoteRepositoryProvider, "remoteRepositoryProvider");
        Intrinsics.checkNotNullParameter(widgetInitializerProvider, "widgetInitializerProvider");
        this.f146496a = contextClass;
        this.f146497b = contextKey;
        this.f146498c = localRepository;
        this.d = widgetContentInteractor;
        this.e = scope;
        this.f = yhm.j.b(remoteRepositoryProvider);
        this.f146499g = yhm.j.b(widgetInitializerProvider);
        this.f146500h = hlm.d.a();
        this.i = hlm.d.a();
        this.f146501j = ukm.e.a(scope, -1, skm.d0.LAZY, null, new g23.q(this, (Continuation) null, 28), 9);
        this.f146505p = f0.f322471a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:143)|47|48|133|49|(1:165)(8:52|135|53|54|(1:63)(1:65)|(1:67)|68|(2:69|(2:71|(1:166)(5:74|75|(1:84)(3:139|79|83)|85|(1:167)(4:88|137|89|(1:168)(9:92|145|93|(3:95|(2:98|96)|152)(1:101)|102|(6:105|(2:155|107)(3:108|(3:111|(1:IC)(1:160)|109)|156)|114|159|157|103)|154|115|(2:117|162)(8:118|119|120|(1:122)|123|(1:169)|126|163))))))(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01a1, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0180, code lost:
    
        r11 = r9;
        r9 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0271 A[Catch: all -> 0x026d, TryCatch #6 {all -> 0x026d, blocks: (B:119:0x02d0, B:93:0x023e, B:95:0x0242, B:96:0x024d, B:98:0x0253, B:102:0x0276, B:103:0x027c, B:105:0x0282, B:114:0x02aa, B:108:0x028f, B:109:0x0293, B:111:0x0299, B:115:0x02ae, B:101:0x0271), top: B:145:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0282 A[Catch: all -> 0x026d, TryCatch #6 {all -> 0x026d, blocks: (B:119:0x02d0, B:93:0x023e, B:95:0x0242, B:96:0x024d, B:98:0x0253, B:102:0x0276, B:103:0x027c, B:105:0x0282, B:114:0x02aa, B:108:0x028f, B:109:0x0293, B:111:0x0299, B:115:0x02ae, B:101:0x0271), top: B:145:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109 A[LOOP:3: B:40:0x0103->B:42:0x0109, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0242 A[Catch: all -> 0x026d, TryCatch #6 {all -> 0x026d, blocks: (B:119:0x02d0, B:93:0x023e, B:95:0x0242, B:96:0x024d, B:98:0x0253, B:102:0x0276, B:103:0x027c, B:105:0x0282, B:114:0x02aa, B:108:0x028f, B:109:0x0293, B:111:0x0299, B:115:0x02ae, B:101:0x0271), top: B:145:0x023e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x016a -> B:135:0x0170). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x018b -> B:62:0x0199). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(gsh.n r18, gim.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.a(gsh.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2 A[Catch: Exception -> 0x005b, TryCatch #1 {Exception -> 0x005b, blocks: (B:21:0x0056, B:26:0x0062, B:41:0x00be, B:43:0x00c2, B:44:0x00d3, B:46:0x00d9, B:47:0x00ee, B:38:0x00aa), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(gsh.n r11, ukm.b r12, gim.c r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.b(gsh.n, ukm.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:19:0x004c, B:62:0x012d, B:53:0x0102, B:55:0x0106, B:57:0x010e), top: B:74:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [hlm.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dsh.i r17, gim.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.c(dsh.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof gsh.f
            if (r0 == 0) goto L13
            r0 = r9
            gsh.f r0 = (gsh.f) r0
            int r1 = r0.f146476y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146476y = r1
            goto L18
        L13:
            gsh.f r0 = new gsh.f
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f146474w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146476y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L6c
        L2d:
            r9 = move-exception
            goto L88
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            int r2 = r0.v
            hlm.a r6 = r0.u
            yhm.o.b(r9)
            r9 = r6
            goto L5a
        L40:
            yhm.o.b(r9)
            boolean r9 = r8.f146502l
            if (r9 == 0) goto L4a
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L4a:
            hlm.c r9 = r8.i
            r0.u = r9
            r2 = 0
            r0.v = r2
            r0.f146476y = r4
            java.lang.Object r6 = r9.lock(r5, r0)
            if (r6 != r1) goto L5a
            goto L6a
        L5a:
            boolean r6 = r8.f146502l     // Catch: java.lang.Throwable -> L7c
            if (r6 != 0) goto L81
            r0.u = r9     // Catch: java.lang.Throwable -> L7c
            r0.v = r2     // Catch: java.lang.Throwable -> L7c
            r0.f146476y = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r8.f(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r0 = r9
        L6c:
            r8.f146502l = r4     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.CoroutineScope r9 = r8.e     // Catch: java.lang.Throwable -> L2d
            ge7.f r1 = new ge7.f     // Catch: java.lang.Throwable -> L2d
            r2 = 26
            r1.<init>(r8, r5, r2)     // Catch: java.lang.Throwable -> L2d
            r2 = 3
            skm.e0.C(r9, r5, r5, r1, r2)     // Catch: java.lang.Throwable -> L2d
            goto L82
        L7c:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L88
        L81:
            r0 = r9
        L82:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r0.unlock(r5)
            return r9
        L88:
            r0.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.d(gim.c):java.lang.Object");
    }

    public final List e() {
        List list;
        if (this.o) {
            return this.f146505p;
        }
        synchronized (this) {
            try {
                if (!this.o) {
                    this.f146505p = ((csh.g) this.f146499g.getValue()).a(this.f146496a);
                    this.o = true;
                }
                list = this.f146505p;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r3.d(r0, r4, (java.util.List) r8) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b A[Catch: Exception -> 0x0043, TRY_ENTER, TryCatch #1 {Exception -> 0x0043, blocks: (B:18:0x003f, B:43:0x009c, B:23:0x0047, B:40:0x008e, B:24:0x004b, B:37:0x007d, B:34:0x006b), top: B:61:0x0023, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e A[Catch: Exception -> 0x0043, PHI: r2
      0x008e: PHI (r2v9 csh.h) = (r2v8 csh.h), (r2v11 csh.h) binds: [B:38:0x008b, B:23:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0043, blocks: (B:18:0x003f, B:43:0x009c, B:23:0x0047, B:40:0x008e, B:24:0x004b, B:37:0x007d, B:34:0x006b), top: B:61:0x0023, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.f(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
    
        if (r4.f(r0, r5, true) != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r13, gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.g(java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
    
        if (r2.f(r0, r4, true) != r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6, types: [hlm.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r13, dsh.e r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.h(java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        if (r5.f(r0, r6, true) != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r13, int r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.i(int, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
    
        if (r2.f(r0, r4, true) != r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6, types: [hlm.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(dsh.t r13, dsh.t r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.n.j(dsh.t, dsh.t, gim.c):java.lang.Object");
    }

    public final Flow k() {
        t0 t0Var = new t0(this.f146498c.l(this.f146497b), 1);
        return this.f146502l ? t0Var : vkm.q.m(new g23.q(this, t0Var, (Continuation) null, 29));
    }
}
