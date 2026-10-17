package xsf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReasonsAdditionalInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReasonsAdditionalInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData data = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(data);
        com.revolut.feature.transfer_reasons.impl.ui.additional_info.a aVar2 = (com.revolut.feature.transfer_reasons.impl.ui.additional_info.a) pVarE3;
        cli.y yVar = aVar2.f92381q;
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f52597a;
        Object obj3 = null;
        String strE0 = kotlin.text.a0.H(str, "ADDITIONAL_INFO_STRING_INPUT_ID_", false) ? kotlin.text.d0.e0(str, "ADDITIONAL_INFO_STRING_INPUT_ID_") : null;
        if (strE0 != null) {
            Iterator it8 = ((m) ((j2) yVar.f22677a).getValue()).f308471b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((AdditionalInfoField) next).f92406a, strE0)) {
                    obj3 = next;
                    break;
                }
            }
            AdditionalInfoField additionalInfoField = (AdditionalInfoField) obj3;
            if (additionalInfoField != null) {
                aVar2.H2(yVar, new xpe.c(additionalInfoField, new t(m70.a.l(kotlin.text.d0.F0(data.f52598b.toString()).toString())), 11));
            }
        }
        return Unit.f186387a;
    }
}
