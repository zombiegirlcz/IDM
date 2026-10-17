package rm2;

import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BackgroundCatalogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BackgroundCatalogController backgroundCatalogController, Continuation continuation) {
        super(2, continuation);
        this.v = backgroundCatalogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((BackgroundSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BackgroundSelectionDelegate.Model model = (BackgroundSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) jVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51698j;
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str != null) {
            oki.h.v2(bVar.f63756w, new BackgroundCatalogControllerContract$ModalStep.DeleteConfirmation(str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
