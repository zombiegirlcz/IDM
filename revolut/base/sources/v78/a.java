package v78;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior.accounts.impl.ui.junior_selection.JuniorSelectionScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sf8.m;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(JuniorSelectionScreen juniorSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.O.getValue();
        Intrinsics.h(model);
        g gVar = (g) cVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.junior_dashboard.api.JuniorAccountInfo");
        gVar.v2(new u68.e(((m) obj3).f262361b));
        return Unit.f186387a;
    }
}
