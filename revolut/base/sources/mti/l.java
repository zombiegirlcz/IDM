package mti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pti.z;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements zsi.h {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f208860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f208861c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f208862a;

    static {
        pkm.e eVar = pkm.e.SECONDS;
        f208860b = kotlin.time.c.g(1, eVar);
        f208861c = kotlin.time.c.g(5, eVar);
    }

    public l(z repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f208862a = repository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r2.emit(r4, r3) == r11) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mti.l r14, kotlinx.coroutines.flow.FlowCollector r15, java.lang.String r16, long r17, long r19, gim.c r21) {
        /*
            r0 = r19
            r2 = r21
            r14.getClass()
            boolean r3 = r2 instanceof mti.j
            if (r3 == 0) goto L1a
            r3 = r2
            mti.j r3 = (mti.j) r3
            int r4 = r3.A
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.A = r4
            goto L1f
        L1a:
            mti.j r3 = new mti.j
            r3.<init>(r14, r2)
        L1f:
            java.lang.Object r2 = r3.f208857y
            fim.a r11 = fim.a.COROUTINE_SUSPENDED
            int r4 = r3.A
            r12 = 2
            r13 = 1
            if (r4 == 0) goto L47
            if (r4 == r13) goto L39
            if (r4 != r12) goto L31
            yhm.o.b(r2)
            goto L84
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            long r0 = r3.f208856x
            long r4 = r3.f208855w
            kotlin.jvm.internal.Ref$ObjectRef r6 = r3.v
            kotlinx.coroutines.flow.FlowCollector r7 = r3.u
            yhm.o.b(r2)
            r8 = r4
            r2 = r7
            goto L69
        L47:
            kotlin.jvm.internal.Ref$ObjectRef r7 = p.a.w(r2)
            b6i.d0 r4 = new b6i.d0
            r10 = 0
            r5 = r14
            r6 = r16
            r8 = r17
            r4.<init>(r5, r6, r7, r8, r10)
            r3.u = r15
            r3.v = r7
            r3.f208855w = r8
            r3.f208856x = r0
            r3.A = r13
            java.lang.Object r4 = skm.h2.e(r0, r4, r3)
            if (r4 != r11) goto L67
            goto L83
        L67:
            r2 = r15
            r6 = r7
        L69:
            java.lang.Object r4 = r6.f186409a
            zsi.g r4 = (zsi.g) r4
            if (r4 == 0) goto L70
            goto L72
        L70:
            zsi.f$a r4 = zsi.f.a.f324933a
        L72:
            r5 = 0
            r3.u = r5
            r3.v = r5
            r3.f208855w = r8
            r3.f208856x = r0
            r3.A = r12
            java.lang.Object r0 = r2.emit(r4, r3)
            if (r0 != r11) goto L84
        L83:
            return r11
        L84:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mti.l.a(mti.l, kotlinx.coroutines.flow.FlowCollector, java.lang.String, long, long, gim.c):java.lang.Object");
    }
}
