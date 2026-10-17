package pq7;

import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pq7.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SmartDrivingScreen f238688w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SmartDrivingScreen smartDrivingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f238688w = smartDrivingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f238688w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f238688w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SmartDrivingScreen smartDrivingScreen = this.f238688w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarH3 = smartDrivingScreen.h3();
                Intrinsics.h(id10);
                p pVar = (p) jVarH3;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("SMART_DRIVING_FAQ")) {
                    pVar.C1(sl7.c.a("topic.telematics"));
                }
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarH32 = smartDrivingScreen.h3();
                String id11 = aVar2.f275445a;
                p pVar2 = (p) jVarH32;
                pVar2.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if (Intrinsics.f(id11, "SMART_DRIVING_SCORE_LEARN_MORE")) {
                    pVar2.v2(i.a.f238693a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
