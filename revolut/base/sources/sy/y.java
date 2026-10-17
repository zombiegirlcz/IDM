package sy;

import com.revolut.camerakit.client.api.models.HintMessage;
import com.revolut.camerakit.core.errors.CameraInitException;
import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.camerakit.core.errors.UnsupportedCameraInitException;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nii.y0;
import vkm.j2;

/* JADX INFO: loaded from: classes16.dex */
public final class y extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.camerakit.revolut.ui.flow.steps.camera.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.v, continuation);
        yVar.u = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((dv.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.r dVar;
        com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar = this.v;
        dv.a aVar2 = aVar.f50803p;
        ?? r3 = aVar.f50810y;
        dz.a aVar3 = aVar.u;
        vy.a aVar4 = aVar.f50805r;
        cli.y yVar = aVar.z;
        final dv.i iVar = (dv.i) this.u;
        fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = 2;
        ?? G = 0;
        G = 0;
        G = 0;
        if (iVar instanceof dv.b) {
            dv.b bVar = (dv.b) iVar;
            CameraKitException cameraKitException = bVar.f118000a;
            if (!(cameraKitException instanceof UnsupportedCameraInitException)) {
                Map map = cameraKitException.f50739a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashSet.add(new Pair((String) entry.getKey(), (String) entry.getValue()));
                }
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, cameraKitException, linkedHashSet);
            }
            if (cameraKitException instanceof CameraInitException) {
                od0.a aVar6 = od0.a.f224253a;
                boolean zE = od0.a.e();
                aVar3.getClass();
                yji.l.b1(aVar, aVar.X1(dz.a.a(cameraKitException, zE)), null, new sma.f(aVar, bVar, G, 4), 3);
            } else {
                od0.a aVar7 = od0.a.f224253a;
                boolean zE2 = od0.a.e();
                aVar3.getClass();
                yji.l.b1(aVar, aVar.X1(dz.a.b(cameraKitException, zE2)), null, new z(aVar, G, i), 3);
            }
        } else if (!(iVar instanceof dv.e)) {
            if (iVar instanceof dv.f) {
                if (aVar4.d.d) {
                    gv.m mVar = ((dv.f) iVar).f118004a;
                    if (mVar instanceof gv.i) {
                        G = ((gv.i) mVar).f147014b.f147019a.g();
                    } else if (!(mVar instanceof gv.k)) {
                        if (mVar instanceof gv.l) {
                            G = ((gv.l) mVar).f147019a.g();
                        } else if (!(mVar instanceof gv.h) && !(mVar instanceof gv.j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (G != 0) {
                        aVar.H2(yVar, new sx8.a((Object) G, 6));
                    }
                    aVar.t1((y0) r3.getValue());
                }
                if (aVar4.f293107a instanceof CameraKitFlowContract$FlowType.ActiveLiveness) {
                    dv.f fVar = (dv.f) iVar;
                    dVar = new vy.c(fVar.f118004a, fVar.f118005b, fVar.f118006c, ((e) ((j2) yVar.f22677a).getValue()).d(), ((e) ((j2) yVar.f22677a).getValue()).f0());
                } else {
                    dv.f fVar2 = (dv.f) iVar;
                    dVar = new vy.d(fVar2.f118004a, fVar2.f118005b, fVar2.f118006c);
                }
                aVar.C2(dVar);
            } else if (iVar instanceof dv.h) {
                e eVar = (e) ((j2) yVar.f22677a).getValue();
                if (eVar instanceof c) {
                    final c cVar = (c) eVar;
                    final int i2 = 0;
                    aVar.H2(yVar, new Function1() { // from class: sy.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i2) {
                                case 0:
                                    return c.a(cVar, false, null, ((dv.h) iVar).f118008a, null, null, false, 59);
                                default:
                                    return c.a(cVar, false, null, false, ((dv.d) iVar).f118002a, null, false, 55);
                            }
                        }
                    });
                } else if (!(eVar instanceof d)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (iVar instanceof dv.g) {
                e eVar2 = (e) ((j2) yVar.f22677a).getValue();
                if (eVar2 instanceof c) {
                    aVar.H2(yVar, new w((c) eVar2, 2));
                } else if (!(eVar2 instanceof d)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                final int i3 = 1;
                if (iVar instanceof dv.d) {
                    e eVar3 = (e) ((j2) yVar.f22677a).getValue();
                    if (eVar3 instanceof c) {
                        final c cVar2 = (c) eVar3;
                        aVar.H2(yVar, new Function1() { // from class: sy.x
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i3) {
                                    case 0:
                                        return c.a(cVar2, false, null, ((dv.h) iVar).f118008a, null, null, false, 59);
                                    default:
                                        return c.a(cVar2, false, null, false, ((dv.d) iVar).f118002a, null, false, 55);
                                }
                            }
                        });
                    } else if (!(eVar3 instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (!(iVar instanceof dv.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e eVar4 = (e) ((j2) yVar.f22677a).getValue();
                    if (eVar4 instanceof c) {
                        c cVar3 = (c) eVar4;
                        if (cVar3.f266535c) {
                            aVar.H2(yVar, new w(c.a(cVar3, false, null, false, null, null, false, 59), 1));
                        }
                    }
                    if (aVar4.f293112j) {
                        ((jv.r) aVar2).i(HintMessage.Processing.f50726a);
                    } else {
                        ((jv.r) aVar2).i(HintMessage.Empty.f50724a);
                        aVar.X1((y0) r3.getValue());
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
