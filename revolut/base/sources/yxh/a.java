package yxh;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_crypto_order_details.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import myh.j;
import yhm.o;
import yuc.p;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xxh.a f317696w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(xxh.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317696w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f317696w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f317696w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        xxh.a aVar = this.f317696w;
        switch (i) {
            case 0:
                g6 selectedTabData = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) ((f) aVar.f309527g);
                eVar.getClass();
                Intrinsics.checkNotNullParameter(selectedTabData, "selectedTabData");
                String str = selectedTabData.f54199a;
                j jVar = j.STOP_LOSS;
                if (!Intrinsics.f(str, jVar.getId())) {
                    jVar = j.TAKE_PROFIT;
                }
                eVar.f317700q.setValue(jVar);
                break;
            default:
                y clickData = (y) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar2 = (e) ((f) aVar.f309527g);
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                eVar2.f317699p.getClass();
                eVar2.N2(txh.c.a(new TextLocalisedClause(R$string.cryptobuysell_order_details_cancel_action_title, u.c(new TextLocalisedClause(R$string.cryptobuysell_order_details_cancel_action_tpsl, null, null, 14)), null, 12), new TextLocalisedClause(R$string.cryptobuysell_order_details_cancel_action_message, u.c(new TextLocalisedClause(R$string.cryptobuysell_order_details_cancel_action_tpsl, null, null, 14)), null, 12)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new p(eVar2, 17));
                break;
        }
        return Unit.f186387a;
    }
}
