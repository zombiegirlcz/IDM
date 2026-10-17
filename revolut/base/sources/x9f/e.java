package x9f;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NumberOfSharesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NumberOfSharesScreen numberOfSharesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = numberOfSharesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(model);
        m mVar = (m) kVarE3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.i instanceof g) {
            j60.a.v(mVar.f303709p, false, null, 3);
        }
        return Unit.f186387a;
    }
}
