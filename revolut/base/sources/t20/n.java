package t20;

import com.revolut.chat.data.network.AuthenticationApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.x;

/* JADX INFO: loaded from: classes.dex */
public final class n implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf3.b f267401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf3.l f267402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AuthenticationApi f267403c;
    public final ue0.c d;
    public final bm0.a e;
    public volatile x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hlm.c f267404g;

    public n(tf3.b chatAuthorizationStatus, rf3.l chatAuthInfoProvider, AuthenticationApi authenticationApi, ue0.c storage, bm0.a cryptoWrapper) {
        Intrinsics.checkNotNullParameter(chatAuthorizationStatus, "chatAuthorizationStatus");
        Intrinsics.checkNotNullParameter(chatAuthInfoProvider, "chatAuthInfoProvider");
        Intrinsics.checkNotNullParameter(authenticationApi, "authenticationApi");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        this.f267401a = chatAuthorizationStatus;
        this.f267402b = chatAuthInfoProvider;
        this.f267403c = authenticationApi;
        this.d = storage;
        this.e = cryptoWrapper;
        this.f267404g = hlm.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [bm0.a] */
    /* JADX WARN: Type inference failed for: r12v0, types: [t20.n] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(t20.n r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.n.a(t20.n, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof t20.f
            if (r0 == 0) goto L13
            r0 = r8
            t20.f r0 = (t20.f) r0
            int r1 = r0.f267389w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267389w = r1
            goto L18
        L13:
            t20.f r0 = new t20.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267389w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            goto L5c
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            tf3.b r8 = r7.f267401a
            zm0.c r8 = r8.f270223a
            cn0.g r8 = (cn0.g) r8
            mm0.o r8 = r8.d()
            boolean r8 = r8 instanceof mm0.o.a
            if (r8 != 0) goto L43
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L43:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r4 = 10
            long r4 = r8.toMillis(r4)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            sqd.h0 r8 = new sqd.h0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r2 = 0
            r6 = 11
            r8.<init>(r7, r2, r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f267389w = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            java.lang.Object r8 = skm.h2.b(r4, r8, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            if (r8 != r1) goto L5c
            return r1
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            boolean r8 = r8.booleanValue()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            goto L64
        L63:
            r8 = 0
        L64:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.n.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: all -> 0x00e5, TRY_ENTER, TryCatch #3 {all -> 0x00e5, blocks: (B:67:0x014b, B:70:0x0157, B:72:0x0161, B:77:0x0173, B:78:0x0180, B:47:0x00bb, B:49:0x00c5, B:54:0x00d7, B:57:0x00e9, B:63:0x0128), top: B:93:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128 A[Catch: all -> 0x00e5, TRY_ENTER, TryCatch #3 {all -> 0x00e5, blocks: (B:67:0x014b, B:70:0x0157, B:72:0x0161, B:77:0x0173, B:78:0x0180, B:47:0x00bb, B:49:0x00c5, B:54:0x00d7, B:57:0x00e9, B:63:0x0128), top: B:93:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157 A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:67:0x014b, B:70:0x0157, B:72:0x0161, B:77:0x0173, B:78:0x0180, B:47:0x00bb, B:49:0x00c5, B:54:0x00d7, B:57:0x00e9, B:63:0x0128), top: B:93:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r17v0, types: [t20.n] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [hlm.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.n.c(gim.c):java.lang.Object");
    }

    @Override // od0.e
    public final void clear() {
        k(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof t20.h
            if (r0 == 0) goto L13
            r0 = r8
            t20.h r0 = (t20.h) r0
            int r1 = r0.f267393w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267393w = r1
            goto L18
        L13:
            t20.h r0 = new t20.h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267393w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            yhm.o.b(r8)
            return r8
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            yhm.o.b(r8)
            return r8
        L3c:
            yhm.o.b(r8)
            goto L62
        L40:
            yhm.o.b(r8)
            return r8
        L44:
            yhm.o.b(r8)
            tf3.b r8 = r7.f267401a
            boolean r8 = r8.b()
            if (r8 == 0) goto L59
            r0.f267393w = r6
            java.lang.Object r8 = r7.e(r0)
            if (r8 != r1) goto L58
            goto L7c
        L58:
            return r8
        L59:
            r0.f267393w = r5
            java.lang.Object r8 = r7.b(r0)
            if (r8 != r1) goto L62
            goto L7c
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L74
            r0.f267393w = r4
            java.lang.Object r8 = r7.e(r0)
            if (r8 != r1) goto L73
            goto L7c
        L73:
            return r8
        L74:
            r0.f267393w = r3
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.n.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof t20.i
            if (r0 == 0) goto L13
            r0 = r8
            t20.i r0 = (t20.i) r0
            int r1 = r0.f267394w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267394w = r1
            goto L18
        L13:
            t20.i r0 = new t20.i
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267394w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28
            goto L4c
        L28:
            r8 = move-exception
            goto L4f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L28
            r5 = 20
            long r5 = r8.toMillis(r5)     // Catch: java.lang.Exception -> L28
            sx2.r r8 = new sx2.r     // Catch: java.lang.Exception -> L28
            r2 = 6
            r8.<init>(r7, r3, r2)     // Catch: java.lang.Exception -> L28
            r0.f267394w = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r8 = skm.h2.b(r5, r8, r0)     // Catch: java.lang.Exception -> L28
            if (r8 != r1) goto L4c
            return r1
        L4c:
            t20.c r8 = (t20.c) r8     // Catch: java.lang.Exception -> L28
            return r8
        L4f:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.WARNING
            java.lang.String r2 = "ChatAuthentication"
            rd0.d.a(r1, r2, r3, r8, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.n.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t20.j
            if (r0 == 0) goto L13
            r0 = r6
            t20.j r0 = (t20.j) r0
            int r1 = r0.f267395w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267395w = r1
            goto L18
        L13:
            t20.j r0 = new t20.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267395w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            e20.b r6 = new e20.b
            r6.<init>(r5)
            com.revolut.chat.data.network.AuthenticationApi r5 = r4.f267403c
            efm.d0 r5 = r5.signInAnonymousByEmail(r6)
            r0.f267395w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.n.g(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t20.k
            if (r0 == 0) goto L13
            r0 = r6
            t20.k r0 = (t20.k) r0
            int r1 = r0.f267396w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267396w = r1
            goto L18
        L13:
            t20.k r0 = new t20.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267396w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            e20.c r6 = new e20.c
            r6.<init>(r5)
            com.revolut.chat.data.network.AuthenticationApi r5 = r4.f267403c
            efm.d0 r5 = r5.signInAnonymousByPhone(r6)
            r0.f267396w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.n.h(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t20.l
            if (r0 == 0) goto L13
            r0 = r7
            t20.l r0 = (t20.l) r0
            int r1 = r0.f267397w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267397w = r1
            goto L18
        L13:
            t20.l r0 = new t20.l
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267397w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            e20.d r7 = new e20.d
            r7.<init>(r6, r5)
            com.revolut.chat.data.network.AuthenticationApi r5 = r4.f267403c
            efm.d0 r5 = r5.signInVerification(r7)
            r0.f267397w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t20.n.i(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final x j() {
        x xVar = this.f;
        if (xVar != null) {
            return xVar;
        }
        x.Companion companion = x.INSTANCE;
        ue0.c cVar = this.d;
        companion.getClass();
        x xVarB = x.Companion.b(cVar);
        this.f = xVarB;
        return xVarB;
    }

    public final void k(x xVar) {
        this.f = xVar;
        if (xVar != null) {
            xVar.f(this.d);
            return;
        }
        x.Companion companion = x.INSTANCE;
        ue0.c cVar = this.d;
        companion.getClass();
        x.Companion.a(cVar);
    }
}
