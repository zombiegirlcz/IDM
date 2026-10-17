package luh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.workflow.engine.rfi.impl.ui.documents.ChooseDocumentsScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.documents.ChooseDocumentsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChooseDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ChooseDocumentsScreen chooseDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chooseDocumentsScreen;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.S.getValue();
        Intrinsics.h(model);
        com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a aVar2 = (com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) cVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        File file = obj3 instanceof File ? (File) obj3 : null;
        if (file != null) {
            oki.h.v2(aVar2.f96549t, new ChooseDocumentsScreenContract$ModalStep.DeleteDocumentDialog(file), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
