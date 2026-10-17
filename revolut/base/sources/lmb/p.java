package lmb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.SavingsAccountCreationContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f196934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a f196935x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196935x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f196935x, continuation, 0);
                pVar.f196934w = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f196935x, continuation, 1);
                pVar2.f196934w = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((fjb.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fjb.c cVar = (fjb.c) this.f196934w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (cVar instanceof fjb.a) {
                        this.f196934w = null;
                        this.v = 1;
                        if (k0.b(2500L, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oki.h.D2(this.f196935x.B);
                return Unit.f186387a;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.f196934w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a aVar3 = this.f196935x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    q function = q.f;
                    Intrinsics.checkNotNullParameter(function, "function");
                    y yVar = new y(0);
                    s sVar = new s(aVar3, coroutineScope, null);
                    this.f196934w = null;
                    this.v = 1;
                    obj2 = n14.k.Q(aVar3, null, null, yVar, sVar, this, 3);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.d) {
                    pcd.s sVar2 = ((h) ((nii.d) eVar).f216133a).f196924a;
                    String str = sVar2.o;
                    if (str == null || d0.W(str)) {
                        aVar3.K2(sVar2);
                    } else {
                        oki.h.w2(aVar3.B, new SavingsAccountCreationContract$ModalStep.PostCreationWorkflow(str, sVar2), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                    }
                }
                return Unit.f186387a;
        }
    }
}
