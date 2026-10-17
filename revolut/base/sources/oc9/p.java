package oc9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ QesTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(QesTermsScreen qesTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = qesTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.d();
        RowDelegate.Model model2 = (RowDelegate.Model) model.f53305b;
        b0 b0Var = (b0) xVarE3;
        cli.y yVar = b0Var.f224137t;
        Intrinsics.checkNotNullParameter(model2, "model");
        Object obj3 = model2.u;
        Terms terms = obj3 instanceof Terms ? (Terms) obj3 : null;
        if (terms != null) {
            TermsScope termsScope = terms.f;
            Set setH1 = zhm.d0.h1(((v) ((j2) yVar.f22677a).getValue()).d);
            if (setH1.contains(termsScope)) {
                setH1.remove(termsScope);
            } else {
                setH1.add(termsScope);
            }
            b0Var.H2(yVar, new imk.e(21, setH1));
        }
        return Unit.f186387a;
    }
}
