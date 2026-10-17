package j53;

import cli.y;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.b4;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CustomisationImageGenerationController f171465w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CustomisationImageGenerationController customisationImageGenerationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171465w = customisationImageGenerationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f171465w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f171465w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f171465w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((b4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CustomisationImageGenerationController customisationImageGenerationController = this.f171465w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE3 = customisationImageGenerationController.d();
                Intrinsics.h(str);
                ((com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) hVarE3).I2(str);
                return Unit.f186387a;
            case 1:
                b4 inputAction = (b4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE32 = customisationImageGenerationController.d();
                Intrinsics.h(inputAction);
                com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar3 = (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) hVarE32;
                aVar3.getClass();
                y yVar = aVar3.f65320y;
                Intrinsics.checkNotNullParameter(inputAction, "inputAction");
                if (inputAction != b4.SEND_MESSAGE) {
                    throw new IllegalStateException(inputAction + " isn't supported");
                }
                aVar3.f65315r.R();
                Object value = ((j2) yVar.f22677a).getValue();
                Intrinsics.i(value, "null cannot be cast to non-null type com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract.DomainState.CreateAiPrompt");
                String str2 = ((i) value).f171466a;
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar3.H2(yVar, new j3f.d(10));
                aVar3.l2(new r(aVar3, str2, null, 1), new yi5.b(26));
                return Unit.f186387a;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE33 = customisationImageGenerationController.d();
                String clickId = aVar4.f275445a;
                com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar6 = (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) hVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(clickId, "clickId");
                if (Intrinsics.f(clickId, "GUIDELINES_CLICK_ID")) {
                    oki.h.v2(aVar6.z, CustomisationImageGenerationControllerContract$ModalStep.Guidelines.f65312a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
        }
    }
}
