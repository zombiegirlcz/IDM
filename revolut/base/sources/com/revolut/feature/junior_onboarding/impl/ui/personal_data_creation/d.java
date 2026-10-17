package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation;

import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import gim.i;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PersonalDetailsForm f77019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map f77020x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, PersonalDetailsForm personalDetailsForm, Map map, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f77019w = personalDetailsForm;
        this.f77020x = map;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f77019w, this.f77020x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e.I2(r3, r5, r1, r7) == r0) goto L18;
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
            r2 = 0
            com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e r3 = r7.v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            yhm.o.b(r8)
            goto L5f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            yhm.o.b(r8)
            goto L40
        L1f:
            yhm.o.b(r8)
            r7.u = r5
            rh8.o0 r8 = r3.f77038s
            efm.r r8 = r8.d()
            vkm.d r8 = rd0.e.b(r8)
            eed.a r1 = new eed.a
            r6 = 18
            r1.<init>(r6)
            jhi.b r8 = mo3.a.g(r8, r2, r1, r5)
            java.lang.Object r8 = vkm.q.x(r8, r7)
            if (r8 != r0) goto L40
            goto L5e
        L40:
            com.revolut.feature.junior_onboarding.api.model.OnboardingTerms r8 = (com.revolut.feature.junior_onboarding.api.model.OnboardingTerms) r8
            boolean r8 = r8.f76954a
            java.util.Map r1 = r7.f77020x
            com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm r5 = r7.f77019w
            if (r8 == 0) goto L56
            yki.i r8 = r3.f77039t
            com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlowContract$Step$TermsAndConditions r0 = new com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlowContract$Step$TermsAndConditions
            r0.<init>(r5, r1)
            r1 = 6
            oki.h.u2(r3, r8, r0, r2, r1)
            goto L5f
        L56:
            r7.u = r4
            java.lang.Object r8 = com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e.I2(r3, r5, r1, r7)
            if (r8 != r0) goto L5f
        L5e:
            return r0
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
