package jji;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends lki.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f174965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f174966h;

    public f(String smallCardItemId, String bigCardItemId) {
        Intrinsics.checkNotNullParameter(smallCardItemId, "smallCardItemId");
        Intrinsics.checkNotNullParameter(bigCardItemId, "bigCardItemId");
        this.f174965g = smallCardItemId;
        this.f174966h = bigCardItemId;
    }

    public static final Bitmap d(f fVar, View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
        Outline outline = new Outline();
        Rect rect = new Rect();
        Path path = new Path();
        view.getOutlineProvider().getOutline(view, outline);
        outline.getRect(rect);
        path.rewind();
        path.addRoundRect(new RectF(rect), outline.getRadius(), outline.getRadius(), Path.Direction.CW);
        canvasE.clipPath(path);
        view.draw(canvasE);
        return bitmapCreateBitmap;
    }

    public static AnimatorSet f(View view, View view2, boolean z) {
        return (AnimatorSet) new k(lki.u.END_TO_START).a(view, view2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    @Override // lki.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.View r30, android.view.View r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jji.f.a(android.view.View, android.view.View, boolean):android.animation.Animator");
    }
}
