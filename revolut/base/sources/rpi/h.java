package rpi;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rlh.d0;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends fsi.c implements j {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final fsi.b f256392m = new fsi.b("SECURE_KEYBOARD_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f256393h;
    public final Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.view.d f256394j;
    public ifm.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f256395l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Activity activity) {
        super(f256392m);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f256393h = activity;
        this.i = new Handler(Looper.getMainLooper());
        this.f256394j = new androidx.view.d(this, 23);
    }

    @Override // rpi.j
    public final r D(c01.a button) {
        ihm.f fVarB;
        r map;
        Intrinsics.checkNotNullParameter(button, "button");
        c01.d dVarW = jh.d.f(this.f256393h).W();
        if (dVarW != null && (fVarB = ((hz0.e) dVarW).b()) != null) {
            r rVarFilter = fVarB.filter(new d(new mqi.b(button, 1), 1));
            if (rVarFilter != null && (map = rVarFilter.map(new d(new e(0), 2))) != null) {
                return map;
            }
        }
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // rpi.j
    public final void m(c01.a aVar) {
        c01.d dVarW = jh.d.f(this.f256393h).W();
        if (dVarW != null) {
            ((hz0.e) dVarW).c(aVar);
        }
    }

    @Override // fsi.c, fsi.a
    public final void onDestroy() {
        super.onDestroy();
        this.i.removeCallbacks(this.f256394j);
        w.p0(this.k);
    }

    @Override // rpi.j
    public final void r(long j2) {
        if (this.f256395l) {
            return;
        }
        this.f256395l = true;
        androidx.view.d dVar = this.f256394j;
        if (j2 == 0) {
            dVar.run();
        } else {
            this.i.postDelayed(dVar, j2);
        }
        this.k = jh.d.f(this.f256393h).W() != null ? D(c01.a.HIDE).subscribe(new d(new d0(this, 25), 0)) : null;
    }

    @Override // rpi.j
    public final void y() {
        if (this.f256395l) {
            this.f256395l = false;
            this.i.removeCallbacks(this.f256394j);
            c01.d dVarW = jh.d.f(this.f256393h).W();
            if (dVarW != null) {
                ((hz0.e) dVarW).a();
            }
            w.p0(this.k);
        }
    }
}
