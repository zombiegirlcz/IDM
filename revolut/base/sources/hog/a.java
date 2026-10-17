package hog;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.document_type_selector.DocumentTypeSelectorController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentTypeSelectorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DocumentTypeSelectorController documentTypeSelectorController, Continuation continuation) {
        super(2, continuation);
        this.v = documentTypeSelectorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        gog.a documentType = obj3 instanceof gog.a ? (gog.a) obj3 : null;
        if (documentType != null) {
            f fVar = this.v.R;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            fVar.C2(new c(documentType));
        }
        return Unit.f186387a;
    }
}
