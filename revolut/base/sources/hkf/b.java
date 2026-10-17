package hkf;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function3 {
    public /* synthetic */ a3 u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f152926w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(3, continuation);
        this.f152926w = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b bVar = new b(this.f152926w, (Continuation) obj4);
        bVar.u = (a3) obj2;
        bVar.v = (List) obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if ((r5 != null ? r5.f272662a : null) != null) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            tof.a3 r0 = r4.u
            java.util.List r1 = r4.v
            java.util.List r1 = (java.util.List) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            java.util.Set r5 = hkf.c.f152927c
            hkf.c r5 = r4.f152926w
            r5.getClass()
            java.util.Set r5 = hkf.c.d
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            tof.v5 r2 = r0.f272618v1
            boolean r5 = zhm.d0.T(r5, r2)
            if (r5 != 0) goto L65
            tof.k r5 = r0.T0
            if (r5 != 0) goto L65
            tof.x6 r5 = r0.I
            tof.e3 r0 = r5.d
            r2 = 0
            if (r0 == 0) goto L2c
            java.lang.String r0 = r0.f272726a
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 != 0) goto L37
            tof.c3 r5 = r5.e
            if (r5 == 0) goto L35
            java.lang.String r2 = r5.f272662a
        L35:
            if (r2 == 0) goto L65
        L37:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r1.iterator()
        L42:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.revolut.core.ui_kit.views.ActionsView$Item r2 = (com.revolut.core.ui_kit.views.ActionsView.Item) r2
            hkf.a r3 = hkf.c.a()
            r3.getClass()
            java.util.Set r3 = hkf.c.f152927c
            java.lang.String r2 = r2.f58316a
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L42
            r5.add(r1)
            goto L42
        L64:
            return r5
        L65:
            zhm.f0 r5 = zhm.f0.f322471a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hkf.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
