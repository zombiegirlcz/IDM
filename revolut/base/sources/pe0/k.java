package pe0;

import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f235294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KClass f235295c;

    public /* synthetic */ k(FlowCollector flowCollector, KClass kClass, int i) {
        this.f235293a = i;
        this.f235294b = flowCollector;
        this.f235295c = kClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.f235293a
            switch(r0) {
                case 0: goto L4d;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof vkm.l1
            if (r0 == 0) goto L18
            r0 = r8
            vkm.l1 r0 = (vkm.l1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            vkm.l1 r0 = new vkm.l1
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)
            goto L4a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            kotlin.reflect.KClass r8 = r6.f235295c
            boolean r8 = r8.l(r7)
            if (r8 == 0) goto L4a
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r8 = r6.f235294b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L4a
            goto L4c
        L4a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4c:
            return r1
        L4d:
            boolean r0 = r8 instanceof pe0.j
            if (r0 == 0) goto L60
            r0 = r8
            pe0.j r0 = (pe0.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L60
            int r1 = r1 - r2
            r0.v = r1
            goto L65
        L60:
            pe0.j r0 = new pe0.j
            r0.<init>(r6, r8)
        L65:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7c
            if (r2 != r3) goto L74
            yhm.o.b(r8)
            goto Lba
        L74:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L7c:
            yhm.o.b(r8)
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L8c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r7.next()
            r4 = r2
            pe0.f r4 = (pe0.f) r4
            java.lang.Class r4 = r4.getClass()
            kotlin.jvm.internal.p0 r5 = kotlin.jvm.internal.o0.f186429a
            kotlin.reflect.KClass r4 = r5.b(r4)
            kotlin.reflect.KClass r5 = r6.f235295c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L8c
            r8.add(r2)
            goto L8c
        Laf:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f235294b
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto Lba
            goto Lbc
        Lba:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pe0.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
