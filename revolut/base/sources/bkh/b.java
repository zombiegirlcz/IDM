package bkh;

import aw0.n6;
import com.revolut.feature.wealth.ui.impl.cash_balance.info.CashBalanceInfoDialogController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pih.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CashBalanceInfoDialogController f16412w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CashBalanceInfoDialogController cashBalanceInfoDialogController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16412w = cashBalanceInfoDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f16412w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f16412w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        int i = this.u;
        CashBalanceInfoDialogController cashBalanceInfoDialogController = this.f16412w;
        switch (i) {
            case 0:
                n6 largeActionButtonModel = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) ((c) cashBalanceInfoDialogController.T.getValue());
                eVar.getClass();
                Intrinsics.checkNotNullParameter(largeActionButtonModel, "largeActionButtonModel");
                Object obj3 = largeActionButtonModel.k;
                hVar = obj3 instanceof h ? (h) obj3 : null;
                if (hVar != null) {
                    eVar.C2(hVar);
                }
                break;
            default:
                n6 largeActionButtonModel2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar2 = (e) ((c) cashBalanceInfoDialogController.T.getValue());
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(largeActionButtonModel2, "largeActionButtonModel");
                Object obj4 = largeActionButtonModel2.k;
                hVar = obj4 instanceof h ? (h) obj4 : null;
                if (hVar != null) {
                    eVar2.C2(hVar);
                }
                break;
        }
        return Unit.f186387a;
    }
}
