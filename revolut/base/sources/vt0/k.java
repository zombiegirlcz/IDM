package vt0;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f291895a;

    public k(h hVar) {
        this.f291895a = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        h hVar = this.f291895a;
        if (hVar.getRecyclerView().findViewHolderForLayoutPosition(0) == null) {
            return true;
        }
        hVar.getRecyclerView().getViewTreeObserver().removeOnPreDrawListener(this);
        h.l0(hVar);
        if (!h.j0(hVar) || hVar.f291888w) {
            return true;
        }
        hVar.setState(b.FULL_SCREEN);
        return false;
    }
}
