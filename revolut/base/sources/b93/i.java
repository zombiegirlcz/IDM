package b93;

import b93.f;
import h93.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class i {
    public static final l0 a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof f.a) {
            return ((f.a) fVar).f13618a;
        }
        if (fVar instanceof h) {
            return ((h) fVar).f13633a.f123851q;
        }
        if (fVar instanceof g) {
            return ((g) fVar).f13619a.r();
        }
        if (fVar instanceof f.b) {
            return l0.DEBIT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
