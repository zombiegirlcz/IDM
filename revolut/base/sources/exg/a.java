package exg;

import aw0.r9;
import aw0.s9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwg.j;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    private static final C0761a Companion = new C0761a();

    /* JADX INFO: renamed from: exg.a$a, reason: collision with other inner class name */
    public static final class C0761a {
        private C0761a() {
        }
    }

    public final s9 a(j gauge) {
        float f;
        Intrinsics.checkNotNullParameter(gauge, "gauge");
        int i = b.f130427a[gauge.ordinal()];
        if (i == 1) {
            f = 0.16f;
        } else if (i == 2) {
            f = 0.5f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = 0.84f;
        }
        return new s9(f, Float.valueOf(0.5f), r9.THREE, 8);
    }
}
