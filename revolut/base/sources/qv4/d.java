package qv4;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreen;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardStatementHubScreen f249524w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CreditCardStatementHubScreen creditCardStatementHubScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249524w = creditCardStatementHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f249524w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f249524w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        f fVar;
        int i = this.u;
        CreditCardStatementHubScreen creditCardStatementHubScreen = this.f249524w;
        switch (i) {
            case 0:
                yx4.b event = (yx4.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) creditCardStatementHubScreen.S.getValue();
                nVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (Intrinsics.f(event.f317544a, "ERROR_STATE_ID")) {
                    nVar.n2(new qc8.b(nVar, null, 15), new whi.b(6));
                } else {
                    Object obj3 = event.f317545b;
                    if (obj3 instanceof p) {
                        nVar.C2(new h(((p) obj3).f249534a));
                    }
                }
                return Unit.f186387a;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar2 = (n) creditCardStatementHubScreen.S.getValue();
                String tabId = g6Var.f54199a;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    if (Intrinsics.f(tabId, "id_credit_card_statement_hub_tab_upcoming")) {
                        fVar = f.UPCOMING;
                    } else {
                        if (!Intrinsics.f(tabId, "id_credit_card_statement_hub_tab_past")) {
                            throw new IllegalStateException("Unsupported tabId: " + tabId);
                        }
                        fVar = f.PAST;
                    }
                    nVar2.H2(nVar2.f249533q, new qtb.c(fVar, 8));
                    objA = Unit.f186387a;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                return Unit.f186387a;
        }
    }
}
