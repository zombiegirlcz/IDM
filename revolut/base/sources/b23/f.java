package b23;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.impl.R$string;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import n33.s2;
import n33.w;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ h A;
    public final /* synthetic */ CardOrderAccountWrapper.Junior B;
    public final /* synthetic */ e93.e C;
    public final /* synthetic */ w D;
    public h u;
    public CardOrderAccountWrapper.Junior v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e93.e f11873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f11874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public NaviCommand f11875y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, CardOrderAccountWrapper.Junior junior, e93.e eVar, w wVar, Continuation continuation) {
        super(2, continuation);
        this.A = hVar;
        this.B = junior;
        this.C = eVar;
        this.D = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.A, this.B, this.C, this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CardOrderAccountWrapper.Junior junior;
        h hVar;
        e93.e eVar;
        CompositeCommand compositeCommandC;
        String str;
        Object objA;
        NaviCommand naviCommand;
        String str2;
        CardOrderAccountWrapper.Junior junior2;
        h hVar2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.z;
        if (i == 0) {
            o.b(obj2);
            s2 s2Var = (s2) this.D;
            String str3 = (String) s2Var.B0().get();
            NaviCommand naviCommand2 = (NaviCommand) te0.w.O(s2Var.C0());
            junior = this.B;
            hVar = this.A;
            eVar = this.C;
            if (naviCommand2 == null) {
                compositeCommandC = null;
                str = str3;
                e93.e eVar2 = eVar;
                hVar.getClass();
                hVar.f11879a.D(new n93.g(str, eVar2, compositeCommandC, null, null, null, null, AccountId.Personal.f51414a, junior.f64934b, null, new n93.i(new TextLocalisedClause(R$string.junior_virtual_card_order_success_title, u.c(junior.f64935c), null, 12)), 632));
                return Unit.f186387a;
            }
            String str4 = junior.f64934b;
            this.u = hVar;
            this.v = junior;
            this.f11873w = eVar;
            this.f11874x = str3;
            this.f11875y = naviCommand2;
            this.z = 1;
            objA = h.a(hVar, str4, this);
            if (objA == aVar) {
                return aVar;
            }
            naviCommand = naviCommand2;
            str2 = str3;
            junior2 = junior;
            hVar2 = hVar;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            naviCommand = this.f11875y;
            str2 = this.f11874x;
            e93.e eVar3 = this.f11873w;
            junior2 = this.v;
            hVar2 = this.u;
            o.b(obj2);
            eVar = eVar3;
            objA = obj2;
        }
        compositeCommandC = com.revolut.retail.core.navigation.a.c(naviCommand, (NaviCommand) objA);
        str = str2;
        hVar = hVar2;
        junior = junior2;
        e93.e eVar22 = eVar;
        hVar.getClass();
        hVar.f11879a.D(new n93.g(str, eVar22, compositeCommandC, null, null, null, null, AccountId.Personal.f51414a, junior.f64934b, null, new n93.i(new TextLocalisedClause(R$string.junior_virtual_card_order_success_title, u.c(junior.f64935c), null, 12)), 632));
        return Unit.f186387a;
    }
}
