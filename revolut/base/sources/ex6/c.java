package ex6;

import com.revolut.data.model.Data;
import com.revolut.feature.checkout.models.PreorderPlanResult;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f130354w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.u = i;
        this.f130354w = function1;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(0, continuation, this.f130354w);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(1, continuation, this.f130354w);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(2, continuation, this.f130354w);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(3, continuation, this.f130354w);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(4, continuation, this.f130354w);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c(5, continuation, this.f130354w);
                cVar6.v = obj2;
                return cVar6;
            default:
                c cVar7 = new c(6, continuation, this.f130354w);
                cVar7.v = obj2;
                return cVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((PreorderPlanResult) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Function1 function1 = this.f130354w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                function1.invoke(n1Var);
                break;
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.h(str);
                function1.invoke(str);
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Throwable error = data.getError();
                if (error != null) {
                    function1.invoke(error);
                }
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Object content = data2.getContent();
                if (!data2.getLoading() && data2.getError() == null && content != null) {
                    function1.invoke(content);
                }
                break;
            case 4:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                function1.invoke(n1Var2);
                break;
            case 5:
                n1 n1Var3 = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                function1.invoke(n1Var3);
                break;
            default:
                PreorderPlanResult preorderPlanResult = (PreorderPlanResult) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                function1.invoke(preorderPlanResult);
                break;
        }
        return Unit.f186387a;
    }
}
