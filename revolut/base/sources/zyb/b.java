package zyb;

import aw0.n6;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsBottomSheetScreen f326400w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(RevPointsBottomSheetScreen revPointsBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f326400w = revPointsBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f326400w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f326400w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            default:
                b bVar3 = new b(this.f326400w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsBottomSheetScreen revPointsBottomSheetScreen = this.f326400w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) revPointsBottomSheetScreen.e3()).I2(n6Var);
                break;
            case 1:
                n6 n6Var2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) revPointsBottomSheetScreen.e3()).I2(n6Var2);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) revPointsBottomSheetScreen.e3();
                hVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof HyperTextClickData) {
                    HyperTextTarget hyperTextTarget = ((HyperTextClickData) obj3).f74762a;
                    HyperTextTarget.Link link = hyperTextTarget instanceof HyperTextTarget.Link ? (HyperTextTarget.Link) hyperTextTarget : null;
                    if (link != null) {
                        hVar.l2(new f(hVar, link, null), new yi5.b(26));
                    }
                } else {
                    r6.b.D("Parcel must be HyperTextClickData");
                }
                break;
        }
        return Unit.f186387a;
    }
}
