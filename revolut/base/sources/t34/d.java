package t34;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import q14.k;
import yhm.m;
import yhm.o;
import yy3.t;
import yy3.u;
import yy3.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f267650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f267651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f267652y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h1 h1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f267650w = eVar;
        this.f267651x = h1Var;
        this.f267652y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f267650w, this.f267651x, this.f267652y, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.f267650w;
        try {
            if (i == 0) {
                o.b(obj2);
                h1 h1Var = this.f267651x;
                String str = this.f267652y;
                m.Companion companion = m.INSTANCE;
                CreditPluginsService creditPluginsService = eVar.f267654b;
                String str2 = h1Var.f137835a;
                q14.m mVar = new q14.m(str);
                this.v = null;
                this.u = 1;
                obj2 = creditPluginsService.startMortgageSignatureSigningProcess(str2, mVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = (k) obj2;
            m.Companion companion2 = m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            ServerError serverErrorA = eVar.d.a(thA instanceof CreditApplicationException ? ((CreditApplicationException) thA).f66910a : thA);
            if (serverErrorA == null || serverErrorA.f51362a != 32061) {
                throw thA;
            }
            return t.a.f317799a;
        }
        k kVar = (k) objA;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String processId = kVar.getProcessId();
        k.a inProgressConfig = kVar.getInProgressConfig();
        List<k.a.C1331a> content = inProgressConfig.getContent();
        ArrayList arrayList = new ArrayList(w.t(content, 10));
        for (k.a.C1331a c1331a : content) {
            arrayList.add(new u(c1331a.getTitle(), c1331a.getDescription()));
        }
        return new yy3.w(processId, new v(inProgressConfig.getIntervalSeconds(), arrayList));
    }
}
