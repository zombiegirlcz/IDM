package n30;

import com.revolut.chat.data.network.InAppCallSupportApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f211646w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(p0 p0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f211646w = p0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f211646w, continuation, 0);
            default:
                return new m0(this.f211646w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        p0 p0Var = this.f211646w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                InAppCallSupportApi inAppCallSupportApi = p0Var.f211657c;
                this.v = 1;
                Object inboundCallConfig = inAppCallSupportApi.getInboundCallConfig(this);
                return inboundCallConfig == aVar ? aVar : inboundCallConfig;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objA = p0.a(p0Var, this);
                    if (objA != obj3) {
                    }
                    return obj3;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objA = ((yhm.m) obj2).f314193a;
                m.Companion companion = yhm.m.INSTANCE;
                if (objA instanceof yhm.n) {
                    objA = null;
                }
                obj3 = (e0) objA;
                if (obj3 == null) {
                    Intrinsics.checkNotNullParameter("Unable to start inbound call due to Twilio registration error", "message");
                    throw new IllegalStateException("Unable to start inbound call due to Twilio registration error") { // from class: com.revolut.chat.domain.interactor.chat.InAppCallRequestsInteractorImpl$TwilioRegistrationError
                        {
                            Intrinsics.checkNotNullParameter("Unable to register Twilio when force=true", "message");
                        }
                    };
                }
                return obj3;
        }
    }
}
