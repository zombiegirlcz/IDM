package bw6;

import cli.y;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes.FreelancerAddNotesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerAddNotesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FreelancerAddNotesScreen freelancerAddNotesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerAddNotesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerAddNotesScreen freelancerAddNotesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                freelancerAddNotesScreen.R2().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE3 = freelancerAddNotesScreen.R2();
                y yVar = lVarE3.f19256q;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) ((g) j2Var.getValue()).f19245a.getContent();
                Continuation continuation = null;
                boolean zF = Intrinsics.f(freelancerInvoice != null ? freelancerInvoice.u : null, ((g) j2Var2.getValue()).f19247c);
                boolean z = !zF;
                if (!zF || ((g) j2Var2.getValue()).f19246b) {
                    lVarE3.l2(new ald.m(lVarE3, z, freelancerInvoice, continuation, 7), new yi5.b(26));
                } else {
                    lVarE3.B2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
