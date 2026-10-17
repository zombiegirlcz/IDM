package gcg;

import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.TravelHotelsHomeDiscoverScreen;
import ip0.vr;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsHomeDiscoverScreen f142448w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142448w = travelHotelsHomeDiscoverScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f142448w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f142448w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f142448w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            default:
                h hVar4 = new h(this.f142448w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((vr) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((vr) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((vr) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen = this.f142448w;
        switch (i) {
            case 0:
                vr model = (vr) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarD3 = travelHotelsHomeDiscoverScreen.d();
                Intrinsics.h(model);
                e0 e0Var = (e0) rVarD3;
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                e0Var.f142446x.Z2(new a0(e0Var, continuation, 2));
                break;
            case 1:
                vr model2 = (vr) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarD32 = travelHotelsHomeDiscoverScreen.d();
                Intrinsics.h(model2);
                e0 e0Var2 = (e0) rVarD32;
                e0Var2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                e0Var2.f142446x.Z2(new a0(e0Var2, continuation, 0));
                break;
            case 2:
                vr model3 = (vr) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarD33 = travelHotelsHomeDiscoverScreen.d();
                Intrinsics.h(model3);
                e0 e0Var3 = (e0) rVarD33;
                e0Var3.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                e0Var3.f142446x.Z2(new a0(e0Var3, continuation, 1));
                break;
            default:
                u8 model4 = (u8) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarD34 = travelHotelsHomeDiscoverScreen.d();
                Intrinsics.h(model4);
                e0 e0Var4 = (e0) rVarD34;
                e0Var4.getClass();
                Intrinsics.checkNotNullParameter(model4, "model");
                e0Var4.f142446x.Z2(new ah1.m(model4, e0Var4, continuation, 16));
                break;
        }
        return Unit.f186387a;
    }
}
