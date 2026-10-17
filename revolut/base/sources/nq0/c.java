package nq0;

import android.graphics.Canvas;
import android.view.View;
import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import fu0.g;
import fu0.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends RevolutDrawableWrapper implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f218346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f218347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevolutShimmerDrawable drawable, View view, h hVar) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f218346a = view;
        this.f218347b = hVar;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        h hVar = this.f218347b;
        if (hVar == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            for (g gVar : hVar.b()) {
                gVar.a(canvas);
            }
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th10) {
            canvas.restoreToCount(iSave);
            throw th10;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f218346a;
        setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        h hVar = this.f218347b;
        if (hVar != null) {
            hVar.B();
            for (g gVar : hVar.b()) {
                gVar.c(view.getLeft(), view.getTop());
            }
        }
    }
}
