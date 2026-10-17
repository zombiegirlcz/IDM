package fs0;

import android.text.Layout;
import et0.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private l() {
    }

    public static int a(w0 block, float f, float f4) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        float f5 = f - (block.f129140c + block.e);
        Intrinsics.checkNotNullParameter(block, "block");
        float f6 = f4 - (block.d + block.f);
        Layout layout = block.f129138a;
        return layout.getOffsetForHorizontal(layout.getLineForVertical((int) f6), f5);
    }
}
