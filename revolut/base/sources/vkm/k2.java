package vkm;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class k2 extends wkm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f290058a = new AtomicReference(null);

    @Override // wkm.c
    public final boolean a(wkm.a aVar) {
        AtomicReference atomicReference = this.f290058a;
        if (zkm.b.f(atomicReference) != null) {
            return false;
        }
        zkm.b.i(atomicReference, q.d);
        return true;
    }

    @Override // wkm.c
    public final Continuation[] b(wkm.a aVar) {
        zkm.b.i(this.f290058a, null);
        return wkm.b.f298303a;
    }

    public final Object c(i2 frame) {
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        cfm.c cVar = q.d;
        while (true) {
            AtomicReference atomicReference = this.f290058a;
            if (atomicReference.compareAndSet(cVar, lVar)) {
                break;
            }
            if (atomicReference.get() != cVar) {
                m.Companion companion = yhm.m.INSTANCE;
                lVar.resumeWith(Unit.f186387a);
                break;
            }
        }
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }
}
