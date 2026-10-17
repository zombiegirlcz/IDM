package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import com.fourthline.orca.internal.c21;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface l21 extends j20 {
    c21.b.c.a a(Pair pair, int i);

    c21.b.c.C0177b a(int i, Pair pair);

    c21 a(ScannerImage scannerImage);

    c21 a(SelfieScannerWarning selfieScannerWarning);

    Function1 a(int i);

    default Function1 a(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new yl1(image, 1);
    }

    Function1 a(Integer num, Float f, Float f4);

    c21 b();

    c21 b(c21 c21Var);

    c21.b.c.C0177b c(int i);

    c21 d();

    c21.b.C0176b f();

    c21.b.C0176b h();

    c21 j();

    Function1 o();

    default Function1 p() {
        return new jm1(20);
    }

    c21 r();

    c21.b.a u();

    /* JADX INFO: Access modifiers changed from: private */
    static c21 a(Bitmap bitmap, c21 c21Var) {
        Intrinsics.checkNotNullParameter(c21Var, "<this>");
        if (c21Var instanceof c21.a.C0175a) {
            return c21.a.C0175a.a((c21.a.C0175a) c21Var, null, null, null, null, null, null, null, null, new hw(AndroidImageBitmap_androidKt.asImageBitmap(bitmap)), null, 767, null);
        }
        throw new IllegalStateException("Only confirm state supports enlarge functionality");
    }

    /* JADX INFO: Access modifiers changed from: private */
    static c21 a(c21 c21Var) {
        Intrinsics.checkNotNullParameter(c21Var, "<this>");
        if (c21Var instanceof c21.a.C0175a) {
            return c21.a.C0175a.a((c21.a.C0175a) c21Var, null, null, null, null, null, null, null, null, null, null, 767, null);
        }
        throw new IllegalStateException("Only confirm state supports enlarge functionality");
    }
}
