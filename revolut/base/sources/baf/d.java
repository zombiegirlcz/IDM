package baf;

import a3i.t;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountInformationScreen f14049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountInformationScreen accountInformationScreen, Continuation continuation) {
        super(2, continuation);
        this.f14049w = accountInformationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f14049w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            l lVarE3 = this.f14049w.d();
            String str = textData.f52597a;
            String string = textData.f52598b.toString();
            this.v = null;
            this.u = 1;
            com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a aVar2 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a) lVarE3;
            aVar2.getClass();
            if (pu7.a.B(aVar2.k, "AccountInformationScreenModel_onTextInputValueChange", new t(str, aVar2, string, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
