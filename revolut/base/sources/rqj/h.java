package rqj;

import java.util.ArrayList;
import java.util.List;
import w2a.q;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r10.c(r0, r8) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(rqj.h r10, java.lang.String r11, long r12, long r14, java.util.ArrayList r16, kotlin.coroutines.Continuation r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof rqj.g
            if (r1 == 0) goto L16
            r1 = r0
            rqj.g r1 = (rqj.g) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.A = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            rqj.g r1 = new rqj.g
            r1.<init>(r10, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.f256562y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.A
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 == r3) goto L36
            if (r2 != r9) goto L2e
            yhm.o.b(r0)
            goto L76
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            long r14 = r8.f256561x
            long r12 = r8.f256560w
            java.util.ArrayList r10 = r8.v
            rqj.h r11 = r8.u
            yhm.o.b(r0)
            r0 = r10
            r10 = r11
            goto L5e
        L44:
            yhm.o.b(r0)
            r8.u = r10
            r0 = r16
            r8.v = r0
            r8.f256560w = r12
            r8.f256561x = r14
            r8.A = r3
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            java.lang.Object r11 = r2.a(r3, r4, r6, r8)
            if (r11 != r1) goto L5e
            goto L75
        L5e:
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto L79
            r11 = 0
            r8.u = r11
            r8.v = r11
            r8.f256560w = r12
            r8.f256561x = r14
            r8.A = r9
            java.lang.Object r10 = r10.c(r0, r8)
            if (r10 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L79:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rqj.h.e(rqj.h, java.lang.String, long, long, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Object a(String str, long j2, long j3, g gVar);

    public abstract Object b(String str, long j2, long j3, wih.c cVar);

    public abstract Object c(List list, g gVar);

    public Object d(String str, long j2, long j3, ArrayList arrayList, q qVar) {
        return e(this, str, j2, j3, arrayList, qVar);
    }
}
