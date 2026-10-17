package a9a;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.InputAliasScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InputAliasScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputAliasScreen inputAliasScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inputAliasScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) this.v.e3()).J2(textData.f52598b.toString());
        return Unit.f186387a;
    }
}
