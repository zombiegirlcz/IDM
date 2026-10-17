package b8d;

import com.revolut.feature.shared.help_centre.impl.utils.FaqNotFoundException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.article.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(0, this.v, continuation);
            default:
                return new x(1, this.v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws FaqNotFoundException {
        switch (this.u) {
            case 0:
                return ((x) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                ((x) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws FaqNotFoundException {
        int i = this.u;
        com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.u2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw new FaqNotFoundException(cVar.f86243y);
        }
    }
}
