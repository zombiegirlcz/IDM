package com.revolut.feature.kyc.impl.flow.kyc_consolidated;

import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$Step;
import com.revolut.feature.kyc.impl.g;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineScope;
import ku8.k;
import ku8.n;
import ku8.t;
import ku8.u;
import ku8.v;
import ku8.w;
import nii.y0;
import oki.h;
import vkm.j2;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ KycConsolidatedFlowContract$Step.RemoteDocs v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f77742w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, KycConsolidatedFlowContract$Step.RemoteDocs remoteDocs, n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = remoteDocs;
        this.f77742w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, this.f77742w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        my8.o oVar = ((k) this.f77742w).f189742a;
        c cVar = this.u;
        w wVarY = s.y(cVar.L2(this.v), oVar);
        wi0.b bVar = ((KycConsolidatedFlowContract$State) ((j2) cVar.f77751x.f22677a).getValue()).f77730a;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (wVarY instanceof v) {
            h.t2(cVar, cVar.f77752y, new KycConsolidatedFlowContract$Step.SingleDocPrompt(((v) wVarY).f189755a, bVar, cVar.o.f77722c), false, TransitionAnimation.NONE.f98393a, false, 8);
        } else {
            if (!wVarY.equals(t.f189753a)) {
                if (wVarY instanceof ku8.s) {
                    throw new IllegalStateException("ChooseDocumentController returned a document-list response as CannotRenderDocuments");
                }
                if (wVarY.equals(u.f189754a)) {
                    throw new IllegalStateException("Remote documents were resolved as having no next documents");
                }
                throw new NoWhenBranchMatchedException();
            }
            l.a1(cVar, cVar.X1(new y0(null, com.revolut.retail.operation_status.modal_status.a.a(g.a(bVar)), false, 5)), null, null, null, 7);
        }
        return Unit.f186387a;
    }
}
