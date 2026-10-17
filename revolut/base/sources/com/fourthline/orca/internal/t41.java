package com.fourthline.orca.internal;

import com.fourthline.orca.internal.xd1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class t41 implements wd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ky f33194a;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33196b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = t41.this.new a(continuation);
            aVar.f33196b = obj2;
            return aVar;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            FlowCollector flowCollector = (FlowCollector) this.f33196b;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f33195a;
            if (i == 0) {
                yhm.o.b(obj2);
                xd1.a aVar2 = new xd1.a(t41.this.f33194a);
                this.f33196b = null;
                this.f33195a = 1;
                if (flowCollector.emit(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public t41(ky flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f33194a = flowAction;
    }

    @Override // com.fourthline.orca.internal.wd1
    public Object a(ge1 ge1Var, Continuation continuation) {
        return new vkm.v1(new a(null));
    }
}
