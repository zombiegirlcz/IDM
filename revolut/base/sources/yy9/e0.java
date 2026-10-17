package yy9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements ry9.c {

    @NotNull
    public static final a0 Companion = new a0();
    public static final Regex f = new Regex("revolut\\.me/([a-zA-Z0-9_]{3,})");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Regex f317882g = new Regex("(?:^|\\s)@([a-zA-Z0-9_]{3,})");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f317883h = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw9.d f317884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f317885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzl.c f317886c;
    public final cl3.a d;
    public final ang.f e;

    public e0(cw9.d paymentsProductFeatureChecker, z80.b phoneToolsProvider, zzl.c regexMatcher, cl3.a contactsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f317884a = paymentsProductFeatureChecker;
        this.f317885b = phoneToolsProvider;
        this.f317886c = regexMatcher;
        this.d = contactsInteractor;
        this.e = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ry9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.e0.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[PHI: r9
      0x0059: PHI (r9v25 java.lang.String) = (r9v15 java.lang.String), (r9v11 java.lang.String) binds: [B:32:0x0077, B:24:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof yy9.b0
            if (r0 == 0) goto L13
            r0 = r9
            yy9.b0 r0 = (yy9.b0) r0
            int r1 = r0.f317870w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317870w = r1
            goto L18
        L13:
            yy9.b0 r0 = new yy9.b0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317870w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L98
        L29:
            r8 = move-exception
            goto L9d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            kotlin.text.Regex r9 = yy9.e0.f
            kotlin.text.o r9 = r9.b(r8)
            if (r9 == 0) goto L4c
            java.util.List r9 = r9.c()
            kotlin.text.m r9 = (kotlin.text.m) r9
            java.lang.Object r9 = r9.get(r3)
            java.lang.String r9 = (java.lang.String) r9
            goto L4d
        L4c:
            r9 = r4
        L4d:
            java.lang.String r2 = "^(?=.*[a-zA-Z])(?!.*__)[a-zA-Z0-9][a-zA-Z0-9_]{1,}[a-zA-Z0-9]$"
            zzl.c r5 = r7.f317886c
            if (r9 == 0) goto L5b
            boolean r6 = r5.a(r2, r9)
            if (r6 == 0) goto L5b
        L59:
            r8 = r9
            goto L82
        L5b:
            kotlin.text.Regex r9 = yy9.e0.f317882g
            kotlin.text.o r9 = r9.b(r8)
            if (r9 == 0) goto L70
            java.util.List r9 = r9.c()
            kotlin.text.m r9 = (kotlin.text.m) r9
            java.lang.Object r9 = r9.get(r3)
            java.lang.String r9 = (java.lang.String) r9
            goto L71
        L70:
            r9 = r4
        L71:
            if (r9 == 0) goto L7a
            boolean r6 = r5.a(r2, r9)
            if (r6 == 0) goto L7a
            goto L59
        L7a:
            boolean r9 = r5.a(r2, r8)
            if (r9 == 0) goto L81
            goto L82
        L81:
            r8 = r4
        L82:
            if (r8 != 0) goto L85
            return r4
        L85:
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            cl3.a r9 = r7.d     // Catch: java.lang.Throwable -> L29
            wl3.h r9 = (wl3.h) r9     // Catch: java.lang.Throwable -> L29
            rfm.z r8 = r9.f(r8)     // Catch: java.lang.Throwable -> L29
            r0.f317870w = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = nim.a.i(r8, r0)     // Catch: java.lang.Throwable -> L29
            if (r9 != r1) goto L98
            return r1
        L98:
            zm3.a r9 = (zm3.a) r9     // Catch: java.lang.Throwable -> L29
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            goto La3
        L9d:
            yhm.m$a r9 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r8)
        La3:
            java.lang.Throwable r8 = yhm.m.a(r9)
            if (r8 == 0) goto Lb2
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r8, r0)
        Lb2:
            boolean r8 = r9 instanceof yhm.n
            if (r8 == 0) goto Lb7
            r9 = r4
        Lb7:
            zm3.a r9 = (zm3.a) r9
            if (r9 == 0) goto Lc0
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$P2PType$Revtag r4 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$P2PType$Revtag
            r4.<init>(r9)
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.e0.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof yy9.c0
            if (r0 == 0) goto L13
            r0 = r9
            yy9.c0 r0 = (yy9.c0) r0
            int r1 = r0.f317875y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317875y = r1
            goto L18
        L13:
            yy9.c0 r0 = new yy9.c0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f317873w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317875y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            boolean r8 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L36
            r6 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto L5f
        L30:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto L6e
        L36:
            r8 = move-exception
            goto L78
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            yhm.o.b(r9)
            java.lang.String r9 = yy9.e0.f317883h
            r2 = 0
            boolean r9 = kotlin.text.a0.H(r8, r9, r2)
            if (r9 == 0) goto L79
            ang.f r5 = r7.e     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            efm.d0 r2 = r5.f(r2)     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            r0.u = r8     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            r0.v = r9     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            r0.f317875y = r3     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            java.lang.Object r0 = nim.a.b(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            if (r0 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            do3.n r0 = (do3.n) r0     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            wi0.b r0 = do3.q.y(r0)     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            java.lang.String r0 = r0.f297794a     // Catch: java.util.concurrent.CancellationException -> L36 java.lang.Exception -> L6d
            goto L7a
        L6d:
            r0 = move-exception
        L6e:
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r4, r4, r0, r1)
            goto L79
        L78:
            throw r8
        L79:
            r0 = r4
        L7a:
            z80.b r1 = r7.f317885b
            boolean r2 = r1.k(r8, r0)
            if (r2 == 0) goto L8f
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$P2PType$Phone r4 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$P2PType$Phone
            if (r9 == 0) goto L8c
            yk0.b r9 = yk0.b.E164
            java.lang.String r8 = r1.a(r8, r0, r9)
        L8c:
            r4.<init>(r8)
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.e0.c(java.lang.String, gim.c):java.lang.Object");
    }
}
