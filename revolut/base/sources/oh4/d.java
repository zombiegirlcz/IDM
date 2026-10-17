package oh4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedController;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedControllerContract$InputData;
import hs3.k1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RejectedController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RejectedController rejectedController, Continuation continuation) {
        super(2, continuation);
        this.v = rejectedController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        k1 k1Var;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.R.getValue();
        Intrinsics.h(model);
        l lVar = (l) eVar;
        lVar.getClass();
        RejectedControllerContract$InputData rejectedControllerContract$InputData = lVar.f225298r;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        int iHashCode = str.hashCode();
        if (iHashCode != 45552427) {
            if (iHashCode != 172120503) {
                if (iHashCode == 1169929593 && str.equals("ID_BUTTON_PRIMARY")) {
                    lVar.L2(rejectedControllerContract$InputData.f68299a.f154913c.f154904b);
                }
            } else if (str.equals("bureau_got_it_id")) {
                j60.a.v(lVar.f225300t, false, null, 3);
            }
        } else if (str.equals("ID_BUTTON_SECONDARY") && (k1Var = rejectedControllerContract$InputData.f68299a.d) != null) {
            lVar.L2(k1Var.f154904b);
        }
        return Unit.f186387a;
    }
}
