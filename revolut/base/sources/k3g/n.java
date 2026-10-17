package k3g;

import androidx.room.RxRoom;
import c1g.e0;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import fxf.d;
import java.util.List;
import k37.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
import pfm.z;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f180726w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180726w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f180726w, continuation, 0);
            case 1:
                return new n(this.f180726w, continuation, 1);
            case 2:
                return new n(this.f180726w, continuation, 2);
            default:
                return new n(this.f180726w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                o oVar = this.f180726w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z zVarA = exf.c.a(oVar.f180729r, fxf.a.FINE_LOCATION, 2);
                    this.v = 1;
                    obj2 = nim.a.b(zVarA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                fxf.d dVar = (fxf.d) obj2;
                if (dVar instanceof fxf.c) {
                    fxf.c cVar = (fxf.c) dVar;
                    oVar.v2(new h(new Coordinates(cVar.f138815a, cVar.f138816b, null)));
                } else {
                    o.y2(oVar);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                o oVar2 = this.f180726w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z zVarA2 = exf.c.a(oVar2.f180729r, fxf.a.FINE_LOCATION, 2);
                    this.v = 1;
                    obj2 = nim.a.b(zVarA2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                fxf.d dVar2 = (fxf.d) obj2;
                if (dVar2 instanceof fxf.c) {
                    fxf.c cVar2 = (fxf.c) dVar2;
                    oVar2.v2(new h(new Coordinates(cVar2.f138815a, cVar2.f138816b, null)));
                } else if (dVar2 instanceof d.a) {
                    yji.l.j2(oVar2, new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, null, false, 14)))), null, new k0d.c(oVar2, 11), 1);
                } else {
                    if (!(dVar2 instanceof d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o.y2(oVar2);
                }
                return Unit.f186387a;
            case 2:
                o oVar3 = this.f180726w;
                hyf.d dVar3 = oVar3.f180727p;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Object objA = nim.a.a(w.g0(RxRoom.createCompletable(((e0) dVar3).f20482b.f231538b.f267032a, false, true, new szb.g(15))), this);
                    if (objA != aVar3) {
                        objA = Unit.f186387a;
                    }
                    if (objA != aVar3) {
                        objA = Unit.f186387a;
                    }
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        oVar3.x2(new t((List) obj2, 1));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                obj2 = ((e0) dVar3).f20482b.b(this);
                if (obj2 == aVar3) {
                    return aVar3;
                }
                oVar3.x2(new t((List) obj2, 1));
                return Unit.f186387a;
            default:
                o oVar4 = this.f180726w;
                hyf.d dVar4 = oVar4.f180727p;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    e0 e0Var = (e0) dVar4;
                    p0g.g gVar = e0Var.f20482b;
                    DateTime dateTimeWithTimeAtStartOfDay = ((l80.f) e0Var.f20483c).g().withTimeAtStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                    Object objA2 = nim.a.a(w.g0(RxRoom.createCompletable(gVar.f231538b.f267032a, false, true, new nxc.a(dateTimeWithTimeAtStartOfDay.getMillis(), 13))), this);
                    if (objA2 != aVar4) {
                        objA2 = Unit.f186387a;
                    }
                    if (objA2 != aVar4) {
                        objA2 = Unit.f186387a;
                    }
                    if (objA2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        oVar4.x2(new t((List) obj2, 2));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                obj2 = ((e0) dVar4).f20482b.b(this);
                if (obj2 == aVar4) {
                    return aVar4;
                }
                oVar4.x2(new t((List) obj2, 2));
                return Unit.f186387a;
        }
    }
}
