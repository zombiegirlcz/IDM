package com.revolut.feature.topup_screen.impl.flow.topup_methods;

import com.revolut.domain.models.topup.methods.TopupMethod;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function0 f90657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TopupMethod f90658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f90659y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Function0 function0, TopupMethod topupMethod, String str, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f90657w = function0;
        this.f90658x = topupMethod;
        this.f90659y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f90657w, this.f90658x, this.f90659y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r9 == r0) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            kotlin.jvm.functions.Function0 r2 = r8.f90657w
            r3 = 2
            com.revolut.feature.topup_screen.impl.flow.topup_methods.d r4 = r8.v
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r3) goto L14
            yhm.o.b(r9)
            goto L81
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            yhm.o.b(r9)
            goto L33
        L20:
            yhm.o.b(r9)
            ang.f r9 = r4.f90660p
            r1 = 0
            efm.d0 r9 = r9.f(r1)
            r8.u = r5
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L33
            goto L80
        L33:
            do3.n r9 = (do3.n) r9
            kotlin.jvm.internal.Intrinsics.h(r9)
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.n3
            boolean r9 = te0.w.S(r9, r1)
            if (r9 == 0) goto L9e
            vte.a r9 = r4.z
            e0f.v0 r9 = (e0f.v0) r9
            w71.b r9 = r9.f121695c
            e31.j r9 = (e31.j) r9
            ue0.c r9 = r9.f122180a
            java.lang.reflect.Type r1 = l21.d.e
            java.lang.String r5 = "<get-BOOLEAN_TYPE>(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.String r6 = "ADD_MONEY_RESTRICTIONS_BOTTOM_SHEET_SHOWN_KEY"
            java.lang.Object r9 = r9.v0(r5, r6, r1)
            ufm.b r9 = efm.d0.m(r9)
            dug.e r1 = new dug.e
            r5 = 3
            r1.<init>(r5)
            pfm.z r5 = new pfm.z
            r6 = 0
            r7 = 1
            r5.<init>(r9, r7, r1, r6)
            java.lang.String r9 = "onErrorReturn(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r9)
            ufm.n r9 = te0.w.i0(r5)
            r8.u = r3
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L81
        L80:
            return r0
        L81:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            r2.invoke()
            goto La1
        L8d:
            yki.a r9 = r4.D
            com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$Step$UaRestrictionDialog r0 = new com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$Step$UaRestrictionDialog
            com.revolut.domain.models.topup.methods.TopupMethod r1 = r8.f90658x
            java.lang.String r2 = r8.f90659y
            r0.<init>(r1, r2)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r9, r0, r1)
            goto La1
        L9e:
            r2.invoke()
        La1:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flow.topup_methods.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
