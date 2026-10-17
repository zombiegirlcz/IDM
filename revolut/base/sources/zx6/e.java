package zx6;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings.InvoiceGeneralSettingsScreen;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceGeneralSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceGeneralSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        String listId = model.f52580a;
        o oVar = (o) iVarE3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_INPUT_TEXT_INVOICE_CURRENCY")) {
            y yVar = oVar.f326064t;
            g gVar = (g) zi0.c.I(((h) ((j2) yVar.f22677a).getValue()).f326049c);
            FreelancerInvoiceSettings freelancerInvoiceSettings = ((h) ((j2) yVar.f22677a).getValue()).f326047a;
            if (freelancerInvoiceSettings == null || (bVar = freelancerInvoiceSettings.f73411n) == null) {
                bVar = gVar.d;
            }
            oVar.C1(u0.c(new CurrencyChooserFeatureConfig.CurrencyChooser(bVar, d0.d1(gVar.f326044a), (Integer) 4, 4)));
        }
        return Unit.f186387a;
    }
}
