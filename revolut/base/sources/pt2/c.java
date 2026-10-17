package pt2;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.businessinstaller.impl.ui.in_app_install.BusinessInstallerController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pe2.l;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ BusinessInstallerController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BusinessInstallerController businessInstallerController, Continuation continuation) {
        super(2, continuation);
        this.u = businessInstallerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.u.L.getValue();
        fVar.getClass();
        fVar.n2(new l(fVar, null, 23), new whi.b(6));
        return Unit.f186387a;
    }
}
