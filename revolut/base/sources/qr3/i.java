package qr3;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes21.dex */
public abstract class i {
    public static final et3.a a(d dVar) {
        int i = h.f248641c[dVar.ordinal()];
        if (i == 1) {
            return et3.a.DAYS;
        }
        if (i == 2) {
            return et3.a.MONTHS;
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
