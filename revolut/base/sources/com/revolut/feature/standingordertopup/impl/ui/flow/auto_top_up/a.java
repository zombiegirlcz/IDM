package com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public boolean u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f88189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f88190x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f88190x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f88190x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r9 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b r0 = r8.f88190x
            com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.f88189w
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L2c
            if (r3 == r7) goto L28
            if (r3 == r5) goto L22
            if (r3 != r4) goto L1a
            xi0.b r2 = r8.v
            yhm.o.b(r9)
            goto L6b
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            boolean r3 = r8.u
            yhm.o.b(r9)
            goto L57
        L28:
            yhm.o.b(r9)
            goto L38
        L2c:
            yhm.o.b(r9)
            r8.f88189w = r7
            java.lang.Object r9 = com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b.I2(r0, r8)
            if (r9 != r2) goto L38
            goto L68
        L38:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r3 = r9.booleanValue()
            if (r3 == 0) goto L7e
            xi0.b r9 = r1.f88178a
            if (r9 != 0) goto L59
            wsg.n r9 = r0.f88192q
            com.revolut.core.model.account.AccountId$Personal r7 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r9 = r9.x(r7)
            r8.u = r3
            r8.f88189w = r5
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r2) goto L57
            goto L68
        L57:
            xi0.b r9 = (xi0.b) r9
        L59:
            kotlin.jvm.internal.Intrinsics.h(r9)
            r8.v = r9
            r8.u = r3
            r8.f88189w = r4
            java.lang.Object r3 = com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b.J2(r0, r9, r8)
            if (r3 != r2) goto L69
        L68:
            return r2
        L69:
            r2 = r9
            r9 = r3
        L6b:
            com.revolut.domain.models.topup.AutoTopUpState r9 = (com.revolut.domain.models.topup.AutoTopUpState) r9
            yki.i r3 = r0.u
            com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$Step$EditTopUpOrder r4 = new com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$Step$EditTopUpOrder
            kotlin.jvm.internal.Intrinsics.h(r2)
            java.lang.String r1 = r1.f88180c
            r4.<init>(r2, r9, r1)
            r9 = 6
            oki.h.u2(r0, r3, r4, r6, r9)
            goto Lb1
        L7e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            io3.l r2 = r1.f88179b
            xi0.b r1 = r1.f88178a
            if (r1 == 0) goto L89
            java.lang.String r1 = r1.f306286a
            goto L8a
        L89:
            r1 = r6
        L8a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Auto top-up is not available, pocketType = "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", currency = "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r9.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r6, r6, r9, r1)
            yki.i r9 = r0.u
            oki.h.D2(r9)
        Lb1:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
