package hw3;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final di0.i f156066a;

    public f0(di0.i textRecognizer) {
        Intrinsics.checkNotNullParameter(textRecognizer, "textRecognizer");
        this.f156066a = textRecognizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x0037, LOOP:0: B:26:0x008b->B:28:0x0091, LOOP_END, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x007c, B:26:0x008b, B:28:0x0091, B:29:0x00a1, B:21:0x0059), top: B:37:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:25:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(hw3.f0 r19, android.graphics.pdf.PdfRenderer r20, gim.c r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hw3.f0.a(hw3.f0, android.graphics.pdf.PdfRenderer, gim.c):java.lang.Object");
    }

    public static Bitmap c(PdfRenderer.Page page) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (1080 * (page.getWidth() / page.getHeight())), 1080, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        page.render(bitmapCreateBitmap, null, null, 1);
        return bitmapCreateBitmap;
    }

    public final Object b(String str, v vVar) {
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new g0a.e(str, this, (Continuation) null), vVar);
    }

    public final Object d(String str, String str2, String str3, q qVar) {
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new a9h.a(str, str3, str2, this, (Continuation) null), qVar);
    }
}
