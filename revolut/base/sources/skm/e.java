package skm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f263964b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0[] f263965a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(g0[] g0VarArr) {
        this.f263965a = g0VarArr;
        this.notCompletedCount$volatile = g0VarArr.length;
    }

    public final Object a(Continuation frame) {
        l lVar = new l(1, fim.h.b(frame));
        lVar.u();
        g0[] g0VarArr = this.f263965a;
        int length = g0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i = 0; i < length; i++) {
            g0 g0Var = g0VarArr[i];
            g0Var.start();
            c cVar = new c(this, lVar);
            cVar.f = e0.w(g0Var, cVar);
            Unit unit = Unit.f186387a;
            cVarArr[i] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            c cVar2 = cVarArr[i2];
            cVar2.getClass();
            c.f263959h.set(cVar2, dVar);
        }
        if (lVar.y()) {
            dVar.b();
        } else {
            lVar.w(dVar);
        }
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }
}
