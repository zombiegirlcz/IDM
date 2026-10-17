package kkk;

import aw0.n6;
import cli.y;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreen;
import hha.b0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FamilyPlanInvitationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(FamilyPlanInvitationScreen familyPlanInvitationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = familyPlanInvitationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PricingPlanSubscription pricingPlanSubscription;
        Object next;
        int i = this.u;
        FamilyPlanInvitationScreen familyPlanInvitationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                familyPlanInvitationScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) familyPlanInvitationScreen.R2();
                y yVar = tVar.f185128w;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                lha.j jVar = (lha.j) ((i) j2Var.getValue()).f185102b.getContent();
                if (jVar != null) {
                    boolean z = jVar.f195214a.f195207h;
                    hha.d dVar = (hha.d) ((i) j2Var2.getValue()).f185101a.getContent();
                    if (dVar != null && (pricingPlanSubscription = (PricingPlanSubscription) ((i) j2Var2.getValue()).e.getContent()) != null) {
                        b0 b0Var = pricingPlanSubscription.u;
                        if (b0Var != null) {
                            lha.j jVar2 = (lha.j) ((i) j2Var2.getValue()).f185102b.getContent();
                            if (jVar2 != null) {
                                tVar.C2(new m(pricingPlanSubscription.f81129a, dVar, z, b0Var, jVar2.f195214a.a()));
                            }
                        } else {
                            tVar.C2(new j(dVar, z));
                        }
                    }
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar2 = (t) familyPlanInvitationScreen.R2();
                y yVar2 = tVar2.f185128w;
                lha.j jVar3 = (lha.j) ((i) ((j2) yVar2.f22677a).getValue()).f185102b.getContent();
                if (jVar3 != null) {
                    lha.g gVar = jVar3.f195214a;
                    hha.d dVar2 = (hha.d) ((i) ((j2) yVar2.f22677a).getValue()).f185101a.getContent();
                    if (dVar2 != null) {
                        Iterator it8 = gVar.f195206g.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((lha.h) next).f195208a, tVar2.u.f103399b)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        lha.h hVar = (lha.h) next;
                        tVar2.C2(new k(gVar.a(), dVar2, hVar != null ? hVar.f : false));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
