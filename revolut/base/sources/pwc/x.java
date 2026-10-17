package pwc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function1 {
    public dj0.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a f240428w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f240428w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.f240428w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r15.f(r14) == r3) goto L27;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a r0 = r14.f240428w
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$InputData r1 = r0.o
            cli.y r2 = r0.D
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r14.v
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L27
            if (r4 == r6) goto L20
            if (r4 != r5) goto L18
            yhm.o.b(r15)
            goto Lab
        L18:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L20:
            dj0.d r4 = r14.u
            yhm.o.b(r15)
        L25:
            r10 = r4
            goto L49
        L27:
            yhm.o.b(r15)
            java.lang.Object r15 = r2.f22677a
            vkm.j2 r15 = (vkm.j2) r15
            java.lang.Object r15 = r15.getValue()
            pwc.g r15 = (pwc.g) r15
            dj0.d r4 = r15.f240401b
            if (r4 == 0) goto Lb9
            pmk.t r15 = new pmk.t
            r8 = 7
            r15.<init>(r0, r4, r7, r8)
            r14.u = r4
            r14.v = r6
            java.lang.Object r15 = ue8.c.f0(r0, r15, r14)
            if (r15 != r3) goto L25
            goto Laa
        L49:
            java.lang.Object r15 = r2.f22677a
            vkm.j2 r15 = (vkm.j2) r15
            java.lang.Object r15 = r15.getValue()
            pwc.g r15 = (pwc.g) r15
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState$Visible r15 = r15.f240400a
            wtc.u0 r2 = r0.f85786s
            qtc.k r4 = r1.f85775a
            java.lang.String r9 = r4.name()
            boolean r6 = r15 instanceof com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible.Enabled
            if (r6 == 0) goto L68
            r6 = r15
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState$Visible$Enabled r6 = (com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible.Enabled) r6
            dj0.d r6 = r6.f85448c
        L66:
            r11 = r6
            goto L79
        L68:
            boolean r6 = r15 instanceof com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible.Disabled
            if (r6 == 0) goto Lb3
            dj0.d r6 = new dj0.d
            r8 = r15
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState$Visible$Disabled r8 = (com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible.Disabled) r8
            xi0.b r8 = r8.f85445b
            r11 = 0
            r6.<init>(r11, r8)
            goto L66
        L79:
            dj0.d r12 = r15.getD()
            com.revolut.feature.security_hub.api.models.WealthProtectionSuggestedAmount r13 = r15.getE()
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails$Enabled r8 = new com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails$Enabled
            r8.<init>(r9, r10, r11, r12, r13)
            r2.getClass()
            java.lang.String r15 = "feature"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r15)
            java.lang.String r15 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r15)
            java.util.HashMap r15 = r2.f299910a
            r15.put(r4, r8)
            qtc.k r15 = r1.f85775a
            qtc.k r1 = qtc.k.TRANSFERS
            if (r15 != r1) goto Lab
            wtc.g0 r15 = r0.v
            r14.u = r7
            r14.v = r5
            java.lang.Object r15 = r15.f(r14)
            if (r15 != r3) goto Lab
        Laa:
            return r3
        Lab:
            pwc.i r15 = pwc.i.f240407a
            r0.C2(r15)
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        Lb3:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        Lb9:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "User could click confirm without typing the limit"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: pwc.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
