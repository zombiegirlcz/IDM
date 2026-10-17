package ill;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.sso.impl.ui.choose_challenge.ChooseChallengeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChooseChallengeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ChooseChallengeController chooseChallengeController, Continuation continuation) {
        super(2, continuation);
        this.v = chooseChallengeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.Q.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof jkl.i) {
            jVar.C2(new c((jkl.i) obj3));
        }
        return Unit.f186387a;
    }
}
