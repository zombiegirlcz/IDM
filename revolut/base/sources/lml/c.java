package lml;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.sso.impl.ui.consolidation.we_found_existing_account.WeFoundExistingAccountScreen;
import com.revolut.sso.impl.ui.consolidation.we_found_existing_account.WeFoundExistingAccountScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WeFoundExistingAccountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(WeFoundExistingAccountScreen weFoundExistingAccountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = weFoundExistingAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WeFoundExistingAccountScreen weFoundExistingAccountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                weFoundExistingAccountScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.sso.impl.ui.consolidation.we_found_existing_account.a) ((f) weFoundExistingAccountScreen.P.getValue())).f106499q, WeFoundExistingAccountScreenContract$ModalStep.LearnMore.f106497a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.sso.impl.ui.consolidation.we_found_existing_account.a) ((f) weFoundExistingAccountScreen.P.getValue())).C2(e.f197096a);
                break;
        }
        return Unit.f186387a;
    }
}
