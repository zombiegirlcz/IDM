package zyd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.statements.impl.ui.account_confirmation.screen.AccountConfirmationScreen;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ryd.w;
import vkm.j2;
import zhm.z0;
import zrd.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AccountConfirmationScreen accountConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountConfirmationScreen accountConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((m) accountConfirmationScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) accountConfirmationScreen.R2();
                g gVar = (g) ((j2) mVar.f326449t.f22677a).getValue();
                zxd.c cVar = mVar.f326446q;
                Set setH = z0.h(gVar.f326439c);
                h hVar = mVar.o;
                AccountId accountId = hVar.f326440a;
                Continuation continuation = null;
                if (!(accountId instanceof AccountId.Joint)) {
                    accountId = null;
                }
                AccountId.Joint joint = (AccountId.Joint) accountId;
                String str = joint != null ? joint.f51413b : null;
                Boolean boolValueOf = Boolean.valueOf(gVar.f326438b);
                io3.l lVar = hVar.f326441b;
                w wVar = (w) cVar;
                wVar.getClass();
                yji.l.a1(mVar, byd.g.a(byd.g.c(rd0.e.b(wVar.n(2, new ryd.f(wVar, setH, str, boolValueOf, lVar, 0))), mVar.X(), mVar.f326448s.d(), new zg8.d(1, mVar.f326448s, byd.a.class, "createErrorDialogConfiguration", "createErrorDialogConfiguration(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 18), new q(mVar, 20))), null, null, new l(mVar, continuation, 1), 3);
                break;
        }
        return Unit.f186387a;
    }
}
