package dhi;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_workflow_reminder_impl.ui.reminder.WorkflowReminderController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WorkflowReminderController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WorkflowReminderController workflowReminderController, Continuation continuation) {
        super(2, continuation);
        this.v = workflowReminderController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            com.revolut.feature_workflow_reminder_impl.ui.reminder.WorkflowReminderController r5 = r4.v
            java.lang.Object r5 = r5.K
            java.lang.Object r5 = r5.getValue()
            dhi.i r5 = (dhi.i) r5
            java.lang.String r0 = r0.f53228a
            r5.getClass()
            java.lang.String r1 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r0.hashCode()
            r2 = -1887453784(0xffffffff8f7fbda8, float:-1.2608997E-29)
            r3 = 0
            if (r1 == r2) goto L61
            r2 = 367545249(0x15e84ba1, float:9.3823375E-26)
            if (r1 == r2) goto L46
            r2 = 746878937(0x2c8477d9, float:3.7649714E-12)
            if (r1 == r2) goto L32
            goto L69
        L32:
            java.lang.String r1 = "LIST_TIMER_OPTIONS_TOMORROW_ID"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3b
            goto L69
        L3b:
            dhi.e r0 = new dhi.e
            wgi.a r1 = wgi.a.TOMORROW
            r0.<init>(r1)
            r5.C2(r0)
            goto L88
        L46:
            java.lang.String r1 = "LIST_TIMER_OPTIONS_ONE_HOUR_ID"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4f
            goto L69
        L4f:
            cq6.k r0 = new cq6.k
            r1 = 19
            r0.<init>(r5, r3, r1)
            yi5.b r1 = new yi5.b
            r2 = 26
            r1.<init>(r2)
            r5.l2(r0, r1)
            goto L88
        L61:
            java.lang.String r1 = "LIST_TIMER_OPTIONS_LATER_TODAY_ID"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7e
        L69:
            kotlin.NotImplementedError r5 = new kotlin.NotImplementedError
            java.lang.String r1 = "row action click not handled for listId = "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r5, r0)
            goto L88
        L7e:
            dhi.e r0 = new dhi.e
            wgi.a r1 = wgi.a.TODAY
            r0.<init>(r1)
            r5.C2(r0)
        L88:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dhi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
