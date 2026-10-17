package iai;

import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a f160039w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a aVar, com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f160039w = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f160039w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a aVar2 = this.v;
            boolean z = aVar2 instanceof gai.e;
            com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a aVar3 = this.f160039w;
            if (z) {
                d dVar = new d(aVar2, aVar3, null);
                this.u = 1;
                if (aVar3.p2(this, dVar) == aVar) {
                    return aVar;
                }
            } else if (Intrinsics.f(aVar2, a.b.f97521a)) {
                com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a.I2(aVar3, SubmitCitizenshipFlowOutput.Decline.f97506a);
            } else {
                if (!Intrinsics.f(aVar2, a.C0593a.f97520a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a.I2(aVar3, aVar3.o.f97498b ? SubmitCitizenshipFlowOutput.Back.f97504a : SubmitCitizenshipFlowOutput.Close.f97505a);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
