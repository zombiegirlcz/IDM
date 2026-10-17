package pv0;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import au0.q4;
import jh.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static void a(View logoBackground, View backgroundMediaView, Context context, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(logoBackground, "logoBackground");
        Intrinsics.checkNotNullParameter(backgroundMediaView, "backgroundMediaView");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = 8;
        if (!z3) {
            logoBackground.setVisibility(8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            logoBackground.setVisibility(8);
            backgroundMediaView.setClipToOutline(true);
            backgroundMediaView.setOutlineProvider(z ? new q4(new Matrix(), 6) : ViewOutlineProvider.BACKGROUND);
        } else {
            if (z && !d.g(context)) {
                i = 0;
            }
            logoBackground.setVisibility(i);
        }
    }
}
