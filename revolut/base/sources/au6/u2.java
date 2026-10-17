package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxAuthorityService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ ds6.j f9632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w2 f9633x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(w2 w2Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f9633x = w2Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ds6.j jVar = (ds6.j) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u2 u2Var = new u2(this.f9633x, continuation, 0);
                u2Var.f9632w = jVar;
                return u2Var.invokeSuspend(Unit.f186387a);
            default:
                u2 u2Var2 = new u2(this.f9633x, continuation, 1);
                u2Var2.f9632w = jVar;
                return u2Var2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                ds6.j jVar = this.f9632w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FreelancerTaxAuthorityService freelancerTaxAuthorityService = this.f9633x.f9651a;
                    String strName = jVar.name();
                    this.f9632w = null;
                    this.v = 1;
                    obj2 = freelancerTaxAuthorityService.getAuthorityUrl(strName, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                wt6.a aVar2 = (wt6.a) obj2;
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                return new ds6.q(aVar2.getWebsiteUrl(), aVar2.getPaymentDisclaimerUrl());
            default:
                ds6.j jVar2 = this.f9632w;
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FreelancerTaxAuthorityService freelancerTaxAuthorityService2 = this.f9633x.f9651a;
                    String strName2 = jVar2.name();
                    this.f9632w = null;
                    this.v = 1;
                    obj2 = freelancerTaxAuthorityService2.getAuthorityPaymentDetails(strName2, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                arrayList = new ArrayList();
                Iterator it8 = ((Iterable) obj2).iterator();
                while (it8.hasNext()) {
                    ds6.w wVarG = bu6.f.g((wt6.c) it8.next());
                    if (wVarG != null) {
                        arrayList.add(wVarG);
                    }
                }
                return arrayList;
        }
    }
}
