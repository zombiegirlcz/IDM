package au6;

import androidx.room.util.DBUtil;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c3 f9499w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(c3 c3Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9499w = c3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b3 b3Var = new b3(this.f9499w, continuation, 0);
                b3Var.v = obj2;
                return b3Var;
            default:
                b3 b3Var2 = new b3(this.f9499w, continuation, 1);
                b3Var2.v = obj2;
                return b3Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b3) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c3 c3Var = this.f9499w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.b bVar = c3Var.d;
                ps6.b bVar2 = (ps6.b) DBUtil.performBlocking(bVar.f229240a, true, false, new ood.k(bVar, str, 21));
                if (bVar2 == null) {
                    return null;
                }
                TaxHubCalendarEvent taxHubCalendarEventC = bu6.f.c(bVar2);
                od0.i.Companion.getClass();
                return od0.h.a(taxHubCalendarEventC);
            default:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wt6.e eVar = (wt6.e) wp5.y.t(wt6.e.class, c3Var.f9506b, j6.a.q("freelancer:taxCalendarEvents:eventVatSummary:", str2));
                if (eVar != null) {
                    return bu6.f.e(eVar);
                }
                return null;
        }
    }
}
