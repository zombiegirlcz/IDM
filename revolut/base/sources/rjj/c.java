package rjj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rjj.e;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanChooseNumberScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanChooseNumberScreen;
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

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Q.getValue();
        String listId = model.f53228a;
        h hVar = (h) fVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -865066688) {
            if (iHashCode != -272107441) {
                if (iHashCode == 1836532309 && listId.equals("ID_NUMBER_RANDOM")) {
                    hVar.C2(e.b.f254683a);
                }
            } else if (listId.equals("ID_NUMBER_PORTING")) {
                hVar.C2(e.c.f254684a);
            }
        } else if (listId.equals("ID_NUMBER_FEATURED")) {
            hVar.C2(e.a.f254682a);
        }
        return Unit.f186387a;
    }
}
