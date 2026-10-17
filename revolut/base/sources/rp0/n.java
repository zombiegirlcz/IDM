package rp0;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f256131b;

    public /* synthetic */ n(o oVar, int i) {
        this.f256130a = i;
        this.f256131b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f256130a) {
            case 0:
                o oVar = this.f256131b;
                View view = oVar.d;
                if (view.getParent() == null) {
                    oVar.f.h0(oVar.f256137h);
                    oVar.f256134b.addView(view);
                    View view2 = oVar.e;
                    if (view2 != null) {
                        or0.u.b(view2, true, oVar.i);
                    }
                    ViewCompat.setOnApplyWindowInsetsListener(view, oVar.f256138j);
                    ViewUtils.requestApplyInsetsWhenAttached(view);
                    break;
                }
                break;
            default:
                o oVar2 = this.f256131b;
                View view3 = oVar2.d;
                if (view3.getParent() != null) {
                    oVar2.f.j0();
                    oVar2.f256134b.removeView(view3);
                    View view4 = oVar2.e;
                    if (view4 != null) {
                        or0.u.q(view4, oVar2.i);
                    }
                    ViewCompat.setOnApplyWindowInsetsListener(view3, null);
                    break;
                }
                break;
        }
    }
}
