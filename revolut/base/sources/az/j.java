package az;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import xv.l;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f11281w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11281w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f11281w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f11281w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((dv.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.f11281w;
        switch (i) {
            case 0:
                l detectorResult = (l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yy.c cVar = kVar.f11282p;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
                gv.a screenFlashState = gv.a.f147001a;
                Intrinsics.checkNotNullParameter(screenFlashState, "screenFlashState");
                ((sx.b) cVar.f317737n).d(detectorResult, screenFlashState);
                kVar.H2(kVar.u, new auj.o(detectorResult, 22));
                return Unit.f186387a;
            default:
                dv.i iVar = (dv.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (iVar instanceof dv.b) {
                    kVar.C2(new vy.b(((dv.b) iVar).f118000a));
                } else if (!(iVar instanceof dv.e)) {
                    if (iVar instanceof dv.f) {
                        dv.f fVar = (dv.f) iVar;
                        kVar.C2(new vy.d(fVar.f118004a, fVar.f118005b, fVar.f118006c));
                    } else if (!(iVar instanceof dv.h) && !(iVar instanceof dv.g) && !(iVar instanceof dv.d)) {
                        if (!(iVar instanceof dv.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kVar.X1((y0) kVar.f11286t.getValue());
                    }
                }
                return Unit.f186387a;
        }
    }
}
