package q03;

import com.revolut.feature.card_management.api.CardManagementKompotFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h93.f0 f241087w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, h93.f0 f0Var, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f241087w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f241087w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = this.v;
        h93.f0 f0Var = this.f241087w;
        if (i == 0) {
            yhm.o.b(obj2);
            l93.f fVar = bVar.f64915x;
            String cardId = f0Var.f150110a;
            ha3.x xVar = (ha3.x) fVar;
            xVar.getClass();
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            efm.r map = m70.a.g(rd0.e.c(xVar.f.w(cardId), kotlin.coroutines.g.f186406a), null, new pyb.g(11), 1).map(new pz4.a(23, new pyc.p(24)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Boolean bool = Boolean.FALSE;
            efm.d0 d0VarFirst = ue0.e.E(map, bool).first(bool);
            Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
            this.u = 1;
            obj2 = nim.a.b(d0VarFirst, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return bVar.C1(((Boolean) obj2).booleanValue() ? new CardManagementKompotFeatureConfig.ActivatePinDestination(f0Var.f150110a) : new CardManagementKompotFeatureConfig.ChangePinDestination(f0Var.f150110a));
    }
}
