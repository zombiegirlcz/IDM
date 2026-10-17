package epg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.username.ui.UsernameScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UsernameScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(UsernameScreen usernameScreen, Continuation continuation) {
        super(2, continuation);
        this.v = usernameScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = (o) this.v.f94690b0.getValue();
        Intrinsics.h(model);
        u uVar = (u) oVar;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(uVar.f128195q, true, null, 2);
        return Unit.f186387a;
    }
}
