package ev7;

import bu7.d0;
import bu7.e0;
import bu7.f0;
import bu7.g0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu7.l;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllPolicyDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AllPolicyDocumentsScreen allPolicyDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = allPolicyDocumentsScreen;
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

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        nu7.d dVarB;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Y.getValue();
        Object obj3 = model.u;
        i iVar = (i) fVar;
        iVar.getClass();
        if (obj3 instanceof d) {
            d dVar = (d) obj3;
            TextLocalisedClause title = dVar.f129748a;
            g0 g0Var = dVar.f129749b;
            boolean z = g0Var instanceof d0;
            if (z || (g0Var instanceof f0)) {
                Intrinsics.checkNotNullParameter(g0Var, "<this>");
                Intrinsics.checkNotNullParameter(title, "title");
                if (z) {
                    d0 d0Var = (d0) g0Var;
                    dVarB = new nu7.c(new f9i.c(new f9i.e(d0Var.f18707b, d0Var.f18708c)));
                } else {
                    if (!(g0Var instanceof f0)) {
                        if (g0Var instanceof e0) {
                            throw new IllegalStateException("Unsupported");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarB = l.b(title, ((f0) g0Var).f18712b);
                }
                ou7.a.a(iVar, dVarB, new eu7.c(iVar, 4));
            } else {
                if (!(g0Var instanceof e0)) {
                    throw new NoWhenBranchMatchedException();
                }
                yji.l.j2(iVar, new SimpleTextDocumentScreen(new SimpleTextDocumentScreenContract$InputData(title, ((e0) g0Var).f18710b)), null, null, 3);
            }
        }
        return Unit.f186387a;
    }
}
