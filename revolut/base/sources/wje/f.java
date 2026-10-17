package wje;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CryptoSettingsScreen cryptoSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.tab.crypto.impl.ui.settings.a aVar2 = (com.revolut.feature.tab.crypto.impl.ui.settings.a) hVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(aVar2.f89802q, false, null, 3);
        if (model.u instanceof xi0.b) {
            aVar2.n2(new o(aVar2, model, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
