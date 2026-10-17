package vf2;

import be7.s;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreenContract$InputData;
import efm.d0;
import elm.f;
import gim.i;
import io3.d;
import j02.k;
import j02.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import tf2.e;
import uvl.c;
import vz1.g;
import wsg.n;
import xi0.b;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f288503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ApmPaymentAuthorisationSummary f288504x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary, Continuation continuation) {
        super(2, continuation);
        this.f288503w = cVar;
        this.f288504x = apmPaymentAuthorisationSummary;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f288503w, continuation);
            default:
                return new a(this.f288503w, this.f288504x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        b bVar;
        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary;
        int i = this.u;
        c cVar = this.f288503w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    g gVar = (g) cVar.d;
                    m mVar = new m(ApmPaymentAuthorisationPaymentMethod.UPI, new k(((UpiIntentPaymentReviewScreenContract$InputData) cVar.f283491a).f62985a));
                    this.v = 1;
                    obj2 = gVar.a(mVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        apmPaymentAuthorisationSummary = this.f288504x;
                        o.b(obj2);
                        d dVar = (d) obj2;
                        Intrinsics.h(dVar);
                        return new e(apmPaymentAuthorisationSummary, dVar);
                    }
                    o.b(obj2);
                }
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary2 = (ApmPaymentAuthorisationSummary) obj2;
                n nVar = (n) cVar.f283492b;
                dj0.d dVar2 = apmPaymentAuthorisationSummary2.f;
                if (dVar2 == null || (bVar = dVar2.f115083b) == null) {
                    b.Companion.getClass();
                    bVar = b.E;
                }
                d0 d0VarR = osg.b.r(nVar, bVar, null, null, null, 62);
                this.f288504x = apmPaymentAuthorisationSummary2;
                this.v = 2;
                Object objB = nim.a.b(d0VarR, this);
                if (objB == aVar) {
                    return aVar;
                }
                apmPaymentAuthorisationSummary = apmPaymentAuthorisationSummary2;
                obj2 = objB;
                d dVar3 = (d) obj2;
                Intrinsics.h(dVar3);
                return new e(apmPaymentAuthorisationSummary, dVar3);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    bf2.c cVar2 = (bf2.c) cVar.f283493c;
                    String str = this.f288504x.f61992a;
                    this.v = 1;
                    s sVar = new s(cVar2, str, null, 3);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(f.f127540b, sVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return new k71.c((String) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f288503w = cVar;
    }
}
