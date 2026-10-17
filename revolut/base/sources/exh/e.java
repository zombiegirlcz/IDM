package exh;

import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.ExpireDateFormatter$CardExpire;
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
public final class e extends gim.i implements Function2 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f130438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ cue.d f130439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CardDetails f130440y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, cue.d dVar, CardDetails cardDetails, Continuation continuation) {
        super(2, continuation);
        this.f130438w = gVar;
        this.f130439x = dVar;
        this.f130440y = cardDetails;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.f130438w, this.f130439x, this.f130440y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        g gVar = this.f130438w;
        if (i == 0) {
            o.b(obj2);
            gVar.getClass();
            cue.d dVar = this.f130439x;
            String strC = g.c(dVar);
            q qVar = gVar.f130444a;
            CardDetails cardDetails = this.f130440y;
            String str2 = cardDetails.f90566a;
            String str3 = cardDetails.f90568c;
            Map map = dVar.f108994g;
            String str4 = map != null ? (String) map.get("postcode") : null;
            ExpireDateFormatter$CardExpire expireDateFormatter$CardExpire = cardDetails.f90567b;
            int i2 = expireDateFormatter$CardExpire.f90569a;
            int i3 = expireDateFormatter$CardExpire.f90570b;
            this.u = strC;
            this.v = 1;
            ywh.b bVar = (ywh.b) qVar.d;
            Object objA = nim.a.a(w.g0(((CardPaymentsGatewayService) qVar.f148941b).requestTopup(strC, new bxh.d(new bxh.c(bxh.b.First, str2, new Integer(i2), new Integer(i3), str3, null, str4 != null ? new bxh.a(str4) : null, new cxh.a(bVar.f317439a.getResources().getDisplayMetrics().widthPixels, bVar.f317439a.getResources().getDisplayMetrics().heightPixels), 288)), qVar.w0())), this);
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
