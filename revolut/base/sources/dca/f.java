package dca;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixQrRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PixQrRequestScreen pixQrRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixQrRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f51781a;
        int iHashCode = str.hashCode();
        PixQrRequestScreen pixQrRequestScreen = this.v;
        if (iHashCode != -904915620) {
            if (iHashCode != 589019594) {
                if (iHashCode == 1815981476 && str.equals("ADD_AMOUNT_KEY_ID")) {
                    ((r) pixQrRequestScreen.d()).C2(j.f112831a);
                }
            } else if (str.equals("CHANGE_PIX_KEY_ID")) {
                ((r) pixQrRequestScreen.d()).C2(l.f112833a);
            }
        } else if (str.equals("ADD_DESCRIPTION_KEY_ID")) {
            ((r) pixQrRequestScreen.d()).C2(k.f112832a);
        }
        return Unit.f186387a;
    }
}
