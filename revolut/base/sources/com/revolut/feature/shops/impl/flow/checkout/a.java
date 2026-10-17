package com.revolut.feature.shops.impl.flow.checkout;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shops.impl.flow.checkout.ModalCheckoutFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$string;
import eub.c;
import eub.d;
import eub.e;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.y0;
import nii.z;
import nyb.f;
import oki.h;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        b bVar = this.v;
        ModalCheckoutFlowContract$InputData modalCheckoutFlowContract$InputData = bVar.o;
        yki.i iVar = bVar.f87092q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            e eVar = bVar.f87091p;
            this.u = 1;
            objA = ((f) eVar).a(this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objA = obj2;
        }
        d dVar = (d) objA;
        boolean z = dVar instanceof d.a;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            h.w2(iVar, new ModalCheckoutFlowContract$Step.CampaignCheckout(modalCheckoutFlowContract$InputData.f87088a), bottom_dialog);
        } else if (dVar instanceof c) {
            if (((c) dVar).f129540a) {
                h.w2(iVar, new ModalCheckoutFlowContract$Step.CampaignCheckout(modalCheckoutFlowContract$InputData.f87088a), bottom_dialog);
            } else {
                h.w2(iVar, ModalCheckoutFlowContract$Step.OptIn.f87090a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
            }
        } else {
            if (!(dVar instanceof eub.b)) {
                throw new NoWhenBranchMatchedException();
            }
            l.a1(bVar, bVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new hbg.h(bVar, null, 9), 3);
        }
        return Unit.f186387a;
    }
}
