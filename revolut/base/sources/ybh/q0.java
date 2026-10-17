package ybh;

import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 extends gim.i implements Function1 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b f312342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RecurringDepositSchedule f312343x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, RecurringDepositSchedule recurringDepositSchedule, Continuation continuation) {
        super(1, continuation);
        this.f312342w = bVar;
        this.f312343x = recurringDepositSchedule;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q0(this.f312342w, this.f312343x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.v
            r2 = 9
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r3 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
            r4 = 0
            r5 = 2
            r6 = 1
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b r7 = r10.f312342w
            if (r1 == 0) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            int r0 = r10.u
            yhm.o.b(r11)
            goto L87
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            yhm.o.b(r11)
            goto L34
        L26:
            yhm.o.b(r11)
            tb4.t r11 = r7.f95596y
            r10.v = r6
            java.lang.Object r11 = r11.B(r10)
            if (r11 != r0) goto L34
            goto L85
        L34:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lae
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input r11 = r7.o
            java.lang.String r1 = r11.f
            if (r1 == 0) goto L43
            goto L4b
        L43:
            j0h.a r1 = r11.f95587h
            j0h.a r8 = j0h.a.REQUIRE_RECURRING_DEPOSIT
            if (r1 == r8) goto L4b
            r1 = r6
            goto L4c
        L4b:
            r1 = r4
        L4c:
            com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule r8 = r10.f312343x
            if (r8 == 0) goto L67
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input r11 = new com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input
            java.time.LocalDate r0 = r8.f95325b
            k4l.c0 r4 = r8.f95324a
            r11.<init>(r0, r4, r1)
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen r0 = new com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen
            r0.<init>(r11)
            y7k.g0 r1 = new y7k.g0
            r1.<init>(r7, r11, r2)
            r7.Y1(r0, r3, r1)
            goto Lae
        L67:
            m1h.k r8 = r7.f95595x
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r11 = r11.f95583a
            go.g r11 = r8.f(r11)
            y65.n r8 = new y65.n
            r9 = 23
            r8.<init>(r9)
            r9 = 0
            jhi.b r11 = mo3.a.g(r11, r9, r8, r6)
            r10.u = r1
            r10.v = r5
            java.lang.Object r11 = vkm.q.x(r11, r10)
            if (r11 != r0) goto L86
        L85:
            return r0
        L86:
            r0 = r1
        L87:
            m1h.j r11 = (m1h.j) r11
            m1h.i r11 = r11.f201501a
            if (r11 == 0) goto La7
            if (r0 == 0) goto L90
            r4 = r6
        L90:
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input r0 = new com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input
            java.time.LocalDate r1 = r11.f201499a
            k4l.c0 r11 = r11.f201500b
            r0.<init>(r1, r11, r4)
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen r11 = new com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen
            r11.<init>(r0)
            y7k.g0 r1 = new y7k.g0
            r1.<init>(r7, r0, r2)
            r7.Y1(r11, r3, r1)
            goto Lae
        La7:
            java.lang.String r11 = "Calendar button clicked but recurring deposit default amount is null"
            r6.b.D(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
        Lae:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ybh.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
