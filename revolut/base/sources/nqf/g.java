package nqf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReasonForTransferGoodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ReasonForTransferGoodsScreen reasonForTransferGoodsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reasonForTransferGoodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarH3 = this.v.T2();
        Intrinsics.h(textData);
        p pVar = (p) mVarH3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        int iHashCode = str.hashCode();
        if (iHashCode != -121193059) {
            if (iHashCode != 407883082) {
                if (iHashCode == 889304470 && str.equals("INPUT_SHIPPINGPORT_ID")) {
                    pVar.x2(new ak8.i(textData, 13));
                }
            } else if (str.equals("INPUT_PRODUCT_NAME_ID")) {
                pVar.x2(new ak8.i(textData, 12));
            }
        } else if (str.equals("INPUT_CUSTOM_REASON_ID")) {
            pVar.x2(new ak8.i(textData, 14));
        }
        return Unit.f186387a;
    }
}
