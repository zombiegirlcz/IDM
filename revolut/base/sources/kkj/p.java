package kkj;

import c5a.m0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import dfj.i1;
import dfj.q1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a f185089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f185090x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f185091y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f185089w = aVar;
        this.f185090x = str;
        this.f185091y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f185089w, this.f185090x, this.f185091y, continuation, 0);
            default:
                return new p(this.f185089w, this.f185090x, this.f185091y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar = this.f185089w;
        switch (i) {
            case 0:
                nkj.d dVar = aVar.f101250r;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    dVar.getClass();
                    aVar.X1(new mii.j(28, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_number_termination_loading_title, null, null, 14), null, "ID_PHONE_NUMBER_TERMINATION_LOADING", null));
                    i1 i1Var = aVar.f101249q;
                    this.v = 1;
                    i1Var.getClass();
                    m0 m0Var = new m0(i1Var, this.f185091y, this.f185090x, null, 25);
                    p0 p0Var = p0.f264001a;
                    if (e0.J(elm.f.f127540b, m0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar.getClass();
                return aVar.X1(new mii.k("ID_PHONE_NUMBER_TERMINATION_SUCCESS", new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_number_termination_success_title, null, null, 14), null, null, null, 28));
            default:
                nkj.d dVar2 = aVar.f101250r;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    dVar2.getClass();
                    aVar.X1(new mii.j(28, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_number_release_loading_title, null, null, 14), null, "ID_PHONE_NUMBER_RELEASE_LOADING", null));
                    q1 q1Var = aVar.u;
                    this.v = 1;
                    q1Var.getClass();
                    m0 m0Var2 = new m0(q1Var, this.f185091y, this.f185090x, null, 27);
                    p0 p0Var2 = p0.f264001a;
                    if (e0.J(elm.f.f127540b, m0Var2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar2.getClass();
                return aVar.X1(new mii.k("ID_PHONE_NUMBER_RELEASE_SUCCESS", new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_number_release_success_title, null, null, 14), null, null, null, 28));
        }
    }
}
