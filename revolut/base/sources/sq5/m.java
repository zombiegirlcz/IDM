package sq5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import sq5.e;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoAddressHostingPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CryptoAddressHostingPickerController cryptoAddressHostingPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoAddressHostingPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVarE3 = this.v.d();
        Intrinsics.h(model);
        q qVar = (q) dVarE3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "ADDRESS_HOSTING_PICKER_ADD_MANUALLY_ID")) {
            qVar.C2(e.a.f265004a);
        } else if (a0.H(str, "ADDRESS_HOSTING_PICKER_LIST_ITEM_ID", false)) {
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerContract.AddressHostingItemParcel");
            b bVar = (b) obj3;
            qVar.C2(new f(bVar.f264998a, bVar.f264999b));
        }
        return Unit.f186387a;
    }
}
