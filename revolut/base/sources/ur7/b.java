package ur7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_common.data.model.Document;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreen;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import un8.j;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DocumentListScreen documentListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = documentListScreen;
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

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.Z.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.insurance_common.ui.screen.documents.a aVar2 = (com.revolut.feature.insurance_common.ui.screen.documents.a) dVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof Document) {
            rr7.c cVarA = rr7.e.a((Document) obj3);
            if (cVarA instanceof rr7.a) {
                aVar2.C1(((rr7.a) cVarA).f256732a);
            } else {
                if (!(cVarA instanceof rr7.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.A1(new j(aVar2, (rr7.b) cVarA, null, 6), new yi5.b(25));
            }
        }
        return Unit.f186387a;
    }
}
