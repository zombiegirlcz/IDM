package y44;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$Configuration;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditApplicationDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CreditApplicationDocumentsScreen creditApplicationDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditApplicationDocumentsScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarD3 = this.v.R2();
        String documentId = model.f53228a;
        mVarD3.getClass();
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        for (du3.a aVar2 : ((CreditApplicationDocumentsScreenContract$Configuration) zi0.c.I(((g) ((j2) mVarD3.f310785q.f22677a).getValue()).f310776a)).f67003a) {
            if (Intrinsics.f(aVar2.f117551a, documentId)) {
                mVarD3.C2(new j(aVar2));
                return Unit.f186387a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
