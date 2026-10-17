package zyb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsBottomSheetScreen revPointsBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsBottomSheetScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVarE3 = this.v.e3();
        Intrinsics.h(model);
        h hVar = (h) eVarE3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        hVar.B2();
        Object obj3 = model.u;
        azb.g gVar = obj3 instanceof azb.g ? (azb.g) obj3 : null;
        if (gVar != null) {
            hVar.l2(new g(hVar, gVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
