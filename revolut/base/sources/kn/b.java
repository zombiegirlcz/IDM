package kn;

import androidx.work.impl.Processor;
import com.revolut.data.model.Data;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w4l.k;
import w4l.l;
import z9h.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f185957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f185958c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, int i, Object obj3, Object obj4) {
        this.f185956a = i;
        this.f185957b = obj2;
        this.f185958c = obj3;
        this.d = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r rVarStartWith;
        switch (this.f185956a) {
            case 0:
                e eVar = (e) this.f185957b;
                ym.b bVar = (ym.b) this.f185958c;
                ym.c cVar = (ym.c) this.d;
                HashSet hashSet = eVar.f185963l;
                String str = bVar.f314825c;
                AtomicLong atomicLong = bVar.d;
                boolean zContains = hashSet.contains(str);
                if (bVar.f314824b) {
                    if (!zContains) {
                        long j2 = eVar.k;
                        if (atomicLong.get() == j2 || atomicLong.compareAndSet(Long.MIN_VALUE, j2)) {
                            return new ufm.f(cVar.g3(bVar), new km2.b(1, new c(eVar, bVar, 0)), 3);
                        }
                    }
                    return d0.m(Boolean.TRUE);
                }
                if (zContains) {
                    long j3 = eVar.k;
                    if (atomicLong.get() == j3 || atomicLong.compareAndSet(Long.MIN_VALUE, j3)) {
                        return new ufm.f(cVar.g3(bVar), new km2.b(2, new c(eVar, bVar, 1)), 3);
                    }
                }
                return d0.m(Boolean.TRUE);
            case 1:
                return ((Processor) this.f185957b).lambda$startWork$0((ArrayList) this.f185958c, (String) this.d);
            default:
                w4l.f fVar = (w4l.f) this.f185957b;
                k kVar = (k) this.d;
                Function1 function1 = fVar.f294634a;
                Object obj2 = this.f185958c;
                Object objInvoke = function1.invoke(obj2);
                boolean z = false;
                boolean z3 = objInvoke == null;
                ihm.k kVarI = fVar.i(obj2);
                if (kVar.f294645a || z3 || fVar.k.containsKey(obj2) || (Intrinsics.f(fVar.f294640l.get(obj2), Boolean.TRUE) && kVar.f294646b)) {
                    z = true;
                }
                if (objInvoke != null) {
                    rVarStartWith = r.concat(n.f(objInvoke, null, z, 2, null), kVarI);
                    Intrinsics.checkNotNullExpressionValue(rVarStartWith, "concat(...)");
                    if (z) {
                        rVarStartWith = rVarStartWith.mergeWith(new pfm.h(new lm.a(new r5.c(kVarI, objInvoke, fVar, obj2, 8), 5), 2));
                    }
                    Intrinsics.h(rVarStartWith);
                } else {
                    d0 d0VarD = fVar.f294639j.d(obj2);
                    vz4.c cVar2 = new vz4.c(new sc7.b(kVar, fVar, obj2, kVarI, 27), 28);
                    d0VarD.getClass();
                    rVarStartWith = new sfm.b(d0VarD, cVar2, 2).startWith(new Data(null, null, true, 2, null));
                    Intrinsics.h(rVarStartWith);
                }
                return rVarStartWith.filter(new l());
        }
    }
}
