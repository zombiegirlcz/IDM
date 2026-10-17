package sf9;

import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlow;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
import com.revolut.camerakit.revolut.ui.barcode.models.BarcodeReaderScreenSettings;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.R$color;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.billers.api.navigation.BillersChooserNavigation$InputData;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import java.util.HashMap;
import jg9.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rch.o;
import rnb.u;
import rz.m;
import s6e.v;
import sbb.w;
import vkm.j2;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends k {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jg9.g f262374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wo1.b f262375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final im1.a f262376n;
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f262377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ep1.b f262378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f262379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PayBillsAndTaxesNavigation$InputData f262380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f262381t;

    public g(jg9.g formExtension, wo1.b billsInteractor, im1.a billersInteractor, i mapper, a controllerDialogProvider, ep1.b billsDialogProvider, wj0.a idempotencyKeyHolder, PayBillsAndTaxesNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(billersInteractor, "billersInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(controllerDialogProvider, "controllerDialogProvider");
        Intrinsics.checkNotNullParameter(billsDialogProvider, "billsDialogProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f262374l = formExtension;
        this.f262375m = billsInteractor;
        this.f262376n = billersInteractor;
        this.o = mapper;
        this.f262377p = controllerDialogProvider;
        this.f262378q = billsDialogProvider;
        this.f262379r = idempotencyKeyHolder;
        this.f262380s = inputData;
        this.f262381t = q.c(new j(0));
    }

    @Override // xf9.a
    public final boolean Z2(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return Intrinsics.f(countryCode, wi0.b.Y1);
    }

    @Override // xf9.a
    public final Flow e3() {
        return new v(this.f262381t, this.o, 5);
    }

    @Override // xf9.a
    public final Unit f3() {
        Biller.Details details;
        Biller biller = ((j) this.f262381t.getValue()).f262383a;
        if (biller == null || (details = biller.k) == null || !details.d) {
            T2(new f(this, null, 0), new u(1, this, g.class, "handleConfirmationError", "handleConfirmationError(Ljava/lang/Throwable;)Z", 0, 24));
        } else {
            N2(new ActionsBottomSheetController(((wp1.a) this.f262378q).b()), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new b(this, 0));
        }
        return Unit.f186387a;
    }

    @Override // xf9.a
    public final void g3(String listId, String extractedValue, String str) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        i2b.a.P(listId, extractedValue, str, new o(2, this, g.class, "updateFieldValue", "updateFieldValue(Ljava/lang/String;Ljava/lang/String;)V", 0, 5));
    }

    @Override // xf9.a
    public final void h3(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f262377p.getClass();
        n.P2(this, new ActionsBottomSheetController(a.a()), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    @Override // xf9.a
    public final void i3(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_barcode_scanner_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pay_bills_taxes_barcode_scanner_action_button, null, null, 14);
        m mVar = m.FIT;
        int i = R$color.camera_kit_white;
        N2(new BarcodeReaderFlow(new BarcodeReaderFlowContract$InputData(new BarcodeReaderScreenSettings(textLocalisedClause, textLocalisedClause2, new Mask.Barcode(mVar, i, i, i, 16), null))), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a, new sdi.k(this, model, 2));
    }

    @Override // xf9.a
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.P;
        if (obj2 instanceof BillFormField) {
            b bVar = new b(this, 1);
            ((l) this.f262374l).d3((BillFormField) obj2, bVar);
        } else {
            N2(o2(new dm1.e(new BillersChooserNavigation$InputData(xo1.g.TAPI, null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new b(this, 2));
        }
    }

    @Override // xf9.a
    public final void m3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f262379r.a("BILL_TAPI_IDEMPOTENCY_KEY");
        String str = this.f262380s.f78681a;
        Continuation continuation = null;
        if (str != null) {
            T2(new w(this, str, continuation, 9), new yi5.b(27));
            return;
        }
        N2(o2(new dm1.e(new BillersChooserNavigation$InputData(xo1.g.TAPI, null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new b(this, 2));
    }

    public final void o3(Biller biller) {
        j2 j2Var;
        Object value;
        Continuation continuation;
        do {
            j2Var = this.f262381t;
            value = j2Var.getValue();
            continuation = null;
        } while (!j2Var.h(value, j.a((j) value, biller, null, null, 61)));
        T2(new f(this, continuation, 1), new yi5.b(27));
    }

    public final void p3(String str, String str2) {
        j2 j2Var;
        Object value;
        HashMap map;
        do {
            j2Var = this.f262381t;
            value = j2Var.getValue();
            map = new HashMap(((j) j2Var.getValue()).e);
            map.put(str, str2);
            Unit unit = Unit.f186387a;
        } while (!j2Var.h(value, j.a((j) value, null, null, map, 31)));
    }
}
