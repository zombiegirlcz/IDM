package bo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen.JuniorAccountDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAccountDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(JuniorAccountDetailsController juniorAccountDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAccountDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarD3 = this.v.R2();
        Intrinsics.h(model);
        b0 b0Var = (b0) mVarD3;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "ID_SHARE_ACCOUNT_DETAILS")) {
            b0Var.l2(new u(b0Var, null, 0), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
