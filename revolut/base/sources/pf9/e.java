package pf9;

import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlow;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
import com.revolut.camerakit.revolut.ui.barcode.models.BarcodeReaderScreenSettings;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.R$color;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.boleto.api.BoletoFinderAction$Activate;
import com.revolut.feature.apm.bills.boleto.api.BoletoFinderAction$SeeAllBoletos;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.HashMap;
import jg9.l;
import k50.b2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import ox5.r;
import pd4.u;
import pdi.j;
import qua.p;
import rz.m;
import skm.a2;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yji.n;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jg9.g f235529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kdh.b f235530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f235531n;
    public final qm1.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PayBillsAndTaxesNavigation$InputData f235532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nm1.c f235533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final en1.a f235534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f235535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f235536t;
    public final j2 u;

    public e(jg9.g formExtension, kdh.b interactor, g mapper, qm1.h dialogProvider, PayBillsAndTaxesNavigation$InputData inputData, nm1.c boletoFinderNavigationProvider, en1.a boletoFinderOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(boletoFinderNavigationProvider, "boletoFinderNavigationProvider");
        Intrinsics.checkNotNullParameter(boletoFinderOnboardingInteractor, "boletoFinderOnboardingInteractor");
        this.f235529l = formExtension;
        this.f235530m = interactor;
        this.f235531n = mapper;
        this.o = dialogProvider;
        this.f235532p = inputData;
        this.f235533q = boletoFinderNavigationProvider;
        this.f235534r = boletoFinderOnboardingInteractor;
        this.f235536t = q.b(0, 6, null);
        this.u = q.c(new h(new Data(null, null, true, 3, null), r0.i(new Pair("PAYMENT_TYPE", "BOLETO")), null));
    }

    @Override // xf9.a
    public final boolean Z2(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return Intrinsics.f(countryCode, wi0.b.A);
    }

    @Override // xf9.a
    public final void d(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SCAN_MENU_ITEM_ID")) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_barcode_scanner_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pay_bills_taxes_barcode_scanner_action_button, null, null, 14);
            m mVar = m.FIT;
            int i = R$color.camera_kit_white;
            N2(new BarcodeReaderFlow(new BarcodeReaderFlowContract$InputData(new BarcodeReaderScreenSettings(textLocalisedClause, textLocalisedClause2, new Mask.Barcode(mVar, i, i, i, 16), new Regex("^\\d{44,48}$")))), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a, new a(this, 2));
        }
    }

    @Override // xf9.a
    public final Flow d3() {
        return this.f235536t;
    }

    @Override // xf9.a
    public final Flow e3() {
        return new oi3.g(this.u, this.f235531n, 17);
    }

    @Override // xf9.a
    public final Unit f3() {
        String str = (String) ((h) this.u.getValue()).f235540b.get("BILL_NUMBER");
        if (str != null) {
            ap1.c cVar = new ap1.c(jli.g.f(str));
            T2(new j(this, cVar, null, 5), new p5e.h(this, cVar, 16));
        }
        return Unit.f186387a;
    }

    @Override // xf9.a
    public final void g3(String listId, String extractedValue, String str) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        i2b.a.P(listId, extractedValue, str, new b2(2, this, e.class, "updateFieldValue", "updateFieldValue(Ljava/lang/String;Ljava/lang/String;)V", 0, 20));
    }

    @Override // xf9.a
    public final void j3(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.i, BoletoFinderAction$SeeAllBoletos.f61165a)) {
            A2(new ScheduledPaymentsDestination(new ScheduledPaymentsInputData(RecurringPaymentAccount.Personal.f89320a, (ScheduledPaymentsInputData.InitialAction) null, 6), 2));
        }
    }

    @Override // xf9.a
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.P;
        BillFormField billFormField = obj2 instanceof BillFormField ? (BillFormField) obj2 : null;
        if (billFormField == null) {
            super.k1(model);
        } else {
            ((l) this.f235529l).c3(billFormField, new a(this, 3));
        }
    }

    @Override // xf9.a
    public final void k3(ListSubheaderDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "BOLETO_FINDER_HEADER")) {
            n.P2(this, o2(pm1.c.f237444a), null, null, 3);
        }
    }

    @Override // xf9.a
    public final void l3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        if (obj2 instanceof BoletoFinderAction$Activate) {
            n.P2(this, o2(new pm1.b(((BoletoFinderAction$Activate) obj2).f61164a)), null, new a(this, 1), 1);
        } else if (obj2 instanceof p) {
            T2(new j(this, (p) obj2, null, 4), new a(this, 0));
        }
    }

    @Override // xf9.a
    public final void m3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        kdh.b bVar = this.f235530m;
        wo1.b bVar2 = (wo1.b) bVar.f182899b;
        xo1.d formFieldsQuery = new xo1.d(xo1.g.BOLETO, null, null, 30);
        Intrinsics.checkNotNullParameter(formFieldsQuery, "formFieldsQuery");
        rp1.j jVar = ((vp1.c) bVar2).f291042a;
        Intrinsics.checkNotNullParameter(formFieldsQuery, "formFieldsQuery");
        this.f235535s = n.j2(this, nim.a.v(u0.m(jVar.d.b(formFieldsQuery, w4l.i.f294643c), nim.a.v(rd0.e.b(xua.a.a((xua.a) bVar.f182900c, null, 3)), new u(24))), new u(23)), null, new r(this, null, 28), 3);
        T2(new pe2.l(this, null, 2), new yi5.b(27));
    }

    @Override // xf9.a
    public final void n3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        a2 a2Var = this.f235535s;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f235535s = null;
    }

    public final void o3(String str, String str2) {
        j2 j2Var;
        Object value;
        HashMap map;
        do {
            j2Var = this.u;
            value = j2Var.getValue();
            map = new HashMap(((h) j2Var.getValue()).f235540b);
            map.put(str, str2);
            Unit unit = Unit.f186387a;
        } while (!j2Var.h(value, h.a((h) value, null, map, null, 5)));
    }
}
