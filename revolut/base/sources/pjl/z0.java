package pjl;

import android.accounts.AccountManager;
import android.content.Context;
import com.revolut.sso.api.accounts.RevolutAccount;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class z0 implements uil.a {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f236872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f236873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f236874c;
    public final ekl.a d;
    public final qjl.f e;
    public final ih0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bkl.g f236875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccountManager f236876h;
    public final Lazy i;

    public z0(Context context, d accountManagerProxyNative, c accountManagerProxyFallback, ekl.a localDateProvider, qjl.f migrator, ih0.b remoteConfig, bkl.g userExtraAttributesSerializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountManagerProxyNative, "accountManagerProxyNative");
        Intrinsics.checkNotNullParameter(accountManagerProxyFallback, "accountManagerProxyFallback");
        Intrinsics.checkNotNullParameter(localDateProvider, "localDateProvider");
        Intrinsics.checkNotNullParameter(migrator, "migrator");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(userExtraAttributesSerializer, "userExtraAttributesSerializer");
        this.f236872a = context;
        this.f236873b = accountManagerProxyNative;
        this.f236874c = accountManagerProxyFallback;
        this.d = localDateProvider;
        this.e = migrator;
        this.f = remoteConfig;
        this.f236875g = userExtraAttributesSerializer;
        AccountManager accountManager = AccountManager.get(context);
        Intrinsics.checkNotNullExpressionValue(accountManager, "get(...)");
        this.f236876h = accountManager;
        this.i = yhm.j.b(new pgk.f(this, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:25:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(pjl.z0 r9, java.lang.String r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof pjl.n0
            if (r0 == 0) goto L13
            r0 = r11
            pjl.n0 r0 = (pjl.n0) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            pjl.n0 r0 = new pjl.n0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            int r10 = r0.z
            int r2 = r0.f236832y
            java.lang.Object r4 = r0.f236831x
            java.util.Iterator r5 = r0.f236830w
            java.util.Collection r6 = r0.v
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = r0.u
            yhm.o.b(r11)
            goto L8a
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            java.lang.String r10 = r0.u
            yhm.o.b(r11)
            goto L54
        L46:
            yhm.o.b(r11)
            r0.u = r10
            r0.C = r4
            java.lang.Object r11 = r9.h(r0)
            if (r11 != r1) goto L54
            goto L89
        L54:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
            r7 = r10
            r5 = r11
            r6 = r2
            r10 = r4
            r2 = r10
        L65:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto La2
            java.lang.Object r4 = r5.next()
            r11 = r4
            com.revolut.sso.api.accounts.RevolutAccount r11 = (com.revolut.sso.api.accounts.RevolutAccount) r11
            r0.u = r7
            r8 = r6
            java.util.Collection r8 = (java.util.Collection) r8
            r0.v = r8
            r0.f236830w = r5
            r0.f236831x = r4
            r0.f236832y = r2
            r0.z = r10
            r0.C = r3
            java.lang.Object r11 = r9.l(r11, r0)
            if (r11 != r1) goto L8a
        L89:
            return r1
        L8a:
            com.revolut.sso.api.models.UserInfo r11 = (com.revolut.sso.api.models.UserInfo) r11
            if (r11 == 0) goto L93
            java.util.UUID r11 = r11.getF105990a()
            goto L94
        L93:
            r11 = 0
        L94:
            java.util.UUID r8 = java.util.UUID.fromString(r7)
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r8)
            if (r11 == 0) goto L65
            r6.add(r4)
            goto L65
        La2:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.a(pjl.z0, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:34:0x0093, B:36:0x0097, B:41:0x00a8, B:39:0x00a4, B:20:0x0047, B:27:0x0071, B:29:0x0075, B:30:0x0079, B:23:0x0054), top: B:50:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(pjl.z0 r9, android.accounts.Account r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.b(pjl.z0, android.accounts.Account, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0318 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0317 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(pjl.z0 r25, android.accounts.Account r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.c(pjl.z0, android.accounts.Account, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r0.a(r1, r2, r5) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(pjl.z0 r17, android.accounts.Account r18, java.lang.String r19, java.lang.String r20, gim.c r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r21
            r0.getClass()
            boolean r3 = r2 instanceof pjl.w0
            if (r3 == 0) goto L1c
            r3 = r2
            pjl.w0 r3 = (pjl.w0) r3
            int r4 = r3.z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.z = r4
            goto L21
        L1c:
            pjl.w0 r3 = new pjl.w0
            r3.<init>(r0, r2)
        L21:
            java.lang.Object r2 = r3.f236862x
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.z
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L5a
            if (r5 == r8) goto L49
            if (r5 == r7) goto L3f
            if (r5 != r6) goto L37
            yhm.o.b(r2)
            goto Lbe
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            java.lang.String r1 = r3.f236861w
            java.lang.String r5 = r3.v
            android.accounts.Account r7 = r3.u
            yhm.o.b(r2)
            goto La7
        L49:
            java.lang.String r1 = r3.f236861w
            java.lang.String r5 = r3.v
            android.accounts.Account r8 = r3.u
            yhm.o.b(r2)
            r16 = r5
            r5 = r1
            r1 = r8
            r8 = r2
            r2 = r16
            goto L70
        L5a:
            yhm.o.b(r2)
            r3.u = r1
            r2 = r19
            r3.v = r2
            r5 = r20
            r3.f236861w = r5
            r3.z = r8
            java.lang.Object r8 = r0.j(r1, r3)
            if (r8 != r4) goto L70
            goto Lbd
        L70:
            java.util.List r8 = (java.util.List) r8
            boolean r9 = r8.contains(r2)
            if (r9 != 0) goto Laa
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.ArrayList r9 = zhm.d0.F0(r2, r8)
            r3.u = r1
            r3.v = r2
            r3.f236861w = r5
            r3.z = r7
            pjl.a r7 = r0.g()
            r14 = 0
            r15 = 62
            java.lang.String r10 = ","
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r8 = zhm.d0.k0(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r9 = "USER_DATA_TOKEN_TYPES"
            kotlin.Unit r7 = r7.g(r1, r9, r8)
            if (r7 != r4) goto L9f
            goto La1
        L9f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        La1:
            if (r7 != r4) goto La4
            goto Lbd
        La4:
            r7 = r1
            r1 = r5
            r5 = r2
        La7:
            r2 = r5
            r5 = r1
            r1 = r7
        Laa:
            pjl.a r0 = r0.g()
            r7 = 0
            r3.u = r7
            r3.v = r7
            r3.f236861w = r7
            r3.z = r6
            kotlin.Unit r0 = r0.a(r1, r2, r5)
            if (r0 != r4) goto Lbe
        Lbd:
            return r4
        Lbe:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.d(pjl.z0, android.accounts.Account, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.sso.api.accounts.RevolutAccount r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pjl.k0
            if (r0 == 0) goto L13
            r0 = r7
            pjl.k0 r0 = (pjl.k0) r0
            int r1 = r0.f236821w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236821w = r1
            goto L18
        L13:
            pjl.k0 r0 = new pjl.k0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236821w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L52
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            pjl.a r7 = r5.g()     // Catch: java.lang.Throwable -> L27
            android.accounts.Account r2 = new android.accounts.Account     // Catch: java.lang.Throwable -> L27
            com.revolut.sso.impl.domain.models.RevolutAccountImpl r6 = (com.revolut.sso.impl.domain.models.RevolutAccountImpl) r6     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r6.getF106157a()     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r6.getF106159c()     // Catch: java.lang.Throwable -> L27
            r2.<init>(r4, r6)     // Catch: java.lang.Throwable -> L27
            r0.f236821w = r3     // Catch: java.lang.Throwable -> L27
            kotlin.Unit r6 = r7.f(r2)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L52
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L5d
        L57:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L5d:
            java.lang.Throwable r6 = yhm.m.a(r6)
            if (r6 == 0) goto L80
            boolean r7 = r6 instanceof java.lang.SecurityException
            r0 = 0
            if (r7 == 0) goto L77
            com.revolut.sso.impl.data.repositories.SsoIsNotSupportedProperlyException r7 = new com.revolut.sso.impl.data.repositories.SsoIsNotSupportedProperlyException
            r7.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r0, r0, r7, r6)
            goto L80
        L77:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r0, r0, r6, r7)
        L80:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.e(com.revolut.sso.api.accounts.RevolutAccount, gim.c):java.lang.Object");
    }

    public final Object f(gim.i iVar) throws Throwable {
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new cuc.c0(this, null, 5), iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final a g() {
        return (a) this.i.getValue();
    }

    public final Object h(gim.c cVar) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new m0(this, null), cVar);
    }

    public final Object i(cjl.b bVar, gim.c cVar) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new o0(this, bVar, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.accounts.Account r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pjl.q0
            if (r0 == 0) goto L13
            r0 = r6
            pjl.q0 r0 = (pjl.q0) r0
            int r1 = r0.f236842w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236842w = r1
            goto L18
        L13:
            pjl.q0 r0 = new pjl.q0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236842w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            pjl.a r6 = r4.g()
            r0.f236842w = r3
            java.lang.String r0 = "USER_DATA_TOKEN_TYPES"
            java.lang.String r6 = r6.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L55
            java.lang.String r5 = ","
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r0 = 0
            r1 = 6
            java.util.List r5 = kotlin.text.d0.n0(r6, r5, r0, r1)
            if (r5 != 0) goto L54
            goto L55
        L54:
            return r5
        L55:
            zhm.f0 r5 = zhm.f0.f322471a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.j(android.accounts.Account, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable k(com.revolut.sso.api.accounts.RevolutAccount r5, gim.c r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pjl.s0
            if (r0 == 0) goto L13
            r0 = r6
            pjl.s0 r0 = (pjl.s0) r0
            int r1 = r0.f236847w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236847w = r1
            goto L18
        L13:
            pjl.s0 r0 = new pjl.s0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236847w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            pjl.a r6 = r4.g()     // Catch: java.lang.Throwable -> L27
            android.accounts.Account r5 = ksj.b.O(r5)     // Catch: java.lang.Throwable -> L27
            r0.f236847w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.e(r5, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L27
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L52
        L4c:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r5)
        L52:
            boolean r5 = r6 instanceof yhm.n
            if (r5 == 0) goto L57
            r6 = 0
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.k(com.revolut.sso.api.accounts.RevolutAccount, gim.c, java.lang.String):java.io.Serializable");
    }

    public final Object l(RevolutAccount revolutAccount, gim.c cVar) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new j0(this, revolutAccount, null, 2), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        if (n(r12, r5, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002d, B:58:0x0124, B:21:0x0047, B:55:0x010d, B:24:0x0056, B:45:0x00cf, B:47:0x00d7, B:50:0x0102, B:27:0x0065, B:34:0x0096, B:36:0x00a2, B:39:0x00be, B:30:0x0074), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d A[Catch: all -> 0x0032, PHI: r2 r5 r8 r12 r13
      0x010d: PHI (r2v15 int) = (r2v13 int), (r2v16 int) binds: [B:46:0x00d5, B:54:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r5v7 com.revolut.sso.api.models.UserInfo) = (r5v4 com.revolut.sso.api.models.UserInfo), (r5v9 com.revolut.sso.api.models.UserInfo) binds: [B:46:0x00d5, B:54:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r8v4 int) = (r8v2 int), (r8v5 int) binds: [B:46:0x00d5, B:54:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r12v14 com.revolut.sso.api.accounts.RevolutAccount) = (r12v25 com.revolut.sso.api.accounts.RevolutAccount), (r12v18 com.revolut.sso.api.accounts.RevolutAccount) binds: [B:46:0x00d5, B:54:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r13v10 int) = (r13v8 int), (r13v11 int) binds: [B:46:0x00d5, B:54:0x010a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002d, B:58:0x0124, B:21:0x0047, B:55:0x010d, B:24:0x0056, B:45:0x00cf, B:47:0x00d7, B:50:0x0102, B:27:0x0065, B:34:0x0096, B:36:0x00a2, B:39:0x00be, B:30:0x0074), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.revolut.sso.impl.domain.models.RevolutAccountImpl r12, com.revolut.sso.api.models.UserInfo r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.m(com.revolut.sso.impl.domain.models.RevolutAccountImpl, com.revolut.sso.api.models.UserInfo, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fb, code lost:
    
        if (r9.g(r8, "USER_DATA_USER_INFO_PICTURE", r7) == r1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea A[PHI: r7 r8
      0x00ea: PHI (r7v10 com.revolut.sso.api.models.UserInfo) = (r7v6 com.revolut.sso.api.models.UserInfo), (r7v11 com.revolut.sso.api.models.UserInfo) binds: [B:39:0x00e6, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r8v10 android.accounts.Account) = (r8v6 android.accounts.Account), (r8v11 android.accounts.Account) binds: [B:39:0x00e6, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b A[PHI: r7 r8
      0x010b: PHI (r7v12 com.revolut.sso.api.models.UserInfo) = (r7v10 com.revolut.sso.api.models.UserInfo), (r7v13 com.revolut.sso.api.models.UserInfo) binds: [B:46:0x0107, B:20:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r8v12 android.accounts.Account) = (r8v10 android.accounts.Account), (r8v13 android.accounts.Account) binds: [B:46:0x0107, B:20:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c A[PHI: r7 r8
      0x012c: PHI (r7v14 com.revolut.sso.api.models.UserInfo) = (r7v12 com.revolut.sso.api.models.UserInfo), (r7v15 com.revolut.sso.api.models.UserInfo) binds: [B:53:0x0128, B:19:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r8v14 android.accounts.Account) = (r8v12 android.accounts.Account), (r8v15 android.accounts.Account) binds: [B:53:0x0128, B:19:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145 A[PHI: r7 r8
      0x0145: PHI (r7v16 com.revolut.sso.api.models.UserInfo) = (r7v14 com.revolut.sso.api.models.UserInfo), (r7v17 com.revolut.sso.api.models.UserInfo) binds: [B:56:0x0141, B:18:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r8v16 android.accounts.Account) = (r8v14 android.accounts.Account), (r8v17 android.accounts.Account) binds: [B:56:0x0141, B:18:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e A[PHI: r7 r8
      0x015e: PHI (r7v18 com.revolut.sso.api.models.UserInfo) = (r7v16 com.revolut.sso.api.models.UserInfo), (r7v19 com.revolut.sso.api.models.UserInfo) binds: [B:59:0x015a, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r8v18 android.accounts.Account) = (r8v16 android.accounts.Account), (r8v19 android.accounts.Account) binds: [B:59:0x015a, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178 A[PHI: r7 r8
      0x0178: PHI (r7v20 com.revolut.sso.api.models.UserInfo) = (r7v18 com.revolut.sso.api.models.UserInfo), (r7v21 com.revolut.sso.api.models.UserInfo) binds: [B:62:0x0174, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r8v20 android.accounts.Account) = (r8v18 android.accounts.Account), (r8v21 android.accounts.Account) binds: [B:62:0x0174, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019d A[PHI: r7 r8
      0x019d: PHI (r7v22 com.revolut.sso.api.models.UserInfo) = (r7v20 com.revolut.sso.api.models.UserInfo), (r7v23 com.revolut.sso.api.models.UserInfo) binds: [B:69:0x019a, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r8v22 android.accounts.Account) = (r8v20 android.accounts.Account), (r8v23 android.accounts.Account) binds: [B:69:0x019a, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2 A[PHI: r7 r8
      0x01c2: PHI (r7v24 com.revolut.sso.api.models.UserInfo) = (r7v22 com.revolut.sso.api.models.UserInfo), (r7v25 com.revolut.sso.api.models.UserInfo) binds: [B:76:0x01bf, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r8v24 android.accounts.Account) = (r8v22 android.accounts.Account), (r8v25 android.accounts.Account) binds: [B:76:0x01bf, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(android.accounts.Account r7, com.revolut.sso.api.models.UserInfo r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.n(android.accounts.Account, com.revolut.sso.api.models.UserInfo, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable o(java.util.Set r5, android.accounts.Account r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof pjl.y0
            if (r0 == 0) goto L13
            r0 = r7
            pjl.y0 r0 = (pjl.y0) r0
            int r1 = r0.f236869x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236869x = r1
            goto L18
        L13:
            pjl.y0 r0 = new pjl.y0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236869x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Set r5 = r0.u
            java.util.Set r5 = (java.util.Set) r5
            yhm.o.b(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            pjl.a r7 = r4.g()
            r2 = r5
            java.util.Set r2 = (java.util.Set) r2
            r0.u = r2
            r0.f236869x = r3
            java.lang.String r0 = "com.revolut.USER_DATA_SCOPED_DEVICE_IDS"
            java.lang.String r7 = r7.b(r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L58
            gm0.a r6 = gm0.d.Companion
            r6.getClass()
            java.util.Set r6 = gm0.a.b(r7)
            goto L59
        L58:
            r6 = 0
        L59:
            aim.o r7 = new aim.o
            r7.<init>()
            if (r6 == 0) goto L65
            java.util.Collection r6 = (java.util.Collection) r6
            r7.addAll(r6)
        L65:
            java.util.Collection r5 = (java.util.Collection) r5
            r7.addAll(r5)
            aim.o r5 = zhm.y0.a(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.z0.o(java.util.Set, android.accounts.Account, gim.c):java.io.Serializable");
    }
}
