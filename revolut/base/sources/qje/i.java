package qje;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabCryptoFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TabCryptoFlow tabCryptoFlow, Continuation continuation) {
        super(2, continuation);
        this.v = tabCryptoFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        u uVar = (u) lVarE3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        uVar.I2().N1(model);
        return Unit.f186387a;
    }
}
