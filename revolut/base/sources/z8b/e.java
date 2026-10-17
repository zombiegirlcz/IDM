package z8b;

import com.revolut.feature.retail.crypto.advanced_charts.impl.ui.currencies_selector.CryptoCurrenciesSelectorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yui.v;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoCurrenciesSelectorScreen f320056w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CryptoCurrenciesSelectorScreen cryptoCurrenciesSelectorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320056w = cryptoCurrenciesSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f320056w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f320056w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoCurrenciesSelectorScreen cryptoCurrenciesSelectorScreen = this.f320056w;
        switch (i) {
            case 0:
                xi0.b bVar = (xi0.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = cryptoCurrenciesSelectorScreen.d();
                Intrinsics.h(bVar);
                jVarE3.I2(bVar);
                break;
            default:
                String text = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE32 = cryptoCurrenciesSelectorScreen.d();
                Intrinsics.h(text);
                jVarE32.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                jVarE32.H2(jVarE32.f320064q, new v(text, 9));
                break;
        }
        return Unit.f186387a;
    }
}
