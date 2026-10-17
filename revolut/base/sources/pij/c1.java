package pij;

import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class c1 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236533w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f236534x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f236533w = bVar;
        this.f236534x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c1 c1Var = new c1(this.f236533w, continuation);
                c1Var.f236534x = obj2;
                return c1Var;
            default:
                return new c1(this.f236533w, this.f236534x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c1) create((chj.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                chj.c cVar = (chj.c) this.f236534x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    boolean zF = Intrinsics.f(cVar, chj.a.f24241a);
                    com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.f236533w;
                    if (zF) {
                        dfj.k0 k0Var = bVar.f101088x;
                        this.f236534x = null;
                        this.v = 1;
                        if (k0Var.e(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (!Intrinsics.f(cVar, chj.b.f24243a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar.C2(EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked.f101051a);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Object obj3 = this.f236534x;
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar2 = this.f236533w;
                i1 i1Var = new i1(bVar2, obj3, null);
                this.v = 1;
                Object objP2 = bVar2.p2(this, i1Var);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f236533w = bVar;
    }
}
