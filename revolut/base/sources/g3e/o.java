package g3e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.store.impl.ui.exclusives.StoreExclusivesScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lk0.h;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreExclusivesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(StoreExclusivesScreen storeExclusivesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeExclusivesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarR2 = this.v.R2();
        Intrinsics.h(model);
        r rVar = (r) bVarR2;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "EXCLUSIVES_ERROR_STATE_GENERAL_ITEM_ID") || Intrinsics.f(str, "EXCLUSIVES_ERROR_STATE_PAGE_ITEM_ID")) {
            i iVar = (i) rVar.o;
            ihm.b bVar = iVar.f140276c;
            lk0.g gVar = (lk0.g) bVar.f();
            if (gVar != null) {
                List list = gVar.f196174a;
                lk0.e eVar = (lk0.e) d0.o0(list);
                if (eVar != null && eVar.e != null) {
                    if (list.size() == 1) {
                        iVar.e.onNext(Unit.f186387a);
                    } else {
                        bVar.onNext(lk0.g.a(list.subList(0, list.size() - 1)));
                        iVar.d.onNext(h.b.f196176a);
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
