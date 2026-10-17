package to2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RequestListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RequestListScreen requestListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = requestListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        String listId = model.f53228a;
        Object obj3 = model.u;
        mVarE3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (a0.H(listId, "ID_REQUEST_", false)) {
            vo2.b bVar = obj3 instanceof vo2.b ? (vo2.b) obj3 : null;
            if (bVar != null) {
                mVarE3.C2(new j(bVar.f290844a));
            }
        }
        return Unit.f186387a;
    }
}
