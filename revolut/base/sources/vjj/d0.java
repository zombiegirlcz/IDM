package vjj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sij.b;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c f289762w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f289762w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.f289762w, continuation);
        d0Var.v = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((b.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r8.c(r0, r7) == r1) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.v
            sij.b$a r0 = (sij.b.a) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.u
            r3 = 2
            r4 = 1
            r5 = 0
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c r6 = r7.f289762w
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            yhm.o.b(r8)
            goto L75
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            yhm.o.b(r8)
            goto L64
        L23:
            yhm.o.b(r8)
            boolean r8 = r0 instanceof sij.a
            if (r8 == 0) goto L78
            sij.a r0 = (sij.a) r0
            com.revolut.retail.feature.esim.api.model.EsimProfile r8 = r0.f263640a
            if (r8 == 0) goto L52
            gte.a r0 = r6.v
            com.revolut.retail.feature.esim.api.EsimApi$Toggles$EsimMobilePlanFlexibleStart r2 = com.revolut.retail.feature.esim.api.EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c
            jte.d r0 = (jte.d) r0
            boolean r0 = r0.c(r2)
            if (r0 == 0) goto L40
            r6.K2(r8)
            goto L57
        L40:
            chj.d r0 = r6.f101209r
            java.lang.String r2 = r8.f100423a
            com.revolut.retail.feature.esim.api.model.EsimProfileDetails r8 = r8.f100426g
            if (r8 == 0) goto L4d
            com.revolut.retail.feature.esim.api.model.EsimProfileDetails$InstallationType r8 = r8.a()
            goto L4e
        L4d:
            r8 = r5
        L4e:
            r0.b3(r2, r8)
            goto L57
        L52:
            java.lang.String r8 = "Esim profile is not ready to be installed after transferring the esim to current device"
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c.L2(r8)
        L57:
            dfj.k0 r8 = r6.f101211t
            r7.v = r5
            r7.u = r4
            java.lang.Object r8 = r8.e(r7)
            if (r8 != r1) goto L64
            goto L74
        L64:
            dfj.s3 r8 = r6.f101213x
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$InputData r0 = r6.o
            java.lang.String r0 = r0.f101191a
            r7.v = r5
            r7.u = r3
            java.lang.Object r8 = r8.c(r0, r7)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L78:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vjj.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
