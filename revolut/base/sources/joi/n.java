package joi;

import android.view.View;
import ix0.e1;
import ix0.f1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f177111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f177112c;
    public final f1 d;
    public boolean e;

    public n(View view) {
        float pivotX = view.getPivotX();
        float pivotY = view.getPivotY();
        Intrinsics.checkNotNullParameter(view, "view");
        this.f177110a = view;
        this.f177111b = pivotX;
        this.f177112c = pivotY;
        this.d = jb3.l.s(view);
    }

    public final void a() {
        View view = this.f177110a;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(this.f177111b);
        view.setPivotY(this.f177112c);
        b(false);
    }

    public final void b(boolean z) {
        if (this.e == z) {
            return;
        }
        this.d.a(e1.SCALE_ANIMATION, z);
        this.e = z;
    }
}
