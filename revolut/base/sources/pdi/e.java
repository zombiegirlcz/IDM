package pdi;

import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.feature_rev_points_pocket_impl.network.RevPointsPocketService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import odi.b;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f235248w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f235248w = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new e(this.f235248w, continuation, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new e(this.f235248w, continuation, 1).invokeSuspend(Unit.f186387a);
            default:
                return new e(this.f235248w, continuation, 2).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                RevPointsPocketService revPointsPocketService = this.f235248w.f235257a;
                this.v = 1;
                Object pointsPocketBenefits = revPointsPocketService.getPointsPocketBenefits(this);
                return pointsPocketBenefits == aVar ? aVar : pointsPocketBenefits;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    RevPointsPocketService revPointsPocketService2 = this.f235248w.f235257a;
                    this.v = 1;
                    obj2 = revPointsPocketService2.getPointsPocket(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                odi.b bVar = (odi.b) obj2;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                if (!(bVar instanceof b.C1248b)) {
                    if (bVar instanceof b.a) {
                        return RevPointsPocketState.Inactive.INSTANCE;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                b.C1248b c1248b = (b.C1248b) bVar;
                String str = c1248b.f224483a;
                String str2 = c1248b.f224484b;
                ddi.e eVar = c1248b.f224485c;
                long j2 = c1248b.d;
                dj0.d dVar = c1248b.e;
                String str3 = c1248b.f;
                RevPoints revPointsD = str3 != null ? qvb.a.d(str3) : null;
                String str4 = c1248b.f224486g;
                return new RevPointsPocketState.Active(new RevPointsPocketInfo(str, str2, eVar, j2, dVar, revPointsD, str4 != null ? qvb.a.d(str4) : null));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                RevPointsPocketService revPointsPocketService3 = this.f235248w.f235257a;
                this.v = 1;
                Object pointsPocketThresholds = revPointsPocketService3.getPointsPocketThresholds(this);
                return pointsPocketThresholds == aVar3 ? aVar3 : pointsPocketThresholds;
        }
    }
}
