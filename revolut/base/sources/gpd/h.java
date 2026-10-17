package gpd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.r;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryManagementListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CategoryManagementListController categoryManagementListController, Continuation continuation) {
        super(2, continuation);
        this.v = categoryManagementListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.M.getValue();
        String id10 = model.f52613a;
        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b) cVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        dpd.k kVar = bVar.f87662q;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        r rVar = kVar.f116874q;
        if (rVar != null) {
            rVar.U(id10);
        }
        return Unit.f186387a;
    }
}
