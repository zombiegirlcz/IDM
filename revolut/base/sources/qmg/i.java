package qmg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qmg.d;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UserChecklistController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(UserChecklistController userChecklistController, Continuation continuation) {
        super(2, continuation);
        this.v = userChecklistController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVar = (b) this.v.V.getValue();
        Object obj3 = model.i;
        l lVar = (l) bVar;
        lVar.getClass();
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str == null) {
            lVar.C2(d.a.f247827a);
        } else {
            lVar.n2(new j(lVar, str, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
