package na8;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorIsaChildCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JuniorIsaChildCreationScreen juniorIsaChildCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorIsaChildCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData data = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(data);
        com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a aVar2 = (com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) nVarE3;
        aVar2.getClass();
        y yVar = aVar2.u;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = d0.F0(data.f52598b.toString()).toString();
        String str = data.f52597a;
        int i = 21;
        String str2 = null;
        if (Intrinsics.f(str, "FIRST_NAME_INPUT_LIST_ID")) {
            aVar2.H2(yVar, new avj.o(string, str2, aVar2, i));
        } else if (Intrinsics.f(str, "LAST_NAME_INPUT_LIST_ID")) {
            aVar2.H2(yVar, new avj.o(str2, string, aVar2, i));
        }
        return Unit.f186387a;
    }
}
