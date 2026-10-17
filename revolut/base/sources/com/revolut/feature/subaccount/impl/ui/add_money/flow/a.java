package com.revolut.feature.subaccount.impl.ui.add_money.flow;

import com.revolut.feature.subaccount.api.models.Subaccount;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public Subaccount u;
    public b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yki.i f88991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f88992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f88993y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f88993y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f88993y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.f88992x
            com.revolut.feature.subaccount.impl.ui.add_money.flow.b r2 = r8.f88993y
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            yki.i r0 = r8.f88991w
            com.revolut.feature.subaccount.impl.ui.add_money.flow.b r2 = r8.v
            com.revolut.feature.subaccount.api.models.Subaccount r1 = r8.u
            yhm.o.b(r9)
            r7 = r1
            r1 = r0
            r0 = r7
            goto L68
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            yhm.o.b(r9)
            goto L4f
        L27:
            yhm.o.b(r9)
            g6e.d r9 = r2.f88994p
            com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$InputData r1 = r2.o
            java.lang.String r1 = r1.f88986a
            s6e.z r9 = (s6e.z) r9
            vkm.d r9 = r9.u(r1)
            zfd.e r9 = zi0.c.w(r9)
            n33.l0 r1 = new n33.l0
            r5 = 25
            r1.<init>(r5)
            r5 = 0
            jhi.b r9 = mo3.a.g(r9, r5, r1, r4)
            r8.f88992x = r4
            java.lang.Object r9 = vkm.q.x(r9, r8)
            if (r9 != r0) goto L4f
            goto L64
        L4f:
            r1 = r9
            com.revolut.feature.subaccount.api.models.Subaccount r1 = (com.revolut.feature.subaccount.api.models.Subaccount) r1
            yki.i r9 = r2.f88997s
            n7e.h r4 = r2.f88995q
            r8.u = r1
            r8.v = r2
            r8.f88991w = r9
            r8.f88992x = r3
            java.lang.Object r3 = r4.a(r1, r8)
            if (r3 != r0) goto L65
        L64:
            return r0
        L65:
            r0 = r1
            r1 = r9
            r9 = r3
        L68:
            n7e.f r9 = (n7e.f) r9
            boolean r3 = r9 instanceof n7e.d
            if (r3 == 0) goto L78
            com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$Step$MoveMoney r3 = new com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$Step$MoveMoney
            n7e.d r9 = (n7e.d) r9
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r9 = r9.f213075a
            r3.<init>(r9, r0)
            goto L85
        L78:
            boolean r3 = r9 instanceof n7e.e
            if (r3 == 0) goto L92
            com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$Step$VaultAddMoney r3 = new com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$Step$VaultAddMoney
            n7e.e r9 = (n7e.e) r9
            com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig$AddMoney$Destination r9 = r9.f213076a
            r3.<init>(r9, r0)
        L85:
            r5 = 0
            r6 = 12
            r0 = r2
            r2 = r3
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L92:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.add_money.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
