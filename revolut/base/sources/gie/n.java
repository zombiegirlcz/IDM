package gie;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f144142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f144143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f144144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, Continuation continuation) {
        super(3, continuation);
        this.f144144y = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(continuation, this.f144144y);
                nVar.f144142w = flowCollector;
                nVar.f144143x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            default:
                n nVar2 = new n(this.f144144y, continuation);
                nVar2.f144142w = flowCollector;
                nVar2.f144143x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.u
            switch(r0) {
                case 0: goto L66;
                default: goto L5;
            }
        L5:
            gie.s r0 = r8.f144144y
            gie.a r0 = r0.f144154r
            kotlinx.coroutines.flow.FlowCollector r1 = r8.f144142w
            java.lang.Object r2 = r8.f144143x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r8.v
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L30
            if (r4 == r7) goto L2c
            if (r4 == r6) goto L28
            if (r4 != r5) goto L20
            yhm.o.b(r9)
            goto L63
        L20:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L28:
            yhm.o.b(r9)
            goto L55
        L2c:
            yhm.o.b(r9)
            goto L40
        L30:
            yhm.o.b(r9)
            r8.f144142w = r1
            r8.f144143x = r2
            r8.v = r7
            java.lang.Object r9 = r0.Z2(r8)
            if (r9 != r3) goto L40
            goto L65
        L40:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L55
            r8.f144142w = r1
            r8.f144143x = r2
            r8.v = r6
            java.lang.Object r9 = r0.d3(r8)
            if (r9 != r3) goto L55
            goto L65
        L55:
            r9 = 0
            r8.f144142w = r9
            r8.f144143x = r9
            r8.v = r5
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r3) goto L63
            goto L65
        L63:
            kotlin.Unit r3 = kotlin.Unit.f186387a
        L65:
            return r3
        L66:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 1
            if (r1 == 0) goto L7b
            if (r1 != r2) goto L73
            yhm.o.b(r9)
            goto Lb4
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L7b:
            yhm.o.b(r9)
            kotlinx.coroutines.flow.FlowCollector r9 = r8.f144142w
            java.lang.Object r1 = r8.f144143x
            kotlin.Unit r1 = (kotlin.Unit) r1
            gie.s r1 = r8.f144144y
            cie.z r1 = r1.o
            mkd.d r3 = r1.f24538a
            gld.f0 r3 = (gld.f0) r3
            gld.a0 r3 = r3.f144638l
            kotlinx.coroutines.flow.Flow r3 = r3.e()
            ba4.x r4 = new ba4.x
            gld.i r3 = (gld.i) r3
            r5 = 22
            r4.<init>(r3, r1, r5)
            ccg.a r1 = new ccg.a
            r3 = 16
            r1.<init>(r3)
            vkm.h r1 = vkm.q.r(r1, r4)
            r3 = 0
            r8.f144142w = r3
            r8.f144143x = r3
            r8.v = r2
            java.lang.Object r9 = vkm.q.u(r9, r1, r8)
            if (r9 != r0) goto Lb4
            goto Lb6
        Lb4:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gie.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Continuation continuation, s sVar) {
        super(3, continuation);
        this.f144144y = sVar;
    }
}
