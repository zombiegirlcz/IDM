package or0;

import android.view.View;
import android.view.ViewTreeObserver;
import ip0.md;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f228031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md f228032b;

    public r(View view, md mdVar) {
        this.f228031a = view;
        this.f228032b = mdVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f228031a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f228032b.invoke();
        return Boolean.TRUE.booleanValue();
    }
}
