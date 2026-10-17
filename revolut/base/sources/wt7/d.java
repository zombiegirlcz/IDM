package wt7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wgb.v;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DocumentsScreen documentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = documentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.S.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof vs7.d) {
            vs7.c cVar = ((vs7.d) obj3).d;
            Continuation continuation = null;
            if (cVar instanceof vs7.a) {
                iVar.n2(new v(iVar, ((vs7.a) cVar).f291734a, continuation, 26), new whi.b(6));
            } else {
                if (!(cVar instanceof vs7.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar.A1(new v(cVar, iVar, continuation, 27), new yi5.b(25));
            }
        }
        return Unit.f186387a;
    }
}
