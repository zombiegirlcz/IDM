package tm1;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.apm.bills.boleto.impl.finder.deactivate.BoletoFinderDeactivateScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tjf.p0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BoletoFinderDeactivateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BoletoFinderDeactivateScreen boletoFinderDeactivateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = boletoFinderDeactivateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.L.getValue();
        Intrinsics.h(model);
        h hVar = (h) eVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "ID_CANCEL_BUTTON")) {
            hVar.C2(d.f272152a);
        } else if (Intrinsics.f(str, "ID_CONFIRM_BUTTON")) {
            hVar.l2(new p0(hVar, null, 3), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
