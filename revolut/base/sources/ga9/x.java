package ga9;

import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ EmailFlowOutputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f142110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(EmailFlowOutputData emailFlowOutputData, com.revolut.feature.onboarding.impl.onboarding.v vVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = emailFlowOutputData;
        this.f142109w = vVar;
        this.f142110x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, this.f142109w, this.f142110x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            EmailFlowOutputData emailFlowOutputData = this.v;
            boolean z = emailFlowOutputData instanceof EmailFlowOutputData.EmailData;
            com.revolut.feature.onboarding.impl.onboarding.v vVar = this.f142109w;
            if (z) {
                String str = ((EmailFlowOutputData.EmailData) emailFlowOutputData).f97566b;
                w wVar = new w(emailFlowOutputData, vVar, this.f142110x, null);
                this.u = 1;
                if (u0.b0(vVar.X(), str, wVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (!Intrinsics.f(emailFlowOutputData, EmailFlowOutputData.Close.f97564a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar.B2();
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
