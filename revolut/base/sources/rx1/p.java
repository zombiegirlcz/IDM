package rx1;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public interface p {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object b(rx1.p r4, nx1.e r5, java.util.Map r6, java.util.Map r7, rx1.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof rx1.o
            if (r0 == 0) goto L13
            r0 = r9
            rx1.o r0 = (rx1.o) r0
            int r1 = r0.f258016w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f258016w = r1
            goto L18
        L13:
            rx1.o r0 = new rx1.o
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f258016w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L44
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r9)
            java.util.List r5 = r4.a(r5)
            if (r5 != 0) goto L3b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3b:
            r0.f258016w = r3
            kotlin.Unit r4 = r4.c(r5, r6, r7, r8)
            if (r4 != r1) goto L44
            return r1
        L44:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rx1.p.b(rx1.p, nx1.e, java.util.Map, java.util.Map, rx1.a, gim.c):java.lang.Object");
    }

    List a(nx1.e eVar);

    Unit c(List list, Map map, Map map2, a aVar);

    default Object d(List list, Continuation continuation) {
        return Boolean.FALSE;
    }
}
