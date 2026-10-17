package q7c;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn0.c f242843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn2.c f242844b;

    public x(pn0.c signatureProvider, fn2.c verificationRepository) {
        Intrinsics.checkNotNullParameter(signatureProvider, "signatureProvider");
        Intrinsics.checkNotNullParameter(verificationRepository, "verificationRepository");
        this.f242843a = signatureProvider;
        this.f242844b = verificationRepository;
    }

    public static Set a(String str, String str2, String str3, String str4) {
        Pair pair = new Pair("revpay_verify_reason", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = new Pair("revpay_verify_calling_activity_pkg", str2);
        if (str3 == null) {
            str3 = "null";
        }
        Pair pair3 = new Pair("revpay_verify_calling_pkg", str3);
        if (str4 == null) {
            str4 = "null";
        }
        Pair[] elements = {pair, pair2, pair3, new Pair("revpay_verify_launched_from_pkg", str4)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    public static Set f(String str, String str2, Set set, String str3, String str4, String str5) {
        Pair pair = new Pair("revpay_verify_reason", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair[] elements = {pair, new Pair("revpay_verify_browser_pkg", str2), new Pair("revpay_verify_caller_pkgs", d0.k0(d0.O0(set), null, null, null, 0, null, 63)), new Pair("revpay_verify_payment_method", str3), new Pair("revpay_verify_payment_request_origin", str4), new Pair("revpay_verify_top_level_origin", str5)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum b(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, gim.c r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r4 = r16
            r0 = r17
            boolean r1 = r0 instanceof q7c.u
            if (r1 == 0) goto L18
            r1 = r0
            q7c.u r1 = (q7c.u) r1
            int r2 = r1.z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r2 & r5
            if (r6 == 0) goto L18
            int r2 = r2 - r5
            r1.z = r2
        L16:
            r6 = r1
            goto L1e
        L18:
            q7c.u r1 = new q7c.u
            r1.<init>(r12, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r6.f242838x
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.z
            java.lang.String r8 = "Revolut Pay verification failed"
            java.lang.String r9 = "RevolutPayVerification"
            r10 = 0
            r11 = 1
            if (r1 == 0) goto L4d
            if (r1 != r11) goto L45
            java.lang.String r13 = r6.f242837w
            java.lang.String r14 = r6.v
            java.lang.String r1 = r6.u
            yhm.o.b(r0)     // Catch: java.lang.Exception -> L3b java.util.concurrent.CancellationException -> L41
            r3 = r14
            r14 = r1
            goto La4
        L3b:
            r0 = move-exception
            r4 = r13
            r3 = r14
            r14 = r1
            goto Lad
        L41:
            r0 = move-exception
            r13 = r0
            goto Lbf
        L45:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L4d:
            yhm.o.b(r0)
            if (r14 != 0) goto L62
            java.lang.String r13 = "CALLING_ACTIVITY_NULL"
            java.util.Set r13 = a(r13, r14, r15, r4)
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r8, r10, r13)
            x7c.a r13 = x7c.a.UNVERIFIED
            return r13
        L62:
            if (r15 != 0) goto L74
            java.lang.String r13 = "CALLING_PACKAGE_NULL"
            java.util.Set r13 = a(r13, r14, r15, r4)
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r8, r10, r13)
            x7c.a r13 = x7c.a.UNVERIFIED
            return r13
        L74:
            boolean r0 = r14.equals(r15)
            if (r0 != 0) goto L8a
            java.lang.String r13 = "PACKAGE_MISMATCH"
            java.util.Set r13 = a(r13, r14, r15, r4)
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r8, r10, r13)
            x7c.a r13 = x7c.a.UNVERIFIED
            return r13
        L8a:
            be7.m r0 = new be7.m     // Catch: java.util.concurrent.CancellationException -> L41 java.lang.Exception -> Lab
            r5 = 6
            r1 = r12
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L41 java.lang.Exception -> Lab
            r6.u = r14     // Catch: java.util.concurrent.CancellationException -> L41 java.lang.Exception -> Lab
            r6.v = r15     // Catch: java.util.concurrent.CancellationException -> L41 java.lang.Exception -> Lab
            r6.f242837w = r4     // Catch: java.util.concurrent.CancellationException -> L41 java.lang.Exception -> Lab
            r6.z = r11     // Catch: java.util.concurrent.CancellationException -> L41 java.lang.Exception -> Lab
            java.lang.Enum r0 = r12.c(r13, r14, r0, r6)     // Catch: java.util.concurrent.CancellationException -> L41 java.lang.Exception -> Lab
            if (r0 != r7) goto La2
            return r7
        La2:
            r3 = r15
            r13 = r4
        La4:
            x7c.a r0 = (x7c.a) r0     // Catch: java.util.concurrent.CancellationException -> L41 java.lang.Exception -> La8
            r10 = r0
            goto Lba
        La8:
            r0 = move-exception
            r4 = r13
            goto Lad
        Lab:
            r0 = move-exception
            r3 = r15
        Lad:
            java.lang.String r13 = "EXCEPTION"
            java.util.Set r13 = a(r13, r14, r3, r4)
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r8, r0, r13)
        Lba:
            if (r10 != 0) goto Lbe
            x7c.a r10 = x7c.a.UNVERIFIED
        Lbe:
            return r10
        Lbf:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q7c.x.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum c(java.lang.String r12, java.lang.String r13, be7.m r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof q7c.v
            if (r0 == 0) goto L13
            r0 = r15
            q7c.v r0 = (q7c.v) r0
            int r1 = r0.f242840w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242840w = r1
            goto L18
        L13:
            q7c.v r0 = new q7c.v
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242840w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L73
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r15)
            pn0.c r15 = r11.f242843a
            java.util.ArrayList r9 = r15.c(r13)
            boolean r15 = r9.isEmpty()
            if (r15 == 0) goto L55
            java.lang.String r12 = "EMPTY_FINGERPRINTS"
            java.lang.Object r12 = r14.invoke(r12)
            java.util.Set r12 = (java.util.Set) r12
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r13 = rd0.c.ERROR
            java.lang.String r14 = "Revolut Pay verification failed"
            r15 = 0
            java.lang.String r0 = "RevolutPayVerification"
            rd0.d.a(r13, r0, r14, r15, r12)
            x7c.a r12 = x7c.a.UNVERIFIED
            return r12
        L55:
            r0.f242840w = r3
            i4g.d r4 = new i4g.d
            r10 = 0
            r5 = 26
            fn2.c r6 = r11.f242844b
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L6e
            goto L70
        L6e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L70:
            if (r12 != r1) goto L73
            return r1
        L73:
            x7c.a r12 = x7c.a.VERIFIED
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q7c.x.c(java.lang.String, java.lang.String, be7.m, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum d(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, kwg.e r24, gim.c r25) throws java.lang.Throwable {
        /*
            r19 = this;
            r1 = r19
            r2 = r24
            r0 = r25
            boolean r3 = r0 instanceof q7c.w
            if (r3 == 0) goto L19
            r3 = r0
            q7c.w r3 = (q7c.w) r3
            int r4 = r3.f242842x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f242842x = r4
            goto L1e
        L19:
            q7c.w r3 = new q7c.w
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f242842x
            java.lang.String r6 = "Revolut Pay Web Payment verification failed"
            java.lang.String r7 = "RevolutPayVerification"
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L40
            if (r5 != r8) goto L38
            kwg.e r2 = r3.u
            yhm.o.b(r0)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            goto L89
        L34:
            r0 = move-exception
            goto L8c
        L36:
            r0 = move-exception
            goto La0
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L40:
            yhm.o.b(r0)
            pn0.c r0 = r1.f242843a     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            r12 = r23
            java.util.ArrayList r13 = r0.c(r12)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            boolean r0 = r13.isEmpty()     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            if (r0 == 0) goto L64
            java.lang.String r0 = "EMPTY_FINGERPRINTS"
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            rd0.c r3 = rd0.c.ERROR     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            rd0.d.a(r3, r7, r6, r9, r0)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            x7c.a r0 = x7c.a.UNVERIFIED     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
        L62:
            r9 = r0
            goto L9b
        L64:
            fn2.c r11 = r1.f242844b     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            r3.u = r2     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            r3.f242842x = r8     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            a41.j1 r10 = new a41.j1     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            r17 = 0
            r18 = 18
            r16 = r20
            r14 = r21
            r15 = r22
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            skm.p0 r0 = skm.p0.f264001a     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            elm.f r0 = elm.f.f127540b     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.Object r0 = skm.e0.J(r0, r10, r3)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            if (r0 != r4) goto L84
            goto L86
        L84:
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
        L86:
            if (r0 != r4) goto L89
            return r4
        L89:
            x7c.a r0 = x7c.a.VERIFIED     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L36
            goto L62
        L8c:
            java.lang.String r3 = "EXCEPTION"
            java.lang.Object r2 = r2.invoke(r3)
            java.util.Set r2 = (java.util.Set) r2
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r7, r6, r0, r2)
        L9b:
            if (r9 != 0) goto L9f
            x7c.a r9 = x7c.a.UNVERIFIED
        L9f:
            return r9
        La0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7c.x.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kwg.e, gim.c):java.lang.Enum");
    }

    public final Enum e(String str, String str2, String str3, String str4, Set set, gim.c cVar) {
        String str5 = str4 == null ? (String) d0.L0(set) : str4;
        String str6 = set.isEmpty() ? "CALLER_PACKAGES_EMPTY" : (str4 == null || set.contains(str4)) ? str5 == null ? "CALLER_PACKAGE_AMBIGUOUS" : null : "PACKAGE_NOT_OWNED_BY_CALLER";
        if (str6 == null && str5 != null) {
            return d(str, str2, str3, str5, new kwg.e(this, str5, set, str, str2, str3), cVar);
        }
        String str7 = str5;
        if (str6 == null) {
            str6 = "CALLER_PACKAGE_UNRESOLVED";
        }
        Set setF = f(str6, str7, set, str, str2, str3);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "RevolutPayVerification", "Revolut Pay Web Payment verification failed", null, setF);
        return x7c.a.UNVERIFIED;
    }
}
