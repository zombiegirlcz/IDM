package zzd;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentsHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(DocumentsHubScreen documentsHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = documentsHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f51917h;
        wxd.z zVar = obj3 instanceof wxd.z ? (wxd.z) obj3 : null;
        if (zVar != null) {
            ((com.revolut.feature.statements.impl.ui.documents_hub.a) this.v.d()).J2(new a0e.g(zVar, !model.f51915c));
        }
        return Unit.f186387a;
    }
}
