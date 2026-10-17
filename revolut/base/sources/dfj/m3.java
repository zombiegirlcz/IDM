package dfj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class m3 extends gim.i implements Function1 {
    public final /* synthetic */ long A;
    public final /* synthetic */ EsimDataPlanOfferInfo B;
    public int u;
    public final /* synthetic */ q3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f114043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f114044x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f114045y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(q3 q3Var, String str, String str2, String str3, String str4, long j2, EsimDataPlanOfferInfo esimDataPlanOfferInfo, Continuation continuation) {
        super(1, continuation);
        this.v = q3Var;
        this.f114043w = str;
        this.f114044x = str2;
        this.f114045y = str3;
        this.z = str4;
        this.A = j2;
        this.B = esimDataPlanOfferInfo;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m3(this.v, this.f114043w, this.f114044x, this.f114045y, this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m3) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        nfj.v1 v1Var = this.v.f114082a;
        this.u = 1;
        v1Var.getClass();
        nfj.r1 r1Var = new nfj.r1(v1Var, this.f114043w, this.f114044x, this.f114045y, this.A, this.z, this.B, null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, r1Var, this);
        return objJ == aVar ? aVar : objJ;
    }
}
