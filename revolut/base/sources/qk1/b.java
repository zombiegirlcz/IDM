package qk1;

import com.revolut.feature.alipay_plus.mpm.model.APMPMCallback;
import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyResponse;
import fnc.s;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f246937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ APMPMProxyRequest f246938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ APMPMCallback f246939y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, APMPMProxyRequest aPMPMProxyRequest, APMPMCallback aPMPMCallback, Continuation continuation) {
        super(2, continuation);
        this.f246937w = cVar;
        this.f246938x = aPMPMProxyRequest;
        this.f246939y = aPMPMCallback;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f246937w, this.f246938x, this.f246939y, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                o.b(obj2);
                c cVar = this.f246937w;
                APMPMProxyRequest aPMPMProxyRequest = this.f246938x;
                m.Companion companion = m.INSTANCE;
                s sVar = cVar.f246940a;
                this.v = null;
                this.u = 1;
                kb7.c cVar2 = new kb7.c(sVar, aPMPMProxyRequest, null, 12);
                p0 p0Var = p0.f264001a;
                obj2 = e0.J(elm.f.f127540b, cVar2, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = (APMPMProxyResponse) obj2;
            m.Companion companion2 = m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        APMPMCallback aPMPMCallback = this.f246939y;
        if (thA == null) {
            aPMPMCallback.onSuccess((APMPMProxyResponse) objA);
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AlipayPlusNetworkService", null, thA, h0Var);
            APMPMError.Companion companion4 = APMPMError.INSTANCE;
            String message = thA.getMessage();
            if (message == null) {
                message = "Alipay+ proxy request failed";
            }
            aPMPMCallback.onFailure(companion4.system(message, thA));
        }
        return Unit.f186387a;
    }
}
