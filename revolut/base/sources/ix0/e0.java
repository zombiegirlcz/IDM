package ix0;

import android.graphics.Canvas;
import android.graphics.Path;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    private e0() {
    }

    public static void a(j0 controller, Canvas canvas) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        List listB = controller.b();
        if (!canvas.isHardwareAccelerated() && listB != null && (!listB.isEmpty())) {
            canvas.restore();
            return;
        }
        if (canvas.isHardwareAccelerated()) {
            controller.a().a(e1.CUTOUT_STAGE, listB != null && (listB.isEmpty() ^ true));
            if (listB != null) {
                int size = listB.size();
                for (int i = 0; i < size; i++) {
                    f0 f0Var = (f0) listB.get(i);
                    if (f0Var == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    canvas.drawCircle(f0Var.a(), f0Var.b(), f0Var.c(), l0.e);
                }
            }
        }
    }

    public static void b(Canvas canvas, List list) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (canvas.isHardwareAccelerated() || list == null || !(!list.isEmpty())) {
            return;
        }
        canvas.save();
        Path path = l0.f;
        path.rewind();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            f0 f0Var = (f0) list.get(i);
            if (f0Var == null) {
                throw new NoWhenBranchMatchedException();
            }
            path.addCircle(f0Var.a(), f0Var.b(), f0Var.c(), Path.Direction.CW);
        }
        canvas.clipOutPath(path);
    }
}
