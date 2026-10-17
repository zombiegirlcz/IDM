package f1c;

import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreen;
import ip0.ii0;
import ip0.ui0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.dc;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsWrappedCardsScreen f131243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(RevPointsWrappedCardsScreen revPointsWrappedCardsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f131243w = revPointsWrappedCardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f131243w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f131243w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f131243w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((dc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((ui0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((ii0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsWrappedCardsScreen revPointsWrappedCardsScreen = this.f131243w;
        switch (i) {
            case 0:
                dc positionInfo = (dc) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = revPointsWrappedCardsScreen.R2();
                Intrinsics.h(positionInfo);
                t tVar = (t) rVarE3;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
                tVar.H2(tVar.f131255s, new f0m.c(positionInfo, 1));
                break;
            case 1:
                ui0 model = (ui0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = revPointsWrappedCardsScreen.R2();
                Intrinsics.h(model);
                t tVar2 = (t) rVarE32;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                tVar2.I2(model.d);
                break;
            default:
                ii0 model2 = (ii0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE33 = revPointsWrappedCardsScreen.R2();
                Intrinsics.h(model2);
                t tVar3 = (t) rVarE33;
                tVar3.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                tVar3.I2(model2.e);
                break;
        }
        return Unit.f186387a;
    }
}
