package to2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tjf.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ RequestListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RequestListScreen requestListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = requestListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.u.R2();
        mVarE3.H2(mVarE3.f272507p, new tlf.n(16));
        mVarE3.n2(new p0(mVarE3, null, 5), new whi.b(6));
        return Unit.f186387a;
    }
}
