package glh;

import aii.u;
import cli.y;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CashHoldingFundsExplanationScreen f144691w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(CashHoldingFundsExplanationScreen cashHoldingFundsExplanationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f144691w = cashHoldingFundsExplanationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f144691w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f144691w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CashHoldingFundsExplanationScreen cashHoldingFundsExplanationScreen = this.f144691w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) cashHoldingFundsExplanationScreen.T.getValue();
                Intrinsics.h(listId);
                y yVar = fVar.f144697p;
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("WITHDRAWABLE_CASH")) {
                    fVar.C2(new d(((b) ((j2) yVar.f22677a).getValue()).f144694c));
                } else if (listId.equals("UNSETTLED_CASH")) {
                    fVar.C2(new c(((b) ((j2) yVar.f22677a).getValue()).f144694c));
                }
                break;
            default:
                ty0.a data = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) cashHoldingFundsExplanationScreen.T.getValue();
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                u uVarM0 = fVar2.o.M0(data);
                if (uVarM0 != null) {
                    fVar2.C1(uVarM0);
                }
                break;
        }
        return Unit.f186387a;
    }
}
