package o9a;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.api.model.PixQrCodeAmount;
import com.revolut.feature.pix.api.model.PixQrCodeBill;
import com.revolut.feature.pix.api.model.PixQrCodeDataDetails;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeImplementation;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreenContract$ModalStep;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAuthorisationRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PixAuthorisationRequestScreen pixAuthorisationRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAuthorisationRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PixQrCodeDataDetails pixQrCodeDataDetails;
        PixQrCodeBill pixQrCodeBill;
        String str;
        PixQrCodeDataDetails pixQrCodeDataDetails2;
        PixQrCodeAmount pixQrCodeAmount;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str2 = model.f51781a;
        int iHashCode = str2.hashCode();
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        dj0.d dVar = null;
        PixAuthorisationRequestScreen pixAuthorisationRequestScreen = this.v;
        if (iHashCode != -2009526674) {
            if (iHashCode != -91860937) {
                if (iHashCode == -56475584 && str2.equals("PAYMENT_INFO_CELL_ID")) {
                    ((com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) pixAuthorisationRequestScreen.d()).C2(n.f223161a);
                }
            } else if (str2.equals("SINGLE_TRANSACTION_LIMIT_ID")) {
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar2 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) pixAuthorisationRequestScreen.d();
                j jVar = (j) ((j2) aVar2.f80599t.f22677a).getValue();
                com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.u;
                dj0.d dVar2 = jVar.e;
                g8a.k kVar = (g8a.k) jVar.d.getContent();
                if (kVar == null) {
                    PixQrCodeDecodeData pixQrCodeDecodeData = jVar.f223156c;
                    if (pixQrCodeDecodeData != null) {
                        Intrinsics.checkNotNullParameter(pixQrCodeDecodeData, "<this>");
                        PixQrCodeImplementation pixQrCodeImplementation = pixQrCodeDecodeData.f80446b;
                        int i = pixQrCodeImplementation == null ? -1 : g8a.j.f141310a[pixQrCodeImplementation.ordinal()];
                        if (i == 1) {
                            PixQrCodeAmount pixQrCodeAmount2 = pixQrCodeDecodeData.f80456r;
                            if (pixQrCodeAmount2 != null) {
                                dVar = pixQrCodeAmount2.f80424a;
                            }
                        } else if (i == 2 && (pixQrCodeDataDetails2 = pixQrCodeDecodeData.f80458t) != null && (pixQrCodeAmount = pixQrCodeDataDetails2.f80442n) != null) {
                            dVar = pixQrCodeAmount.f80424a;
                        }
                    }
                } else {
                    g8a.i iVar = kVar.f141320p;
                    if (iVar != null) {
                        dVar = iVar.f141309b;
                    }
                }
                oki.h.v2(aVar3, new PixAuthorisationRequestScreenContract$ModalStep.TransactionLimitChange(dVar2, dVar), popup);
            }
        } else if (str2.equals("PAYMENT_INSTRUCTION_CELL_ID")) {
            com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar4 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) pixAuthorisationRequestScreen.d();
            cli.y yVar = aVar4.f80599t;
            PixQrCodeDecodeData pixQrCodeDecodeData2 = ((j) ((j2) yVar.f22677a).getValue()).f223156c;
            if (pixQrCodeDecodeData2 != null && (pixQrCodeDataDetails = pixQrCodeDecodeData2.f80457s) != null && (pixQrCodeBill = pixQrCodeDataDetails.e) != null && (str = pixQrCodeBill.f) != null) {
                zof.f fVar = aVar4.f80598s;
                TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_empty, null, null, 14);
                String str3 = ((j) ((j2) yVar.f22677a).getValue()).f223157g;
                if (str3 == null) {
                    str3 = "";
                }
                aVar4.Y1(((qpf.h) fVar).b(new ReferenceInputData(140, textClause, textLocalisedClause, str3)), popup, new nzj.n(1, aVar4, com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a.class, "handlePaymentInstructionModalResult", "handlePaymentInstructionModalResult(Lcom/revolut/feature/transfer/core/api/ui/reference/ReferenceOutputData;)V", 0, 15));
            }
        }
        return Unit.f186387a;
    }
}
