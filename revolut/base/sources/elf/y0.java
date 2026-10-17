package elf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f127439w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(a1 a1Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f127439w = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y0(this.f127439w, continuation, 0);
            default:
                return new y0(this.f127439w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                a1 a1Var = this.f127439w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    SharedFlow sharedFlowD = a1Var.f127294n.d();
                    this.v = 1;
                    obj2 = vkm.q.x(sharedFlowD, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return a1Var.L2(new mii.k("SUCCESS_TOAST_ID", new TextLocalisedClause(R$string.transaction_details_subscriptions_subscription_added_confirmation, null, null, 14), null, null, null, 28));
                    }
                    yhm.o.b(obj2);
                }
                a3 a3Var = (a3) obj2;
                xua.a aVar2 = a1Var.f127293m;
                Set transactionsGroupIds = zhm.y0.b(a3Var.f272581b);
                String id10 = a3Var.f272584c;
                if (id10 != null) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                } else {
                    id10 = null;
                }
                yua.q qVar = (yua.q) aVar2;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(transactionsGroupIds, "transactionsGroupIds");
                ufm.i iVar = new ufm.i(qVar.m(), new yta.c(20, new yrk.e(qVar, 3, transactionsGroupIds, id10)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                this.v = 2;
                if (nim.a.b(iVar, this) == aVar) {
                    return aVar;
                }
                return a1Var.L2(new mii.k("SUCCESS_TOAST_ID", new TextLocalisedClause(R$string.transaction_details_subscriptions_subscription_added_confirmation, null, null, 14), null, null, null, 28));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a1 a1Var2 = this.f127439w;
                y0 y0Var = new y0(a1Var2, null, 0);
                this.v = 1;
                Object objY2 = a1Var2.Y2(this, y0Var);
                return objY2 == aVar3 ? aVar3 : objY2;
        }
    }
}
