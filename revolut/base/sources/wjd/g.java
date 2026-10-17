package wjd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SignInMethodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SignInMethodsScreen signInMethodsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = signInMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.Q.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        RowDelegate.Model.c cVar = model.k;
        Intrinsics.i(cVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RowDelegate.Model.Value.Switch");
        boolean z = !((vf) cVar).f54880a;
        com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a aVar2 = (com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a) jVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        aVar2.n2(new o(aVar2, listId, z, obj3, (Continuation) null, 0), new whi.b(6));
        return Unit.f186387a;
    }
}
