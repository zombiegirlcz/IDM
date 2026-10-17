package gm7;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (skm.k0.c(r8, r10) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            r2 = 14
            r3 = 0
            r4 = 5
            r5 = 2
            r6 = 1
            gm7.d r7 = r10.v
            if (r1 == 0) goto L22
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            yhm.o.b(r11)
            goto L71
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            yhm.o.b(r11)
            goto L4b
        L22:
            yhm.o.b(r11)
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_in_progress_title_quotes_1
            r11.<init>(r1, r3, r3, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r8 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_in_progress_description
            r1.<init>(r8, r3, r3, r2)
            nii.y0 r11 = vl7.a.c(r11, r1)
            r7.L2(r11)
            kotlin.time.b$a r11 = kotlin.time.b.INSTANCE
            pkm.e r11 = pkm.e.SECONDS
            long r8 = kotlin.time.c.g(r4, r11)
            r10.u = r6
            java.lang.Object r11 = skm.k0.c(r8, r10)
            if (r11 != r0) goto L4b
            goto L70
        L4b:
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_in_progress_title_quotes_2
            r11.<init>(r1, r3, r3, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_in_progress_description
            r1.<init>(r6, r3, r3, r2)
            nii.y0 r11 = vl7.a.c(r11, r1)
            r7.L2(r11)
            kotlin.time.b$a r11 = kotlin.time.b.INSTANCE
            pkm.e r11 = pkm.e.SECONDS
            long r8 = kotlin.time.c.g(r4, r11)
            r10.u = r5
            java.lang.Object r11 = skm.k0.c(r8, r10)
            if (r11 != r0) goto L71
        L70:
            return r0
        L71:
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_in_progress_title_quotes_3
            r11.<init>(r0, r3, r3, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_in_progress_description
            r0.<init>(r1, r3, r3, r2)
            nii.y0 r11 = vl7.a.c(r11, r0)
            kotlinx.coroutines.flow.Flow r11 = r7.L2(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gm7.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
