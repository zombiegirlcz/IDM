package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberService;
import kfj.a4;
import kfj.y3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f215032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u0 f215033x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(u0 u0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f215033x = u0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s0 s0Var = new s0(this.f215033x, continuation, 0);
                s0Var.f215032w = str;
                return s0Var.invokeSuspend(Unit.f186387a);
            default:
                s0 s0Var2 = new s0(this.f215033x, continuation, 1);
                s0Var2.f215032w = str;
                return s0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f215032w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberService esimPhoneNumberService = this.f215033x.f215052a;
                    this.f215032w = null;
                    this.v = 1;
                    obj2 = esimPhoneNumberService.getPhoneNumberCancellationPreview(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return mif.e0.E((y3) obj2);
            default:
                String str2 = this.f215032w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberService esimPhoneNumberService2 = this.f215033x.f215052a;
                    this.f215032w = null;
                    this.v = 1;
                    obj2 = esimPhoneNumberService2.getPhoneNumber(str2, this);
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
