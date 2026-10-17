package hxi;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.a1;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7b.a f156610a;

    public l(c7b.a iconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f156610a = iconMapper;
    }

    public static Integer b(a1 a1Var) {
        int i = a1Var == null ? -1 : k.f156609a[a1Var.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return Integer.valueOf(R$attr.uikit_colorStatusSuccess);
        }
        if (i == 2) {
            return Integer.valueOf(R$attr.uikit_colorStatusDanger);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model a(svi.t0 r32, hxi.j r33) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hxi.l.a(svi.t0, hxi.j):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }
}
