package ms0;

import android.content.Context;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w3 {
    private w3() {
    }

    public static v3 a(Context context, boolean z, aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        boolean z3 = colorScheme == aw0.v1.DARK;
        gs0.c cVar = new gs0.c(context, colorScheme);
        int iD = io0.a.d(z3 ? 0.35f : 0.6f, kli.a.s(z3 ? R$attr.uikit_colorForeground : R$attr.uikit_colorPopoverBackground, cVar));
        int iS = kli.a.s(colorScheme.a(), cVar);
        if (!z) {
            iS = io0.a.d(z3 ? 0.4f : 0.3f, iS);
        }
        return new v3(iD, iS);
    }
}
