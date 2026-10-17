package vv7;

import cli.y;
import com.revolut.feature.insurance_embedded.impl.data.model.p;
import com.revolut.feature.insurance_embedded.impl.data.model.r;
import com.revolut.feature.insurance_embedded.impl.data.model.s;
import com.revolut.feature.insurance_embedded.impl.data.model.t;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.MakeClaimScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.MakeClaimScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gu7.a0;
import gu7.e0;
import gu7.m0;
import gu7.u;
import gu7.x;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MakeClaimScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MakeClaimScreen makeClaimScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = makeClaimScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e0 e0Var;
        int i = this.u;
        MakeClaimScreen makeClaimScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                makeClaimScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a aVar3 = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a) makeClaimScreen.d();
                y yVar = aVar3.u;
                m0 m0Var = (m0) ((h) ((j2) yVar.f22677a).getValue()).f292461a.getContent();
                Continuation continuation = null;
                u uVar = m0Var != null ? m0Var.f146792c : null;
                m0 m0Var2 = (m0) ((h) ((j2) yVar.f22677a).getValue()).f292461a.getContent();
                p pVar = (m0Var2 == null || (e0Var = m0Var2.d) == null) ? null : e0Var.f146734a;
                int i2 = 1;
                if (pVar != null) {
                    s sVar = pVar.f76028b;
                    if (sVar instanceof t) {
                        aVar3.n2(new k(aVar3, ((t) sVar).f76032b, continuation, 0), new whi.b(6));
                    } else if (sVar instanceof com.revolut.feature.insurance_embedded.impl.data.model.u) {
                        aVar3.n2(new k(aVar3, ((com.revolut.feature.insurance_embedded.impl.data.model.u) sVar).f76033b, continuation, i2), new vsl.f(1, aVar3, pu7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 3));
                    } else if (sVar instanceof r) {
                        oki.h.v2(aVar3.v, new MakeClaimScreenContract$ModalStep.BottomSheetStep(((r) sVar).f76030b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        if (sVar != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("Footer action should not be null for ContactsLayout");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    }
                } else if (uVar instanceof x) {
                    aVar3.n2(new k(aVar3, ((x) uVar).f146860b, continuation, i2), new vsl.f(1, aVar3, pu7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 3));
                } else if (uVar instanceof a0) {
                    ou7.a.d(aVar3, ((a0) uVar).f146710b);
                } else {
                    if (uVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException2 = new IllegalStateException("ClaimUrl should not be null for ContactsLayout");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
                return Unit.f186387a;
        }
    }
}
