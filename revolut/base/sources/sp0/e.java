package sp0;

import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.drawables.AnimatedDrawable;
import kotlin.jvm.internal.Intrinsics;
import ms0.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c0 f264859h;
    public static final c0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c0 f264860j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f264861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f264862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f264863c;
    public AnimatedDrawable d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f264864g;

    static {
        Class cls = Float.TYPE;
        f264859h = new c0("scaleX", 2, cls);
        i = new c0("scaleY", 3, cls);
        f264860j = new c0("alpha", 1, cls);
    }

    public e(Drawable drawable, float f, e eVar, int i2) {
        float f4 = (i2 & 2) != 0 ? 0.5f : 0.72166663f;
        f = (i2 & 8) != 0 ? 1.0f : f;
        float f5 = (i2 & 16) != 0 ? 1.0f : 0.0f;
        float f6 = (i2 & 32) == 0 ? 0.0f : 1.0f;
        eVar = (i2 & 64) != 0 ? null : eVar;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f264861a = drawable;
        this.f264862b = f4;
        this.f264863c = eVar;
        this.e = f;
        this.f = f5;
        this.f264864g = f6;
    }
}
