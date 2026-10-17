package nrd;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_other_asset.AddOtherAssetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddOtherAssetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AddOtherAssetController addOtherAssetController, Continuation continuation) {
        super(2, continuation);
        this.v = addOtherAssetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (model == null) {
            model = null;
        }
        Object obj3 = model != null ? model.k : null;
        vzi.b category = obj3 instanceof vzi.b ? (vzi.b) obj3 : null;
        if (category != null) {
            h hVar = (h) this.v.O.getValue();
            hVar.getClass();
            Intrinsics.checkNotNullParameter(category, "category");
            hVar.H2(hVar.f218618p, new g(category, 0));
        }
        return Unit.f186387a;
    }
}
