package dej;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t2 {
    private t2() {
    }

    public final long a() {
        if (this instanceof r2) {
            return ((r2) this).f113640a.f272591g.getMillis();
        }
        if (this instanceof s2) {
            return ((s2) this).f113648a.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
