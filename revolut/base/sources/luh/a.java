package luh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.workflow.engine.rfi.impl.ui.documents.ChooseDocumentsScreen;
import e60.s;
import ip0.u00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChooseDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChooseDocumentsScreen chooseDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chooseDocumentsScreen;
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

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.S.getValue();
        Intrinsics.h(model);
        com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a aVar2 = (com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) cVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "add_file_id")) {
            e60.a aVar3 = aVar2.f96547r;
            u00 u00Var = u00.BACK;
            e60.o.Companion.getClass();
            s sVar = (s) aVar3;
            sVar.T(new e60.i(null, null, null, true, 0, 0, d0.E0(e60.b.f122837b, e60.b.f122838c), null, false, u00Var, null, 15799));
        }
        return Unit.f186387a;
    }
}
