package a68;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import te8.y;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f1575c;
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v58.i f1576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f1577b;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f1575c = kotlin.time.c.g(7, pkm.e.SECONDS);
        d = kotlin.time.c.g(300, pkm.e.MILLISECONDS);
    }

    public l(v58.i juniorActivationClaimRepository, y juniorPollingInteractor) {
        Intrinsics.checkNotNullParameter(juniorActivationClaimRepository, "juniorActivationClaimRepository");
        Intrinsics.checkNotNullParameter(juniorPollingInteractor, "juniorPollingInteractor");
        this.f1576a = juniorActivationClaimRepository;
        this.f1577b = juniorPollingInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(r58.b r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a68.k
            if (r0 == 0) goto L14
            r0 = r11
            a68.k r0 = (a68.k) r0
            int r1 = r0.f1574w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f1574w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a68.k r0 = new a68.k
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f1574w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r11)
            goto L5e
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r11)
            r11 = r2
            pe8.e r2 = new pe8.e
            long r3 = a68.l.f1575c
            long r7 = a68.l.d
            r2.<init>(r3, r7)
            a2j.c r3 = new a2j.c
            r1 = 2
            r4 = 0
            r3.<init>(r9, r10, r4, r1)
            r10 = r4
            a2c.c r4 = new a2c.c
            r5 = 2
            r4.<init>(r5, r1, r10)
            r1 = r5
            a2c.c r5 = new a2c.c
            r7 = 3
            r5.<init>(r1, r7, r10)
            r6.f1574w = r11
            te8.y r1 = r9.f1577b
            java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L5e
            return r0
        L5e:
            pe8.j r11 = (pe8.j) r11
            boolean r10 = r11 instanceof pe8.i
            if (r10 == 0) goto L89
            pe8.i r11 = (pe8.i) r11
            java.lang.Object r10 = r11.f235343a
            v58.c r10 = (v58.c) r10
            boolean r11 = r10 instanceof v58.a
            if (r11 == 0) goto L73
            v58.a r10 = (v58.a) r10
            r58.c r10 = r10.f286160a
            return r10
        L73:
            v58.b r11 = v58.b.f286161a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r11)
            if (r10 == 0) goto L83
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Status should never be pending after polling has finished/timedout."
            r10.<init>(r11)
            throw r10
        L83:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L89:
            boolean r10 = r11 instanceof pe8.h
            if (r10 == 0) goto L94
            pe8.h r11 = (pe8.h) r11
            java.lang.Exception r10 = r11.getException()
            throw r10
        L94:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a68.l.a(r58.b, gim.c):java.lang.Object");
    }
}
