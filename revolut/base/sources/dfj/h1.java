package dfj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class h1 extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ int u;
    public EsimSubscriptionPhoneNumber v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f113986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i1 f113987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f113988y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(i1 i1Var, String str, String str2, String str3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f113987x = i1Var;
        this.f113988y = str;
        this.z = str2;
        this.A = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h1(this.f113987x, this.f113988y, this.z, this.A, continuation, 0);
            default:
                return new h1(this.f113987x, this.f113988y, this.z, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        String str = this.A;
        i1 i1Var = this.f113987x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f113986w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    nfj.k0 k0Var = i1Var.f113996a;
                    this.f113986w = 1;
                    nfj.u0 u0Var = (nfj.u0) k0Var;
                    u0Var.getClass();
                    nfj.r0 r0Var = new nfj.r0(u0Var, this.z, this.f113988y, null, 0);
                    skm.p0 p0Var = skm.p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, r0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = this.v;
                        yhm.o.b(obj2);
                        return esimSubscriptionPhoneNumber;
                    }
                    yhm.o.b(obj2);
                }
                EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber2 = (EsimSubscriptionPhoneNumber) obj2;
                nfj.a2 a2Var = i1Var.f113997b;
                this.v = esimSubscriptionPhoneNumber2;
                this.f113986w = 2;
                return ((nfj.s2) a2Var).p(str, esimSubscriptionPhoneNumber2, this) == aVar ? aVar : esimSubscriptionPhoneNumber2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f113986w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    nfj.k0 k0Var2 = i1Var.f113996a;
                    this.f113986w = 1;
                    nfj.u0 u0Var2 = (nfj.u0) k0Var2;
                    u0Var2.getClass();
                    nfj.r0 r0Var2 = new nfj.r0(u0Var2, this.f113988y, this.z, null, 1);
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, r0Var2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber3 = this.v;
                        yhm.o.b(obj2);
                        return esimSubscriptionPhoneNumber3;
                    }
                    yhm.o.b(obj2);
                }
                EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber4 = (EsimSubscriptionPhoneNumber) obj2;
                nfj.a2 a2Var2 = i1Var.f113997b;
                this.v = esimSubscriptionPhoneNumber4;
                this.f113986w = 2;
                return ((nfj.s2) a2Var2).p(str, esimSubscriptionPhoneNumber4, this) == aVar2 ? aVar2 : esimSubscriptionPhoneNumber4;
        }
    }
}
