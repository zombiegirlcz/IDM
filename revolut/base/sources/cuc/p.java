package cuc;

import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.impl.network.SecurityDelayService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import retrofit2.HttpException;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f108966w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Continuation continuation) {
        super(3, continuation);
        this.f108966w = rVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        p pVar = new p(this.f108966w, (Continuation) obj4);
        pVar.v = (m) obj3;
        return pVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        r rVar = this.f108966w;
        m mVar = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                String str = mVar.f108960a;
                String str2 = mVar.f108961b;
                m.Companion companion = yhm.m.INSTANCE;
                SecurityDelayService securityDelayService = rVar.f108970c;
                this.v = null;
                this.u = 1;
                obj2 = securityDelayService.getTransactionSecurityDelay(str, str2, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            objA = (auc.s) obj2;
            m.Companion companion2 = yhm.m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA == null) {
            return i.a((auc.s) objA);
        }
        if ((thA instanceof HttpException) && ((HttpException) thA).code() == 404) {
            return new SecurityDelayInfo.NotFound(0);
        }
        throw thA;
    }
}
