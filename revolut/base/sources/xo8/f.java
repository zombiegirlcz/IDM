package xo8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JuniorSettingsController juniorSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f52613a;
        h0 h0Var = (h0) nVarE3;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        oc8.n nVar = (oc8.n) h0Var.f307700r;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_JUNIOR_COPARENT_GOT_IT")) {
            j60.a.v(nVar.f224128r, false, null, 3);
        }
        return Unit.f186387a;
    }
}
