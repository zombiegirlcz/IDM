package vrb;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdClosePositionsSelectorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CfdClosePositionsSelectorController cfdClosePositionsSelectorController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdClosePositionsSelectorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.T.getValue();
        Intrinsics.h(model);
        l lVar = (l) bVar;
        y yVar = lVar.f291562w;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        final f fVar = obj3 instanceof f ? (f) obj3 : null;
        if (fVar != null) {
            if (fVar instanceof d) {
                final int i = 0;
                lVar.H2(yVar, new Function1() { // from class: vrb.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        c update = (c) obj4;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return c.a(update, null, ((d) fVar).f291549a, 1);
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return c.a(update, null, gc0.c.A(update.f291548b, ((e) fVar).f291550a), 1);
                        }
                    }
                });
            } else {
                if (!(fVar instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                final int i2 = 1;
                lVar.H2(yVar, new Function1() { // from class: vrb.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        c update = (c) obj4;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return c.a(update, null, ((d) fVar).f291549a, 1);
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return c.a(update, null, gc0.c.A(update.f291548b, ((e) fVar).f291550a), 1);
                        }
                    }
                });
            }
        }
        return Unit.f186387a;
    }
}
