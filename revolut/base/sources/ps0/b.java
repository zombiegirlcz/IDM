package ps0;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.j3;
import ip0.k3;
import ip0.w3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b {
    public static final int a(j3 j3Var, w3 w3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var instanceof k3) {
            return ((k3) j3Var).f164952a;
        }
        if (Intrinsics.f(j3Var, j3.a.f164786a)) {
            int i = R$attr.uikit_colorBlue;
            int i2 = R$attr.uikit_colorGreyTone8;
            int i3 = w3Var == null ? -1 : a.f239351a[w3Var.ordinal()];
            if (i3 == -1 || i3 == 1) {
                return i;
            }
            if (i3 == 2) {
                return i2;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!Intrinsics.f(j3Var, j3.b.f164787a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = R$attr.uikit_colorCyan;
        int i6 = R$attr.uikit_colorGreyTone20;
        int i21 = w3Var == null ? -1 : a.f239351a[w3Var.ordinal()];
        if (i21 == -1 || i21 == 1) {
            return i5;
        }
        if (i21 == 2) {
            return i6;
        }
        throw new NoWhenBranchMatchedException();
    }
}
