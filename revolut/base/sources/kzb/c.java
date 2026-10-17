package kzb;

import aw0.n6;
import com.revolut.feature.rev_points.impl.ui.earn_options.RevPointsEarnOptionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsEarnOptionsScreen f191086w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RevPointsEarnOptionsScreen revPointsEarnOptionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191086w = revPointsEarnOptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f191086w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f191086w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f191086w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 22;
        Continuation continuation = null;
        RevPointsEarnOptionsScreen revPointsEarnOptionsScreen = this.f191086w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) revPointsEarnOptionsScreen.d();
                hVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.k;
                if (obj3 instanceof e) {
                    hVar.l2(new kq5.d(hVar, ((e) obj3).f191087a, continuation, i2), new yi5.b(26));
                }
                break;
            case 1:
                n6 model2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar2 = (h) revPointsEarnOptionsScreen.d();
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj4 = model2.k;
                if (obj4 instanceof e) {
                    hVar2.l2(new kq5.d(hVar2, ((e) obj4).f191087a, continuation, i2), new yi5.b(26));
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar3 = (h) revPointsEarnOptionsScreen.d();
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj5 = clickData.d;
                if (obj5 instanceof fub.b) {
                    hVar3.l2(new kq5.d(hVar3, ((fub.b) obj5).f138164a, continuation, i2), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
