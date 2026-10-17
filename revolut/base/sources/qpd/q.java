package qpd;

import com.revolut.core.ui_kit.delegates.vh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a f248367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a3 f248368x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ vh f248369y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a aVar, a3 a3Var, vh vhVar, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f248367w = aVar;
        this.f248368x = a3Var;
        this.f248369y = vhVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, this.f248367w, this.f248368x, this.f248369y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r8 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r8)
            goto L4e
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            yhm.o.b(r8)
            goto L3c
        L1c:
            yhm.o.b(r8)
            com.revolut.core.ui_kit.delegates.vh r8 = r7.f248369y
            tof.a3 r1 = r7.f248368x
            com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a r4 = r7.f248367w
            java.lang.String r5 = r7.v
            if (r5 == 0) goto L3f
            qpd.p r2 = new qpd.p
            r6 = 0
            r2.<init>(r4, r1, r8, r6)
            r7.u = r3
            tji.f r8 = r4.X()
            java.lang.Object r8 = zh9.u0.b0(r8, r5, r2, r7)
            if (r8 != r0) goto L3c
            goto L4d
        L3c:
            uhf.e r8 = (uhf.e) r8
            return r8
        L3f:
            ujf.h r3 = r4.f87709s
            com.revolut.core.ui_kit.delegates.SwipeToActionDelegate$SwipeAction r8 = r8.f54883a
            java.lang.String r8 = r8.f53505a
            r7.u = r2
            java.lang.Object r8 = r3.d(r1, r8, r7)
            if (r8 != r0) goto L4e
        L4d:
            return r0
        L4e:
            uhf.e r8 = (uhf.e) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qpd.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
