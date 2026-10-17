package a2c;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import p1c.i;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements i {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f730b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f731a;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f730b = kotlin.time.c.g(5, pkm.e.SECONDS);
    }

    public e(l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f731a = userCompanyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a2c.b
            if (r0 == 0) goto L13
            r0 = r9
            a2c.b r0 = (a2c.b) r0
            int r1 = r0.f728w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f728w = r1
            goto L18
        L13:
            a2c.b r0 = new a2c.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f728w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L28
            goto L47
        L28:
            r9 = move-exception
            goto L50
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            yhm.o.b(r9)
            long r5 = a2c.e.f730b     // Catch: java.lang.Throwable -> L28
            a01.e r9 = new a01.e     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r7 = 4
            r9.<init>(r8, r2, r7)     // Catch: java.lang.Throwable -> L28
            r0.f728w = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = skm.h2.e(r5, r9, r0)     // Catch: java.lang.Throwable -> L28
            if (r9 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto L54
            boolean r3 = r9.booleanValue()     // Catch: java.lang.Throwable -> L28
            goto L54
        L50:
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L59
        L54:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L59:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a2c.e.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a2c.d
            if (r0 == 0) goto L13
            r0 = r5
            a2c.d r0 = (a2c.d) r0
            int r1 = r0.f729w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f729w = r1
            goto L18
        L13:
            a2c.d r0 = new a2c.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f729w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f729w = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L46
            p1c.h r5 = p1c.h.FORCE_FULL_SCREEN
            return r5
        L46:
            p1c.h r5 = p1c.h.NORMAL_FLOW
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2c.e.b(gim.c):java.lang.Enum");
    }
}
