package syc;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.selfserve.sot.impl.ui.document.list.DocumentSelectionController;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DocumentSelectionController documentSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = documentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.k;
        List documentGroup = obj3 instanceof List ? (List) obj3 : null;
        if (documentGroup == null) {
            return Unit.f186387a;
        }
        i iVar = (i) this.v.Q.getValue();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(documentGroup, "documentGroup");
        iVar.C2(new f(documentGroup));
        return Unit.f186387a;
    }
}
