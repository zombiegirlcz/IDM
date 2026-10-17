package nkb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lcd.k;
import lcd.l;
import lcd.m;
import lcd.n;
import lcd.o;
import lcd.p;
import lcd.q;
import ncd.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final h a(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (qVar instanceof n) {
            return h.PERSONAL;
        }
        if (qVar instanceof m) {
            return h.PERSONAL_JOINT;
        }
        if ((qVar instanceof p) || Intrinsics.f(qVar, l.f193863a)) {
            return h.YOUTH;
        }
        if ((qVar instanceof o) || Intrinsics.f(qVar, k.f193862a)) {
            return h.PERSONAL_UNDER_18;
        }
        throw new NoWhenBranchMatchedException();
    }
}
