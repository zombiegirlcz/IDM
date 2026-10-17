package sq5;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoAddressHostingPickerController f265011w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(CryptoAddressHostingPickerController cryptoAddressHostingPickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265011w = cryptoAddressHostingPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f265011w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f265011w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoAddressHostingPickerController cryptoAddressHostingPickerController = this.f265011w;
        switch (i) {
            case 0:
                String input = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE3 = cryptoAddressHostingPickerController.d();
                Intrinsics.h(input);
                q qVar = (q) dVarE3;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                qVar.f265016r.k(input);
                break;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE32 = cryptoAddressHostingPickerController.d();
                String tabId = g6Var.f54199a;
                q qVar2 = (q) dVarE32;
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                qVar2.H2(qVar2.f265017s, new sef.j(tabId, 10));
                break;
        }
        return Unit.f186387a;
    }
}
