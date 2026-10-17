package op0;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w2 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f227466a = new Rect();

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        Rect rect = this.f227466a;
        rect.set(0, 0, width, height);
        Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
        outline.setRoundRect(rect, kli.a.k(r5, qv0.h.LARGE.a()));
    }
}
