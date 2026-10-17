package hng;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import qe0.s;
import wim.z;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f154108b;

    public /* synthetic */ j(q qVar, int i) {
        this.f154107a = i;
        this.f154108b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f154107a) {
            case 0:
                zlg.n nVar = (zlg.n) obj2;
                w4l.f fVar = this.f154108b.i;
                Unit unit = Unit.f186387a;
                Intrinsics.h(nVar);
                fVar.j(unit, nVar);
                return unit;
            case 1:
                q qVar = this.f154108b;
                gm0.f fVar2 = qVar.e;
                AtomicBoolean atomicBoolean = fVar2.d;
                if (!atomicBoolean.get()) {
                    fVar2.f144736a.G(Integer.valueOf(((Number) fVar2.f144738c.getValue()).intValue()), "PREF_KEY_LAST_SUCCESSFUL_DEVICE_ID_VERSION", z.d(o0.b(Integer.TYPE)));
                    atomicBoolean.set(true);
                }
                s sVar = qVar.f;
                Unit unit2 = Unit.f186387a;
                sVar.f(unit2);
                return unit2;
            default:
                do3.n nVar2 = (do3.n) obj2;
                w4l.f fVar3 = this.f154108b.f154117g;
                Unit unit3 = Unit.f186387a;
                Intrinsics.h(nVar2);
                fVar3.j(unit3, nVar2);
                return unit3;
        }
    }
}
