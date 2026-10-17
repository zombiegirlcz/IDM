package nme;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarG3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53623w;
        if (obj3 instanceof k19.c) {
            k19.c cVar = (k19.c) obj3;
            String str = cVar.f180147a;
            k19.d0 d0Var = cVar.f180148b;
            fVar.M2(str, d0Var != null ? d0Var.f180151a : null, null);
        }
        if (obj3 instanceof cme.a) {
            k19.c cVar2 = ((cme.a) obj3).f25212a;
            String str2 = cVar2.f180147a;
            k19.d0 d0Var2 = cVar2.f180148b;
            fVar.M2(str2, d0Var2 != null ? d0Var2.f180151a : null, (com.revolut.analytics.ads.model.a) obj3);
        }
        zn.d dVar = obj3 instanceof zn.d ? (zn.d) obj3 : null;
        if (dVar != null) {
            fVar.z.Z2(dVar);
        }
        return Unit.f186387a;
    }
}
