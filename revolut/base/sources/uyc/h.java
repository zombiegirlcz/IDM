package uyc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.selfserve.sot.impl.ui.evidencelist.EvidenceListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EvidenceListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EvidenceListController evidenceListController, Continuation continuation) {
        super(2, continuation);
        this.v = evidenceListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        if ((obj3 instanceof String) && obj3.equals("ADD_FILE")) {
            EvidenceListController evidenceListController = this.v;
            k kVarE3 = evidenceListController.R2();
            String actionToDoId = evidenceListController.K.f85926c;
            w wVar = (w) kVarE3;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
            if (actionToDoId.length() > 0) {
                wVar.H2(wVar.f284157s, new uo7.k(actionToDoId, 8));
            }
            wVar.f284156r = false;
            wVar.J2();
        }
        return Unit.f186387a;
    }
}
