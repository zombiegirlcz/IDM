package eq5;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreen;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ CryptoSendAmountInputScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CryptoSendAmountInputScreen cryptoSendAmountInputScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoSendAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.u.d();
        cli.y yVar = jVar.F;
        CryptoAddress cryptoAddress = (CryptoAddress) ((r) ((j2) yVar.f22677a).getValue()).e.getContent();
        j2 j2Var = (j2) yVar.f22677a;
        n1 n1Var = (n1) ((r) j2Var.getValue()).f128314m.getContent();
        ArrayList arrayList = n1Var != null ? n1Var.f128296b : null;
        wk5.a aVar2 = ((r) j2Var.getValue()).f128309c;
        if (cryptoAddress != null && arrayList != null && aVar2 != null) {
            jVar.n2(new dp4.p(18, jVar, cryptoAddress, arrayList, aVar2, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
