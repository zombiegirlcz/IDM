package pgb;

import aw0.n6;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3Controller;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SalaryHubV3Controller v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(SalaryHubV3Controller salaryHubV3Controller, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = salaryHubV3Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.u
            com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3Controller r1 = r4.v
            switch(r0) {
                case 0: goto L4e;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            pgb.j r5 = r1.R2()
            com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a r5 = (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) r5
            cli.y r0 = r5.v
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            pgb.i r0 = (pgb.i) r0
            com.revolut.data.model.Data r0 = r0.f235841a
            java.lang.Object r0 = r0.getContent()
            tgb.o r0 = (tgb.o) r0
            if (r0 == 0) goto L46
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            tgb.h r1 = r0.f271158g
            boolean r1 = r1.f271140a
            if (r1 == 0) goto L46
            pdi.j r1 = new pdi.j
            r2 = 9
            r3 = 0
            r1.<init>(r5, r0, r3, r2)
            yi5.b r0 = new yi5.b
            r2 = 26
            r0.<init>(r2)
            r5.l2(r1, r0)
            goto L4b
        L46:
            pgb.l r0 = pgb.l.f235845a
            r5.C2(r0)
        L4b:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4e:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            pgb.j r5 = r1.R2()
            com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a r5 = (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) r5
            pgb.k r0 = pgb.k.f235844a
            r5.C2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pgb.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
