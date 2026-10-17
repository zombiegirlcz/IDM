package jx;

import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.camerakit.detectors.api.models.FaceDetectionUnavailable;
import dx.l;
import gim.i;
import java.util.List;
import jsl.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import rz.u;
import skm.h2;
import xv.m;
import xv.n;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends i implements Function2 {
    public CameraKitException u;
    public dx.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f179023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f179024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ lx.a f179025y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, lx.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f179024x = dVar;
        this.f179025y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f179024x, this.f179025y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair;
        CameraKitException cameraKitException;
        dx.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f179023w;
        Continuation continuation = null;
        try {
            if (i == 0) {
                o.b(obj2);
                d dVar = this.f179024x;
                a aVar3 = d.Companion;
                ti0.c cVar = (ti0.c) dVar.f.j(d.i[0]);
                if (cVar == null) {
                    return new dx.b(new FaceDetectionUnavailable(new IllegalStateException("No detector available")), f0.f322471a);
                }
                if (this.f179024x.f179032g) {
                    return d.f179028j;
                }
                b.Companion companion = kotlin.time.b.INSTANCE;
                long jG = kotlin.time.c.g(1000, pkm.e.MILLISECONDS);
                t0 t0Var = new t0(cVar, this.f179025y, continuation, 10);
                this.f179023w = 1;
                obj2 = h2.e(jG, t0Var, this);
                if (obj2 == aVar2) {
                }
                return aVar2;
            }
            if (i != 1) {
                if (i == 2) {
                    cameraKitException = this.u;
                    o.b(obj2);
                    return new dx.b(cameraKitException, (Iterable) obj2);
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.v;
                o.b(obj2);
                lx.a aVar4 = this.f179025y;
                ch0.a aVar5 = aVar4.f200499a;
                return new dx.c((List) obj2, aVar, new n(aVar5.f24097a, aVar5.d, aVar5.f24098b, aVar5.f24099c, aVar5.e, aVar4.f200500b, null, aVar4.f200501c));
            }
            o.b(obj2);
            dh0.b bVar = (dh0.b) obj2;
            m mVarA = ex.b.a(this.f179025y.f200499a);
            l lVar = this.f179024x.d;
            if (lVar instanceof dx.n) {
                u f50856a = ((dx.n) lVar).f120507a.getF50856a();
                if (f50856a == null) {
                    throw new IllegalStateException("Undefined preview location");
                }
                pair = new Pair(new Integer(f50856a.f258459c), new Integer(f50856a.d));
            } else {
                if (!(lVar instanceof dx.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                u uVar = ((dx.m) lVar).a().f258438a;
                if (uVar == null) {
                    throw new IllegalStateException("Undefined preview location");
                }
                pair = new Pair(new Integer(uVar.f258459c), new Integer(uVar.d));
            }
            int iIntValue = ((Number) pair.f186385a).intValue();
            int iIntValue2 = ((Number) pair.f186386b).intValue();
            if (bVar != null) {
                d dVar2 = this.f179024x;
                dx.a aVar6 = new dx.a(dVar2.f179030b.i(bVar, this.f179025y, iIntValue, iIntValue2));
                d dVar3 = this.f179024x;
                this.u = null;
                this.v = aVar6;
                this.f179023w = 3;
                obj2 = d.d(dVar3, aVar6, mVarA, this);
                if (obj2 != aVar2) {
                    aVar = aVar6;
                    lx.a aVar42 = this.f179025y;
                    ch0.a aVar52 = aVar42.f200499a;
                    return new dx.c((List) obj2, aVar, new n(aVar52.f24097a, aVar52.d, aVar52.f24098b, aVar52.f24099c, aVar52.e, aVar42.f200500b, null, aVar42.f200501c));
                }
            } else {
                CameraKitException cameraKitException2 = new CameraKitException("Face not recognised", (Throwable) null, 6);
                d dVar4 = this.f179024x;
                this.u = cameraKitException2;
                this.f179023w = 2;
                Object objD = d.d(dVar4, null, mVarA, this);
                if (objD != aVar2) {
                    cameraKitException = cameraKitException2;
                    obj2 = objD;
                    return new dx.b(cameraKitException, (Iterable) obj2);
                }
            }
            return aVar2;
        } catch (UnsupportedOperationException e) {
            return new dx.b(new FaceDetectionUnavailable(e), f0.f322471a);
        } catch (Throwable th10) {
            return new dx.b(new CameraKitException("face is not detected", th10, 4), f0.f322471a);
        }
    }
}
