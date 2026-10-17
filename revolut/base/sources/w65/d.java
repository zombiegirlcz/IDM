package w65;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocument;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.LoanDocumentSectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LoanDocumentSectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoanDocumentSectionController loanDocumentSectionController, Continuation continuation) {
        super(2, continuation);
        this.v = loanDocumentSectionController;
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

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.O.getValue();
        yx4.a aVar2 = yx4.b.Companion;
        Intrinsics.h(model);
        aVar2.getClass();
        yx4.b click = yx4.a.a(model);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(click, "click");
        Object obj3 = click.f317545b;
        if (obj3 instanceof LoanDocument) {
            LoanDocument loanDocument = (LoanDocument) obj3;
            hVar.C2(new e(loanDocument.f70154b, loanDocument.f));
        }
        return Unit.f186387a;
    }
}
