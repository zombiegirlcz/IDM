package ocb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.RetailPrivacyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RetailPrivacyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RetailPrivacyScreen retailPrivacyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = retailPrivacyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVar = (k) this.v.f82782d0.getValue();
        String id10 = model.f53228a;
        x xVar = (x) kVar;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        xVar.l2(new w(id10, xVar, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
