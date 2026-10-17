package ct0;

import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface z {
    static /* synthetic */ void a(c0 c0Var, Canvas canvas, RectF rectF, t tVar, int i, boolean z, u uVar, x xVar, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        c0Var.d(canvas, rectF, tVar, i, z, uVar, v.TIP, (i2 & 64) != 0 ? x.NORMAL : xVar);
    }

    static void b(c0 c0Var, Canvas canvas, RectF rect, int i, u uVar, w segment, y yVar, int i2) {
        if ((i2 & 4) != 0) {
            uVar = u.UP;
        }
        u direction = uVar;
        x state = x.NORMAL;
        if ((i2 & 32) != 0) {
            yVar = y.GRADIENT;
        }
        y style = yVar;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(style, "style");
        c0Var.c(direction, segment);
        c0Var.g(canvas, rect, i, direction, state, style);
    }
}
