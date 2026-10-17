package j54;

import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ yja.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditApplicationFlowContract$Step.ProductArticles.NextAction f171498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.b f171499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d f171500y;
    public final /* synthetic */ aik.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yja.b bVar, CreditApplicationFlowContract$Step.ProductArticles.NextAction nextAction, com.revolut.feature.credit.application.plugins.impl.ui.application.b bVar2, com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar, aik.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f171498w = nextAction;
        this.f171499x = bVar2;
        this.f171500y = dVar;
        this.z = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c0(this.v, this.f171498w, this.f171499x, this.f171500y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        aik.g gVar = this.z;
        com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar = this.f171500y;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                yja.b bVar = yja.b.NOT_FOUND;
                yja.b bVar2 = this.v;
                if (bVar2 == bVar) {
                    od0.a aVar2 = od0.a.f224253a;
                    if (!od0.a.i()) {
                        IllegalStateException illegalStateException = new IllegalStateException("Unexpected result of onboarding product article: " + bVar2);
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    }
                }
                CreditApplicationFlowContract$Step.ProductArticles.NextAction.NextApplicationStep nextApplicationStep = CreditApplicationFlowContract$Step.ProductArticles.NextAction.NextApplicationStep.f67083a;
                CreditApplicationFlowContract$Step.ProductArticles.NextAction nextAction = this.f171498w;
                if (!Intrinsics.f(nextAction, nextApplicationStep)) {
                    if (!(nextAction instanceof CreditApplicationFlowContract$Step.ProductArticles.NextAction.CustomStep)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.f67118t = null;
                    gVar.invoke();
                    CreditApplicationFlowContract$Step creditApplicationFlowContract$Step = ((CreditApplicationFlowContract$Step.ProductArticles.NextAction.CustomStep) nextAction).f67082a;
                    return creditApplicationFlowContract$Step instanceof CreditApplicationFlowContract$Step.ModalStep ? dVar.r2().M0(new h54.e(creditApplicationFlowContract$Step, ModalDestination.Style.BOTTOM_DIALOG.f98301a)) : dVar.r2().M0(new h54.d(creditApplicationFlowContract$Step));
                }
                com.revolut.feature.credit.application.plugins.impl.ui.application.b bVar3 = this.f171499x;
                this.u = 1;
                if (bVar3.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            dVar.f67118t = null;
            gVar.invoke();
            return Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            dVar.f67118t = null;
            gVar.invoke();
            throw th10;
        }
    }
}
