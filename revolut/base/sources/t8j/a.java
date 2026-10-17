package t8j;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.marketnews.api.navigation.WealthNewsFeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.A2(u0.c(new WealthNewsFeatureConfig.Overview(tzj.a.CRYPTO, new ActivityAnimation.System(new Integer(R$anim.fade_in), new Integer(R$anim.fade_out)))));
        return Unit.f186387a;
    }
}
