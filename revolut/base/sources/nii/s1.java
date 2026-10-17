package nii;

import android.content.Context;
import com.revolut.core.ui_kit.views.status.StatusView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s1 {
    private s1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.revolut.core.ui_kit.views.status.StatusView r25, nii.m0 r26, nii.m0 r27, ifm.b r28) {
        /*
            Method dump skipped, instruction units count: 2159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nii.s1.a(com.revolut.core.ui_kit.views.status.StatusView, nii.m0, nii.m0, ifm.b):void");
    }

    public static i1 b(m0 m0Var) {
        if (m0Var instanceof j0) {
            return new g1((j0) m0Var, true, new n(0), true, true);
        }
        if (m0Var instanceof z) {
            return new b1((z) m0Var, true, new n(0), true, true, true, true, true);
        }
        if (m0Var instanceof g0) {
            return new f1((g0) m0Var, true, new n(0), true, true, true, true);
        }
        if (m0Var instanceof l0) {
            return new h1((l0) m0Var, true, new n(0), true, true);
        }
        if (m0Var instanceof e0) {
            return new e1((e0) m0Var, true, new n(0), true);
        }
        if (m0Var instanceof b0) {
            return new c1((b0) m0Var, true, new n(0), true);
        }
        if (m0Var instanceof c0) {
            return new d1((c0) m0Var, true, new n(0), true, true);
        }
        if (m0Var instanceof v) {
            return new a1((v) m0Var, true, new n(0), true, true, true);
        }
        if (m0Var instanceof t) {
            return new z0((t) m0Var, true, new n(0), true, true, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean c(m0 m0Var, m0 m0Var2) {
        Intrinsics.checkNotNullParameter(m0Var2, "new");
        return (m0Var2.f() && m0Var != null && m0Var.getClass().equals(m0Var2.getClass())) ? false : true;
    }

    public static void d(StatusView statusView, m0 configuration) {
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        com.revolut.core.ui_kit_core.displayers.haptic.c cVar = configuration instanceof j0 ? com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT : configuration instanceof g0 ? com.revolut.core.ui_kit_core.displayers.haptic.c.PULSE : ((configuration instanceof l0) || (configuration instanceof z) || (configuration instanceof e0)) ? com.revolut.core.ui_kit_core.displayers.haptic.c.DEEP : null;
        if (cVar != null) {
            Context context = statusView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            statusView.postDelayed(new k0.b(jh.d.f(context).Y(), cVar, 22), 300L);
        }
    }
}
