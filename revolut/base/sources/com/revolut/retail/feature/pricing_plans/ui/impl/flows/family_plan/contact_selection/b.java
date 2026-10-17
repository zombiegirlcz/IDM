package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.FamilyPlanContactSelectionFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.e;
import ffk.h;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wgk.g;
import yhm.o;
import zhm.h0;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f103001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, l lVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f103001w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f103001w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar = this.v;
        yki.i iVar = dVar.f103006t;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        l lVar = this.f103001w;
        if (i == 0) {
            o.b(obj2);
            f fVar = dVar.f103004r;
            this.u = 1;
            obj2 = q.x(mo3.a.g(boh.f.e(((h) fVar.f103010b).h(lVar, w4l.h.f294642c), new wdb.b(fVar, 21)), null, new wf0.b(9), 1), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        e eVar = (e) obj2;
        if (Intrinsics.f(eVar, e.a.f103007a)) {
            dVar.C2(new wgk.d(lVar));
        } else if (eVar instanceof g) {
            oki.h.w2(iVar, new FamilyPlanContactSelectionFlowContract$Step.ShowUpgradeToInvite(lVar, ((g) eVar).f297337a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!Intrinsics.f(eVar, e.b.f103008a)) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "FamilyPlanContactSelectionFlowModel", "Non Eligible contact should be handle inside FamilyPlanValidationRule", null, h0Var);
            oki.h.D2(iVar);
        }
        return Unit.f186387a;
    }
}
