package dca;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.pix.api.model.PixQrCode;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreen;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreenContract$InputData;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixQrRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PixQrRequestScreen pixQrRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixQrRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarD3 = this.v.d();
        ActionsView.Item item = yVar.f167226b;
        r rVar = (r) nVarD3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        Object obj3 = item.f58324n;
        int iHashCode = str.hashCode();
        Continuation continuation = null;
        if (iHashCode != -409628674) {
            if (iHashCode != 483927482) {
                if (iHashCode == 1263246634 && str.equals("SHARE_QR_BUTTON_ID")) {
                    PixQrCode pixQrCode = obj3 instanceof PixQrCode ? (PixQrCode) obj3 : null;
                    if (pixQrCode != null) {
                        rVar.l2(new cuc.c(rVar, pixQrCode, continuation, 28), new yi5.b(26));
                    }
                }
            } else if (str.equals("RESET_QR_BUTTON_ID")) {
                MutableStateFlow mutableStateFlow = rVar.o;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.h(value, new PixQrRequestScreenContract$InputData(((PixQrRequestScreenContract$InputData) value).f80726a, null, null)));
            }
        } else if (str.equals("COPY_KEY_BUTTON_ID")) {
            PixQrCode pixQrCode2 = obj3 instanceof PixQrCode ? (PixQrCode) obj3 : null;
            if (pixQrCode2 != null) {
                rVar.f112841q.a(null, pixQrCode2.f80419b, false);
            }
        }
        return Unit.f186387a;
    }
}
