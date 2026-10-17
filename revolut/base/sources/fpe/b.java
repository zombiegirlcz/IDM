package fpe;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ TaxResidencySoleScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TaxResidencySoleScreen taxResidencySoleScreen, Continuation continuation) {
        super(2, continuation);
        this.u = taxResidencySoleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.tax_residency.impl.ui.sole.b bVar = (com.revolut.feature.tax_residency.impl.ui.sole.b) ((h) this.u.Q.getValue());
        bVar.getClass();
        Intrinsics.checkNotNullParameter("PRIMARY_BUTTON_LOADING_TAG", "buttonLoadingTag");
        bVar.C2(new f());
        return Unit.f186387a;
    }
}
