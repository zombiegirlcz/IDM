package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberService;
import kfj.a4;
import kfj.b4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f215022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f215023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f215024y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(u0 u0Var, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f215022w = u0Var;
        this.f215023x = str;
        this.f215024y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r0(this.f215022w, this.f215023x, this.f215024y, continuation, 0);
            default:
                return new r0(this.f215022w, this.f215023x, this.f215024y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberService esimPhoneNumberService = this.f215022w.f215052a;
                    this.v = 1;
                    obj2 = esimPhoneNumberService.postPhoneNumberPortingCancellationRequest(this.f215023x, this.f215024y, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ofj.p.b((a4) obj2, null, null);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberService esimPhoneNumberService2 = this.f215022w.f215052a;
                    b4 b4Var = new b4(this.f215024y);
                    this.v = 1;
                    obj2 = esimPhoneNumberService2.updatePhoneNumberLabel(this.f215023x, b4Var, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ofj.p.b((a4) obj2, null, null);
        }
    }
}
