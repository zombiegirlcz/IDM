package aah;

import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.a0;
import z0h.d1;
import z0h.e1;
import z0h.f1;
import z0h.q;
import z0h.r;
import z0h.w;
import z0h.x;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements Comparator {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static int a(f1 f1Var) {
        if (f1Var instanceof d1) {
            return 0;
        }
        if (f1Var instanceof a0) {
            return 1;
        }
        if (f1Var instanceof q) {
            return 2;
        }
        if (f1Var instanceof w) {
            return 3;
        }
        if (f1Var instanceof WealthDisclaimersContract$Disclaimer$Investment) {
            return 4;
        }
        if (f1Var instanceof z0h.j) {
            return 5;
        }
        if (f1Var instanceof r) {
            return 6;
        }
        if (f1Var instanceof x) {
            return 7;
        }
        if (f1Var instanceof e1) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        f1 d15 = (f1) obj2;
        f1 d210 = (f1) obj3;
        Intrinsics.checkNotNullParameter(d15, "d1");
        Intrinsics.checkNotNullParameter(d210, "d2");
        return a(d15) - a(d210);
    }
}
