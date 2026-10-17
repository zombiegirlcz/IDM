package ip0;

import android.view.View;
import androidx.customview.poolingcontainer.PoolingContainerListener;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class nw implements PoolingContainerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ koi.b f165583b;

    public /* synthetic */ nw(koi.b bVar, int i) {
        this.f165582a = i;
        this.f165583b = bVar;
    }

    @Override // androidx.customview.poolingcontainer.PoolingContainerListener
    public final void onRelease() {
        View viewA;
        View viewA2;
        switch (this.f165582a) {
            case 0:
                pw pwVar = (pw) this.f165583b;
                if (!pwVar.f165892q) {
                    pwVar.f165892q = true;
                    pwVar.f165885g.removeView(i26.l.a(pwVar.f, null));
                    break;
                }
                break;
            case 1:
                com.revolut.core.ui_kit.delegates.y8 y8Var = (com.revolut.core.ui_kit.delegates.y8) this.f165583b;
                if (!y8Var.f55632n) {
                    y8Var.f55632n = true;
                    ai0.r rVar = y8Var.f55631m;
                    if (rVar != null && (viewA = i26.l.a(rVar, null)) != null) {
                        y8Var.F().removeView(viewA);
                        break;
                    }
                }
                break;
            default:
                com.revolut.core.ui_kit.delegates.y8 y8Var2 = ((op0.b3) this.f165583b).k;
                if (!y8Var2.f55632n) {
                    y8Var2.f55632n = true;
                    ai0.r rVar2 = y8Var2.f55631m;
                    if (rVar2 != null && (viewA2 = i26.l.a(rVar2, null)) != null) {
                        y8Var2.F().removeView(viewA2);
                        break;
                    }
                }
                break;
        }
    }
}
