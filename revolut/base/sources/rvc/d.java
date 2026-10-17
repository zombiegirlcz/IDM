package rvc;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NameLocationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NameLocationScreen nameLocationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = nameLocationScreen;
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
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        String text = textData.f52598b.toString();
        nVarE3.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        nVarE3.H2(nVarE3.f257755r, new k(text, 0));
        return Unit.f186387a;
    }
}
