package t48;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.joint.impl.ui.consent.ConsentScreen;
import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConsentScreen consentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = consentScreen;
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
        o oVarI3 = this.v.T2();
        Intrinsics.h(model);
        y yVar = (y) oVarI3;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        b0.Companion.getClass();
        if (b0.e.contains(model.f53228a)) {
            Object obj3 = model.u;
            TermsScope termsScope = obj3 instanceof TermsScope ? (TermsScope) obj3 : null;
            if (termsScope == null) {
                throw new IllegalStateException("TermsType shouldn't be null");
            }
            yVar.l2(new x(yVar, termsScope, null), yVar.v);
        }
        return Unit.f186387a;
    }
}
