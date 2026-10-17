package v44;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import dx4.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditApplicationDocumentViewerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditApplicationDocumentViewerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String id10 = model.f52519a;
        nVarE3.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        y yVar = nVarE3.f285961s;
        List<t0> list = ((g) ((j2) yVar.f22677a).getValue()).f285946h;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (t0 t0VarB : list) {
            if (Intrinsics.f(t0VarB.f120770a, id10)) {
                t0VarB = t0.b(t0VarB, !t0VarB.d);
            }
            arrayList.add(t0VarB);
        }
        nVarE3.H2(yVar, new ua2.r(5, arrayList));
        return Unit.f186387a;
    }
}
