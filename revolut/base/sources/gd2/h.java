package gd2;

import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListControllerContract$InputData;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            IDealAccountsListControllerContract$InputData iDealAccountsListControllerContract$InputData = jVar.o;
            String str = iDealAccountsListControllerContract$InputData.f62839b == d.CONFIRM_PAYMENT ? iDealAccountsListControllerContract$InputData.f62838a : null;
            ad2.a aVar2 = jVar.f143043p;
            List list = ((e) ((j2) jVar.f143045r.f22677a).getValue()).d;
            this.u = 1;
            bd2.e eVar = (bd2.e) aVar2;
            eVar.getClass();
            b96.d dVar = new b96.d(str, eVar, list, continuation, 9);
            p0 p0Var = p0.f264001a;
            objJ = e0.J(elm.f.f127540b, dVar, this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objJ = obj2;
        }
        return jVar.C1(u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) jVar.f143044q).f((String) objJ), 14), null, null, null, 0, null, null, null, null, false, 1022))));
    }
}
