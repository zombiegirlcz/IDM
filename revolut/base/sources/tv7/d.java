package tv7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreen;
import gu7.a0;
import gu7.m0;
import gu7.u;
import gu7.x;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GetHelpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GetHelpScreen getHelpScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = getHelpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GetHelpScreen getHelpScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                getHelpScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = getHelpScreen.d();
                m0 m0Var = (m0) ((h) ((j2) jVarE3.f274729t.f22677a).getValue()).f274721a.getContent();
                Continuation continuation = null;
                u uVar = m0Var != null ? m0Var.f146792c : null;
                if (uVar instanceof x) {
                    jVarE3.n2(new tqh.j(jVarE3, (x) uVar, continuation, 12), new su0.c(1, jVarE3, pu7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 21));
                } else if (uVar instanceof a0) {
                    ou7.a.d(jVarE3, ((a0) uVar).f146710b);
                } else {
                    if (uVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Claim be null for ContactsLayout");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
