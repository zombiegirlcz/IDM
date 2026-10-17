package opf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final use.d f227623a;

    public l(use.d ticketsInteractor) {
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        this.f227623a = ticketsInteractor;
    }

    public static String a(kse.a ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        return p.a.p("revolut://app/consumer-tickets/", ticket.f189436a, "?presentation_type=inline&presentation_style=modal");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof opf.k
            if (r0 == 0) goto L13
            r0 = r7
            opf.k r0 = (opf.k) r0
            int r1 = r0.f227622w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227622w = r1
            goto L18
        L13:
            opf.k r0 = new opf.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227622w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L60
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            use.d r7 = r5.f227623a
            efm.r r6 = r7.c(r6)
            efm.r r6 = zi0.c.J(r6)
            op0.v3 r7 = new op0.v3
            r2 = 21
            r7.<init>(r2)
            op0.v3 r2 = new op0.v3
            r4 = 22
            r2.<init>(r4)
            efm.r r6 = m70.a.e(r6, r7, r2)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f227622w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.l.b(java.lang.String, gim.c):java.lang.Object");
    }
}
