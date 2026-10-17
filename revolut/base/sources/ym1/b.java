package ym1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bills.boleto.impl.finder.info.BoletosInfoScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BoletosInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BoletosInfoScreen boletosInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = boletosInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.L.getValue();
        Intrinsics.h(model);
        j jVar = (j) gVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "ID_HIDDEN_BOLETOS_ROW")) {
            jVar.C2(e.f314832a);
        } else if (Intrinsics.f(str, "ID_DEACTIVATE_BOLETO_FINDER_ROW")) {
            jVar.C2(d.f314831a);
        }
        return Unit.f186387a;
    }
}
