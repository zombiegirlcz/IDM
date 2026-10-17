package mqi;

import android.os.Handler;
import android.os.Looper;
import efm.r;
import hz0.e;
import ihm.f;
import kotlin.jvm.internal.Intrinsics;
import mlk.b0;
import rpi.j;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends yji.d implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f208008c;
    public final Handler d;
    public final kt0.d e;
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f208009g;

    public d(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f208008c = controller;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new kt0.d(this, 10);
    }

    @Override // rpi.j
    public final r D(c01.a button) {
        f fVar;
        r rVarFilter;
        r map;
        Intrinsics.checkNotNullParameter(button, "button");
        c01.d dVarQ = Q();
        if (dVarQ != null && (fVar = ((e) dVarQ).e) != null && (rVarFilter = fVar.filter(new b0(new b(button, 0), 12))) != null && (map = rVarFilter.map(new b0(new mqg.b(2), 13))) != null) {
            return map;
        }
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    public final c01.d Q() {
        return jh.d.f(this.f208008c.m2()).W();
    }

    @Override // rpi.j
    public final void m(c01.a aVar) {
        c01.d dVarQ = Q();
        if (dVarQ != null) {
            ((e) dVarQ).c(aVar);
        }
    }

    @Override // yji.d
    public final void onDestroy() {
        this.d.removeCallbacks(this.e);
        w.p0(this.f);
    }

    @Override // rpi.j
    public final void r(long j2) {
        if (this.f208009g) {
            return;
        }
        this.f208009g = true;
        kt0.d dVar = this.e;
        if (j2 == 0) {
            dVar.run();
        } else {
            this.d.postDelayed(dVar, j2);
        }
        this.f = Q() != null ? D(c01.a.HIDE).subscribe(new b0(new a(this, 0), 11)) : null;
    }

    @Override // rpi.j
    public final void y() {
        if (this.f208009g) {
            this.f208009g = false;
            this.d.removeCallbacks(this.e);
            c01.d dVarQ = Q();
            if (dVarQ != null) {
                ((e) dVarQ).d(false);
            }
            w.p0(this.f);
        }
    }
}
