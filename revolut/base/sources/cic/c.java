package cic;

import c84.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rewards.impl.ui.concierge.screen.additionalinfo.AdditionalInfoBottomSheetScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AdditionalInfoBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AdditionalInfoBottomSheetScreen additionalInfoBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = additionalInfoBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.U.getValue();
        String id10 = model.f53228a;
        Object obj3 = model.u;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj3 instanceof bic.c) {
            dVar.n2(new y(dVar, ((bic.c) obj3).f15468a, null, 16), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
