package vkj;

import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanDynamicFormBusinessDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanDynamicFormBusinessDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.u
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreen r1 = r5.v
            switch(r0) {
                case 0: goto La2;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            vkj.h r6 = r1.d()
            vkj.n r6 = (vkj.n) r6
            cli.y r0 = r6.u
            java.lang.Object r1 = r0.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            vkj.e r1 = (vkj.e) r1
            java.util.LinkedHashMap r1 = r1.f289969a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L27
            goto L4d
        L27:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            zkj.b r2 = (zkj.b) r2
            alj.a r3 = r6.f289981q
            r3.getClass()
            boolean r2 = alj.a.a(r2)
            if (r2 != 0) goto L2f
            goto L9f
        L4d:
            zkj.a r1 = r6.f289982r
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData r2 = r6.o
            com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest r2 = r2.f101261c
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            vkj.e r0 = (vkj.e) r0
            java.util.LinkedHashMap r0 = r0.f289969a
            r1.getClass()
            java.lang.String r1 = "originalRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "ownerAccountTypeUserInputs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDonorDetailsRequest r1 = r2.f100583a
            r3 = 0
            if (r1 == 0) goto L84
            com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingOwnerAccountTypeRequest r4 = r1.f100581b
            if (r4 == 0) goto L7e
            java.util.ArrayList r0 = zkj.a.a(r0)
            com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingOwnerAccountTypeRequest r0 = com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingOwnerAccountTypeRequest.a(r4, r0)
            goto L7f
        L7e:
            r0 = r3
        L7f:
            com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDonorDetailsRequest r0 = com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDonorDetailsRequest.a(r1, r0)
            goto L85
        L84:
            r0 = r3
        L85:
            com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPreferredScheduleRequest r1 = r2.f100584b
            java.util.List r2 = r2.f100585c
            com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest r4 = new com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest
            r4.<init>(r0, r1, r2)
            vge.r r0 = new vge.r
            r1 = 21
            r0.<init>(r6, r4, r3, r1)
            yi5.b r1 = new yi5.b
            r2 = 26
            r1.<init>(r2)
            r6.l2(r0, r1)
        L9f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        La2:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            vkj.h r6 = r1.d()
            vkj.n r6 = (vkj.n) r6
            r6.B2()
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vkj.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
