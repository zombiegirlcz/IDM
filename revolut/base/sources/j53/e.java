package j53;

import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController;
import e93.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CustomisationImageGenerationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CustomisationImageGenerationController customisationImageGenerationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = customisationImageGenerationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CustomisationImageGenerationController customisationImageGenerationController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar2 = (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) customisationImageGenerationController.e3();
                Object value = ((j2) aVar2.f65320y.f22677a).getValue();
                Intrinsics.i(value, "null cannot be cast to non-null type com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract.DomainState.GeneratedImages");
                k kVar = (k) value;
                String str = kVar.d;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object content = kVar.f171471b.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar2.C2(new b53.c((g0) content, str));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) customisationImageGenerationController.e3()).J2();
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) customisationImageGenerationController.e3()).J2();
                return Unit.f186387a;
        }
    }
}
