package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund;

import a82.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.a;
import dp4.p;
import dwi.k;
import elm.f;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import rd0.e;
import skm.p0;
import svi.m1;
import svi.n1;
import svi.o1;
import svi.p1;
import svi.q1;
import svi.r1;
import vkm.v1;
import vkm.y;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objX;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            k kVar = cVar.f99140p;
            String passId = cVar.o.f231041a;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(passId, "passId");
            y yVarE = e.e(new v1(new p(6, kVar, passId, continuation)), m72.b.w("AirportLoungePassRefundInteractorImpl", "submitPassRefund"), new q(3, 13, null));
            p0 p0Var = p0.f264001a;
            olf.e eVar = new olf.e(vkm.q.C(yVarE, f.f127540b), 10);
            this.u = 1;
            objX = vkm.q.x(eVar, this);
            if (objX == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objX = obj2;
        }
        r1 r1Var = (r1) objX;
        if (Intrinsics.f(r1Var, o1.f265960a)) {
            cVar.f99141q.getClass();
            l.a1(cVar, cVar.X1(new mii.k("ID_REFUND_SUCCESS_DIALOG", new TextLocalisedClause(R$string.airport_lounges_refund_banner_refund_succeed, null, null, 14), null, null, null, 28)), null, null, null, 7);
            cVar.C2(a.b.f99139a);
            return Unit.f186387a;
        }
        if (Intrinsics.f(r1Var, p1.f265964a) || (r1Var instanceof m1) || (r1Var instanceof q1)) {
            cVar.f99141q.getClass();
            return cVar.X1(new y0("ID_REFUND_ERROR_DIALOG", new z(new TextLocalisedClause(R$string.airport_lounges_refund_error_prompt_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_refund_error_prompt_description, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_refund_error_prompt_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
        }
        if (Intrinsics.f(r1Var, n1.f265956a)) {
            return Unit.f186387a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
