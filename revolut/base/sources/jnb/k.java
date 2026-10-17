package jnb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsScreen;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProductDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ProductDocumentsScreen productDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = productDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar = (g) this.v.R.getValue();
        Intrinsics.h(model);
        p pVar = (p) gVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        SavingsDocument savingsDocument = obj3 instanceof SavingsDocument ? (SavingsDocument) obj3 : null;
        if (savingsDocument != null) {
            pVar.C1(new SavingsDocumentLauncherDestination(savingsDocument));
        }
        return Unit.f186387a;
    }
}
