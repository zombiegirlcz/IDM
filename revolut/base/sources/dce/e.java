package dce;

import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsController;
import ip0.f6;
import ip0.t5;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubscriptionDetailsController f112862w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SubscriptionDetailsController subscriptionDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112862w = subscriptionDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f112862w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f112862w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f112862w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f112862w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e(this.f112862w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e(this.f112862w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                e eVar7 = new e(this.f112862w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
            default:
                e eVar8 = new e(this.f112862w, continuation, 7);
                eVar8.v = obj2;
                return eVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((f6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SubscriptionDetailsController subscriptionDetailsController = this.f112862w;
        switch (i) {
            case 0:
                t5 t5Var = (t5) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = subscriptionDetailsController.e3();
                Intrinsics.h(t5Var);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) oVarE3).L2(new x(t5Var));
                break;
            case 1:
                f6 f6Var = (f6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE32 = subscriptionDetailsController.e3();
                Intrinsics.h(f6Var);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) oVarE32).L2(new v(f6Var));
                break;
            case 2:
                Object obj3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE33 = subscriptionDetailsController.e3();
                Intrinsics.h(obj3);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) oVarE33).L2(new z(obj3));
                break;
            case 3:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE34 = subscriptionDetailsController.e3();
                Intrinsics.h(aVar4);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) oVarE34).L2(new a0(aVar4));
                break;
            case 4:
                com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE35 = subscriptionDetailsController.e3();
                Intrinsics.h(tVar);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) oVarE35).L2(new s(tVar));
                break;
            case 5:
                ip0.y yVar = (ip0.y) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE36 = subscriptionDetailsController.e3();
                Intrinsics.h(yVar);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) oVarE36).L2(new r(yVar));
                break;
            case 6:
                x10 x10Var = (x10) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE37 = subscriptionDetailsController.e3();
                Intrinsics.h(x10Var);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) oVarE37).L2(new d0(x10Var));
                break;
            default:
                ty0.a aVar9 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE38 = subscriptionDetailsController.e3();
                Intrinsics.h(aVar9);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) oVarE38).L2(new b0(aVar9));
                break;
        }
        return Unit.f186387a;
    }
}
