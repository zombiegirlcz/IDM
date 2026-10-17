package exh;

import com.revolut.feature_cpg.impl.network.CardPaymentsGatewayService;
import h30.q;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f130435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ cue.d f130436x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f130437y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, cue.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f130435w = gVar;
        this.f130436x = dVar;
        this.f130437y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.f130435w, this.f130436x, this.f130437y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        g gVar = this.f130435w;
        if (i == 0) {
            o.b(obj2);
            gVar.getClass();
            cue.d dVar = this.f130436x;
            String strC = g.c(dVar);
            Map map = dVar.f108994g;
            q qVar = gVar.f130444a;
            String str2 = map != null ? (String) map.get("payment_method_id") : null;
            if (str2 == null) {
                throw new IllegalStateException("'payment_method_id' must be present");
            }
            String str3 = map != null ? (String) map.get("postcode") : null;
            this.u = strC;
            this.v = 1;
            ywh.b bVar = (ywh.b) qVar.d;
            Object objA = nim.a.a(w.g0(((CardPaymentsGatewayService) qVar.f148941b).requestTopup(strC, new bxh.d(new bxh.c(bxh.b.Subsequent, null, null, null, this.f130437y, str2, str3 != null ? new bxh.a(str3) : null, new cxh.a(bVar.f317439a.getResources().getDisplayMetrics().widthPixels, bVar.f317439a.getResources().getDisplayMetrics().heightPixels), 270)), qVar.w0())), this);
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA != obj3) {
                str = strC;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        str = this.u;
        o.b(obj2);
        j jVar = gVar.f130445b;
        this.u = null;
        this.v = 2;
        Object objA2 = jVar.a(str, this);
        return objA2 == obj3 ? obj3 : objA2;
    }
}
