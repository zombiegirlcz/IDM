package gq1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ FormsListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FormsListScreen formsListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = formsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) ((i) this.u.Q.getValue());
        jq1.a aVar2 = lVar.f145515p;
        k onResult = new k(lVar, 1);
        jq1.e eVar = (jq1.e) aVar2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        eVar.T2(new jq1.d(eVar, onResult, null), new yi5.b(27));
        return Unit.f186387a;
    }
}
