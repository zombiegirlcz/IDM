package bh9;

import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlow;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
import com.revolut.camerakit.revolut.ui.barcode.models.BarcodeReaderScreenSettings;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.R$color;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BillsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BillsSearchScreen billsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = billsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.d();
        Intrinsics.h(model);
        t tVar = (t) fVarE3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_barcode_scanner_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pay_bills_taxes_barcode_scanner_action_button, null, null, 14);
        rz.m mVar = rz.m.FIT;
        int i = R$color.camera_kit_white;
        tVar.f2(new BarcodeReaderFlow(new BarcodeReaderFlowContract$InputData(new BarcodeReaderScreenSettings(textLocalisedClause, textLocalisedClause2, new Mask.Barcode(mVar, i, i, i, 16), null))), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a, new beg.k(model, tVar, 5));
        return Unit.f186387a;
    }
}
