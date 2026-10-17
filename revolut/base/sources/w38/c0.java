package w38;

import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f294160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f294161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io3.d f294162c;
    public final /* synthetic */ xi0.b d;
    public final /* synthetic */ n38.a e;
    public final /* synthetic */ List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ do3.n f294163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Set f294164h;
    public final /* synthetic */ g48.a i;

    public c0(FlowCollector flowCollector, q0 q0Var, io3.d dVar, xi0.b bVar, n38.a aVar, List list, do3.n nVar, Set set, g48.a aVar2) {
        this.f294160a = flowCollector;
        this.f294161b = q0Var;
        this.f294162c = dVar;
        this.d = bVar;
        this.e = aVar;
        this.f = list;
        this.f294163g = nVar;
        this.f294164h = set;
        this.i = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof w38.b0
            if (r0 == 0) goto L13
            r0 = r15
            w38.b0 r0 = (w38.b0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            w38.b0 r0 = new w38.b0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L63
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            r9 = r14
            com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle r9 = (com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle) r9
            w38.q0 r14 = r13.f294161b
            u38.m r4 = r14.f294204a
            java.util.Set r14 = r13.f294164h
            io3.d r5 = r13.f294162c
            java.lang.String r15 = r5.f163145a
            boolean r11 = r14.contains(r15)
            g48.a r12 = r13.i
            xi0.b r6 = r13.d
            n38.a r7 = r13.e
            java.util.List r8 = r13.f
            do3.n r10 = r13.f294163g
            com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Main r14 = r4.d(r5, r6, r7, r8, r9, r10, r11, r12)
            r15 = 3
            r2 = 0
            r4 = 0
            com.revolut.data.model.Data r14 = zi0.c.P(r14, r2, r4, r15)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r15 = r13.f294160a
            java.lang.Object r14 = r15.emit(r14, r0)
            if (r14 != r1) goto L63
            return r1
        L63:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: w38.c0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
