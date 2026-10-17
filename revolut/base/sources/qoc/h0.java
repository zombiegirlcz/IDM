package qoc;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 {
    public static int a(roc.a aVar) {
        int i = aVar == null ? -1 : g0.f248121a[aVar.ordinal()];
        if (i == -1) {
            return s0.f248145h;
        }
        if (i == 1 || i == 2 || i == 3) {
            return s0.i;
        }
        if (i == 4) {
            return s0.f248146j;
        }
        throw new NoWhenBranchMatchedException();
    }
}
