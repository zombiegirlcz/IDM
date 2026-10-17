package enf;

import android.graphics.Bitmap;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    public e(a pageRenderer) {
        Intrinsics.checkNotNullParameter(pageRenderer, "pageRenderer");
    }

    public final Bitmap a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            Pair pairA = a.a(file);
            int iIntValue = (int) ((((Number) pairA.f186386b).intValue() * 600.0f) / ((Number) pairA.f186385a).intValue());
            if (iIntValue < 1) {
                iIntValue = 1;
            }
            return a.b(file, iIntValue);
        } catch (Exception e) {
            Exception exc2 = new Exception(com.google.android.gms.internal.mlkit_vision_face.a.n("Failed to render PDF receipt thumbnail: ", e), e);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, exc2, h0Var);
            return null;
        }
    }
}
