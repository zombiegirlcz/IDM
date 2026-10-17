package i1e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.stock_lending.impl.R$string;
import hwi.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f157622w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(s sVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f157622w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f157622w, continuation, 0);
            default:
                return new n(this.f157622w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                s sVar = this.f157622w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarG0 = w.g0(sVar.f157626p.f303367c.f123677a.disableStockLending());
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                s.Companion.getClass();
                return yji.l.b1(sVar, sVar.X1(new mii.k("STOCK_LENDING_DISABLED_SUCCESS_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.wealth_stock_lending_disabled_status_view_title, null, null, 14), null, null, null, 28)), null, new l0(sVar, null, 9), 3);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s sVar2 = this.f157622w;
                n nVar = new n(sVar2, null, 0);
                this.v = 1;
                Object objP2 = sVar2.p2(this, nVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
