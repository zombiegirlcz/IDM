package nnb;

import ard.t;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.retail.savings.impl.documents.presentation.statements.account_selection.SavingsSelectionScreen;
import ip0.qd0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SavingsSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SavingsSelectionScreen savingsSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = savingsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        o oVar = (o) hVarE3;
        y yVar = oVar.v;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        g gVar = obj3 instanceof g ? (g) obj3 : null;
        if (gVar == null) {
            throw new IllegalStateException("Parcel must be SavingsSelectionScreenContract.ItemParcel");
        }
        String str = gVar.f217492a;
        Set setH1 = d0.h1(((f) ((j2) yVar.f22677a).getValue()).f217490b);
        boolean z = ((f) ((j2) yVar.f22677a).getValue()).f217491c;
        if (model.f53306c == qd0.SELECTED) {
            setH1.remove(str);
        } else {
            setH1.add(str);
        }
        oVar.H2(yVar, new t(setH1, oVar, gVar, z, 19));
        return Unit.f186387a;
    }
}
