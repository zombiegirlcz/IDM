package tvc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r7 == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a.I2(r0, r7, r6) == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a r0 = r6.v
            cli.y r1 = r0.f85680t
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1d
            if (r3 == r5) goto L19
            if (r3 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            yhm.o.b(r7)
            goto L7f
        L1d:
            yhm.o.b(r7)
            java.lang.Object r7 = r1.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            tvc.d r7 = (tvc.d) r7
            com.revolut.data.model.Data r7 = r7.f274747c
            java.lang.Object r7 = r7.getContent()
            com.revolut.feature.security_hub.api.models.SecurityDelayInfo r7 = (com.revolut.feature.security_hub.api.models.SecurityDelayInfo) r7
            boolean r3 = r7 instanceof com.revolut.feature.security_hub.api.models.SecurityDelayInfo.Created
            if (r3 == 0) goto L4e
            com.revolut.feature.security_hub.api.models.SecurityDelayInfo$Created r7 = (com.revolut.feature.security_hub.api.models.SecurityDelayInfo.Created) r7
            java.lang.String r7 = r7.f85411a
            r6.u = r5
            ufm.d r1 = r0.f85678r
            com.revolut.feature.security_hub.api.navigation.SecurityDelayInputData r0 = r0.o
            com.revolut.feature.security_hub.api.navigation.SecurityDelayType r0 = r0.f85457a
            java.lang.Object r7 = r1.m(r7, r0, r6)
            if (r7 != r2) goto L49
            goto L4b
        L49:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L4b:
            if (r7 != r2) goto L7f
            goto L7e
        L4e:
            boolean r3 = r7 instanceof com.revolut.feature.security_hub.api.models.SecurityDelayInfo.InProgress
            if (r3 != 0) goto L56
            boolean r3 = r7 instanceof com.revolut.feature.security_hub.api.models.SecurityDelayInfo.Ready
            if (r3 == 0) goto L7f
        L56:
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            tvc.d r1 = (tvc.d) r1
            com.revolut.feature.security_hub.api.navigation.SecurityDelayType r1 = r1.f274745a
            boolean r3 = r1 instanceof com.revolut.feature.security_hub.api.navigation.SecurityDelayType.Transaction
            if (r3 == 0) goto L6a
            r0.B2()
            goto L7f
        L6a:
            com.revolut.feature.security_hub.api.navigation.SecurityDelayType$WealthProtection r3 = com.revolut.feature.security_hub.api.navigation.SecurityDelayType.WealthProtection.f85459a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 == 0) goto L82
            java.lang.String r7 = r7.getF85417a()
            r6.u = r4
            java.lang.Object r7 = com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a.I2(r0, r7, r6)
            if (r7 != r2) goto L7f
        L7e:
            return r2
        L7f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L82:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tvc.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
