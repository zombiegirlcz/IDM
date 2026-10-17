package b6k;

import b6k.a;
import b6k.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public final a a(h calculationResult) {
        Intrinsics.checkNotNullParameter(calculationResult, "calculationResult");
        if (calculationResult instanceof i) {
            return new b(((i) calculationResult).f12855a);
        }
        if (Intrinsics.f(calculationResult, h.a.f12853a)) {
            return a.C0091a.f12845a;
        }
        if (Intrinsics.f(calculationResult, h.b.f12854a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
