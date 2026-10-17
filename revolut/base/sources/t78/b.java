package t78;

import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceDestination;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowancesListDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import s6e.v;
import vkm.q;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c84.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JuniorProductAccountIdPayload f268604w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f268605x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f268606y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c84.c cVar, JuniorProductAccountIdPayload juniorProductAccountIdPayload, List list, String str, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f268604w = juniorProductAccountIdPayload;
        this.f268605x = list;
        this.f268606y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f268604w, this.f268605x, this.f268606y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        JuniorProductAccountIdPayload juniorProductAccountIdPayload;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        c84.c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = (!((jte.d) ((gte.a) cVar.f22078n)).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) || (juniorProductAccountIdPayload = this.f268604w) == null || juniorProductAccountIdPayload.f76718b == null) ? null : q.z(rd0.e.e(new v(mo3.a.g(((wsg.b) cVar.f22077m).c(juniorProductAccountIdPayload.f76717a, w4l.j.f294644c), null, new t5e.j(6), 1), juniorProductAccountIdPayload, 18), h0.f322473a, new qtb.o(3, 29, continuation)), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        xi0.b bVar = (xi0.b) obj2;
        boolean zIsEmpty = this.f268605x.isEmpty();
        String str = this.f268606y;
        return cVar.A2(zIsEmpty ? new JuniorAllowanceDestination(str, null, JuniorAllowanceLaunchMode.AsDestination.f76816a, bVar) : new JuniorAllowancesListDestination(str, bVar));
    }
}
