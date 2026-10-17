package vvf;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vb2.r;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ExtendTicketScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ExtendTicketScreen extendTicketScreen, Continuation continuation) {
        super(2, continuation);
        this.v = extendTicketScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.R.getValue();
        String id10 = model.f53304a;
        k kVar = (k) gVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        kVar.H2(kVar.f292539q, new r(id10, 20));
        return Unit.f186387a;
    }
}
