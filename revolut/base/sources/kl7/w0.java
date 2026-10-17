package kl7;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bills.billers.impl.ui.chooser.BillersChooserScreen;
import com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.BoletoFeeBreakdownScreen;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityItem;
import com.revolut.feature.insurance_car.impl.data.model.PendingMta;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kr.a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185402a;

    public /* synthetic */ w0(int i) {
        this.f185402a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f185402a) {
            case 0:
                MtaAvailabilityItem.Companion companion = MtaAvailabilityItem.INSTANCE;
                return qlm.j1.b("com.revolut.feature.insurance_car.impl.data.model.MtaType", a1.values());
            case 1:
                MtaAvailabilityItem.Companion companion2 = MtaAvailabilityItem.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 2:
                PendingMta.Companion companion3 = PendingMta.INSTANCE;
                return qlm.j1.b("com.revolut.feature.insurance_car.impl.data.model.MtaType", a1.values());
            case 3:
                return new qlm.e(t1.f185390a);
            case 4:
                KProperty[] kPropertyArr = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                return new InputChecklistDelegate();
            case 5:
                KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                return new InputTextDelegate(null);
            case 6:
                KProperty[] kPropertyArr3 = BillersChooserScreen.S;
                return new RowDelegate(null, null, 7);
            case 7:
                Lazy lazy = km2.v.f185711a;
                return new km2.u();
            case 8:
                KProperty[] kPropertyArr4 = BoletoFeeBreakdownScreen.R;
                return new CellDetailsDelegate();
            case 9:
                KProperty[] kPropertyArr5 = TaxResidencyListScreen.V;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr6 = TaxResidencyListScreen.V;
                return new ListSubheaderDelegate();
            case 11:
                KProperty[] kPropertyArr7 = TaxResidencyListScreen.V;
                return new FullScreenStateDelegate();
            case 12:
                kp.d dVar = kp.d.f187954a;
                aim.o oVar = new aim.o();
                List<String> listK = zhm.v.k("https://api.revolut.com", "https://chat.revolut.com", "https://chat.revolut.com/api/client/ws", "https://sso.revolut.com", "https://cpg.revolut.com");
                ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
                for (String str : listK) {
                    ulm.x0.Companion.getClass();
                    arrayList.add(ulm.w0.c(str).d);
                }
                oVar.addAll(arrayList);
                oVar.add("aqueduct.revolut.codes");
                oVar.add("aqueduct.revolut.com");
                return zhm.y0.a(oVar);
            case 13:
                kp.d dVar2 = kp.d.f187954a;
                ulm.x0.Companion.getClass();
                return zhm.y0.b(ulm.w0.c("https://vision-api.revolut.com").d);
            case 14:
                return Unit.f186387a;
            case 15:
                return Unit.f186387a;
            case 16:
                return Unit.f186387a;
            case 17:
                return Unit.f186387a;
            case 18:
                return Unit.f186387a;
            case 19:
                return Unit.f186387a;
            case 20:
                a.Companion companion4 = kr.a.INSTANCE;
                return new qlm.h0(qlm.v1.f247718a, nlm.a.c(mr.b.f208029a), 1);
            case 21:
                return new qlm.h0(qlm.v1.f247718a, nlm.a.c(mr.a.f208027a), 1);
            case 22:
                return new qlm.e(kr.x.f188604a);
            case 23:
                return new qlm.e(new qlm.e(qlm.e0.f247634a));
            case 24:
                return new qlm.h0(qlm.v1.f247718a, nlm.a.c(mr.b.f208029a), 1);
            case 25:
                return new qlm.e(kr.n1.f188539a);
            case 26:
                return new qlm.e(new qlm.e(qlm.e0.f247634a));
            case 27:
                return new qlm.h0(qlm.v1.f247718a, nlm.a.c(mr.b.f208029a), 1);
            case 28:
                return kr.p2.Companion.serializer();
            default:
                return new qlm.e(qlm.t0.f247706a);
        }
    }
}
