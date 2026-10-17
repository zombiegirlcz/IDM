package sdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.t0;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        h hVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ldi.f fVar = ((kdi.c) hVar.f261904m).f182901c;
            w4l.h hVar2 = w4l.h.f294642c;
            t0 t0Var = new t0(mo3.a.g(nim.a.v(u0.m(fVar.c(hVar2), fVar.b(hVar2)), new kcd.a(21)), null, new sa5.a(16), 1), 1);
            this.u = 1;
            obj2 = vkm.q.x(t0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ddi.f fVar2 = (ddi.f) obj2;
        RevPointsPocketInfo revPointsPocketInfo = fVar2.f113227a;
        List allThresholds = fVar2.f113228b;
        Intrinsics.checkNotNullParameter(revPointsPocketInfo, "<this>");
        Intrinsics.checkNotNullParameter(allThresholds, "allThresholds");
        if (hx7.q.t(revPointsPocketInfo, allThresholds) == null) {
            RevPointsPocketThreshold revPointsPocketThreshold = (RevPointsPocketThreshold) d0.d0(allThresholds);
            if (revPointsPocketThreshold == null || (dVar = revPointsPocketThreshold.f97795c) == null) {
                dj0.d.Companion.getClass();
                dVar = dj0.d.d;
            }
            hVar.c3(ddi.g.CONTRIBUTE, pyd.c.H(dVar, fVar2.f113227a.e));
        } else {
            yji.n.P2(hVar, hVar.o2(new edi.c(allThresholds)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
        return Unit.f186387a;
    }
}
