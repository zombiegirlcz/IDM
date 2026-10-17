package ksg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.voluntary.offboarding.impl.ui.remove_obstacles.RemoveObstaclesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RemoveObstaclesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RemoveObstaclesScreen removeObstaclesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = removeObstaclesScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarT2 = this.v.T2();
        Intrinsics.h(model);
        k kVar = (k) hVarT2;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        SectionContent.ActionCell actionCell = obj3 instanceof SectionContent.ActionCell ? (SectionContent.ActionCell) obj3 : null;
        if (actionCell != null && (str = actionCell.f) != null) {
            kVar.v2(new f(str));
        }
        return Unit.f186387a;
    }
}
