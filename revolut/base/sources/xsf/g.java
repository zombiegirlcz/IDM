package xsf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$ModalStep;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import com.revolut.kompot.common.ModalDestination;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReasonsAdditionalInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReasonsAdditionalInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        Object rVar;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.feature.transfer_reasons.impl.ui.additional_info.a aVar2 = (com.revolut.feature.transfer_reasons.impl.ui.additional_info.a) pVarE3;
        cli.y yVar = aVar2.f92381q;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (kotlin.text.a0.H(listId, "ADDITIONAL_INFO_DROPDOWN_INPUT_ID_", false)) {
            String strE0 = kotlin.text.d0.e0(listId, "ADDITIONAL_INFO_DROPDOWN_INPUT_ID_");
            Iterator it8 = ((m) ((j2) yVar.f22677a).getValue()).f308471b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((AdditionalInfoField) next).f92406a, strE0)) {
                    break;
                }
            }
            AdditionalInfoField additionalInfoField = (AdditionalInfoField) next;
            if (additionalInfoField != null) {
                m mVar = (m) ((j2) yVar.f22677a).getValue();
                int i = l.f308469a[additionalInfoField.d.ordinal()];
                if (i == 1) {
                    rVar = new r(false);
                } else if (i == 2) {
                    rVar = new s(null, null);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar = new t(null);
                }
                Object obj3 = (t) rVar;
                Object obj4 = mVar.f308472c.get(additionalInfoField);
                if (obj4 != null) {
                    obj3 = obj4;
                }
                oki.h.v2(aVar2.f92382r, new TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDropdownSelection(additionalInfoField, ((t) obj3).f308482a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
