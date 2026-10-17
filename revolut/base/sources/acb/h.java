package acb;

import io3.l;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;
import wda.r;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f3120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3121c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h(FlowCollector flowCollector, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f3119a = i;
        this.f3120b = flowCollector;
        this.f3121c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof wda.q
            if (r0 == 0) goto L13
            r0 = r12
            wda.q r0 = (wda.q) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            wda.q r0 = new wda.q
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r12)
            goto Lc2
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r12)
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r12 = r11.f186385a
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            java.lang.Object r11 = r11.f186386b
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r10.f3121c
            wda.r r2 = (wda.r) r2
            java.lang.Object r4 = r10.d
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L54:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r4.next()
            r7 = r6
            io3.d r7 = (io3.d) r7
            java.lang.String r8 = r7.f163146b
            java.lang.Object r9 = r10.e
            java.lang.String r9 = (java.lang.String) r9
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r8 == 0) goto L54
            io3.l r7 = r7.e
            java.lang.Object r8 = r10.f
            io3.l r8 = (io3.l) r8
            if (r7 != r8) goto L54
            r5.add(r6)
            goto L54
        L79:
            r12 = r12 ^ r3
            wda.i r4 = wda.r.Companion
            r4 = 10
            int r4 = zhm.w.t(r5, r4)
            int r4 = zhm.q0.b(r4)
            r6 = 16
            if (r4 >= r6) goto L8b
            r4 = r6
        L8b:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L94:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb7
            java.lang.Object r5 = r4.next()
            io3.d r5 = (io3.d) r5
            xi0.a r7 = xi0.b.Companion
            java.lang.String r8 = r5.f163147c
            r7.getClass()
            xi0.b r7 = xi0.a.a(r8)
            od0.i r5 = r2.e(r11, r5, r12)
            java.lang.Object r5 = r5.g()
            r6.put(r7, r5)
            goto L94
        Lb7:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r11 = r10.f3120b
            java.lang.Object r11 = r11.emit(r6, r0)
            if (r11 != r1) goto Lc2
            return r1
        Lc2:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: acb.h.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02dd, code lost:
    
        if (r6.emit((java.util.List) r1, r2) == r3) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: acb.h.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:605:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r39, kotlin.coroutines.Continuation r40) {
        /*
            Method dump skipped, instruction units count: 3094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: acb.h.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public h(FlowCollector flowCollector, r rVar, List list, xi0.b bVar, String str, l lVar) {
        this.f3119a = 13;
        this.f3120b = flowCollector;
        this.f3121c = rVar;
        this.d = list;
        this.e = str;
        this.f = lVar;
    }
}
