package ybh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b r3 = r6.v
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L53
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L2c
        L1e:
            yhm.o.b(r7)
            tb4.t r7 = r3.f95596y
            r6.u = r4
            java.lang.Object r7 = r7.B(r6)
            if (r7 != r0) goto L2c
            goto L52
        L2c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7a
            m1h.k r7 = r3.f95595x
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input r1 = r3.o
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r1 = r1.f95583a
            go.g r7 = r7.f(r1)
            y65.n r1 = new y65.n
            r5 = 24
            r1.<init>(r5)
            r5 = 0
            jhi.b r7 = mo3.a.g(r7, r5, r1, r4)
            r6.u = r2
            java.lang.Object r7 = vkm.q.x(r7, r6)
            if (r7 != r0) goto L53
        L52:
            return r0
        L53:
            m1h.j r7 = (m1h.j) r7
            m1h.i r7 = r7.f201501a
            if (r7 == 0) goto L75
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input r0 = new com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input
            java.time.LocalDate r1 = r7.f201499a
            k4l.c0 r7 = r7.f201500b
            r2 = 0
            r0.<init>(r1, r7, r2)
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen r7 = new com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen
            r7.<init>(r0)
            y7k.g0 r1 = new y7k.g0
            r2 = 9
            r1.<init>(r3, r0, r2)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_IMMEDIATE r0 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a
            r3.Y1(r7, r0, r1)
            goto L7a
        L75:
            java.lang.String r7 = "Recurring deposit enabled but recurring deposit default amount is null"
            r6.b.D(r7)
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ybh.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
