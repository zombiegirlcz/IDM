package zx6;

import cli.y;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings.InvoiceGeneralSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvoiceGeneralSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invoiceGeneralSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) invoiceGeneralSettingsScreen.d()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) invoiceGeneralSettingsScreen.d();
                y yVar = oVar.f326064t;
                FreelancerInvoiceSettings freelancerInvoiceSettings = ((g) zi0.c.I(((h) ((j2) yVar.f22677a).getValue()).f326049c)).f326046c;
                j2 j2Var = (j2) yVar.f22677a;
                if (Intrinsics.f(freelancerInvoiceSettings, ((h) j2Var.getValue()).f326047a)) {
                    oVar.B2();
                } else {
                    FreelancerInvoiceSettings freelancerInvoiceSettings2 = ((h) j2Var.getValue()).f326047a;
                    if (freelancerInvoiceSettings2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (freelancerInvoiceSettings2.i == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    oVar.n2(new zr5.k(oVar, freelancerInvoiceSettings2, null, 15), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
