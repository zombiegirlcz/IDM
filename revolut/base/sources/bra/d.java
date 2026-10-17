package bra;

import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f17970a;

    public d(q repository, cra.a eligibilityCardOwnerTypeMapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eligibilityCardOwnerTypeMapper, "eligibilityCardOwnerTypeMapper");
        this.f17970a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(bra.d r4, java.lang.String r5, boolean r6, gim.c r7) throws java.lang.Exception {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof bra.b
            if (r0 == 0) goto L16
            r0 = r7
            bra.b r0 = (bra.b) r0
            int r1 = r0.f17966x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f17966x = r1
            goto L1b
        L16:
            bra.b r0 = new bra.b
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17966x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r4 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L63
            goto L58
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            yhm.o.b(r7)
            r7 = 9
            java.lang.String r5 = kotlin.text.f0.U0(r7, r5)
            ecm.q r4 = r4.f17970a     // Catch: java.lang.Exception -> L63
            bqa.a r7 = bqa.a.SEND     // Catch: java.lang.Exception -> L63
            if (r6 == 0) goto L46
            wpa.a r6 = wpa.a.SELF     // Catch: java.lang.Exception -> L63
            goto L48
        L46:
            wpa.a r6 = wpa.a.OTHER     // Catch: java.lang.Exception -> L63
        L48:
            ufm.n r4 = r4.j(r5, r7, r6)     // Catch: java.lang.Exception -> L63
            r0.u = r5     // Catch: java.lang.Exception -> L63
            r0.f17966x = r3     // Catch: java.lang.Exception -> L63
            java.lang.Object r7 = nim.a.b(r4, r0)     // Catch: java.lang.Exception -> L63
            if (r7 != r1) goto L57
            return r1
        L57:
            r4 = r5
        L58:
            com.revolut.feature.push_to_card.api.model.CardEligibility r7 = (com.revolut.feature.push_to_card.api.model.CardEligibility) r7     // Catch: java.lang.Exception -> L63
            ara.k r5 = new ara.k     // Catch: java.lang.Exception -> L63
            kotlin.jvm.internal.Intrinsics.h(r7)     // Catch: java.lang.Exception -> L63
            r5.<init>(r7, r4)     // Catch: java.lang.Exception -> L63
            return r5
        L63:
            r4 = move-exception
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L75
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r7 = 0
            rd0.d.a(r6, r7, r7, r4, r5)
            ara.j r4 = ara.j.f8604a
            return r4
        L75:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bra.d.a(bra.d, java.lang.String, boolean, gim.c):java.lang.Object");
    }
}
