package to0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f272493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f272494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f272495c;

    public static final class a {
        private a() {
        }
    }

    public f() {
        this(0);
    }

    public final BitmapDrawable a(String listId, View view, int i, Function1 bitmapFactory) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        g gVar = this.f272495c;
        e eVar = (e) gVar.c(listId);
        Bitmap bitmapA = null;
        if (eVar != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (eVar.f272490a != width || eVar.f272491b != height || eVar.f272492c != i) {
                eVar = null;
            }
            if (eVar != null) {
                bitmapA = eVar.d;
            }
        }
        if (bitmapA == null) {
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                throw new IllegalArgumentException(a0.d.g(view.getWidth(), view.getHeight(), "dimensions of the blurred view should be positive. actual width=", ", height=").toString());
            }
            float width2 = view.getWidth();
            this.f272493a.getClass();
            float fA = b.a(width2, 0.2f);
            Bitmap bitmap = (Bitmap) bitmapFactory.invoke(Float.valueOf(fA));
            try {
                c cVar = this.f272494b;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                bitmapA = cVar.a(context, bitmap, ro0.g.f255749a, fA);
                if (bitmapA != bitmap) {
                }
                gVar.d(listId, new e(view.getWidth(), view.getHeight(), i, bitmapA));
            } finally {
                bitmap.recycle();
            }
        }
        return new BitmapDrawable(view.getResources(), bitmapA);
    }

    public f(int i) {
        b bitmapLayoutProcessor = new b();
        c bitmapBlurProcessor = new c();
        Intrinsics.checkNotNullParameter(bitmapLayoutProcessor, "bitmapLayoutProcessor");
        Intrinsics.checkNotNullParameter(bitmapBlurProcessor, "bitmapBlurProcessor");
        this.f272493a = bitmapLayoutProcessor;
        this.f272494b = bitmapBlurProcessor;
        this.f272495c = new g();
    }
}
