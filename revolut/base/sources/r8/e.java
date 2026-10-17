package r8;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f252283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f252284b;

    public e(f fVar, View view) {
        this.f252284b = fVar;
        this.f252283a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        y8.l.f().post(new d(this, this, 0));
    }
}
