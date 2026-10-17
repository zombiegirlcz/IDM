package pw5;

import cw5.d;
import kotlin.NoWhenBranchMatchedException;
import qw5.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final d a(b.EnumC1371b enumC1371b) {
        int i = b.f240336b[enumC1371b.ordinal()];
        if (i == 1) {
            return d.SECURITY;
        }
        if (i == 2) {
            return d.CRYPTO;
        }
        if (i == 3) {
            return d.COMMODITY;
        }
        throw new NoWhenBranchMatchedException();
    }
}
