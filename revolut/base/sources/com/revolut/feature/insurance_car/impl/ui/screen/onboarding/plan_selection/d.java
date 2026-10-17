package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import gim.i;
import kl7.x1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kp7.j;
import ll7.u;
import skm.e0;
import skm.p0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            MotorPlanSelectorScreenContract$InputData motorPlanSelectorScreenContract$InputData = eVar.f75613p;
            if (motorPlanSelectorScreenContract$InputData instanceof MotorPlanSelectorScreenContract$InputData.Application) {
                str = ((MotorPlanSelectorScreenContract$InputData.Application) motorPlanSelectorScreenContract$InputData).f75606a;
            } else {
                if (!(motorPlanSelectorScreenContract$InputData instanceof MotorPlanSelectorScreenContract$InputData.RenewalPolicy)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((MotorPlanSelectorScreenContract$InputData.RenewalPolicy) motorPlanSelectorScreenContract$InputData).f75610b.f75166a;
            }
            eVar.X1(vl7.a.c(null, null));
            u uVar = eVar.f75614q;
            x1 x1Var = new x1(str, ((j) eVar.t2()).e);
            this.u = 1;
            uVar.getClass();
            ll6.i iVar = new ll6.i(uVar, x1Var, null, 3);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, iVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return l.a1(eVar, eVar.X1(vl7.a.e(new TextLocalisedClause(R$string.car_insurance_renewal_reminder_success_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_renewal_reminder_success_description, null, null, 14), null, 12)), null, null, new c(eVar, null), 3);
    }
}
